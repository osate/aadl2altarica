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
  String eNS_URI = "http://osate.org/Altarica";

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SystemImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Owned Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__OWNED_DECLARATIONS = 0;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 1;

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
  int ABSTRACT_TYPE_REF = 20;

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
   * The feature id for the '<em><b>Owned Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__OWNED_LITERALS = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.PrimitiveTypeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = ABSTRACT_DOMAIN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = ABSTRACT_DOMAIN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractSpecificationImpl <em>Abstract Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractSpecification()
   * @generated
   */
  int ABSTRACT_SPECIFICATION = 10;

  /**
   * The number of structural features of the '<em>Abstract Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SPECIFICATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VariableAttributeImpl <em>Variable Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VariableAttributeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariableAttribute()
   * @generated
   */
  int VARIABLE_ATTRIBUTE = 11;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.InitSpecificationImpl <em>Init Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.InitSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInitSpecification()
   * @generated
   */
  int INIT_SPECIFICATION = 12;

  /**
   * The feature id for the '<em><b>Owned Init Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_SPECIFICATION__OWNED_INIT_STATEMENTS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Init Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.InitStatementImpl <em>Init Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.InitStatementImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInitStatement()
   * @generated
   */
  int INIT_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Affectation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_STATEMENT__AFFECTATION = 0;

  /**
   * The number of structural features of the '<em>Init Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ExternalSpecificationImpl <em>External Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ExternalSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExternalSpecification()
   * @generated
   */
  int EXTERNAL_SPECIFICATION = 14;

  /**
   * The feature id for the '<em><b>Owned Directives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ExternalDirectiveImpl <em>External Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ExternalDirectiveImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExternalDirective()
   * @generated
   */
  int EXTERNAL_DIRECTIVE = 15;

  /**
   * The feature id for the '<em><b>Directive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DIRECTIVE__DIRECTIVE = 0;

  /**
   * The number of structural features of the '<em>External Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DIRECTIVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.FlowSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getFlowSpecification()
   * @generated
   */
  int FLOW_SPECIFICATION = 16;

  /**
   * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_SPECIFICATION__OWNED_FLOWS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Flow Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EventSpecificationImpl <em>Event Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EventSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEventSpecification()
   * @generated
   */
  int EVENT_SPECIFICATION = 17;

  /**
   * The feature id for the '<em><b>Owned Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SPECIFICATION__OWNED_EVENTS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.PriorityImpl <em>Priority</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.PriorityImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 18;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY__OWNED_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Priority</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.StateSpecificationImpl <em>State Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.StateSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getStateSpecification()
   * @generated
   */
  int STATE_SPECIFICATION = 19;

  /**
   * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION__OWNED_STATES = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DomainRefImpl <em>Domain Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DomainRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDomainRef()
   * @generated
   */
  int DOMAIN_REF = 21;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NodeInstanceSpecificationImpl <em>Node Instance Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NodeInstanceSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstanceSpecification()
   * @generated
   */
  int NODE_INSTANCE_SPECIFICATION = 22;

  /**
   * The feature id for the '<em><b>Owned Node Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node Instance Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AssertSpecificationImpl <em>Assert Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AssertSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssertSpecification()
   * @generated
   */
  int ASSERT_SPECIFICATION = 23;

  /**
   * The feature id for the '<em><b>Owned Asserts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SPECIFICATION__OWNED_ASSERTS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assert Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AssertImpl <em>Assert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AssertImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssert()
   * @generated
   */
  int ASSERT = 24;

  /**
   * The feature id for the '<em><b>Owned Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__OWNED_EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Assert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VectorSpecificationImpl <em>Vector Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VectorSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVectorSpecification()
   * @generated
   */
  int VECTOR_SPECIFICATION = 25;

  /**
   * The feature id for the '<em><b>Owned Vectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_SPECIFICATION__OWNED_VECTORS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Vector Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VectorImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 26;

  /**
   * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__OWNED_PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__CARDINALITY = 1;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VectorParameterImpl <em>Vector Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VectorParameterImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVectorParameter()
   * @generated
   */
  int VECTOR_PARAMETER = 27;

  /**
   * The feature id for the '<em><b>Event Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_PARAMETER__EVENT_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Is Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_PARAMETER__IS_REQUIRED = 1;

  /**
   * The number of structural features of the '<em>Vector Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.CardinalityImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 28;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TransitionSpecificationImpl <em>Transition Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TransitionSpecificationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionSpecification()
   * @generated
   */
  int TRANSITION_SPECIFICATION = 29;

  /**
   * The feature id for the '<em><b>Owned Transition Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_SPECIFICATION_FEATURE_COUNT = ABSTRACT_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.TransitionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 30;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNED_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 1;

  /**
   * The feature id for the '<em><b>Owned Affectations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OWNED_AFFECTATIONS = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AssignmentImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 31;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__STATE = 0;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__OWNED_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractExpression()
   * @generated
   */
  int ABSTRACT_EXPRESSION = 32;

  /**
   * The number of structural features of the '<em>Abstract Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AbstractBooleanExpressionImpl <em>Abstract Boolean Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AbstractBooleanExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractBooleanExpression()
   * @generated
   */
  int ABSTRACT_BOOLEAN_EXPRESSION = 33;

  /**
   * The number of structural features of the '<em>Abstract Boolean Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_BOOLEAN_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.SwitchImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 34;

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
  int CASE_EXPRESSION = 35;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.IfThenElseImpl <em>If Then Else</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.IfThenElseImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getIfThenElse()
   * @generated
   */
  int IF_THEN_ELSE = 36;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__CONDITION = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__THEN = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE__ELSE = ABSTRACT_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Then Else</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_THEN_ELSE_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ExpressionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERAND = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EventRefImpl <em>Event Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EventRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEventRef()
   * @generated
   */
  int EVENT_REF = 38;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REF__VARIABLE = 0;

  /**
   * The number of structural features of the '<em>Event Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.VariableRefImpl <em>Variable Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.VariableRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariableRef()
   * @generated
   */
  int VARIABLE_REF = 39;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ARBooleanImpl <em>AR Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ARBooleanImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getARBoolean()
   * @generated
   */
  int AR_BOOLEAN = 40;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_BOOLEAN__OPERAND = EXPRESSION__OPERAND;

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
  int AR_STRING = 41;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_STRING__OPERAND = EXPRESSION__OPERAND;

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
  int AR_INTEGER = 42;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AR_INTEGER__OPERAND = EXPRESSION__OPERAND;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ConstantDefinitionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 43;

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
  int DOMAIN = 44;

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
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EnumerationLiteralImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NodeImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNode()
   * @generated
   */
  int NODE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Owned Specifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__OWNED_SPECIFICATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.FlowImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__KIND = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EventImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Owned Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__OWNED_PRIORITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.StateImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getState()
   * @generated
   */
  int STATE = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__DOMAIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NodeInstanceImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstance()
   * @generated
   */
  int NODE_INSTANCE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Node Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE__NODE_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Node Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AdditionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAddition()
   * @generated
   */
  int ADDITION = 51;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.MinusImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 52;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.MultiplicationImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 53;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.DivisionImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 54;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.AndImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAnd()
   * @generated
   */
  int AND = 55;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.OrImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getOr()
   * @generated
   */
  int OR = 56;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.EqualImpl <em>Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.EqualImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEqual()
   * @generated
   */
  int EQUAL = 57;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NotEqualImpl <em>Not Equal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NotEqualImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNotEqual()
   * @generated
   */
  int NOT_EQUAL = 58;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Not Equal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.StrictLowerImpl <em>Strict Lower</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.StrictLowerImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getStrictLower()
   * @generated
   */
  int STRICT_LOWER = 59;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strict Lower</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_LOWER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.LowerImpl <em>Lower</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.LowerImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLower()
   * @generated
   */
  int LOWER = 60;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lower</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.StrictUpperImpl <em>Strict Upper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.StrictUpperImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getStrictUpper()
   * @generated
   */
  int STRICT_UPPER = 61;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strict Upper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_UPPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.UpperImpl <em>Upper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.UpperImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getUpper()
   * @generated
   */
  int UPPER = 62;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Upper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.ImplyImpl <em>Imply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.ImplyImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getImply()
   * @generated
   */
  int IMPLY = 63;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Imply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NestedQualifiedEventRefImpl <em>Nested Qualified Event Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NestedQualifiedEventRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedEventRef()
   * @generated
   */
  int NESTED_QUALIFIED_EVENT_REF = 64;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF__VARIABLE = EVENT_REF__VARIABLE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF__TARGET = EVENT_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nested Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE = EVENT_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Qualified Event Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_EVENT_REF_FEATURE_COUNT = EVENT_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.impl.NestedQualifiedVariableRefImpl <em>Nested Qualified Variable Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.impl.NestedQualifiedVariableRefImpl
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedVariableRef()
   * @generated
   */
  int NESTED_QUALIFIED_VARIABLE_REF = 65;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__OPERAND = VARIABLE_REF__OPERAND;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__VARIABLE = VARIABLE_REF__VARIABLE;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__TARGET = VARIABLE_REF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nested Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF__NESTED_VARIABLE = VARIABLE_REF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Qualified Variable Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_QUALIFIED_VARIABLE_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.PrimitiveTypeKind <em>Primitive Type Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.PrimitiveTypeKind
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveTypeKind()
   * @generated
   */
  int PRIMITIVE_TYPE_KIND = 66;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.FlowKind <em>Flow Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.FlowKind
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getFlowKind()
   * @generated
   */
  int FLOW_KIND = 67;

  /**
   * The meta object id for the '{@link org.osate.altarica.altarica.VisibilityKind <em>Visibility Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.altarica.altarica.VisibilityKind
   * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVisibilityKind()
   * @generated
   */
  int VISIBILITY_KIND = 68;


  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.osate.altarica.altarica.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.System#getOwnedDeclarations <em>Owned Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Declarations</em>'.
   * @see org.osate.altarica.altarica.System#getOwnedDeclarations()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_OwnedDeclarations();

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
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Enumeration#getOwnedLiterals <em>Owned Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Literals</em>'.
   * @see org.osate.altarica.altarica.Enumeration#getOwnedLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_OwnedLiterals();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.osate.altarica.altarica.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.PrimitiveType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.osate.altarica.altarica.PrimitiveType#getName()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_Name();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractSpecification <em>Abstract Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Specification</em>'.
   * @see org.osate.altarica.altarica.AbstractSpecification
   * @generated
   */
  EClass getAbstractSpecification();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.InitSpecification <em>Init Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Specification</em>'.
   * @see org.osate.altarica.altarica.InitSpecification
   * @generated
   */
  EClass getInitSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.InitSpecification#getOwnedInitStatements <em>Owned Init Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Init Statements</em>'.
   * @see org.osate.altarica.altarica.InitSpecification#getOwnedInitStatements()
   * @see #getInitSpecification()
   * @generated
   */
  EReference getInitSpecification_OwnedInitStatements();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.InitStatement <em>Init Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Statement</em>'.
   * @see org.osate.altarica.altarica.InitStatement
   * @generated
   */
  EClass getInitStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.InitStatement#getAffectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Affectation</em>'.
   * @see org.osate.altarica.altarica.InitStatement#getAffectation()
   * @see #getInitStatement()
   * @generated
   */
  EReference getInitStatement_Affectation();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ExternalSpecification <em>External Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Specification</em>'.
   * @see org.osate.altarica.altarica.ExternalSpecification
   * @generated
   */
  EClass getExternalSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.ExternalSpecification#getOwnedDirectives <em>Owned Directives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Directives</em>'.
   * @see org.osate.altarica.altarica.ExternalSpecification#getOwnedDirectives()
   * @see #getExternalSpecification()
   * @generated
   */
  EReference getExternalSpecification_OwnedDirectives();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.ExternalDirective <em>External Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Directive</em>'.
   * @see org.osate.altarica.altarica.ExternalDirective
   * @generated
   */
  EClass getExternalDirective();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.ExternalDirective#getDirective <em>Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Directive</em>'.
   * @see org.osate.altarica.altarica.ExternalDirective#getDirective()
   * @see #getExternalDirective()
   * @generated
   */
  EAttribute getExternalDirective_Directive();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.FlowSpecification <em>Flow Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Specification</em>'.
   * @see org.osate.altarica.altarica.FlowSpecification
   * @generated
   */
  EClass getFlowSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.FlowSpecification#getOwnedFlows <em>Owned Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Flows</em>'.
   * @see org.osate.altarica.altarica.FlowSpecification#getOwnedFlows()
   * @see #getFlowSpecification()
   * @generated
   */
  EReference getFlowSpecification_OwnedFlows();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.EventSpecification <em>Event Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Specification</em>'.
   * @see org.osate.altarica.altarica.EventSpecification
   * @generated
   */
  EClass getEventSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.EventSpecification#getOwnedEvents <em>Owned Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Events</em>'.
   * @see org.osate.altarica.altarica.EventSpecification#getOwnedEvents()
   * @see #getEventSpecification()
   * @generated
   */
  EReference getEventSpecification_OwnedEvents();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Priority</em>'.
   * @see org.osate.altarica.altarica.Priority
   * @generated
   */
  EClass getPriority();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Priority#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see org.osate.altarica.altarica.Priority#getOwnedExpression()
   * @see #getPriority()
   * @generated
   */
  EReference getPriority_OwnedExpression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.StateSpecification <em>State Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Specification</em>'.
   * @see org.osate.altarica.altarica.StateSpecification
   * @generated
   */
  EClass getStateSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.StateSpecification#getOwnedStates <em>Owned States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned States</em>'.
   * @see org.osate.altarica.altarica.StateSpecification#getOwnedStates()
   * @see #getStateSpecification()
   * @generated
   */
  EReference getStateSpecification_OwnedStates();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NodeInstanceSpecification <em>Node Instance Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Instance Specification</em>'.
   * @see org.osate.altarica.altarica.NodeInstanceSpecification
   * @generated
   */
  EClass getNodeInstanceSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.NodeInstanceSpecification#getOwnedNodeInstances <em>Owned Node Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Node Instances</em>'.
   * @see org.osate.altarica.altarica.NodeInstanceSpecification#getOwnedNodeInstances()
   * @see #getNodeInstanceSpecification()
   * @generated
   */
  EReference getNodeInstanceSpecification_OwnedNodeInstances();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AssertSpecification <em>Assert Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert Specification</em>'.
   * @see org.osate.altarica.altarica.AssertSpecification
   * @generated
   */
  EClass getAssertSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.AssertSpecification#getOwnedAsserts <em>Owned Asserts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Asserts</em>'.
   * @see org.osate.altarica.altarica.AssertSpecification#getOwnedAsserts()
   * @see #getAssertSpecification()
   * @generated
   */
  EReference getAssertSpecification_OwnedAsserts();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Assert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert</em>'.
   * @see org.osate.altarica.altarica.Assert
   * @generated
   */
  EClass getAssert();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Assert#getOwnedExpressions <em>Owned Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Expressions</em>'.
   * @see org.osate.altarica.altarica.Assert#getOwnedExpressions()
   * @see #getAssert()
   * @generated
   */
  EReference getAssert_OwnedExpressions();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.VectorSpecification <em>Vector Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Specification</em>'.
   * @see org.osate.altarica.altarica.VectorSpecification
   * @generated
   */
  EClass getVectorSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.VectorSpecification#getOwnedVectors <em>Owned Vectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Vectors</em>'.
   * @see org.osate.altarica.altarica.VectorSpecification#getOwnedVectors()
   * @see #getVectorSpecification()
   * @generated
   */
  EReference getVectorSpecification_OwnedVectors();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector</em>'.
   * @see org.osate.altarica.altarica.Vector
   * @generated
   */
  EClass getVector();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Vector#getOwnedParameters <em>Owned Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
   * @see org.osate.altarica.altarica.Vector#getOwnedParameters()
   * @see #getVector()
   * @generated
   */
  EReference getVector_OwnedParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Vector#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.osate.altarica.altarica.Vector#getCardinality()
   * @see #getVector()
   * @generated
   */
  EReference getVector_Cardinality();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.VectorParameter <em>Vector Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector Parameter</em>'.
   * @see org.osate.altarica.altarica.VectorParameter
   * @generated
   */
  EClass getVectorParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.VectorParameter#getEventParameter <em>Event Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event Parameter</em>'.
   * @see org.osate.altarica.altarica.VectorParameter#getEventParameter()
   * @see #getVectorParameter()
   * @generated
   */
  EReference getVectorParameter_EventParameter();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.VectorParameter#isIsRequired <em>Is Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Required</em>'.
   * @see org.osate.altarica.altarica.VectorParameter#isIsRequired()
   * @see #getVectorParameter()
   * @generated
   */
  EAttribute getVectorParameter_IsRequired();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see org.osate.altarica.altarica.Cardinality
   * @generated
   */
  EClass getCardinality();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Cardinality#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.osate.altarica.altarica.Cardinality#getExpression()
   * @see #getCardinality()
   * @generated
   */
  EReference getCardinality_Expression();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.TransitionSpecification <em>Transition Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Specification</em>'.
   * @see org.osate.altarica.altarica.TransitionSpecification
   * @generated
   */
  EClass getTransitionSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.TransitionSpecification#getOwnedTransitionTransitions <em>Owned Transition Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Transition Transitions</em>'.
   * @see org.osate.altarica.altarica.TransitionSpecification#getOwnedTransitionTransitions()
   * @see #getTransitionSpecification()
   * @generated
   */
  EReference getTransitionSpecification_OwnedTransitionTransitions();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Transition#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see org.osate.altarica.altarica.Transition#getOwnedExpression()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_OwnedExpression();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see org.osate.altarica.altarica.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Transition#getOwnedAffectations <em>Owned Affectations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Affectations</em>'.
   * @see org.osate.altarica.altarica.Transition#getOwnedAffectations()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_OwnedAffectations();

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
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.Assignment#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.osate.altarica.altarica.Assignment#getState()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_State();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Assignment#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see org.osate.altarica.altarica.Assignment#getOwnedExpression()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_OwnedExpression();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.AbstractBooleanExpression <em>Abstract Boolean Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Boolean Expression</em>'.
   * @see org.osate.altarica.altarica.AbstractBooleanExpression
   * @generated
   */
  EClass getAbstractBooleanExpression();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Expression#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see org.osate.altarica.altarica.Expression#getOperand()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Operand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.EventRef <em>Event Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Ref</em>'.
   * @see org.osate.altarica.altarica.EventRef
   * @generated
   */
  EClass getEventRef();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.EventRef#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.osate.altarica.altarica.EventRef#getVariable()
   * @see #getEventRef()
   * @generated
   */
  EReference getEventRef_Variable();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.VariableRef <em>Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Ref</em>'.
   * @see org.osate.altarica.altarica.VariableRef
   * @generated
   */
  EClass getVariableRef();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.VariableRef#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.osate.altarica.altarica.VariableRef#getVariable()
   * @see #getVariableRef()
   * @generated
   */
  EReference getVariableRef_Variable();

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
   * Returns the meta object for class '{@link org.osate.altarica.altarica.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see org.osate.altarica.altarica.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

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
   * Returns the meta object for the containment reference list '{@link org.osate.altarica.altarica.Node#getOwnedSpecifications <em>Owned Specifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Specifications</em>'.
   * @see org.osate.altarica.altarica.Node#getOwnedSpecifications()
   * @see #getNode()
   * @generated
   */
  EReference getNode_OwnedSpecifications();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see org.osate.altarica.altarica.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Flow#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.osate.altarica.altarica.Flow#getDomain()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Domain();

  /**
   * Returns the meta object for the attribute '{@link org.osate.altarica.altarica.Flow#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.osate.altarica.altarica.Flow#getKind()
   * @see #getFlow()
   * @generated
   */
  EAttribute getFlow_Kind();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Flow#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see org.osate.altarica.altarica.Flow#getAttribute()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Attribute();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Event#getOwnedPriority <em>Owned Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Priority</em>'.
   * @see org.osate.altarica.altarica.Event#getOwnedPriority()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_OwnedPriority();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Event#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see org.osate.altarica.altarica.Event#getAttribute()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Attribute();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.osate.altarica.altarica.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.State#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see org.osate.altarica.altarica.State#getDomain()
   * @see #getState()
   * @generated
   */
  EReference getState_Domain();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.State#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see org.osate.altarica.altarica.State#getAttribute()
   * @see #getState()
   * @generated
   */
  EReference getState_Attribute();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NodeInstance <em>Node Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Instance</em>'.
   * @see org.osate.altarica.altarica.NodeInstance
   * @generated
   */
  EClass getNodeInstance();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.NodeInstance#getNodeType <em>Node Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node Type</em>'.
   * @see org.osate.altarica.altarica.NodeInstance#getNodeType()
   * @see #getNodeInstance()
   * @generated
   */
  EReference getNodeInstance_NodeType();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Addition#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Addition#getLeftOperand()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Addition#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Addition#getRightOperand()
   * @see #getAddition()
   * @generated
   */
  EReference getAddition_RightOperand();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Minus#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Minus#getLeftOperand()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Minus#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Minus#getRightOperand()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_RightOperand();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Multiplication#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Multiplication#getLeftOperand()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Multiplication#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Multiplication#getRightOperand()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see org.osate.altarica.altarica.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Division#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Division#getLeftOperand()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Division#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Division#getRightOperand()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see org.osate.altarica.altarica.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.And#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.And#getLeftOperand()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.And#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.And#getRightOperand()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see org.osate.altarica.altarica.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Or#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Or#getLeftOperand()
   * @see #getOr()
   * @generated
   */
  EReference getOr_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Or#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Or#getRightOperand()
   * @see #getOr()
   * @generated
   */
  EReference getOr_RightOperand();

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
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Equal#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Equal#getLeftOperand()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Equal#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Equal#getRightOperand()
   * @see #getEqual()
   * @generated
   */
  EReference getEqual_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NotEqual <em>Not Equal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equal</em>'.
   * @see org.osate.altarica.altarica.NotEqual
   * @generated
   */
  EClass getNotEqual();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.NotEqual#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.NotEqual#getLeftOperand()
   * @see #getNotEqual()
   * @generated
   */
  EReference getNotEqual_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.NotEqual#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.NotEqual#getRightOperand()
   * @see #getNotEqual()
   * @generated
   */
  EReference getNotEqual_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.StrictLower <em>Strict Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strict Lower</em>'.
   * @see org.osate.altarica.altarica.StrictLower
   * @generated
   */
  EClass getStrictLower();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.StrictLower#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.StrictLower#getLeftOperand()
   * @see #getStrictLower()
   * @generated
   */
  EReference getStrictLower_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.StrictLower#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.StrictLower#getRightOperand()
   * @see #getStrictLower()
   * @generated
   */
  EReference getStrictLower_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Lower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lower</em>'.
   * @see org.osate.altarica.altarica.Lower
   * @generated
   */
  EClass getLower();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Lower#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Lower#getLeftOperand()
   * @see #getLower()
   * @generated
   */
  EReference getLower_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Lower#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Lower#getRightOperand()
   * @see #getLower()
   * @generated
   */
  EReference getLower_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.StrictUpper <em>Strict Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strict Upper</em>'.
   * @see org.osate.altarica.altarica.StrictUpper
   * @generated
   */
  EClass getStrictUpper();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.StrictUpper#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.StrictUpper#getLeftOperand()
   * @see #getStrictUpper()
   * @generated
   */
  EReference getStrictUpper_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.StrictUpper#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.StrictUpper#getRightOperand()
   * @see #getStrictUpper()
   * @generated
   */
  EReference getStrictUpper_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Upper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Upper</em>'.
   * @see org.osate.altarica.altarica.Upper
   * @generated
   */
  EClass getUpper();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Upper#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Upper#getLeftOperand()
   * @see #getUpper()
   * @generated
   */
  EReference getUpper_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Upper#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Upper#getRightOperand()
   * @see #getUpper()
   * @generated
   */
  EReference getUpper_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.Imply <em>Imply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imply</em>'.
   * @see org.osate.altarica.altarica.Imply
   * @generated
   */
  EClass getImply();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Imply#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see org.osate.altarica.altarica.Imply#getLeftOperand()
   * @see #getImply()
   * @generated
   */
  EReference getImply_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.Imply#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see org.osate.altarica.altarica.Imply#getRightOperand()
   * @see #getImply()
   * @generated
   */
  EReference getImply_RightOperand();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NestedQualifiedEventRef <em>Nested Qualified Event Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Qualified Event Ref</em>'.
   * @see org.osate.altarica.altarica.NestedQualifiedEventRef
   * @generated
   */
  EClass getNestedQualifiedEventRef();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.NestedQualifiedEventRef#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.osate.altarica.altarica.NestedQualifiedEventRef#getTarget()
   * @see #getNestedQualifiedEventRef()
   * @generated
   */
  EReference getNestedQualifiedEventRef_Target();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.NestedQualifiedEventRef#getNestedVariable <em>Nested Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nested Variable</em>'.
   * @see org.osate.altarica.altarica.NestedQualifiedEventRef#getNestedVariable()
   * @see #getNestedQualifiedEventRef()
   * @generated
   */
  EReference getNestedQualifiedEventRef_NestedVariable();

  /**
   * Returns the meta object for class '{@link org.osate.altarica.altarica.NestedQualifiedVariableRef <em>Nested Qualified Variable Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Qualified Variable Ref</em>'.
   * @see org.osate.altarica.altarica.NestedQualifiedVariableRef
   * @generated
   */
  EClass getNestedQualifiedVariableRef();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.altarica.altarica.NestedQualifiedVariableRef#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.osate.altarica.altarica.NestedQualifiedVariableRef#getTarget()
   * @see #getNestedQualifiedVariableRef()
   * @generated
   */
  EReference getNestedQualifiedVariableRef_Target();

  /**
   * Returns the meta object for the reference '{@link org.osate.altarica.altarica.NestedQualifiedVariableRef#getNestedVariable <em>Nested Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nested Variable</em>'.
   * @see org.osate.altarica.altarica.NestedQualifiedVariableRef#getNestedVariable()
   * @see #getNestedQualifiedVariableRef()
   * @generated
   */
  EReference getNestedQualifiedVariableRef_NestedVariable();

  /**
   * Returns the meta object for enum '{@link org.osate.altarica.altarica.PrimitiveTypeKind <em>Primitive Type Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Type Kind</em>'.
   * @see org.osate.altarica.altarica.PrimitiveTypeKind
   * @generated
   */
  EEnum getPrimitiveTypeKind();

  /**
   * Returns the meta object for enum '{@link org.osate.altarica.altarica.FlowKind <em>Flow Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Flow Kind</em>'.
   * @see org.osate.altarica.altarica.FlowKind
   * @generated
   */
  EEnum getFlowKind();

  /**
   * Returns the meta object for enum '{@link org.osate.altarica.altarica.VisibilityKind <em>Visibility Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility Kind</em>'.
   * @see org.osate.altarica.altarica.VisibilityKind
   * @generated
   */
  EEnum getVisibilityKind();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.SystemImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Owned Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__OWNED_DECLARATIONS = eINSTANCE.getSystem_OwnedDeclarations();

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
     * The meta object literal for the '<em><b>Owned Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__OWNED_LITERALS = eINSTANCE.getEnumeration_OwnedLiterals();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.PrimitiveTypeImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__NAME = eINSTANCE.getPrimitiveType_Name();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractSpecificationImpl <em>Abstract Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractSpecification()
     * @generated
     */
    EClass ABSTRACT_SPECIFICATION = eINSTANCE.getAbstractSpecification();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.InitSpecificationImpl <em>Init Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.InitSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInitSpecification()
     * @generated
     */
    EClass INIT_SPECIFICATION = eINSTANCE.getInitSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Init Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_SPECIFICATION__OWNED_INIT_STATEMENTS = eINSTANCE.getInitSpecification_OwnedInitStatements();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.InitStatementImpl <em>Init Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.InitStatementImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getInitStatement()
     * @generated
     */
    EClass INIT_STATEMENT = eINSTANCE.getInitStatement();

    /**
     * The meta object literal for the '<em><b>Affectation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INIT_STATEMENT__AFFECTATION = eINSTANCE.getInitStatement_Affectation();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ExternalSpecificationImpl <em>External Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ExternalSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExternalSpecification()
     * @generated
     */
    EClass EXTERNAL_SPECIFICATION = eINSTANCE.getExternalSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Directives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_SPECIFICATION__OWNED_DIRECTIVES = eINSTANCE.getExternalSpecification_OwnedDirectives();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ExternalDirectiveImpl <em>External Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ExternalDirectiveImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getExternalDirective()
     * @generated
     */
    EClass EXTERNAL_DIRECTIVE = eINSTANCE.getExternalDirective();

    /**
     * The meta object literal for the '<em><b>Directive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DIRECTIVE__DIRECTIVE = eINSTANCE.getExternalDirective_Directive();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.FlowSpecificationImpl <em>Flow Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.FlowSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getFlowSpecification()
     * @generated
     */
    EClass FLOW_SPECIFICATION = eINSTANCE.getFlowSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_SPECIFICATION__OWNED_FLOWS = eINSTANCE.getFlowSpecification_OwnedFlows();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.EventSpecificationImpl <em>Event Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.EventSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEventSpecification()
     * @generated
     */
    EClass EVENT_SPECIFICATION = eINSTANCE.getEventSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_SPECIFICATION__OWNED_EVENTS = eINSTANCE.getEventSpecification_OwnedEvents();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.PriorityImpl <em>Priority</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.PriorityImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getPriority()
     * @generated
     */
    EClass PRIORITY = eINSTANCE.getPriority();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIORITY__OWNED_EXPRESSION = eINSTANCE.getPriority_OwnedExpression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.StateSpecificationImpl <em>State Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.StateSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getStateSpecification()
     * @generated
     */
    EClass STATE_SPECIFICATION = eINSTANCE.getStateSpecification();

    /**
     * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_SPECIFICATION__OWNED_STATES = eINSTANCE.getStateSpecification_OwnedStates();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NodeInstanceSpecificationImpl <em>Node Instance Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NodeInstanceSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstanceSpecification()
     * @generated
     */
    EClass NODE_INSTANCE_SPECIFICATION = eINSTANCE.getNodeInstanceSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Node Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_INSTANCE_SPECIFICATION__OWNED_NODE_INSTANCES = eINSTANCE.getNodeInstanceSpecification_OwnedNodeInstances();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AssertSpecificationImpl <em>Assert Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AssertSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssertSpecification()
     * @generated
     */
    EClass ASSERT_SPECIFICATION = eINSTANCE.getAssertSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Asserts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT_SPECIFICATION__OWNED_ASSERTS = eINSTANCE.getAssertSpecification_OwnedAsserts();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AssertImpl <em>Assert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AssertImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAssert()
     * @generated
     */
    EClass ASSERT = eINSTANCE.getAssert();

    /**
     * The meta object literal for the '<em><b>Owned Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT__OWNED_EXPRESSIONS = eINSTANCE.getAssert_OwnedExpressions();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.VectorSpecificationImpl <em>Vector Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.VectorSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVectorSpecification()
     * @generated
     */
    EClass VECTOR_SPECIFICATION = eINSTANCE.getVectorSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Vectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_SPECIFICATION__OWNED_VECTORS = eINSTANCE.getVectorSpecification_OwnedVectors();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.VectorImpl <em>Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.VectorImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVector()
     * @generated
     */
    EClass VECTOR = eINSTANCE.getVector();

    /**
     * The meta object literal for the '<em><b>Owned Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__OWNED_PARAMETERS = eINSTANCE.getVector_OwnedParameters();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR__CARDINALITY = eINSTANCE.getVector_Cardinality();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.VectorParameterImpl <em>Vector Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.VectorParameterImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVectorParameter()
     * @generated
     */
    EClass VECTOR_PARAMETER = eINSTANCE.getVectorParameter();

    /**
     * The meta object literal for the '<em><b>Event Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VECTOR_PARAMETER__EVENT_PARAMETER = eINSTANCE.getVectorParameter_EventParameter();

    /**
     * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR_PARAMETER__IS_REQUIRED = eINSTANCE.getVectorParameter_IsRequired();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.CardinalityImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getCardinality()
     * @generated
     */
    EClass CARDINALITY = eINSTANCE.getCardinality();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARDINALITY__EXPRESSION = eINSTANCE.getCardinality_Expression();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.TransitionSpecificationImpl <em>Transition Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.TransitionSpecificationImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getTransitionSpecification()
     * @generated
     */
    EClass TRANSITION_SPECIFICATION = eINSTANCE.getTransitionSpecification();

    /**
     * The meta object literal for the '<em><b>Owned Transition Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_SPECIFICATION__OWNED_TRANSITION_TRANSITIONS = eINSTANCE.getTransitionSpecification_OwnedTransitionTransitions();

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
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OWNED_EXPRESSION = eINSTANCE.getTransition_OwnedExpression();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>Owned Affectations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OWNED_AFFECTATIONS = eINSTANCE.getTransition_OwnedAffectations();

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
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__STATE = eINSTANCE.getAssignment_State();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__OWNED_EXPRESSION = eINSTANCE.getAssignment_OwnedExpression();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AbstractBooleanExpressionImpl <em>Abstract Boolean Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AbstractBooleanExpressionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAbstractBooleanExpression()
     * @generated
     */
    EClass ABSTRACT_BOOLEAN_EXPRESSION = eINSTANCE.getAbstractBooleanExpression();

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
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OPERAND = eINSTANCE.getExpression_Operand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.EventRefImpl <em>Event Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.EventRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEventRef()
     * @generated
     */
    EClass EVENT_REF = eINSTANCE.getEventRef();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_REF__VARIABLE = eINSTANCE.getEventRef_Variable();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.VariableRefImpl <em>Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.VariableRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVariableRef()
     * @generated
     */
    EClass VARIABLE_REF = eINSTANCE.getVariableRef();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF__VARIABLE = eINSTANCE.getVariableRef_Variable();

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
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.EnumerationLiteralImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

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
     * The meta object literal for the '<em><b>Owned Specifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__OWNED_SPECIFICATIONS = eINSTANCE.getNode_OwnedSpecifications();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.FlowImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__DOMAIN = eINSTANCE.getFlow_Domain();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW__KIND = eINSTANCE.getFlow_Kind();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__ATTRIBUTE = eINSTANCE.getFlow_Attribute();

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
     * The meta object literal for the '<em><b>Owned Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__OWNED_PRIORITY = eINSTANCE.getEvent_OwnedPriority();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__ATTRIBUTE = eINSTANCE.getEvent_Attribute();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.StateImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__DOMAIN = eINSTANCE.getState_Domain();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ATTRIBUTE = eINSTANCE.getState_Attribute();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NodeInstanceImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNodeInstance()
     * @generated
     */
    EClass NODE_INSTANCE = eINSTANCE.getNodeInstance();

    /**
     * The meta object literal for the '<em><b>Node Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_INSTANCE__NODE_TYPE = eINSTANCE.getNodeInstance_NodeType();

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
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__LEFT_OPERAND = eINSTANCE.getAddition_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITION__RIGHT_OPERAND = eINSTANCE.getAddition_RightOperand();

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
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT_OPERAND = eINSTANCE.getMinus_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT_OPERAND = eINSTANCE.getMinus_RightOperand();

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
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT_OPERAND = eINSTANCE.getMultiplication_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT_OPERAND = eINSTANCE.getMultiplication_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.DivisionImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT_OPERAND = eINSTANCE.getDivision_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT_OPERAND = eINSTANCE.getDivision_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.AndImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT_OPERAND = eINSTANCE.getAnd_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT_OPERAND = eINSTANCE.getAnd_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.OrImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT_OPERAND = eINSTANCE.getOr_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT_OPERAND = eINSTANCE.getOr_RightOperand();

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
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__LEFT_OPERAND = eINSTANCE.getEqual_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUAL__RIGHT_OPERAND = eINSTANCE.getEqual_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NotEqualImpl <em>Not Equal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NotEqualImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNotEqual()
     * @generated
     */
    EClass NOT_EQUAL = eINSTANCE.getNotEqual();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL__LEFT_OPERAND = eINSTANCE.getNotEqual_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUAL__RIGHT_OPERAND = eINSTANCE.getNotEqual_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.StrictLowerImpl <em>Strict Lower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.StrictLowerImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getStrictLower()
     * @generated
     */
    EClass STRICT_LOWER = eINSTANCE.getStrictLower();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_LOWER__LEFT_OPERAND = eINSTANCE.getStrictLower_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_LOWER__RIGHT_OPERAND = eINSTANCE.getStrictLower_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.LowerImpl <em>Lower</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.LowerImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getLower()
     * @generated
     */
    EClass LOWER = eINSTANCE.getLower();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER__LEFT_OPERAND = eINSTANCE.getLower_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER__RIGHT_OPERAND = eINSTANCE.getLower_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.StrictUpperImpl <em>Strict Upper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.StrictUpperImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getStrictUpper()
     * @generated
     */
    EClass STRICT_UPPER = eINSTANCE.getStrictUpper();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_UPPER__LEFT_OPERAND = eINSTANCE.getStrictUpper_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_UPPER__RIGHT_OPERAND = eINSTANCE.getStrictUpper_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.UpperImpl <em>Upper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.UpperImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getUpper()
     * @generated
     */
    EClass UPPER = eINSTANCE.getUpper();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPPER__LEFT_OPERAND = eINSTANCE.getUpper_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPPER__RIGHT_OPERAND = eINSTANCE.getUpper_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.ImplyImpl <em>Imply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.ImplyImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getImply()
     * @generated
     */
    EClass IMPLY = eINSTANCE.getImply();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLY__LEFT_OPERAND = eINSTANCE.getImply_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPLY__RIGHT_OPERAND = eINSTANCE.getImply_RightOperand();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NestedQualifiedEventRefImpl <em>Nested Qualified Event Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NestedQualifiedEventRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedEventRef()
     * @generated
     */
    EClass NESTED_QUALIFIED_EVENT_REF = eINSTANCE.getNestedQualifiedEventRef();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_EVENT_REF__TARGET = eINSTANCE.getNestedQualifiedEventRef_Target();

    /**
     * The meta object literal for the '<em><b>Nested Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_EVENT_REF__NESTED_VARIABLE = eINSTANCE.getNestedQualifiedEventRef_NestedVariable();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.impl.NestedQualifiedVariableRefImpl <em>Nested Qualified Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.impl.NestedQualifiedVariableRefImpl
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getNestedQualifiedVariableRef()
     * @generated
     */
    EClass NESTED_QUALIFIED_VARIABLE_REF = eINSTANCE.getNestedQualifiedVariableRef();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_VARIABLE_REF__TARGET = eINSTANCE.getNestedQualifiedVariableRef_Target();

    /**
     * The meta object literal for the '<em><b>Nested Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_QUALIFIED_VARIABLE_REF__NESTED_VARIABLE = eINSTANCE.getNestedQualifiedVariableRef_NestedVariable();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.PrimitiveTypeKind <em>Primitive Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.PrimitiveTypeKind
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getPrimitiveTypeKind()
     * @generated
     */
    EEnum PRIMITIVE_TYPE_KIND = eINSTANCE.getPrimitiveTypeKind();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.FlowKind <em>Flow Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.FlowKind
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getFlowKind()
     * @generated
     */
    EEnum FLOW_KIND = eINSTANCE.getFlowKind();

    /**
     * The meta object literal for the '{@link org.osate.altarica.altarica.VisibilityKind <em>Visibility Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.altarica.altarica.VisibilityKind
     * @see org.osate.altarica.altarica.impl.AltaricaPackageImpl#getVisibilityKind()
     * @generated
     */
    EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

  }

} //AltaricaPackage
