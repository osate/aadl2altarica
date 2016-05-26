/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.NamedType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getNamedType()
 * @model
 * @generated
 */
public interface NamedType extends Type
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(NamedElement)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNamedType_Ref()
   * @model
   * @generated
   */
  NamedElement getRef();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NamedType#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(NamedElement value);

} // NamedType
