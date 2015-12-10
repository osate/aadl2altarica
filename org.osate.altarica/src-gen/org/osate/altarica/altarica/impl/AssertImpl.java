/**
 */
package org.osate.altarica.altarica.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.altarica.altarica.AbstractBooleanExpression;
import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Assert;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.AssertImpl#getOwnedExpressions <em>Owned Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertImpl extends MinimalEObjectImpl.Container implements Assert
{
  /**
   * The cached value of the '{@link #getOwnedExpressions() <em>Owned Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedExpressions()
   * @generated
   * @ordered
   */
  protected EList<AbstractBooleanExpression> ownedExpressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertImpl()
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
    return AltaricaPackage.Literals.ASSERT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractBooleanExpression> getOwnedExpressions()
  {
    if (ownedExpressions == null)
    {
      ownedExpressions = new EObjectContainmentEList<AbstractBooleanExpression>(AbstractBooleanExpression.class, this, AltaricaPackage.ASSERT__OWNED_EXPRESSIONS);
    }
    return ownedExpressions;
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
      case AltaricaPackage.ASSERT__OWNED_EXPRESSIONS:
        return ((InternalEList<?>)getOwnedExpressions()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.ASSERT__OWNED_EXPRESSIONS:
        return getOwnedExpressions();
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
      case AltaricaPackage.ASSERT__OWNED_EXPRESSIONS:
        getOwnedExpressions().clear();
        getOwnedExpressions().addAll((Collection<? extends AbstractBooleanExpression>)newValue);
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
      case AltaricaPackage.ASSERT__OWNED_EXPRESSIONS:
        getOwnedExpressions().clear();
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
      case AltaricaPackage.ASSERT__OWNED_EXPRESSIONS:
        return ownedExpressions != null && !ownedExpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssertImpl
