/**
 */
package org.osate.altarica.altarica.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osate.altarica.altarica.*;

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
      case AltaricaPackage.MODEL: return createModel();
      case AltaricaPackage.ABSTRACT_DECLARATION: return createAbstractDeclaration();
      case AltaricaPackage.NAMED_ELEMENT: return createNamedElement();
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT: return createAbstractDefinitionConstant();
      case AltaricaPackage.EXPRESSION_CONSTANT: return createExpressionConstant();
      case AltaricaPackage.DOMAIN_CONSTANT: return createDomainConstant();
      case AltaricaPackage.ABSTRACT_DOMAIN: return createAbstractDomain();
      case AltaricaPackage.RANGE: return createRange();
      case AltaricaPackage.ENUMERATION: return createEnumeration();
      case AltaricaPackage.TYPE: return createType();
      case AltaricaPackage.BASE_TYPE: return createBaseType();
      case AltaricaPackage.CLASS_TYPE: return createClassType();
      case AltaricaPackage.DECLARATION: return createDeclaration();
      case AltaricaPackage.LABELED_TRANSITION: return createLabeledTransition();
      case AltaricaPackage.TRANSITION_EXPRESSION: return createTransitionExpression();
      case AltaricaPackage.ITRANSITION: return createITransition();
      case AltaricaPackage.INSTRUCTION: return createInstruction();
      case AltaricaPackage.IF_THEN_ELSE: return createIfThenElse();
      case AltaricaPackage.EXPRESSION: return createExpression();
      case AltaricaPackage.AR_BOOLEAN: return createARBoolean();
      case AltaricaPackage.AR_STRING: return createARString();
      case AltaricaPackage.AR_INTEGER: return createARInteger();
      case AltaricaPackage.NAME_REF: return createNameRef();
      case AltaricaPackage.VARIABLE_ATTRIBUTE: return createVariableAttribute();
      case AltaricaPackage.ABSTRACT_TYPE_REF: return createAbstractTypeRef();
      case AltaricaPackage.DOMAIN_REF: return createDomainRef();
      case AltaricaPackage.ABSTRACT_EXPRESSION: return createAbstractExpression();
      case AltaricaPackage.SWITCH: return createSwitch();
      case AltaricaPackage.CASE_EXPRESSION: return createCaseExpression();
      case AltaricaPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case AltaricaPackage.DOMAIN: return createDomain();
      case AltaricaPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case AltaricaPackage.NODE: return createNode();
      case AltaricaPackage.VARIABLE: return createVariable();
      case AltaricaPackage.ATTRIBUTE: return createAttribute();
      case AltaricaPackage.EVENT: return createEvent();
      case AltaricaPackage.PARAMETER: return createParameter();
      case AltaricaPackage.OBSERVER: return createObserver();
      case AltaricaPackage.TRANSITION_AND: return createTransitionAnd();
      case AltaricaPackage.TRANSITION_OR: return createTransitionOr();
      case AltaricaPackage.SKIP: return createSkip();
      case AltaricaPackage.ASSIGNMENT: return createAssignment();
      case AltaricaPackage.BLOCK: return createBlock();
      case AltaricaPackage.LOGICAL: return createLogical();
      case AltaricaPackage.EQUAL: return createEqual();
      case AltaricaPackage.ADDITION: return createAddition();
      case AltaricaPackage.MULTIPLICATION: return createMultiplication();
      case AltaricaPackage.NOT: return createNot();
      case AltaricaPackage.MINUS: return createMinus();
      case AltaricaPackage.NESTED_REF: return createNestedRef();
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
      case AltaricaPackage.BASE_TYPE_ENUM:
        return createBaseTypeEnumFromString(eDataType, initialValue);
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
      case AltaricaPackage.BASE_TYPE_ENUM:
        return convertBaseTypeEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
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
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType createBaseType()
  {
    BaseTypeImpl baseType = new BaseTypeImpl();
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassType createClassType()
  {
    ClassTypeImpl classType = new ClassTypeImpl();
    return classType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledTransition createLabeledTransition()
  {
    LabeledTransitionImpl labeledTransition = new LabeledTransitionImpl();
    return labeledTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionExpression createTransitionExpression()
  {
    TransitionExpressionImpl transitionExpression = new TransitionExpressionImpl();
    return transitionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ITransition createITransition()
  {
    ITransitionImpl iTransition = new ITransitionImpl();
    return iTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
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
  public NameRef createNameRef()
  {
    NameRefImpl nameRef = new NameRefImpl();
    return nameRef;
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
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
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
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observer createObserver()
  {
    ObserverImpl observer = new ObserverImpl();
    return observer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionAnd createTransitionAnd()
  {
    TransitionAndImpl transitionAnd = new TransitionAndImpl();
    return transitionAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionOr createTransitionOr()
  {
    TransitionOrImpl transitionOr = new TransitionOrImpl();
    return transitionOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Skip createSkip()
  {
    SkipImpl skip = new SkipImpl();
    return skip;
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
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical createLogical()
  {
    LogicalImpl logical = new LogicalImpl();
    return logical;
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
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
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
  public NestedRef createNestedRef()
  {
    NestedRefImpl nestedRef = new NestedRefImpl();
    return nestedRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseTypeEnum createBaseTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    BaseTypeEnum result = BaseTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBaseTypeEnumToString(EDataType eDataType, Object instanceValue)
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
