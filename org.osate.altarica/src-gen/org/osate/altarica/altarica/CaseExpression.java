/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.CaseExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.CaseExpression#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getCaseExpression_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.CaseExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Instruction)
   * @see org.osate.altarica.altarica.AltaricaPackage#getCaseExpression_Then()
   * @model containment="true"
   * @generated
   */
  Instruction getThen();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.CaseExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Instruction value);

} // CaseExpression
