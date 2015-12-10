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
import org.osate.altarica.altarica.Transition;
import org.osate.altarica.altarica.TransitionSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.TransitionSpecificationImpl#getOwnedTransitionTransitions <em>Owned Transition Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionSpecificationImpl extends AbstractSpecificationImpl implements TransitionSpecification
{
  /**
   * The cached value of the '{@link #getOwnedTransitionTransitions() <em>Owned Transition Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTransitionTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> ownedTransitionTransitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionSpecificationImpl()
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
    return AltaricaPackage.Literals.TRANSITION_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getOwnedTransitionTransitions()
  {
    if (ownedTransitionTransitions == null)
    {
      ownedTransitionTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, AltaricaPackage.TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS);
    }
    return ownedTransitionTransitions;
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
      case AltaricaPackage.TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS:
        return ((InternalEList<?>)getOwnedTransitionTransitions()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS:
        return getOwnedTransitionTransitions();
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
      case AltaricaPackage.TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS:
        getOwnedTransitionTransitions().clear();
        getOwnedTransitionTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case AltaricaPackage.TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS:
        getOwnedTransitionTransitions().clear();
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
      case AltaricaPackage.TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS:
        return ownedTransitionTransitions != null && !ownedTransitionTransitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionSpecificationImpl
