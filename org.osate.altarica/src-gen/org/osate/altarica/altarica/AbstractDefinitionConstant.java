/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Definition Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.AbstractDefinitionConstant#getOwnedExpression <em>Owned Expression</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getAbstractDefinitionConstant()
 * @model
 * @generated
 */
public interface AbstractDefinitionConstant extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Expression</em>' containment reference.
   * @see #setOwnedExpression(Expression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getAbstractDefinitionConstant_OwnedExpression()
   * @model containment="true"
   * @generated
   */
  Expression getOwnedExpression();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.AbstractDefinitionConstant#getOwnedExpression <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Expression</em>' containment reference.
   * @see #getOwnedExpression()
   * @generated
   */
  void setOwnedExpression(Expression value);

} // AbstractDefinitionConstant
