/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Domain#getConstants <em>Constants</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constants</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getDomain_Constants()
   * @model containment="true"
   * @generated
   */
  EList<NamedElement> getConstants();

} // Domain
