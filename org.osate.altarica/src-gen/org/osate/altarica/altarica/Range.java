/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Range#getLower <em>Lower</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Range#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends AbstractDomain
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' containment reference.
   * @see #setLower(Expression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getRange_Lower()
   * @model containment="true"
   * @generated
   */
  Expression getLower();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Range#getLower <em>Lower</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' containment reference.
   * @see #getLower()
   * @generated
   */
  void setLower(Expression value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' containment reference.
   * @see #setUpper(Expression)
   * @see org.osate.altarica.altarica.AltaricaPackage#getRange_Upper()
   * @model containment="true"
   * @generated
   */
  Expression getUpper();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Range#getUpper <em>Upper</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' containment reference.
   * @see #getUpper()
   * @generated
   */
  void setUpper(Expression value);

} // Range
