/**
 */
package org.osate.altarica.altarica.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.NamedElement;
import org.osate.altarica.altarica.NodeInstanceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.NodeInstanceSpecificationImpl#getOwnedNodeInstances <em>Owned Node Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeInstanceSpecificationImpl extends AbstractSpecificationImpl implements NodeInstanceSpecification
{
  /**
   * The cached value of the '{@link #getOwnedNodeInstances() <em>Owned Node Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedNodeInstances()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> ownedNodeInstances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeInstanceSpecificationImpl()
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
    return AltaricaPackage.Literals.NODE_INSTANCE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getOwnedNodeInstances()
  {
    if (ownedNodeInstances == null)
    {
      ownedNodeInstances = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES);
    }
    return ownedNodeInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES:
        return ((InternalEList<?>)getOwnedNodeInstances()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES:
        return getOwnedNodeInstances();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES:
        getOwnedNodeInstances().clear();
        getOwnedNodeInstances().addAll((Collection<? extends NamedElement>)newValue);
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES:
        getOwnedNodeInstances().clear();
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES:
        return ownedNodeInstances != null && !ownedNodeInstances.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeInstanceSpecificationImpl
