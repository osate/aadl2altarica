/**
 */
package org.osate.altarica.altarica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.NodeInstance#getNodeType <em>Node Type</em>}</li>
 * </ul>
 *
 * @see org.osate.altarica.altarica.AltaricaPackage#getNodeInstance()
 * @model
 * @generated
 */
public interface NodeInstance extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Node Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Type</em>' reference.
   * @see #setNodeType(Node)
   * @see org.osate.altarica.altarica.AltaricaPackage#getNodeInstance_NodeType()
   * @model
   * @generated
   */
  Node getNodeType();

  /**
   * Sets the value of the '{@link org.osate.altarica.altarica.NodeInstance#getNodeType <em>Node Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Type</em>' reference.
   * @see #getNodeType()
   * @generated
   */
  void setNodeType(Node value);

} // NodeInstance
