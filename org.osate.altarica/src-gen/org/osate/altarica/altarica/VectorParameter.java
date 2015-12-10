/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.VectorParameter#getEventParameter <em>Event Parameter</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.VectorParameter#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getVectorParameter()
 * @model
 * @generated
 */
public interface VectorParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Parameter</em>' containment reference.
   * @see #setEventParameter(EventRef)
   * @see org.osate.altarica.altarica.AltaricaPackage#getVectorParameter_EventParameter()
   * @model containment="true"
   * @generated
   */
  EventRef getEventParameter();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.VectorParameter#getEventParameter <em>Event Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Parameter</em>' containment reference.
   * @see #getEventParameter()
   * @generated
   */
  void setEventParameter(EventRef value);

  /**
   * Returns the value of the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Required</em>' attribute.
   * @see #setIsRequired(boolean)
   * @see org.osate.altarica.altarica.AltaricaPackage#getVectorParameter_IsRequired()
   * @model
   * @generated
   */
  boolean isIsRequired();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.VectorParameter#isIsRequired <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Required</em>' attribute.
   * @see #isIsRequired()
   * @generated
   */
  void setIsRequired(boolean value);

} // VectorParameter
