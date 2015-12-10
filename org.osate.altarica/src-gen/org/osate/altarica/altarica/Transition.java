/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Transition#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Transition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Transition#getOwnedAffectations <em>Owned Affectations</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
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
   * @see #setOwnedExpression(AbstractExpression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getTransition_OwnedExpression()
   * @model containment="true"
   * @generated
   */
  AbstractExpression getOwnedExpression();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Transition#getOwnedExpression <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Expression</em>' containment reference.
   * @see #getOwnedExpression()
   * @generated
   */
  void setOwnedExpression(AbstractExpression value);

  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see org.osate.altarica.altarica.AltaricaPackage#getTransition_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Transition#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Owned Affectations</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Affectations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Affectations</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getTransition_OwnedAffectations()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getOwnedAffectations();

} // Transition
