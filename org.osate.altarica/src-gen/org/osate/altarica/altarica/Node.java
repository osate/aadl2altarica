/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Node#getOwnedSpecifications <em>Owned Specifications</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Owned Specifications</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.AbstractSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Specifications</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getNode_OwnedSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<AbstractSpecification> getOwnedSpecifications();

} // Node
