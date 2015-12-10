/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Node;
import org.osate.altarica.altarica.NodeInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.NodeInstanceImpl#getNodeType <em>Node Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeInstanceImpl extends NamedElementImpl implements NodeInstance
{
  /**
   * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeType()
   * @generated
   * @ordered
   */
  protected Node nodeType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeInstanceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AltaricaPackage.Literals.NODE_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getNodeType()
  {
    if (nodeType != null && nodeType.eIsProxy())
    {
      InternalEObject oldNodeType = (InternalEObject)nodeType;
      nodeType = (Node)eResolveProxy(oldNodeType);
      if (nodeType != oldNodeType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AltaricaPackage.NODE_INSTANCE__NODE_TYPE, oldNodeType, nodeType));
      }
    }
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetNodeType()
  {
    return nodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeType(Node newNodeType)
  {
    Node oldNodeType = nodeType;
    nodeType = newNodeType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NODE_INSTANCE__NODE_TYPE, oldNodeType, nodeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AltaricaPackage.NODE_INSTANCE__NODE_TYPE:
        if (resolve) return getNodeType();
        return basicGetNodeType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AltaricaPackage.NODE_INSTANCE__NODE_TYPE:
        setNodeType((Node)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AltaricaPackage.NODE_INSTANCE__NODE_TYPE:
        setNodeType((Node)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AltaricaPackage.NODE_INSTANCE__NODE_TYPE:
        return nodeType != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeInstanceImpl
