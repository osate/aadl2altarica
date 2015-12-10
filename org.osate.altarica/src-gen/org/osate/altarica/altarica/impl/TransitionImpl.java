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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.altarica.altarica.AbstractExpression;
import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Assignment;
import org.osate.altarica.altarica.Event;
import org.osate.altarica.altarica.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.TransitionImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.impl.TransitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.osate.altarica.altarica.impl.TransitionImpl#getOwnedAffectations <em>Owned Affectations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getOwnedExpression() <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedExpression()
   * @generated
   * @ordered
   */
  protected AbstractExpression ownedExpression;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getOwnedAffectations() <em>Owned Affectations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedAffectations()
   * @generated
   * @ordered
   */
  protected EList<Assignment> ownedAffectations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return AltaricaPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractExpression getOwnedExpression()
  {
    return ownedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedExpression(AbstractExpression newOwnedExpression, NotificationChain msgs)
  {
    AbstractExpression oldOwnedExpression = ownedExpression;
    ownedExpression = newOwnedExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AltaricaPackage.TRANSITION__OWNED_EXPRESSION, oldOwnedExpression, newOwnedExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedExpression(AbstractExpression newOwnedExpression)
  {
    if (newOwnedExpression != ownedExpression)
    {
      NotificationChain msgs = null;
      if (ownedExpression != null)
        msgs = ((InternalEObject)ownedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.TRANSITION__OWNED_EXPRESSION, null, msgs);
      if (newOwnedExpression != null)
        msgs = ((InternalEObject)newOwnedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AltaricaPackage.TRANSITION__OWNED_EXPRESSION, null, msgs);
      msgs = basicSetOwnedExpression(newOwnedExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.TRANSITION__OWNED_EXPRESSION, newOwnedExpression, newOwnedExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Event)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AltaricaPackage.TRANSITION__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.TRANSITION__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getOwnedAffectations()
  {
    if (ownedAffectations == null)
    {
      ownedAffectations = new EObjectContainmentEList<Assignment>(Assignment.class, this, AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS);
    }
    return ownedAffectations;
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESSION:
        return basicSetOwnedExpression(null, msgs);
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        return ((InternalEList<?>)getOwnedAffectations()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESSION:
        return getOwnedExpression();
      case AltaricaPackage.TRANSITION__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        return getOwnedAffectations();
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESSION:
        setOwnedExpression((AbstractExpression)newValue);
        return;
      case AltaricaPackage.TRANSITION__EVENT:
        setEvent((Event)newValue);
        return;
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        getOwnedAffectations().clear();
        getOwnedAffectations().addAll((Collection<? extends Assignment>)newValue);
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESSION:
        setOwnedExpression((AbstractExpression)null);
        return;
      case AltaricaPackage.TRANSITION__EVENT:
        setEvent((Event)null);
        return;
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        getOwnedAffectations().clear();
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
      case AltaricaPackage.TRANSITION__OWNED_EXPRESSION:
        return ownedExpression != null;
      case AltaricaPackage.TRANSITION__EVENT:
        return event != null;
      case AltaricaPackage.TRANSITION__OWNED_AFFECTATIONS:
        return ownedAffectations != null && !ownedAffectations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionImpl
