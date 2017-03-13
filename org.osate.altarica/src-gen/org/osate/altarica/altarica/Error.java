/**
 * AADL to AltaRica Translator
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
 * Released under a Eclipse Public License - v1.0-style license,
 * 
 * please see license.txt or contact permission@sei.cmu.edu for full terms.
 * DM16-0114
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Error#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Error#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getError()
 * @model
 * @generated
 */
public interface Error extends EObject
{
  /**
   * Returns the value of the '<em><b>Severity</b></em>' attribute.
   * The literals are from the enumeration {@link org.osate.altarica.altarica.Severity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Severity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Severity</em>' attribute.
   * @see org.osate.altarica.altarica.Severity
   * @see #setSeverity(Severity)
   * @see org.osate.altarica.altarica.AltaricaPackage#getError_Severity()
   * @model
   * @generated
   */
  Severity getSeverity();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Error#getSeverity <em>Severity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Severity</em>' attribute.
   * @see org.osate.altarica.altarica.Severity
   * @see #getSeverity()
   * @generated
   */
  void setSeverity(Severity value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see org.osate.altarica.altarica.AltaricaPackage#getError_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Error#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

} // Error
