/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.DomainConstant#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getDomainConstant()
 * @model
 * @generated
 */
public interface DomainConstant extends AbstractDefinitionConstant
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
   * @see #setDomain(AbstractDomain)
   * @see org.osate.altarica.altarica.AltaricaPackage#getDomainConstant_Domain()
   * @model containment="true"
   * @generated
   */
  AbstractDomain getDomain();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.DomainConstant#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(AbstractDomain value);

} // DomainConstant
