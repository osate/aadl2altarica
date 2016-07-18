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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TypeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

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
  int BASE_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NamedTypeImpl <em>Named Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NamedTypeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNamedType()
   * @generated
   */
  int NAMED_TYPE = 5;

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
  int DECLARATION = 6;

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
  int LABELED_TRANSITION = 7;

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
  int TRANSITION_EXPRESSION = 8;

  /**
   * The number of structural features of the '<em>Transition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.InstructionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 9;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__CASES = 0;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ELSE = 1;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 10;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ARBooleanImpl <em>AR Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ARBooleanImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARBoolean()
   * @generated
   */
  int AR_BOOLEAN = 11;

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
  int AR_STRING = 12;

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
  int AR_INTEGER = 13;

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
  int NAME_REF = 14;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SwitchExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSwitchExpression()
   * @generated
   */
  int SWITCH_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION__DEFAULT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.CaseExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getCaseExpression()
   * @generated
   */
  int CASE_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CONDITION = 0;

  /**
   * The feature id for the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION__CASE = 1;

  /**
   * The number of structural features of the '<em>Case Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DomainImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__CONSTANTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
  int SYMBOLIC_CONSTANT = 18;

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
  int NODE = 19;

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
  int VARIABLE = 20;

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
  int ATTRIBUTE = 21;

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
  int EVENT = 22;

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
  int PARAMETER = 23;

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
  int OBSERVER = 24;

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
  int TRANSITION_AND = 25;

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
  int TRANSITION_OR = 26;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TransitionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 27;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = TRANSITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = TRANSITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = TRANSITION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SkipImpl <em>Skip</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SkipImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSkip()
   * @generated
   */
  int SKIP = 28;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__CASES = INSTRUCTION__CASES;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SKIP__ELSE = INSTRUCTION__ELSE;

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
  int ASSIGNMENT = 29;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__CASES = INSTRUCTION__CASES;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__ELSE = INSTRUCTION__ELSE;

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
  int BLOCK = 30;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__CASES = INSTRUCTION__CASES;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ELSE = INSTRUCTION__ELSE;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ConditionalImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 31;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CASES = INSTRUCTION__CASES;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__ELSE = INSTRUCTION__ELSE;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__THEN = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.LogicalOrImpl <em>Logical Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.LogicalOrImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLogicalOr()
   * @generated
   */
  int LOGICAL_OR = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Logical Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.LogicalAndImpl <em>Logical And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.LogicalAndImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLogicalAnd()
   * @generated
   */
  int LOGICAL_AND = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Logical And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EqualImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 34;

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
  int ADDITION = 35;

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
  int MULTIPLICATION = 36;

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
  int NOT = 37;

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
  int MINUS = 38;

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
  int BASE_TYPE_ENUM = 39;


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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see org.osate.altarica.altarica.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Instruction#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.osate.altarica.altarica.Instruction#getCases()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Cases();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Instruction#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.osate.altarica.altarica.Instruction#getElse()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Else();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.SwitchExpression <em>Switch Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Expression</em>'.
   * @see org.osate.altarica.altarica.SwitchExpression
   * @generated
   */
  EClass getSwitchExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.SwitchExpression#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.osate.altarica.altarica.SwitchExpression#getCases()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Cases();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.SwitchExpression#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see org.osate.altarica.altarica.SwitchExpression#getDefault()
   * @see #getSwitchExpression()
   * @generated
   */
  EReference getSwitchExpression_Default();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.CaseExpression#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case</em>'.
   * @see org.osate.altarica.altarica.CaseExpression#getCase()
   * @see #getCaseExpression()
   * @generated
   */
  EReference getCaseExpression_Case();

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
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Domain#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.osate.altarica.altarica.Domain#getConstants()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Constants();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.osate.altarica.altarica.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.osate.altarica.altarica.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Transition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.osate.altarica.altarica.Transition#getAction()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Action();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see org.osate.altarica.altarica.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Conditional#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.altarica.altarica.Conditional#getCondition()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Conditional#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.osate.altarica.altarica.Conditional#getThen()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Then();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.LogicalOr <em>Logical Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Or</em>'.
   * @see org.osate.altarica.altarica.LogicalOr
   * @generated
   */
  EClass getLogicalOr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.LogicalOr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.LogicalOr#getLeft()
   * @see #getLogicalOr()
   * @generated
   */
  EReference getLogicalOr_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.LogicalOr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.altarica.altarica.LogicalOr#getOp()
   * @see #getLogicalOr()
   * @generated
   */
  EAttribute getLogicalOr_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.LogicalOr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.LogicalOr#getRight()
   * @see #getLogicalOr()
   * @generated
   */
  EReference getLogicalOr_Right();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.LogicalAnd <em>Logical And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical And</em>'.
   * @see org.osate.altarica.altarica.LogicalAnd
   * @generated
   */
  EClass getLogicalAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.LogicalAnd#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.osate.altarica.altarica.LogicalAnd#getLeft()
   * @see #getLogicalAnd()
   * @generated
   */
  EReference getLogicalAnd_Left();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.LogicalAnd#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.osate.altarica.altarica.LogicalAnd#getOp()
   * @see #getLogicalAnd()
   * @generated
   */
  EAttribute getLogicalAnd_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.LogicalAnd#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.osate.altarica.altarica.LogicalAnd#getRight()
   * @see #getLogicalAnd()
   * @generated
   */
  EReference getLogicalAnd_Right();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.InstructionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__CASES = eINSTANCE.getInstruction_Cases();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__ELSE = eINSTANCE.getInstruction_Else();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.SwitchExpressionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSwitchExpression()
     * @generated
     */
    EClass SWITCH_EXPRESSION = eINSTANCE.getSwitchExpression();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__CASES = eINSTANCE.getSwitchExpression_Cases();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_EXPRESSION__DEFAULT = eINSTANCE.getSwitchExpression_Default();

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
     * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CASE_EXPRESSION__CASE = eINSTANCE.getCaseExpression_Case();

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
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__CONSTANTS = eINSTANCE.getDomain_Constants();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.TransitionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ConditionalImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__THEN = eINSTANCE.getConditional_Then();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.LogicalOrImpl <em>Logical Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.LogicalOrImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLogicalOr()
     * @generated
     */
    EClass LOGICAL_OR = eINSTANCE.getLogicalOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR__LEFT = eINSTANCE.getLogicalOr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_OR__OP = eINSTANCE.getLogicalOr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_OR__RIGHT = eINSTANCE.getLogicalOr_Right();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.LogicalAndImpl <em>Logical And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.LogicalAndImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLogicalAnd()
     * @generated
     */
    EClass LOGICAL_AND = eINSTANCE.getLogicalAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND__LEFT = eINSTANCE.getLogicalAnd_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_AND__OP = eINSTANCE.getLogicalAnd_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_AND__RIGHT = eINSTANCE.getLogicalAnd_Right();

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
