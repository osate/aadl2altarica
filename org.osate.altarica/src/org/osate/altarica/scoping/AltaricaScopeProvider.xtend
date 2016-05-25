/*
 * generated by Xtext
 */
package org.osate.altarica.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.osate.altarica.altarica.ClassType
import org.osate.altarica.altarica.NameRef
import org.osate.altarica.altarica.Node
import org.osate.altarica.altarica.Variable

import static extension org.eclipse.xtext.EcoreUtil2.getContainerOfType

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */
class AltaricaScopeProvider extends AbstractDeclarativeScopeProvider {
	def scope_NameRef_variable(NameRef context, EReference reference) {
		val nested = context.nested
		if (nested == null) {
			Scopes.scopeFor(context.getContainerOfType(Node).declarations)
		} else {
			val variable = nested.variable
			if (variable instanceof Variable) {
				val type = variable.type
				if (type instanceof ClassType) {
					Scopes.scopeFor(type.class_.declarations)
				} else {
					IScope.NULLSCOPE
				}
			} else {
				IScope.NULLSCOPE
			}
		}
	}
}
