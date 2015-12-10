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
import org.osate.altarica.altarica.InitSpecification;
import org.osate.altarica.altarica.InitStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.InitSpecificationImpl#getOwnedInitStatements <em>Owned Init Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitSpecificationImpl extends AbstractSpecificationImpl implements InitSpecification
{
  /**
   * The cached value of the '{@link #getOwnedInitStatements() <em>Owned Init Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedInitStatements()
   * @generated
   * @ordered
   */
  protected EList<InitStatement> ownedInitStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitSpecificationImpl()
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
    return AltaricaPackage.Literals.INIT_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InitStatement> getOwnedInitStatements()
  {
    if (ownedInitStatements == null)
    {
      ownedInitStatements = new EObjectContainmentEList<InitStatement>(InitStatement.class, this, AltaricaPackage.INIT_SPECIFICATION__OWNED_INIT_STATEMENTS);
    }
    return ownedInitStatements;
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
      case AltaricaPackage.INIT_SPECIFICATION__OWNED_INIT_STATEMENTS:
        return ((InternalEList<?>)getOwnedInitStatements()).basicRemove(otherEnd, msgs);
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
      case AltaricaPackage.INIT_SPECIFICATION__OWNED_INIT_STATEMENTS:
        return getOwnedInitStatements();
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
      case AltaricaPackage.INIT_SPECIFICATION__OWNED_INIT_STATEMENTS:
        getOwnedInitStatements().clear();
        getOwnedInitStatements().addAll((Collection<? extends InitStatement>)newValue);
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
      case AltaricaPackage.INIT_SPECIFICATION__OWNED_INIT_STATEMENTS:
        getOwnedInitStatements().clear();
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
      case AltaricaPackage.INIT_SPECIFICATION__OWNED_INIT_STATEMENTS:
        return ownedInitStatements != null && !ownedInitStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InitSpecificationImpl
