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
import org.osate.altarica.altarica.FlowSpecification;
import org.osate.altarica.altarica.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.FlowSpecificationImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowSpecificationImpl extends AbstractSpecificationImpl implements FlowSpecification
{
  /**
   * The cached value of the '{@link #getOwnedFlows() <em>Owned Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedFlows()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> ownedFlows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowSpecificationImpl()
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
    return AltaricaPackage.Literals.FLOW_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getOwnedFlows()
  {
    if (ownedFlows == null)
    {
      ownedFlows = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, AltaricaPackage.FLOW_SPECIFICATION__OWNED_FLOWS);
    }
    return ownedFlows;
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_FLOWS:
        return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_FLOWS:
        return getOwnedFlows();
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_FLOWS:
        getOwnedFlows().clear();
        getOwnedFlows().addAll((Collection<? extends NamedElement>)newValue);
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_FLOWS:
        getOwnedFlows().clear();
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
      case AltaricaPackage.FLOW_SPECIFICATION__OWNED_FLOWS:
        return ownedFlows != null && !ownedFlows.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FlowSpecificationImpl
