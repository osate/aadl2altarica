/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Enumeration#getOwnedSymbols <em>Owned Symbols</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends AbstractDomain
{
  /**
   * Returns the value of the '<em><b>Owned Symbols</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Symbols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Symbols</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getEnumeration_OwnedSymbols()
   * @model containment="true"
   * @generated
   */
  EList<NamedElement> getOwnedSymbols();

} // Enumeration
