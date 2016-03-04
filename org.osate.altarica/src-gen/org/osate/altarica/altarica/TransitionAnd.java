/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.TransitionAnd#getLeft <em>Left</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.TransitionAnd#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getTransitionAnd()
 * @model
 * @generated
 */
public interface TransitionAnd extends TransitionExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(TransitionExpression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getTransitionAnd_Left()
   * @model containment="true"
   * @generated
   */
  TransitionExpression getLeft();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.TransitionAnd#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TransitionExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(TransitionExpression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getTransitionAnd_Right()
   * @model containment="true"
   * @generated
   */
  TransitionExpression getRight();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.TransitionAnd#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(TransitionExpression value);

} // TransitionAnd
