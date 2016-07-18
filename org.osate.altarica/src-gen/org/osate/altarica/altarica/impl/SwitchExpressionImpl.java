/**
 */
package org.osate.altarica.altarica.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.CaseExpression;
import org.osate.altarica.altarica.Expression;
import org.osate.altarica.altarica.SwitchExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.SwitchExpressionImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.impl.SwitchExpressionImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchExpressionImpl extends ExpressionImpl implements SwitchExpression
{
  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<CaseExpression> cases;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected Expression default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchExpressionImpl()
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
    return AltaricaPackage.Literals.SWITCH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CaseExpression> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<CaseExpression>(CaseExpression.class, this, AltaricaPackage.SWITCH_EXPRESSION__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs)
  {
    Expression oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.SWITCH_EXPRESSION__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(Expression newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.SWITCH_EXPRESSION__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.SWITCH_EXPRESSION__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.SWITCH_EXPRESSION__DEFAULT, newDefault, newDefault));
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
      case AltaricaPackage.SWITCH_EXPRESSION__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case AltaricaPackage.SWITCH_EXPRESSION__DEFAULT:
        return basicSetDefault(null, msgs);
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
      case AltaricaPackage.SWITCH_EXPRESSION__CASES:
        return getCases();
      case AltaricaPackage.SWITCH_EXPRESSION__DEFAULT:
        return getDefault();
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
      case AltaricaPackage.SWITCH_EXPRESSION__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends CaseExpression>)newValue);
        return;
      case AltaricaPackage.SWITCH_EXPRESSION__DEFAULT:
        setDefault((Expression)newValue);
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
      case AltaricaPackage.SWITCH_EXPRESSION__CASES:
        getCases().clear();
        return;
      case AltaricaPackage.SWITCH_EXPRESSION__DEFAULT:
        setDefault((Expression)null);
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
      case AltaricaPackage.SWITCH_EXPRESSION__CASES:
        return cases != null && !cases.isEmpty();
      case AltaricaPackage.SWITCH_EXPRESSION__DEFAULT:
        return default_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SwitchExpressionImpl
