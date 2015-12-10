/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.AssertSpecification#getOwnedAsserts <em>Owned Asserts</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getAssertSpecification()
 * @model
 * @generated
 */
public interface AssertSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Asserts</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.Assert}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Asserts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Asserts</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getAssertSpecification_OwnedAsserts()
   * @model containment="true"
   * @generated
   */
  EList<Assert> getOwnedAsserts();

} // AssertSpecification
