/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Assignment;
import org.osate.altarica.altarica.InitStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.InitStatementImpl#getAffectation <em>Affectation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitStatementImpl extends MinimalEObjectImpl.Container implements InitStatement
{
  /**
   * The cached value of the '{@link #getAffectation() <em>Affectation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAffectation()
   * @generated
   * @ordered
   */
  protected Assignment affectation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitStatementImpl()
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
    return AltaricaPackage.Literals.INIT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getAffectation()
  {
    return affectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAffectation(Assignment newAffectation, NotificationChain msgs)
  {
    Assignment oldAffectation = affectation;
    affectation = newAffectation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.INIT_STATEMENT__AFFECTATION, oldAffectation, newAffectation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAffectation(Assignment newAffectation)
  {
    if (newAffectation != affectation)
    {
      NotificationChain msgs = null;
      if (affectation != null)
        msgs = ((InternalEObject)affectation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.INIT_STATEMENT__AFFECTATION, null, msgs);
      if (newAffectation != null)
        msgs = ((InternalEObject)newAffectation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.INIT_STATEMENT__AFFECTATION, null, msgs);
      msgs = basicSetAffectation(newAffectation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.INIT_STATEMENT__AFFECTATION, newAffectation, newAffectation));
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
      case AltaricaPackage.INIT_STATEMENT__AFFECTATION:
        return basicSetAffectation(null, msgs);
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
      case AltaricaPackage.INIT_STATEMENT__AFFECTATION:
        return getAffectation();
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
      case AltaricaPackage.INIT_STATEMENT__AFFECTATION:
        setAffectation((Assignment)newValue);
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
      case AltaricaPackage.INIT_STATEMENT__AFFECTATION:
        setAffectation((Assignment)null);
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
      case AltaricaPackage.INIT_STATEMENT__AFFECTATION:
        return affectation != null;
    }
    return super.eIsSet(featureID);
  }

} //InitStatementImpl
