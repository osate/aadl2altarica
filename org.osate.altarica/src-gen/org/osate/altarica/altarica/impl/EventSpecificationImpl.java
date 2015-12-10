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
import org.osate.altarica.altarica.EventSpecification;
import org.osate.altarica.altarica.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.EventSpecificationImpl#getOwnedEvents <em>Owned Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventSpecificationImpl extends AbstractSpecificationImpl implements EventSpecification
{
  /**
   * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedEvents()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> ownedEvents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSpecificationImpl()
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
    return AltaricaPackage.Literals.EVENT_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getOwnedEvents()
  {
    if (ownedEvents == null)
    {
      ownedEvents = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENTS);
    }
    return ownedEvents;
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENTS:
        return ((InternalEList<?>)getOwnedEvents()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENTS:
        return getOwnedEvents();
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENTS:
        getOwnedEvents().clear();
        getOwnedEvents().addAll((Collection<? extends NamedElement>)newValue);
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENTS:
        getOwnedEvents().clear();
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
      case AltaricaPackage.EVENT_SPECIFICATION__OWNED_EVENTS:
        return ownedEvents != null && !ownedEvents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EventSpecificationImpl
