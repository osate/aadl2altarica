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
      case AltaricaPackage.TYPE: return createType();
      case AltaricaPackage.BASE_TYPE: return createBaseType();
      case AltaricaPackage.NAMED_TYPE: return createNamedType();
      case AltaricaPackage.DECLARATION: return createDeclaration();
      case AltaricaPackage.LABELED_TRANSITION: return createLabeledTransition();
      case AltaricaPackage.TRANSITION_EXPRESSION: return createTransitionExpression();
      case AltaricaPackage.INSTRUCTION: return createInstruction();
      case AltaricaPackage.CASE_EXPRESSION: return createCaseExpression();
      case AltaricaPackage.EXPRESSION: return createExpression();
      case AltaricaPackage.AR_BOOLEAN: return createARBoolean();
      case AltaricaPackage.AR_STRING: return createARString();
      case AltaricaPackage.AR_INTEGER: return createARInteger();
      case AltaricaPackage.NAME_REF: return createNameRef();
      case AltaricaPackage.DOMAIN: return createDomain();
      case AltaricaPackage.SYMBOLIC_CONSTANT: return createSymbolicConstant();
      case AltaricaPackage.NODE: return createNode();
      case AltaricaPackage.VARIABLE: return createVariable();
      case AltaricaPackage.ATTRIBUTE: return createAttribute();
      case AltaricaPackage.EVENT: return createEvent();
      case AltaricaPackage.PARAMETER: return createParameter();
      case AltaricaPackage.OBSERVER: return createObserver();
      case AltaricaPackage.TRANSITION_AND: return createTransitionAnd();
      case AltaricaPackage.TRANSITION_OR: return createTransitionOr();
      case AltaricaPackage.TRANSITION: return createTransition();
      case AltaricaPackage.SKIP: return createSkip();
      case AltaricaPackage.ASSIGNMENT: return createAssignment();
      case AltaricaPackage.BLOCK: return createBlock();
      case AltaricaPackage.CONDITIONAL: return createConditional();
      case AltaricaPackage.LOGICAL: return createLogical();
      case AltaricaPackage.EQUAL: return createEqual();
      case AltaricaPackage.ADDITION: return createAddition();
      case AltaricaPackage.MULTIPLICATION: return createMultiplication();
      case AltaricaPackage.NOT: return createNot();
      case AltaricaPackage.MINUS: return createMinus();
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
  public NamedType createNamedType()
  {
    NamedTypeImpl namedType = new NamedTypeImpl();
    return namedType;
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
  public SymbolicConstant createSymbolicConstant()
  {
    SymbolicConstantImpl symbolicConstant = new SymbolicConstantImpl();
    return symbolicConstant;
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
  public Conditional createConditional()
  {
    ConditionalImpl conditional = new ConditionalImpl();
    return conditional;
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
