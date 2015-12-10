/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.State#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.State#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement
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
   * @see #setDomain(AbstractTypeRef)
   * @see org.osate.altarica.altarica.AltaricaPackage#getState_Domain()
   * @model containment="true"
   * @generated
   */
  AbstractTypeRef getDomain();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.State#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(AbstractTypeRef value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(VariableAttribute)
   * @see org.osate.altarica.altarica.AltaricaPackage#getState_Attribute()
   * @model containment="true"
   * @generated
   */
  VariableAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.State#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(VariableAttribute value);

} // State
