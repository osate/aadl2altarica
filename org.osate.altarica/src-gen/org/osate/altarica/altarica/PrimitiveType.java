/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.PrimitiveType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends AbstractDomain
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.osate.altarica.altarica.PrimitiveTypeKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.osate.altarica.altarica.PrimitiveTypeKind
   * @see #setName(PrimitiveTypeKind)
   * @see org.osate.altarica.altarica.AltaricaPackage#getPrimitiveType_Name()
   * @model
   * @generated
   */
  PrimitiveTypeKind getName();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.PrimitiveType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.osate.altarica.altarica.PrimitiveTypeKind
   * @see #getName()
   * @generated
   */
  void setName(PrimitiveTypeKind value);

} // PrimitiveType
