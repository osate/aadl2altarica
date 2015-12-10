/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.ExternalSpecification#getOwnedDirectives <em>Owned Directives</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getExternalSpecification()
 * @model
 * @generated
 */
public interface ExternalSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Directives</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.ExternalDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Directives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Directives</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getExternalSpecification_OwnedDirectives()
   * @model containment="true"
   * @generated
   */
  EList<ExternalDirective> getOwnedDirectives();

} // ExternalSpecification
