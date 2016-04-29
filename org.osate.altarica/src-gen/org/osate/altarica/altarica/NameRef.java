/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.NameRef#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.NameRef#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getNameRef()
 * @model
 * @generated
 */
public interface NameRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(NamedElement)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNameRef_Variable()
   * @model
   * @generated
   */
  NamedElement getVariable();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NameRef#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(NamedElement value);

  /**
   * Returns the value of the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested</em>' containment reference.
   * @see #setNested(NameRef)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNameRef_Nested()
   * @model containment="true"
   * @generated
   */
  NameRef getNested();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NameRef#getNested <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' containment reference.
   * @see #getNested()
   * @generated
   */
  void setNested(NameRef value);

} // NameRef
