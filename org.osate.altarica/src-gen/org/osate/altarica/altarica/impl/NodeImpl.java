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

import org.osate.altarica.altarica.AbstractSpecification;
import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.NodeImpl#getOwnedSpecifications <em>Owned Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends NamedElementImpl implements Node
{
  /**
   * The cached value of the '{@link #getOwnedSpecifications() <em>Owned Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedSpecifications()
   * @generated
   * @ordered
   */
  protected EList<AbstractSpecification> ownedSpecifications;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
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
    return AltaricaPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractSpecification> getOwnedSpecifications()
  {
    if (ownedSpecifications == null)
    {
      ownedSpecifications = new EObjectContainmentEList<AbstractSpecification>(AbstractSpecification.class, this, AltaricaPackage.NODE__OWNED_SPECIFICATIONS);
    }
    return ownedSpecifications;
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
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        return ((InternalEList<?>)getOwnedSpecifications()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        return getOwnedSpecifications();
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
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        getOwnedSpecifications().clear();
        getOwnedSpecifications().addAll((Collection<? extends AbstractSpecification>)newValue);
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
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        getOwnedSpecifications().clear();
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
      case AltaricaPackage.NODE__OWNED_SPECIFICATIONS:
        return ownedSpecifications != null && !ownedSpecifications.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeImpl
