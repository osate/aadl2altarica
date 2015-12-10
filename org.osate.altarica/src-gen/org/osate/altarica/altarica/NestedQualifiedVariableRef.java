/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Qualified Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.NestedQualifiedVariableRef#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.NestedQualifiedVariableRef#getNestedVariable <em>Nested Variable</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getNestedQualifiedVariableRef()
 * @model
 * @generated
 */
public interface NestedQualifiedVariableRef extends VariableRef
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
   * @see #setTarget(VariableRef)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNestedQualifiedVariableRef_Target()
   * @model containment="true"
   * @generated
   */
  VariableRef getTarget();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NestedQualifiedVariableRef#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(VariableRef value);

  /**
   * Returns the value of the '<em><b>Nested Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nested Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Variable</em>' reference.
   * @see #setNestedVariable(NamedElement)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNestedQualifiedVariableRef_NestedVariable()
   * @model
   * @generated
   */
  NamedElement getNestedVariable();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NestedQualifiedVariableRef#getNestedVariable <em>Nested Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nested Variable</em>' reference.
   * @see #getNestedVariable()
   * @generated
   */
  void setNestedVariable(NamedElement value);

} // NestedQualifiedVariableRef
