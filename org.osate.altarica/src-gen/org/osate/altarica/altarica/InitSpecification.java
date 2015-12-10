/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.InitSpecification#getOwnedInitStatements <em>Owned Init Statements</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getInitSpecification()
 * @model
 * @generated
 */
public interface InitSpecification extends AbstractSpecification
{
  /**
   * Returns the value of the '<em><b>Owned Init Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.InitStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Init Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Init Statements</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getInitSpecification_OwnedInitStatements()
   * @model containment="true"
   * @generated
   */
  EList<InitStatement> getOwnedInitStatements();

} // InitSpecification
