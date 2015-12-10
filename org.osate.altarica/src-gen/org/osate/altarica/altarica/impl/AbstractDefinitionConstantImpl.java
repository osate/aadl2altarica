/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.altarica.altarica.AbstractDefinitionConstant;
import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Definition Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.AbstractDefinitionConstantImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractDefinitionConstantImpl extends MinimalEObjectImpl.Container implements AbstractDefinitionConstant
{
  /**
   * The cached value of the '{@link #getOwnedExpression() <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedExpression()
   * @generated
   * @ordered
   */
  protected Expression ownedExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractDefinitionConstantImpl()
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
    return AltaricaPackage.Literals.ABSTRACT_DEFINITION_CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOwnedExpression()
  {
    return ownedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedExpression(Expression newOwnedExpression, NotificationChain msgs)
  {
    Expression oldOwnedExpression = ownedExpression;
    ownedExpression = newOwnedExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION, oldOwnedExpression, newOwnedExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedExpression(Expression newOwnedExpression)
  {
    if (newOwnedExpression != ownedExpression)
    {
      NotificationChain msgs = null;
      if (ownedExpression != null)
        msgs = ((InternalEObject)ownedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION, null, msgs);
      if (newOwnedExpression != null)
        msgs = ((InternalEObject)newOwnedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION, null, msgs);
      msgs = basicSetOwnedExpression(newOwnedExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION, newOwnedExpression, newOwnedExpression));
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
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION:
        return basicSetOwnedExpression(null, msgs);
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
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION:
        return getOwnedExpression();
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
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION:
        setOwnedExpression((Expression)newValue);
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
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION:
        setOwnedExpression((Expression)null);
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
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION:
        return ownedExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractDefinitionConstantImpl
