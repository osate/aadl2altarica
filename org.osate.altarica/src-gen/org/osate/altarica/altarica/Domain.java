/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Domain#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' containment reference.
   * @see #setDomain(Enumeration)
   * @see org.osate.altarica.altarica.AltaricaPackage#getDomain_Domain()
   * @model containment="true"
   * @generated
   */
  Enumeration getDomain();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Domain#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(Enumeration value);

} // Domain
