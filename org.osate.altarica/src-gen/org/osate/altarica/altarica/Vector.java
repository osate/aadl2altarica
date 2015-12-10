/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.Vector#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.Vector#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.osate.altarica.altarica.VectorParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Parameters</em>' containment reference list.
   * @see org.osate.altarica.altarica.AltaricaPackage#getVector_OwnedParameters()
   * @model containment="true"
   * @generated
   */
  EList<VectorParameter> getOwnedParameters();

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(Cardinality)
   * @see org.osate.altarica.altarica.AltaricaPackage#getVector_Cardinality()
   * @model containment="true"
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.Vector#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

} // Vector
