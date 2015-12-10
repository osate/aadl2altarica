/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.TransitionSpecification#getOwnedTransitionTransitions <em>Owned Transition Transitions</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getTransitionSpecification()
 * @model
 * @generated
 */
public interface TransitionSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Transition Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Transition Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Transition Transitions</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getTransitionSpecification_OwnedTransitionTransitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getOwnedTransitionTransitions();

} // TransitionSpecification
