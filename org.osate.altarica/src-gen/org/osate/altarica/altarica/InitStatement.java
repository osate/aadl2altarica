/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.InitStatement#getAffectation <em>Affectation</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getInitStatement()
 * @model
 * @generated
 */
public interface InitStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Affectation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Affectation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Affectation</em>' containment reference.
   * @see #setAffectation(Assignment)
   * @see org.osate.altarica.altarica.AltaricaPackage#getInitStatement_Affectation()
   * @model containment="true"
   * @generated
   */
  Assignment getAffectation();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.InitStatement#getAffectation <em>Affectation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Affectation</em>' containment reference.
   * @see #getAffectation()
   * @generated
   */
  void setAffectation(Assignment value);

} // InitStatement
