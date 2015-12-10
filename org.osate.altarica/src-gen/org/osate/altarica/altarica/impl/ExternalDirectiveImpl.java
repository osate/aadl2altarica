/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.ExternalDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.osate.altarica.altarica.impl.ExternalDirectiveImpl#getDirective <em>Directive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalDirectiveImpl extends MinimalEObjectImpl.Container implements ExternalDirective
{
  /**
   * The default value of the '{@link #getDirective() <em>Directive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirective()
   * @generated
   * @ordered
   */
  protected static final String DIRECTIVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirective() <em>Directive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirective()
   * @generated
   * @ordered
   */
  protected String directive = DIRECTIVE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalDirectiveImpl()
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
    return AltaricaPackage.Literals.EXTERNAL_DIRECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirective()
  {
    return directive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirective(String newDirective)
  {
    String oldDirective = directive;
    directive = newDirective;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AltaricaPackage.EXTERNAL_DIRECTIVE__DIRECTIVE, oldDirective, directive));
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
      case AltaricaPackage.EXTERNAL_DIRECTIVE__DIRECTIVE:
        return getDirective();
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
      case AltaricaPackage.EXTERNAL_DIRECTIVE__DIRECTIVE:
        setDirective((String)newValue);
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
      case AltaricaPackage.EXTERNAL_DIRECTIVE__DIRECTIVE:
        setDirective(DIRECTIVE_EDEFAULT);
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
      case AltaricaPackage.EXTERNAL_DIRECTIVE__DIRECTIVE:
        return DIRECTIVE_EDEFAULT == null ? directive != null : !DIRECTIVE_EDEFAULT.equals(directive);
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
    result.append(" (directive: ");
    result.append(directive);
    result.append(')');
    return result.toString();
  }

} //ExternalDirectiveImpl
