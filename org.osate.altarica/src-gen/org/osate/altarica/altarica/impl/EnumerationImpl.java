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
import org.osate.altarica.altarica.Enumeration;
import org.osate.altarica.altarica.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.EnumerationImpl#getOwnedSymbols <em>Owned Symbols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends AbstractDomainImpl implements Enumeration
{
  /**
   * The cached value of the '{@link #getOwnedSymbols() <em>Owned Symbols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedSymbols()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> ownedSymbols;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationImpl()
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
    return AltaricaPackage.Literals.ENUMERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getOwnedSymbols()
  {
    if (ownedSymbols == null)
    {
      ownedSymbols = new EObjectContainmentEList<NamedElement>(NamedElement.class, this, AltaricaPackage.ENUMERATION__OWNED_SYMBOLS);
    }
    return ownedSymbols;
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
      case AltaricaPackage.ENUMERATION__OWNED_SYMBOLS:
        return ((InternalEList<?>)getOwnedSymbols()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.ENUMERATION__OWNED_SYMBOLS:
        return getOwnedSymbols();
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
      case AltaricaPackage.ENUMERATION__OWNED_SYMBOLS:
        getOwnedSymbols().clear();
        getOwnedSymbols().addAll((Collection<? extends NamedElement>)newValue);
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
      case AltaricaPackage.ENUMERATION__OWNED_SYMBOLS:
        getOwnedSymbols().clear();
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
      case AltaricaPackage.ENUMERATION__OWNED_SYMBOLS:
        return ownedSymbols != null && !ownedSymbols.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnumerationImpl
