/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.BaseType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getBaseType()
 * @model
 * @generated
 */
public interface BaseType extends AbstractDomain, Type
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link org.osate.altarica.altarica.BaseTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.osate.altarica.altarica.BaseTypeEnum
   * @see #setName(BaseTypeEnum)
   * @see org.osate.altarica.altarica.AltaricaPackage#getBaseType_Name()
   * @model
   * @generated
   */
  BaseTypeEnum getName();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.BaseType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.osate.altarica.altarica.BaseTypeEnum
   * @see #getName()
   * @generated
   */
  void setName(BaseTypeEnum value);

} // BaseType
