/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Event#getOwnedPriority <em>Owned Priority</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Event#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Owned Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Priority</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Priority</em>' containment reference.
   * @see #setOwnedPriority(Priority)
   * @see org.osate.altarica.altarica.AltaricaPackage#getEvent_OwnedPriority()
   * @model containment="true"
   * @generated
   */
  Priority getOwnedPriority();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Event#getOwnedPriority <em>Owned Priority</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Priority</em>' containment reference.
   * @see #getOwnedPriority()
   * @generated
   */
  void setOwnedPriority(Priority value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(VariableAttribute)
   * @see org.osate.altarica.altarica.AltaricaPackage#getEvent_Attribute()
   * @model containment="true"
   * @generated
   */
  VariableAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Event#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(VariableAttribute value);

} // Event
