/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.altarica.altarica.ARBoolean;
import org.osate.altarica.altarica.ARInteger;
import org.osate.altarica.altarica.ARString;
import org.osate.altarica.altarica.AbstractBooleanExpression;
import org.osate.altarica.altarica.AbstractDeclaration;
import org.osate.altarica.altarica.AbstractDefinitionConstant;
import org.osate.altarica.altarica.AbstractDomain;
import org.osate.altarica.altarica.AbstractExpression;
import org.osate.altarica.altarica.AbstractSpecification;
import org.osate.altarica.altarica.AbstractTypeRef;
import org.osate.altarica.altarica.Addition;
import org.osate.altarica.altarica.AltaricaFactory;
import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.And;
import org.osate.altarica.altarica.Assert;
import org.osate.altarica.altarica.AssertSpecification;
import org.osate.altarica.altarica.Assignment;
import org.osate.altarica.altarica.Cardinality;
import org.osate.altarica.altarica.CaseExpression;
import org.osate.altarica.altarica.ConstantDefinition;
import org.osate.altarica.altarica.Division;
import org.osate.altarica.altarica.Domain;
import org.osate.altarica.altarica.DomainConstant;
import org.osate.altarica.altarica.DomainRef;
import org.osate.altarica.altarica.Enumeration;
import org.osate.altarica.altarica.EnumerationLiteral;
import org.osate.altarica.altarica.Equal;
import org.osate.altarica.altarica.Event;
import org.osate.altarica.altarica.EventRef;
import org.osate.altarica.altarica.EventSpecification;
import org.osate.altarica.altarica.Expression;
import org.osate.altarica.altarica.ExpressionConstant;
import org.osate.altarica.altarica.ExternalDirective;
import org.osate.altarica.altarica.ExternalSpecification;
import org.osate.altarica.altarica.Flow;
import org.osate.altarica.altarica.FlowKind;
import org.osate.altarica.altarica.FlowSpecification;
import org.osate.altarica.altarica.IfThenElse;
import org.osate.altarica.altarica.Imply;
import org.osate.altarica.altarica.InitSpecification;
import org.osate.altarica.altarica.InitStatement;
import org.osate.altarica.altarica.Lower;
import org.osate.altarica.altarica.Minus;
import org.osate.altarica.altarica.Multiplication;
import org.osate.altarica.altarica.NamedElement;
import org.osate.altarica.altarica.NestedQualifiedEventRef;
import org.osate.altarica.altarica.NestedQualifiedVariableRef;
import org.osate.altarica.altarica.Node;
import org.osate.altarica.altarica.NodeInstance;
import org.osate.altarica.altarica.NodeInstanceSpecification;
import org.osate.altarica.altarica.NotEqual;
import org.osate.altarica.altarica.Or;
import org.osate.altarica.altarica.PrimitiveType;
import org.osate.altarica.altarica.PrimitiveTypeKind;
import org.osate.altarica.altarica.Priority;
import org.osate.altarica.altarica.Range;
import org.osate.altarica.altarica.State;
import org.osate.altarica.altarica.StateSpecification;
import org.osate.altarica.altarica.StrictLower;
import org.osate.altarica.altarica.StrictUpper;
import org.osate.altarica.altarica.Switch;
import org.osate.altarica.altarica.Transition;
import org.osate.altarica.altarica.TransitionSpecification;
import org.osate.altarica.altarica.Upper;
import org.osate.altarica.altarica.VariableAttribute;
import org.osate.altarica.altarica.VariableRef;
import org.osate.altarica.altarica.Vector;
import org.osate.altarica.altarica.VectorParameter;
import org.osate.altarica.altarica.VectorSpecification;
import org.osate.altarica.altarica.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AltaricaFactoryImpl extends EFactoryImpl implements AltaricaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AltaricaFactory init()
  {
    try
    {
      AltaricaFactory theAltaricaFactory = (AltaricaFactory)EPackage.Registry.INSTANCE.getEFactory(AltaricaPackage.eNS_URI);
      if (theAltaricaFactory != null)
      {
        return theAltaricaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AltaricaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltaricaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AltaricaPackage.SYSTEM: return createSystem();
      case AltaricaPackage.ABSTRACT_DECLARATION: return createAbstractDeclaration();
      case AltaricaPackage.NAMED_ELEMENT: return createNamedElement();
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT: return createAbstractDefinitionConstant();
      case AltaricaPackage.EXPRESSION_CONSTANT: return createExpressionConstant();
      case AltaricaPackage.DOMAIN_CONSTANT: return createDomainConstant();
      case AltaricaPackage.ABSTRACT_DOMAIN: return createAbstractDomain();
      case AltaricaPackage.RANGE: return createRange();
      case AltaricaPackage.ENUMERATION: return createEnumeration();
      case AltaricaPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case AltaricaPackage.ABSTRACT_SPECIFICATION: return createAbstractSpecification();
      case AltaricaPackage.VARIABLE_ATTRIBUTE: return createVariableAttribute();
      case AltaricaPackage.INIT_SPECIFICATION: return createInitSpecification();
      case AltaricaPackage.INIT_STATEMENT: return createInitStatement();
      case AltaricaPackage.EXTERNAL_SPECIFICATION: return createExternalSpecification();
      case AltaricaPackage.EXTERNAL_DIRECTIVE: return createExternalDirective();
      case AltaricaPackage.FLOW_SPECIFICATION: return createFlowSpecification();
      case AltaricaPackage.EVENT_SPECIFICATION: return createEventSpecification();
      case AltaricaPackage.PRIORITY: return createPriority();
      case AltaricaPackage.STATE_SPECIFICATION: return createStateSpecification();
      case AltaricaPackage.ABSTRACT_TYPE_REF: return createAbstractTypeRef();
      case AltaricaPackage.DOMAIN_REF: return createDomainRef();
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION: return createNodeInstanceSpecification();
      case AltaricaPackage.ASSERT_SPECIFICATION: return createAssertSpecification();
      case AltaricaPackage.ASSERT: return createAssert();
      case AltaricaPackage.VECTOR_SPECIFICATION: return createVectorSpecification();
      case AltaricaPackage.VECTOR: return createVector();
      case AltaricaPackage.VECTOR_PARAMETER: return createVectorParameter();
      case AltaricaPackage.CARDINALITY: return createCardinality();
      case AltaricaPackage.TRANSITION_SPECIFICATION: return createTransitionSpecification();
      case AltaricaPackage.TRANSITION: return createTransition();
      case AltaricaPackage.ASSIGNMENT: return createAssignment();
      case AltaricaPackage.ABSTRACT_EXPRESSION: return createAbstractExpression();
      case AltaricaPackage.ABSTRACT_BOOLEAN_EXPRESSION: return createAbstractBooleanExpression();
      case AltaricaPackage.SWITCH: return createSwitch();
      case AltaricaPackage.CASE_EXPRESSION: return createCaseExpression();
      case AltaricaPackage.IF_THEN_ELSE: return createIfThenElse();
      case AltaricaPackage.EXPRESSION: return createExpression();
      case AltaricaPackage.EVENT_REF: return createEventRef();
      case AltaricaPackage.VARIABLE_REF: return createVariableRef();
      case AltaricaPackage.AR_BOOLEAN: return createARBoolean();
      case AltaricaPackage.AR_STRING: return createARString();
      case AltaricaPackage.AR_INTEGER: return createARInteger();
      case AltaricaPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case AltaricaPackage.DOMAIN: return createDomain();
      case AltaricaPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case AltaricaPackage.NODE: return createNode();
      case AltaricaPackage.FLOW: return createFlow();
      case AltaricaPackage.EVENT: return createEvent();
      case AltaricaPackage.STATE: return createState();
      case AltaricaPackage.NODE_INSTANCE: return createNodeInstance();
      case AltaricaPackage.ADDITION: return createAddition();
      case AltaricaPackage.MINUS: return createMinus();
      case AltaricaPackage.MULTIPLICATION: return createMultiplication();
      case AltaricaPackage.DIVISION: return createDivision();
      case AltaricaPackage.AND: return createAnd();
      case AltaricaPackage.OR: return createOr();
      case AltaricaPackage.EQUAL: return createEqual();
      case AltaricaPackage.NOT_EQUAL: return createNotEqual();
      case AltaricaPackage.STRICT_LOWER: return createStrictLower();
      case AltaricaPackage.LOWER: return createLower();
      case AltaricaPackage.STRICT_UPPER: return createStrictUpper();
      case AltaricaPackage.UPPER: return createUpper();
      case AltaricaPackage.IMPLY: return createImply();
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF: return createNestedQualifiedEventRef();
      case AltaricaPackage.NESTED_QUALIFIED_VARIABLE_REF: return createNestedQualifiedVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AltaricaPackage.PRIMITIVE_TYPE_KIND:
        return createPrimitiveTypeKindFromString(eDataType, initialValue);
      case AltaricaPackage.FLOW_KIND:
        return createFlowKindFromString(eDataType, initialValue);
      case AltaricaPackage.VISIBILITY_KIND:
        return createVisibilityKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AltaricaPackage.PRIMITIVE_TYPE_KIND:
        return convertPrimitiveTypeKindToString(eDataType, instanceValue);
      case AltaricaPackage.FLOW_KIND:
        return convertFlowKindToString(eDataType, instanceValue);
      case AltaricaPackage.VISIBILITY_KIND:
        return convertVisibilityKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.osate.altarica.altarica.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclaration createAbstractDeclaration()
  {
    AbstractDeclarationImpl abstractDeclaration = new AbstractDeclarationImpl();
    return abstractDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement createNamedElement()
  {
    NamedElementImpl namedElement = new NamedElementImpl();
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDefinitionConstant createAbstractDefinitionConstant()
  {
    AbstractDefinitionConstantImpl abstractDefinitionConstant = new AbstractDefinitionConstantImpl();
    return abstractDefinitionConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionConstant createExpressionConstant()
  {
    ExpressionConstantImpl expressionConstant = new ExpressionConstantImpl();
    return expressionConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainConstant createDomainConstant()
  {
    DomainConstantImpl domainConstant = new DomainConstantImpl();
    return domainConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDomain createAbstractDomain()
  {
    AbstractDomainImpl abstractDomain = new AbstractDomainImpl();
    return abstractDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractSpecification createAbstractSpecification()
  {
    AbstractSpecificationImpl abstractSpecification = new AbstractSpecificationImpl();
    return abstractSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAttribute createVariableAttribute()
  {
    VariableAttributeImpl variableAttribute = new VariableAttributeImpl();
    return variableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitSpecification createInitSpecification()
  {
    InitSpecificationImpl initSpecification = new InitSpecificationImpl();
    return initSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitStatement createInitStatement()
  {
    InitStatementImpl initStatement = new InitStatementImpl();
    return initStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalSpecification createExternalSpecification()
  {
    ExternalSpecificationImpl externalSpecification = new ExternalSpecificationImpl();
    return externalSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDirective createExternalDirective()
  {
    ExternalDirectiveImpl externalDirective = new ExternalDirectiveImpl();
    return externalDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowSpecification createFlowSpecification()
  {
    FlowSpecificationImpl flowSpecification = new FlowSpecificationImpl();
    return flowSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventSpecification createEventSpecification()
  {
    EventSpecificationImpl eventSpecification = new EventSpecificationImpl();
    return eventSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority createPriority()
  {
    PriorityImpl priority = new PriorityImpl();
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateSpecification createStateSpecification()
  {
    StateSpecificationImpl stateSpecification = new StateSpecificationImpl();
    return stateSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractTypeRef createAbstractTypeRef()
  {
    AbstractTypeRefImpl abstractTypeRef = new AbstractTypeRefImpl();
    return abstractTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainRef createDomainRef()
  {
    DomainRefImpl domainRef = new DomainRefImpl();
    return domainRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeInstanceSpecification createNodeInstanceSpecification()
  {
    NodeInstanceSpecificationImpl nodeInstanceSpecification = new NodeInstanceSpecificationImpl();
    return nodeInstanceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertSpecification createAssertSpecification()
  {
    AssertSpecificationImpl assertSpecification = new AssertSpecificationImpl();
    return assertSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assert createAssert()
  {
    AssertImpl assert_ = new AssertImpl();
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorSpecification createVectorSpecification()
  {
    VectorSpecificationImpl vectorSpecification = new VectorSpecificationImpl();
    return vectorSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VectorParameter createVectorParameter()
  {
    VectorParameterImpl vectorParameter = new VectorParameterImpl();
    return vectorParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionSpecification createTransitionSpecification()
  {
    TransitionSpecificationImpl transitionSpecification = new TransitionSpecificationImpl();
    return transitionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractExpression createAbstractExpression()
  {
    AbstractExpressionImpl abstractExpression = new AbstractExpressionImpl();
    return abstractExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractBooleanExpression createAbstractBooleanExpression()
  {
    AbstractBooleanExpressionImpl abstractBooleanExpression = new AbstractBooleanExpressionImpl();
    return abstractBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseExpression createCaseExpression()
  {
    CaseExpressionImpl caseExpression = new CaseExpressionImpl();
    return caseExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfThenElse createIfThenElse()
  {
    IfThenElseImpl ifThenElse = new IfThenElseImpl();
    return ifThenElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventRef createEventRef()
  {
    EventRefImpl eventRef = new EventRefImpl();
    return eventRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARBoolean createARBoolean()
  {
    ARBooleanImpl arBoolean = new ARBooleanImpl();
    return arBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARString createARString()
  {
    ARStringImpl arString = new ARStringImpl();
    return arString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ARInteger createARInteger()
  {
    ARIntegerImpl arInteger = new ARIntegerImpl();
    return arInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition createConstantDefinition()
  {
    ConstantDefinitionImpl constantDefinition = new ConstantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeInstance createNodeInstance()
  {
    NodeInstanceImpl nodeInstance = new NodeInstanceImpl();
    return nodeInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Division createDivision()
  {
    DivisionImpl division = new DivisionImpl();
    return division;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEqual createNotEqual()
  {
    NotEqualImpl notEqual = new NotEqualImpl();
    return notEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrictLower createStrictLower()
  {
    StrictLowerImpl strictLower = new StrictLowerImpl();
    return strictLower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lower createLower()
  {
    LowerImpl lower = new LowerImpl();
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StrictUpper createStrictUpper()
  {
    StrictUpperImpl strictUpper = new StrictUpperImpl();
    return strictUpper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Upper createUpper()
  {
    UpperImpl upper = new UpperImpl();
    return upper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imply createImply()
  {
    ImplyImpl imply = new ImplyImpl();
    return imply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQualifiedEventRef createNestedQualifiedEventRef()
  {
    NestedQualifiedEventRefImpl nestedQualifiedEventRef = new NestedQualifiedEventRefImpl();
    return nestedQualifiedEventRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedQualifiedVariableRef createNestedQualifiedVariableRef()
  {
    NestedQualifiedVariableRefImpl nestedQualifiedVariableRef = new NestedQualifiedVariableRefImpl();
    return nestedQualifiedVariableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypeKind createPrimitiveTypeKindFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveTypeKind result = PrimitiveTypeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowKind createFlowKindFromString(EDataType eDataType, String initialValue)
  {
    FlowKind result = FlowKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFlowKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue)
  {
    VisibilityKind result = VisibilityKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltaricaPackage getAltaricaPackage()
  {
    return (AltaricaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AltaricaPackage getPackage()
  {
    return AltaricaPackage.eINSTANCE;
  }

} //AltaricaFactoryImpl
