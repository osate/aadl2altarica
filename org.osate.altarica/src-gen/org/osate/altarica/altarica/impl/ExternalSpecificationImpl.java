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
import org.osate.altarica.altarica.ExternalDirective;
import org.osate.altarica.altarica.ExternalSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.ExternalSpecificationImpl#getOwnedDirectives <em>Owned Directives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSpecificationImpl extends AbstractSpecificationImpl implements ExternalSpecification
{
  /**
   * The cached value of the '{@link #getOwnedDirectives() <em>Owned Directives</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedDirectives()
   * @generated
   * @ordered
   */
  protected EList<ExternalDirective> ownedDirectives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalSpecificationImpl()
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
    return AltaricaPackage.Literals.EXTERNAL_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalDirective> getOwnedDirectives()
  {
    if (ownedDirectives == null)
    {
      ownedDirectives = new EObjectContainmentEList<ExternalDirective>(ExternalDirective.class, this, AltaricaPackage.EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES);
    }
    return ownedDirectives;
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
      case AltaricaPackage.EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES:
        return ((InternalEList<?>)getOwnedDirectives()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES:
        return getOwnedDirectives();
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
      case AltaricaPackage.EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES:
        getOwnedDirectives().clear();
        getOwnedDirectives().addAll((Collection<? extends ExternalDirective>)newValue);
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
      case AltaricaPackage.EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES:
        getOwnedDirectives().clear();
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
      case AltaricaPackage.EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES:
        return ownedDirectives != null && !ownedDirectives.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExternalSpecificationImpl
