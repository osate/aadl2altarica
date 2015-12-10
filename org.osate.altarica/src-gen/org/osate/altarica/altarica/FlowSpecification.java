/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.FlowSpecification#getOwnedFlows <em>Owned Flows</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getFlowSpecification()
 * @model
 * @generated
 */
public interface FlowSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Flows</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Flows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Flows</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getFlowSpecification_OwnedFlows()
   * @model containment="true"
   * @generated
   */
  EList<NamedElement> getOwnedFlows();

} // FlowSpecification
