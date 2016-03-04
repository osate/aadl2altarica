/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.LabeledTransition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.LabeledTransition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getLabeledTransition()
 * @model
 * @generated
 */
public interface LabeledTransition extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(NameRef)
   * @see org.osate.altarica.altarica.AltaricaPackage#getLabeledTransition_Event()
   * @model containment="true"
   * @generated
   */
  NameRef getEvent();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.LabeledTransition#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(NameRef value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(TransitionExpression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getLabeledTransition_Expression()
   * @model containment="true"
   * @generated
   */
  TransitionExpression getExpression();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.LabeledTransition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(TransitionExpression value);

} // LabeledTransition
