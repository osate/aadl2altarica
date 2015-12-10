/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.EventRef;
import org.osate.altarica.altarica.NamedElement;
import org.osate.altarica.altarica.NestedQualifiedEventRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Qualified Event Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.NestedQualifiedEventRefImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.impl.NestedQualifiedEventRefImpl#getNestedVariable <em>Nested Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedQualifiedEventRefImpl extends EventRefImpl implements NestedQualifiedEventRef
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EventRef target;

  /**
   * The cached value of the '{@link #getNestedVariable() <em>Nested Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedVariable()
   * @generated
   * @ordered
   */
  protected NamedElement nestedVariable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedQualifiedEventRefImpl()
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
    return AltaricaPackage.Literals.NESTED_QUALIFIED_EVENT_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventRef getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(EventRef newTarget, NotificationChain msgs)
  {
    EventRef oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(EventRef newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getNestedVariable()
  {
    if (nestedVariable != null && nestedVariable.eIsProxy())
    {
      InternalEObject oldNestedVariable = (InternalEObject)nestedVariable;
      nestedVariable = (NamedElement)eResolveProxy(oldNestedVariable);
      if (nestedVariable != oldNestedVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE, oldNestedVariable, nestedVariable));
      }
    }
    return nestedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetNestedVariable()
  {
    return nestedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNestedVariable(NamedElement newNestedVariable)
  {
    NamedElement oldNestedVariable = nestedVariable;
    nestedVariable = newNestedVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE, oldNestedVariable, nestedVariable));
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
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET:
        return basicSetTarget(null, msgs);
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
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET:
        return getTarget();
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE:
        if (resolve) return getNestedVariable();
        return basicGetNestedVariable();
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
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET:
        setTarget((EventRef)newValue);
        return;
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE:
        setNestedVariable((NamedElement)newValue);
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
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET:
        setTarget((EventRef)null);
        return;
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE:
        setNestedVariable((NamedElement)null);
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
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__TARGET:
        return target != null;
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE:
        return nestedVariable != null;
    }
    return super.eIsSet(featureID);
  }

} //NestedQualifiedEventRefImpl
