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
import org.osate.altarica.altarica.Vector;
import org.osate.altarica.altarica.VectorSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.VectorSpecificationImpl#getOwnedVectors <em>Owned Vectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorSpecificationImpl extends AbstractSpecificationImpl implements VectorSpecification
{
  /**
   * The cached value of the '{@link #getOwnedVectors() <em>Owned Vectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedVectors()
   * @generated
   * @ordered
   */
  protected EList<Vector> ownedVectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VectorSpecificationImpl()
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
    return AltaricaPackage.Literals.VECTOR_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Vector> getOwnedVectors()
  {
    if (ownedVectors == null)
    {
      ownedVectors = new EObjectContainmentEList<Vector>(Vector.class, this, AltaricaPackage.VECTOR_SPECIFICATION__OWNED_VECTORS);
    }
    return ownedVectors;
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
      case AltaricaPackage.VECTOR_SPECIFICATION__OWNED_VECTORS:
        return ((InternalEList<?>)getOwnedVectors()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.VECTOR_SPECIFICATION__OWNED_VECTORS:
        return getOwnedVectors();
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
      case AltaricaPackage.VECTOR_SPECIFICATION__OWNED_VECTORS:
        getOwnedVectors().clear();
        getOwnedVectors().addAll((Collection<? extends Vector>)newValue);
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
      case AltaricaPackage.VECTOR_SPECIFICATION__OWNED_VECTORS:
        getOwnedVectors().clear();
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
      case AltaricaPackage.VECTOR_SPECIFICATION__OWNED_VECTORS:
        return ownedVectors != null && !ownedVectors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VectorSpecificationImpl
