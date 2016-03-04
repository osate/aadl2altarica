/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.NestedRef#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.NestedRef#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getNestedRef()
 * @model
 * @generated
 */
public interface NestedRef extends NameRef
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(NameRef)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNestedRef_Target()
   * @model containment="true"
   * @generated
   */
  NameRef getTarget();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NestedRef#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NameRef value);

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
   * @see org.osate.altarica.altarica.AltaricaPackage#getNestedRef_Nested()
   * @model containment="true"
   * @generated
   */
  NameRef getNested();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NestedRef#getNested <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested</em>' containment reference.
   * @see #getNested()
   * @generated
   */
  void setNested(NameRef value);

} // NestedRef
