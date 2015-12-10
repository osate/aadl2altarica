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
import org.osate.altarica.altarica.StateSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.StateSpecificationImpl#getOwnedStates <em>Owned States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateSpecificationImpl extends AbstractSpecificationImpl implements StateSpecification
{
  /**
   * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedStates()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> ownedStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateSpecificationImpl()
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
    return AltaricaPackage.Literals.STATE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getOwnedStates()
  {
    if (ownedStates == null)
    {
      ownedStates = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, AltaricaPackage.STATE_SPECIFICATION__OWNED_STATES);
    }
    return ownedStates;
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATES:
        return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATES:
        return getOwnedStates();
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATES:
        getOwnedStates().clear();
        getOwnedStates().addAll((Collection<? extends NamedElement>)newValue);
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATES:
        getOwnedStates().clear();
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
      case AltaricaPackage.STATE_SPECIFICATION__OWNED_STATES:
        return ownedStates != null && !ownedStates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateSpecificationImpl
