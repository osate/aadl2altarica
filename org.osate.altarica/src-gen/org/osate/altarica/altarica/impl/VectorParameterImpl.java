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
import org.osate.altarica.altarica.EventRef;
import org.osate.altarica.altarica.VectorParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.VectorParameterImpl#getEventParameter <em>Event Parameter</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.impl.VectorParameterImpl#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorParameterImpl extends MinimalEObjectImpl.Container implements VectorParameter
{
  /**
   * The cached value of the '{@link #getEventParameter() <em>Event Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventParameter()
   * @generated
   * @ordered
   */
  protected EventRef eventParameter;

  /**
   * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected static final boolean IS_REQUIRED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsRequired()
   * @generated
   * @ordered
   */
  protected boolean isRequired = IS_REQUIRED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VectorParameterImpl()
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
    return AltaricaPackage.Literals.VECTOR_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventRef getEventParameter()
  {
    return eventParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEventParameter(EventRef newEventParameter, NotificationChain msgs)
  {
    EventRef oldEventParameter = eventParameter;
    eventParameter = newEventParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER, oldEventParameter, newEventParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventParameter(EventRef newEventParameter)
  {
    if (newEventParameter != eventParameter)
    {
      NotificationChain msgs = null;
      if (eventParameter != null)
        msgs = ((InternalEObject)eventParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER, null, msgs);
      if (newEventParameter != null)
        msgs = ((InternalEObject)newEventParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER, null, msgs);
      msgs = basicSetEventParameter(newEventParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER, newEventParameter, newEventParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsRequired()
  {
    return isRequired;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsRequired(boolean newIsRequired)
  {
    boolean oldIsRequired = isRequired;
    isRequired = newIsRequired;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.VECTOR_PARAMETER__IS_REQUIRED, oldIsRequired, isRequired));
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
      case AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER:
        return basicSetEventParameter(null, msgs);
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
      case AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER:
        return getEventParameter();
      case AltaricaPackage.VECTOR_PARAMETER__IS_REQUIRED:
        return isIsRequired();
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
      case AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER:
        setEventParameter((EventRef)newValue);
        return;
      case AltaricaPackage.VECTOR_PARAMETER__IS_REQUIRED:
        setIsRequired((Boolean)newValue);
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
      case AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER:
        setEventParameter((EventRef)null);
        return;
      case AltaricaPackage.VECTOR_PARAMETER__IS_REQUIRED:
        setIsRequired(IS_REQUIRED_EDEFAULT);
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
      case AltaricaPackage.VECTOR_PARAMETER__EVENT_PARAMETER:
        return eventParameter != null;
      case AltaricaPackage.VECTOR_PARAMETER__IS_REQUIRED:
        return isRequired != IS_REQUIRED_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isRequired: ");
    result.append(isRequired);
    result.append(')');
    return result.toString();
  }

} //VectorParameterImpl
