/**
 */
package org.osate.altarica.altarica;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.altarica.altarica.AltaricaFactory
 * @model kind="package"
 * @generated
 */
public interface AltaricaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "altarica";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://osate.org/Altarica/2.1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "altarica";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AltaricaPackage eINSTANCE = org.osate.altarica.altarica.impl.AltaricaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ModelImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractDeclarationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDeclaration()
   * @generated
   */
  int ABSTRACT_DECLARATION = 1;

  /**
   * The number of structural features of the '<em>Abstract Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NamedElementImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = ABSTRACT_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = ABSTRACT_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractDefinitionConstantImpl <em>Abstract Definition Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractDefinitionConstantImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDefinitionConstant()
   * @generated
   */
  int ABSTRACT_DEFINITION_CONSTANT = 3;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Abstract Definition Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ExpressionConstantImpl <em>Expression Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ExpressionConstantImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExpressionConstant()
   * @generated
   */
  int EXPRESSION_CONSTANT = 4;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTANT__OWNED_EXPRESSION = ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION;

  /**
   * The number of structural features of the '<em>Expression Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTANT_FEATURE_COUNT = ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DomainConstantImpl <em>Domain Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DomainConstantImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomainConstant()
   * @generated
   */
  int DOMAIN_CONSTANT = 5;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CONSTANT__OWNED_EXPRESSION = ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CONSTANT__DOMAIN = ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Domain Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_CONSTANT_FEATURE_COUNT = ABSTRACT_DEFINITION_CONSTANT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractTypeRefImpl <em>Abstract Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractTypeRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractTypeRef()
   * @generated
   */
  int ABSTRACT_TYPE_REF = 24;

  /**
   * The number of structural features of the '<em>Abstract Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_TYPE_REF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractDomainImpl <em>Abstract Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractDomainImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDomain()
   * @generated
   */
  int ABSTRACT_DOMAIN = 6;

  /**
   * The number of structural features of the '<em>Abstract Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DOMAIN_FEATURE_COUNT = ABSTRACT_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.RangeImpl <em>Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.RangeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getRange()
   * @generated
   */
  int RANGE = 7;

  /**
   * The feature id for the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__LOWER = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE__UPPER = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EnumerationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 8;

  /**
   * The feature id for the '<em><b>Owned Symbols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__OWNED_SYMBOLS = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TypeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.BaseTypeImpl <em>Base Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.BaseTypeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getBaseType()
   * @generated
   */
  int BASE_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE__NAME = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NamedTypeImpl <em>Named Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NamedTypeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNamedType()
   * @generated
   */
  int NAMED_TYPE = 11;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE__REF = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DeclarationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 12;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.LabeledTransitionImpl <em>Labeled Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.LabeledTransitionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLabeledTransition()
   * @generated
   */
  int LABELED_TRANSITION = 13;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TRANSITION__EVENT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TRANSITION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Labeled Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABELED_TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TransitionExpressionImpl <em>Transition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TransitionExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionExpression()
   * @generated
   */
  int TRANSITION_EXPRESSION = 14;

  /**
   * The number of structural features of the '<em>Transition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ITransitionImpl <em>ITransition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ITransitionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getITransition()
   * @generated
   */
  int ITRANSITION = 15;

  /**
   * The number of structural features of the '<em>ITransition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITRANSITION_FEATURE_COUNT = TRANSITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.InstructionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 16;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.IfThenElseImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 17;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractExpression()
   * @generated
   */
  int ABSTRACT_EXPRESSION = 26;

  /**
   * The number of structural features of the '<em>Abstract Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 18;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ARBooleanImpl <em>AR Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ARBooleanImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARBoolean()
   * @generated
   */
  int AR_BOOLEAN = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_BOOLEAN__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AR Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_BOOLEAN_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ARStringImpl <em>AR String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ARStringImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARString()
   * @generated
   */
  int AR_STRING = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AR String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ARIntegerImpl <em>AR Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ARIntegerImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARInteger()
   * @generated
   */
  int AR_INTEGER = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_INTEGER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>AR Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_INTEGER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NameRefImpl <em>Name Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NameRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNameRef()
   * @generated
   */
  int NAME_REF = 22;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_REF__NESTED = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Name Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VariableAttributeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariableAttribute()
   * @generated
   */
  int VARIABLE_ATTRIBUTE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DomainRefImpl <em>Domain Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DomainRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomainRef()
   * @generated
   */
  int DOMAIN_REF = 25;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REF__REFERENCE = ABSTRACT_TYPE_REF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Domain Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_REF_FEATURE_COUNT = ABSTRACT_TYPE_REF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SwitchImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 27;

  /**
   * The feature id for the '<em><b>Owned Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__OWNED_CASES = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__DEFAULT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.CaseExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__BODY = 1;

  /**
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ConstantDefinitionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__EXPRESSION = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DomainImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SymbolicConstantImpl <em>Symbolic Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SymbolicConstantImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSymbolicConstant()
   * @generated
   */
  int SYMBOLIC_CONSTANT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_CONSTANT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Symbolic Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOLIC_CONSTANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NodeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNode()
   * @generated
   */
  int NODE = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__DECLARATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__ASSERTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VariableImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AttributeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EventImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ParameterImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ObserverImpl <em>Observer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ObserverImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getObserver()
   * @generated
   */
  int OBSERVER = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVER__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Observer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBSERVER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TransitionAndImpl <em>Transition And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TransitionAndImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionAnd()
   * @generated
   */
  int TRANSITION_AND = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_AND__LEFT = TRANSITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_AND__RIGHT = TRANSITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_AND_FEATURE_COUNT = TRANSITION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TransitionOrImpl <em>Transition Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TransitionOrImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionOr()
   * @generated
   */
  int TRANSITION_OR = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OR__LEFT = TRANSITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OR__RIGHT = TRANSITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_OR_FEATURE_COUNT = TRANSITION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SkipImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 40;

  /**
   * The number of structural features of the '<em>Skip</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AssignmentImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 41;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARIABLE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.BlockImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 42;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.LogicalImpl <em>Logical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.LogicalImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLogical()
   * @generated
   */
  int LOGICAL = 43;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Logical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EqualImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 44;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AdditionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.MultiplicationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NotImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNot()
   * @generated
   */
  int NOT = 47;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.MinusImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 48;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.BaseTypeEnum <em>Base Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.BaseTypeEnum
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getBaseTypeEnum()
   * @generated
   */
  int BASE_TYPE_ENUM = 49;


  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.osate.altarica.altarica.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.osate.altarica.altarica.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractDeclaration <em>Abstract Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declaration</em>'.
   * @see org.osate.altarica.altarica.AbstractDeclaration
   * @generated
   */
  EClass getAbstractDeclaration();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.osate.altarica.altarica.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.altarica.altarica.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractDefinitionConstant <em>Abstract Definition Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Definition Constant</em>'.
   * @see org.osate.altarica.altarica.AbstractDefinitionConstant
   * @generated
   */
  EClass getAbstractDefinitionConstant();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.AbstractDefinitionConstant#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see org.osate.altarica.altarica.AbstractDefinitionConstant#getOwnedExpression()
   * @see #getAbstractDefinitionConstant()
   * @generated
   */
  EReference getAbstractDefinitionConstant_OwnedExpression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ExpressionConstant <em>Expression Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Constant</em>'.
   * @see org.osate.altarica.altarica.ExpressionConstant
   * @generated
   */
  EClass getExpressionConstant();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.DomainConstant <em>Domain Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Constant</em>'.
   * @see org.osate.altarica.altarica.DomainConstant
   * @generated
   */
  EClass getDomainConstant();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.DomainConstant#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.osate.altarica.altarica.DomainConstant#getDomain()
   * @see #getDomainConstant()
   * @generated
   */
  EReference getDomainConstant_Domain();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractDomain <em>Abstract Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Domain</em>'.
   * @see org.osate.altarica.altarica.AbstractDomain
   * @generated
   */
  EClass getAbstractDomain();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range</em>'.
   * @see org.osate.altarica.altarica.Range
   * @generated
   */
  EClass getRange();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Range#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower</em>'.
   * @see org.osate.altarica.altarica.Range#getLower()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Lower();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Range#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper</em>'.
   * @see org.osate.altarica.altarica.Range#getUpper()
   * @see #getRange()
   * @generated
   */
  EReference getRange_Upper();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.osate.altarica.altarica.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Enumeration#getOwnedSymbols <em>Owned Symbols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Symbols</em>'.
   * @see org.osate.altarica.altarica.Enumeration#getOwnedSymbols()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_OwnedSymbols();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.osate.altarica.altarica.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.BaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Type</em>'.
   * @see org.osate.altarica.altarica.BaseType
   * @generated
   */
  EClass getBaseType();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.BaseType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.altarica.altarica.BaseType#getName()
   * @see #getBaseType()
   * @generated
   */
  EAttribute getBaseType_Name();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NamedType <em>Named Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Type</em>'.
   * @see org.osate.altarica.altarica.NamedType
   * @generated
   */
  EClass getNamedType();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.NamedType#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.osate.altarica.altarica.NamedType#getRef()
   * @see #getNamedType()
   * @generated
   */
  EReference getNamedType_Ref();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.osate.altarica.altarica.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.LabeledTransition <em>Labeled Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Labeled Transition</em>'.
   * @see org.osate.altarica.altarica.LabeledTransition
   * @generated
   */
  EClass getLabeledTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.LabeledTransition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.osate.altarica.altarica.LabeledTransition#getEvent()
   * @see #getLabeledTransition()
   * @generated
   */
  EReference getLabeledTransition_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.LabeledTransition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.osate.altarica.altarica.LabeledTransition#getExpression()
   * @see #getLabeledTransition()
   * @generated
   */
  EReference getLabeledTransition_Expression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.TransitionExpression <em>Transition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Expression</em>'.
   * @see org.osate.altarica.altarica.TransitionExpression
   * @generated
   */
  EClass getTransitionExpression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ITransition <em>ITransition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ITransition</em>'.
   * @see org.osate.altarica.altarica.ITransition
   * @generated
   */
  EClass getITransition();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.osate.altarica.altarica.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.IfThenElse <em>If Then Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Then Else</em>'.
   * @see org.osate.altarica.altarica.IfThenElse
   * @generated
   */
  EClass getIfThenElse();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.IfThenElse#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.altarica.altarica.IfThenElse#getCondition()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.IfThenElse#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.osate.altarica.altarica.IfThenElse#getThen()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.IfThenElse#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.osate.altarica.altarica.IfThenElse#getElse()
   * @see #getIfThenElse()
   * @generated
   */
  EReference getIfThenElse_Else();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.osate.altarica.altarica.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ARBoolean <em>AR Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AR Boolean</em>'.
   * @see org.osate.altarica.altarica.ARBoolean
   * @generated
   */
  EClass getARBoolean();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.ARBoolean#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.osate.altarica.altarica.ARBoolean#getValue()
   * @see #getARBoolean()
   * @generated
   */
  EAttribute getARBoolean_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ARString <em>AR String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AR String</em>'.
   * @see org.osate.altarica.altarica.ARString
   * @generated
   */
  EClass getARString();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.ARString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.osate.altarica.altarica.ARString#getValue()
   * @see #getARString()
   * @generated
   */
  EAttribute getARString_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ARInteger <em>AR Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AR Integer</em>'.
   * @see org.osate.altarica.altarica.ARInteger
   * @generated
   */
  EClass getARInteger();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.ARInteger#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.osate.altarica.altarica.ARInteger#getValue()
   * @see #getARInteger()
   * @generated
   */
  EAttribute getARInteger_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NameRef <em>Name Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Ref</em>'.
   * @see org.osate.altarica.altarica.NameRef
   * @generated
   */
  EClass getNameRef();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.NameRef#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.osate.altarica.altarica.NameRef#getVariable()
   * @see #getNameRef()
   * @generated
   */
  EReference getNameRef_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.NameRef#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see org.osate.altarica.altarica.NameRef#getNested()
   * @see #getNameRef()
   * @generated
   */
  EReference getNameRef_Nested();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.VariableAttribute <em>Variable Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Attribute</em>'.
   * @see org.osate.altarica.altarica.VariableAttribute
   * @generated
   */
  EClass getVariableAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.VariableAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.altarica.altarica.VariableAttribute#getName()
   * @see #getVariableAttribute()
   * @generated
   */
  EAttribute getVariableAttribute_Name();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractTypeRef <em>Abstract Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Type Ref</em>'.
   * @see org.osate.altarica.altarica.AbstractTypeRef
   * @generated
   */
  EClass getAbstractTypeRef();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.DomainRef <em>Domain Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Ref</em>'.
   * @see org.osate.altarica.altarica.DomainRef
   * @generated
   */
  EClass getDomainRef();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.DomainRef#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.osate.altarica.altarica.DomainRef#getReference()
   * @see #getDomainRef()
   * @generated
   */
  EReference getDomainRef_Reference();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractExpression <em>Abstract Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Expression</em>'.
   * @see org.osate.altarica.altarica.AbstractExpression
   * @generated
   */
  EClass getAbstractExpression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see org.osate.altarica.altarica.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Switch#getOwnedCases <em>Owned Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Cases</em>'.
   * @see org.osate.altarica.altarica.Switch#getOwnedCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_OwnedCases();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Switch#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see org.osate.altarica.altarica.Switch#getDefault()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Default();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.CaseExpression <em>Case Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Expression</em>'.
   * @see org.osate.altarica.altarica.CaseExpression
   * @generated
   */
  EClass getCaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.CaseExpression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.altarica.altarica.CaseExpression#getCondition()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.CaseExpression#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.osate.altarica.altarica.CaseExpression#getBody()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Body();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see org.osate.altarica.altarica.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.ConstantDefinition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.osate.altarica.altarica.ConstantDefinition#getExpression()
   * @see #getConstantDefinition()
   * @generated
   */
  EReference getConstantDefinition_Expression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.osate.altarica.altarica.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Domain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.osate.altarica.altarica.Domain#getDomain()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Domain();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.SymbolicConstant <em>Symbolic Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbolic Constant</em>'.
   * @see org.osate.altarica.altarica.SymbolicConstant
   * @generated
   */
  EClass getSymbolicConstant();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.osate.altarica.altarica.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Node#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.osate.altarica.altarica.Node#getDeclarations()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Declarations();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Node#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.osate.altarica.altarica.Node#getTransitions()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Transitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Node#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assertions</em>'.
   * @see org.osate.altarica.altarica.Node#getAssertions()
   * @see #getNode()
   * @generated
   */
  EReference getNode_Assertions();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.osate.altarica.altarica.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.altarica.altarica.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Variable#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.osate.altarica.altarica.Variable#getAttributes()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Attributes();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.osate.altarica.altarica.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.osate.altarica.altarica.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.osate.altarica.altarica.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Event#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.osate.altarica.altarica.Event#getAttributes()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Attributes();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.osate.altarica.altarica.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.altarica.altarica.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.osate.altarica.altarica.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Observer <em>Observer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Observer</em>'.
   * @see org.osate.altarica.altarica.Observer
   * @generated
   */
  EClass getObserver();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Observer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.osate.altarica.altarica.Observer#getType()
   * @see #getObserver()
   * @generated
   */
  EReference getObserver_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Observer#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.osate.altarica.altarica.Observer#getValue()
   * @see #getObserver()
   * @generated
   */
  EReference getObserver_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.TransitionAnd <em>Transition And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition And</em>'.
   * @see org.osate.altarica.altarica.TransitionAnd
   * @generated
   */
  EClass getTransitionAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.TransitionAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.TransitionAnd#getLeft()
   * @see #getTransitionAnd()
   * @generated
   */
  EReference getTransitionAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.TransitionAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.TransitionAnd#getRight()
   * @see #getTransitionAnd()
   * @generated
   */
  EReference getTransitionAnd_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.TransitionOr <em>Transition Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Or</em>'.
   * @see org.osate.altarica.altarica.TransitionOr
   * @generated
   */
  EClass getTransitionOr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.TransitionOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.TransitionOr#getLeft()
   * @see #getTransitionOr()
   * @generated
   */
  EReference getTransitionOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.TransitionOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.TransitionOr#getRight()
   * @see #getTransitionOr()
   * @generated
   */
  EReference getTransitionOr_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Skip <em>Skip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Skip</em>'.
   * @see org.osate.altarica.altarica.Skip
   * @generated
   */
  EClass getSkip();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.osate.altarica.altarica.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.osate.altarica.altarica.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.osate.altarica.altarica.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.osate.altarica.altarica.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Block#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see org.osate.altarica.altarica.Block#getInstructions()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Instructions();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Logical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical</em>'.
   * @see org.osate.altarica.altarica.Logical
   * @generated
   */
  EClass getLogical();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Logical#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.Logical#getLeft()
   * @see #getLogical()
   * @generated
   */
  EReference getLogical_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.Logical#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.altarica.altarica.Logical#getOp()
   * @see #getLogical()
   * @generated
   */
  EAttribute getLogical_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Logical#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.Logical#getRight()
   * @see #getLogical()
   * @generated
   */
  EReference getLogical_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Equal <em>Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equal</em>'.
   * @see org.osate.altarica.altarica.Equal
   * @generated
   */
  EClass getEqual();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Equal#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.Equal#getLeft()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.Equal#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.altarica.altarica.Equal#getOp()
   * @see #getEqual()
   * @generated
   */
  EAttribute getEqual_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Equal#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.Equal#getRight()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see org.osate.altarica.altarica.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Addition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.Addition#getLeft()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.Addition#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.altarica.altarica.Addition#getOp()
   * @see #getAddition()
   * @generated
   */
  EAttribute getAddition_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Addition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.Addition#getRight()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see org.osate.altarica.altarica.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.Multiplication#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.altarica.altarica.Multiplication#getOp()
   * @see #getMultiplication()
   * @generated
   */
  EAttribute getMultiplication_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see org.osate.altarica.altarica.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Not#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.osate.altarica.altarica.Not#getExpression()
   * @see #getNot()
   * @generated
   */
  EReference getNot_Expression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.osate.altarica.altarica.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Minus#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.osate.altarica.altarica.Minus#getExpression()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Expression();

  /**
   * Returns the meta object for enum '{@link org.osate.altarica.altarica.BaseTypeEnum <em>Base Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Base Type Enum</em>'.
   * @see org.osate.altarica.altarica.BaseTypeEnum
   * @generated
   */
  EEnum getBaseTypeEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AltaricaFactory getAltaricaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ModelImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractDeclarationImpl <em>Abstract Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractDeclarationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDeclaration()
     * @generated
     */
    EClass ABSTRACT_DECLARATION = eINSTANCE.getAbstractDeclaration();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NamedElementImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractDefinitionConstantImpl <em>Abstract Definition Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractDefinitionConstantImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDefinitionConstant()
     * @generated
     */
    EClass ABSTRACT_DEFINITION_CONSTANT = eINSTANCE.getAbstractDefinitionConstant();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DEFINITION_CONSTANT__OWNED_EXPRESSION = eINSTANCE.getAbstractDefinitionConstant_OwnedExpression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ExpressionConstantImpl <em>Expression Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ExpressionConstantImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExpressionConstant()
     * @generated
     */
    EClass EXPRESSION_CONSTANT = eINSTANCE.getExpressionConstant();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.DomainConstantImpl <em>Domain Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.DomainConstantImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomainConstant()
     * @generated
     */
    EClass DOMAIN_CONSTANT = eINSTANCE.getDomainConstant();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_CONSTANT__DOMAIN = eINSTANCE.getDomainConstant_Domain();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractDomainImpl <em>Abstract Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractDomainImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractDomain()
     * @generated
     */
    EClass ABSTRACT_DOMAIN = eINSTANCE.getAbstractDomain();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.RangeImpl <em>Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.RangeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getRange()
     * @generated
     */
    EClass RANGE = eINSTANCE.getRange();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__LOWER = eINSTANCE.getRange_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RANGE__UPPER = eINSTANCE.getRange_Upper();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.EnumerationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Owned Symbols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__OWNED_SYMBOLS = eINSTANCE.getEnumeration_OwnedSymbols();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.TypeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.BaseTypeImpl <em>Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.BaseTypeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getBaseType()
     * @generated
     */
    EClass BASE_TYPE = eINSTANCE.getBaseType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_TYPE__NAME = eINSTANCE.getBaseType_Name();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NamedTypeImpl <em>Named Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NamedTypeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNamedType()
     * @generated
     */
    EClass NAMED_TYPE = eINSTANCE.getNamedType();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_TYPE__REF = eINSTANCE.getNamedType_Ref();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.DeclarationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.LabeledTransitionImpl <em>Labeled Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.LabeledTransitionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLabeledTransition()
     * @generated
     */
    EClass LABELED_TRANSITION = eINSTANCE.getLabeledTransition();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_TRANSITION__EVENT = eINSTANCE.getLabeledTransition_Event();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LABELED_TRANSITION__EXPRESSION = eINSTANCE.getLabeledTransition_Expression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.TransitionExpressionImpl <em>Transition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.TransitionExpressionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionExpression()
     * @generated
     */
    EClass TRANSITION_EXPRESSION = eINSTANCE.getTransitionExpression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ITransitionImpl <em>ITransition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ITransitionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getITransition()
     * @generated
     */
    EClass ITRANSITION = eINSTANCE.getITransition();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.InstructionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.IfThenElseImpl <em>If Then Else</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.IfThenElseImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getIfThenElse()
     * @generated
     */
    EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__THEN = eINSTANCE.getIfThenElse_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ExpressionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ARBooleanImpl <em>AR Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ARBooleanImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARBoolean()
     * @generated
     */
    EClass AR_BOOLEAN = eINSTANCE.getARBoolean();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AR_BOOLEAN__VALUE = eINSTANCE.getARBoolean_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ARStringImpl <em>AR String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ARStringImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARString()
     * @generated
     */
    EClass AR_STRING = eINSTANCE.getARString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AR_STRING__VALUE = eINSTANCE.getARString_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ARIntegerImpl <em>AR Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ARIntegerImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARInteger()
     * @generated
     */
    EClass AR_INTEGER = eINSTANCE.getARInteger();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AR_INTEGER__VALUE = eINSTANCE.getARInteger_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NameRefImpl <em>Name Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NameRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNameRef()
     * @generated
     */
    EClass NAME_REF = eINSTANCE.getNameRef();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_REF__VARIABLE = eINSTANCE.getNameRef_Variable();

    /**
     * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAME_REF__NESTED = eINSTANCE.getNameRef_Nested();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.VariableAttributeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariableAttribute()
     * @generated
     */
    EClass VARIABLE_ATTRIBUTE = eINSTANCE.getVariableAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ATTRIBUTE__NAME = eINSTANCE.getVariableAttribute_Name();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractTypeRefImpl <em>Abstract Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractTypeRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractTypeRef()
     * @generated
     */
    EClass ABSTRACT_TYPE_REF = eINSTANCE.getAbstractTypeRef();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.DomainRefImpl <em>Domain Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.DomainRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomainRef()
     * @generated
     */
    EClass DOMAIN_REF = eINSTANCE.getDomainRef();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_REF__REFERENCE = eINSTANCE.getDomainRef_Reference();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractExpressionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractExpression()
     * @generated
     */
    EClass ABSTRACT_EXPRESSION = eINSTANCE.getAbstractExpression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.SwitchImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Owned Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__OWNED_CASES = eINSTANCE.getSwitch_OwnedCases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__DEFAULT = eINSTANCE.getSwitch_Default();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.CaseExpressionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getCaseExpression()
     * @generated
     */
    EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__CONDITION = eINSTANCE.getCaseExpression_Condition();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__BODY = eINSTANCE.getCaseExpression_Body();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ConstantDefinitionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getConstantDefinition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DEFINITION__EXPRESSION = eINSTANCE.getConstantDefinition_Expression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.DomainImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__DOMAIN = eINSTANCE.getDomain_Domain();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.SymbolicConstantImpl <em>Symbolic Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.SymbolicConstantImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSymbolicConstant()
     * @generated
     */
    EClass SYMBOLIC_CONSTANT = eINSTANCE.getSymbolicConstant();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NodeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__DECLARATIONS = eINSTANCE.getNode_Declarations();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__TRANSITIONS = eINSTANCE.getNode_Transitions();

    /**
     * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__ASSERTIONS = eINSTANCE.getNode_Assertions();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.VariableImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__ATTRIBUTES = eINSTANCE.getVariable_Attributes();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AttributeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.EventImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__ATTRIBUTES = eINSTANCE.getEvent_Attributes();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ParameterImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ObserverImpl <em>Observer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ObserverImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getObserver()
     * @generated
     */
    EClass OBSERVER = eINSTANCE.getObserver();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVER__TYPE = eINSTANCE.getObserver_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBSERVER__VALUE = eINSTANCE.getObserver_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.TransitionAndImpl <em>Transition And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.TransitionAndImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionAnd()
     * @generated
     */
    EClass TRANSITION_AND = eINSTANCE.getTransitionAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_AND__LEFT = eINSTANCE.getTransitionAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_AND__RIGHT = eINSTANCE.getTransitionAnd_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.TransitionOrImpl <em>Transition Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.TransitionOrImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionOr()
     * @generated
     */
    EClass TRANSITION_OR = eINSTANCE.getTransitionOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_OR__LEFT = eINSTANCE.getTransitionOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_OR__RIGHT = eINSTANCE.getTransitionOr_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.SkipImpl <em>Skip</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.SkipImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSkip()
     * @generated
     */
    EClass SKIP = eINSTANCE.getSkip();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AssignmentImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.BlockImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__INSTRUCTIONS = eINSTANCE.getBlock_Instructions();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.LogicalImpl <em>Logical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.LogicalImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLogical()
     * @generated
     */
    EClass LOGICAL = eINSTANCE.getLogical();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL__LEFT = eINSTANCE.getLogical_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL__OP = eINSTANCE.getLogical_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL__RIGHT = eINSTANCE.getLogical_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.EqualImpl <em>Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.EqualImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEqual()
     * @generated
     */
    EClass EQUAL = eINSTANCE.getEqual();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__LEFT = eINSTANCE.getEqual_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUAL__OP = eINSTANCE.getEqual_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__RIGHT = eINSTANCE.getEqual_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AdditionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAddition()
     * @generated
     */
    EClass ADDITION = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__LEFT = eINSTANCE.getAddition_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDITION__OP = eINSTANCE.getAddition_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__RIGHT = eINSTANCE.getAddition_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.MultiplicationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION__OP = eINSTANCE.getMultiplication_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NotImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.MinusImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__EXPRESSION = eINSTANCE.getMinus_Expression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.BaseTypeEnum <em>Base Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.BaseTypeEnum
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getBaseTypeEnum()
     * @generated
     */
    EEnum BASE_TYPE_ENUM = eINSTANCE.getBaseTypeEnum();

  }

} //AltaricaPackage
