/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.ConstantDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getConstantDefinition()
 * @model
 * @generated
 */
public interface ConstantDefinition extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(AbstractDefinitionConstant)
   * @see org.osate.altarica.altarica.AltaricaPackage#getConstantDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  AbstractDefinitionConstant getExpression();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.ConstantDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(AbstractDefinitionConstant value);

} // ConstantDefinition
