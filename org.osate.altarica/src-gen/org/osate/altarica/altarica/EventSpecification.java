/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.EventSpecification#getOwnedEvents <em>Owned Events</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getEventSpecification()
 * @model
 * @generated
 */
public interface EventSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Events</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Events</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getEventSpecification_OwnedEvents()
   * @model containment="true"
   * @generated
   */
  EList<NamedElement> getOwnedEvents();

} // EventSpecification
