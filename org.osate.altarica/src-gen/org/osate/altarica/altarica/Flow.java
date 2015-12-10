/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Flow#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Flow#getKind <em>Kind</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Flow#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends NamedElement
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
   * @see org.osate.altarica.altarica.AltaricaPackage#getFlow_Domain()
   * @model containment="true"
   * @generated
   */
  AbstractTypeRef getDomain();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Flow#getDomain <em>Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' containment reference.
   * @see #getDomain()
   * @generated
   */
  void setDomain(AbstractTypeRef value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.osate.altarica.altarica.FlowKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.osate.altarica.altarica.FlowKind
   * @see #setKind(FlowKind)
   * @see org.osate.altarica.altarica.AltaricaPackage#getFlow_Kind()
   * @model
   * @generated
   */
  FlowKind getKind();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Flow#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.osate.altarica.altarica.FlowKind
   * @see #getKind()
   * @generated
   */
  void setKind(FlowKind value);

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
   * @see org.osate.altarica.altarica.AltaricaPackage#getFlow_Attribute()
   * @model containment="true"
   * @generated
   */
  VariableAttribute getAttribute();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Flow#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(VariableAttribute value);

} // Flow
