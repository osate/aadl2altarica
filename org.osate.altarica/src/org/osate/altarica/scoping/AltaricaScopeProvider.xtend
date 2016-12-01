/**
 * AADL to AltaRica Translator
 * 
 * Copyright 2016 Carnegie Mellon University. All Rights Reserved.
 * 
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 *  Released under a Eclipse Public License - v1.0-style license,
 *  please see license.txt or contact permission@sei.cmu.edu for full terms.
 * 
 * DM16-0114
 */
package org.osate.altarica.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.osate.altarica.altarica.Assignment
import org.osate.altarica.altarica.Attribute
import org.osate.altarica.altarica.CaseExpression
import org.osate.altarica.altarica.Domain
import org.osate.altarica.altarica.Equal
import org.osate.altarica.altarica.NameRef
import org.osate.altarica.altarica.NamedType
import org.osate.altarica.altarica.Node
import org.osate.altarica.altarica.Transition
import org.osate.altarica.altarica.Variable

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType
import org.osate.altarica.altarica.SwitchExpression

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class AltaricaScopeProvider extends AbstractDeclarativeScopeProvider {
	def scope_NameRef_variable(NameRef context, EReference reference) {
		val owner = context.eContainer
		if (owner instanceof Attribute) {
			domainOfAttribute(owner)
		} else if (owner instanceof Equal && (owner as Equal).right == context) {
			domainOfEqual(owner as Equal)
		} else if (owner instanceof Assignment && (owner as Assignment).value == context && owner.getContainerOfType(Transition) != null) {
			domainOfAssignment(owner as Assignment)
		} else if (owner instanceof SwitchExpression) {
			domainOfAssignment(owner.eContainer as Assignment)
		} else if (owner instanceof CaseExpression) {
			Scopes.scopeFor(owner.getContainerOfType(Node).declarations, domainOfAssignment(owner.eContainer.eContainer as Assignment))
		} else {
			val nested = context.nested
			if (nested == null) {
				Scopes.scopeFor(context.getContainerOfType(Node).declarations)
			} else {
				val variable = nested.variable
				switch (variable) {
					Variable: {
						val type = variable.type
						switch (type) {
							NamedType: {
								val ref = type.ref
								if (ref instanceof Node) {
									Scopes.scopeFor(ref.declarations)
								}
							}
							default:
								IScope.NULLSCOPE
						}
					}
					default:
						IScope.NULLSCOPE
				}
			}
		}
	}

	def domainOfAttribute(Attribute attrib) {
		val variable = attrib.getContainerOfType(Variable)
		val type = variable.type as NamedType
		val domain = type.ref as Domain
		Scopes.scopeFor(domain.constants)
	}

	def domainOfEqual(Equal equal) {
		val variable = (equal.left as NameRef).variable as Variable
		val type = variable.type as NamedType
		val domain = type.ref as Domain
		Scopes.scopeFor(domain.constants)
	}

	def domainOfAssignment(Assignment assign) {
		val variable = (assign.variable as NameRef).variable as Variable
		val type = variable.type as NamedType
		val domain = type.ref as Domain
		Scopes.scopeFor(domain.constants)
	}

}
