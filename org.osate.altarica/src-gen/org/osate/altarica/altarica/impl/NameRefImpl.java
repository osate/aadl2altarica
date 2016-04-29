/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.NameRef;
import org.osate.altarica.altarica.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.NameRefImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.impl.NameRefImpl#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameRefImpl extends ExpressionImpl implements NameRef
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected NamedElement variable;

  /**
   * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNested()
   * @generated
   * @ordered
   */
  protected NameRef nested;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameRefImpl()
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
    return AltaricaPackage.Literals.NAME_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (NamedElement)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AltaricaPackage.NAME_REF__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(NamedElement newVariable)
  {
    NamedElement oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NAME_REF__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameRef getNested()
  {
    return nested;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNested(NameRef newNested, NotificationChain msgs)
  {
    NameRef oldNested = nested;
    nested = newNested;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.NAME_REF__NESTED, oldNested, newNested);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNested(NameRef newNested)
  {
    if (newNested != nested)
    {
      NotificationChain msgs = null;
      if (nested != null)
        msgs = ((InternalEObject)nested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.NAME_REF__NESTED, null, msgs);
      if (newNested != null)
        msgs = ((InternalEObject)newNested).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.NAME_REF__NESTED, null, msgs);
      msgs = basicSetNested(newNested, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NAME_REF__NESTED, newNested, newNested));
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
      case AltaricaPackage.NAME_REF__NESTED:
        return basicSetNested(null, msgs);
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
      case AltaricaPackage.NAME_REF__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case AltaricaPackage.NAME_REF__NESTED:
        return getNested();
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
      case AltaricaPackage.NAME_REF__VARIABLE:
        setVariable((NamedElement)newValue);
        return;
      case AltaricaPackage.NAME_REF__NESTED:
        setNested((NameRef)newValue);
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
      case AltaricaPackage.NAME_REF__VARIABLE:
        setVariable((NamedElement)null);
        return;
      case AltaricaPackage.NAME_REF__NESTED:
        setNested((NameRef)null);
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
      case AltaricaPackage.NAME_REF__VARIABLE:
        return variable != null;
      case AltaricaPackage.NAME_REF__NESTED:
        return nested != null;
    }
    return super.eIsSet(featureID);
  }

} //NameRefImpl
