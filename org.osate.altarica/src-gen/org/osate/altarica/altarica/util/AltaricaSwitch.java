/**
 */
package org.osate.altarica.altarica.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.altarica.altarica.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.altarica.altarica.AltaricaPackage
 * @generated
 */
public class AltaricaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AltaricaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltaricaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AltaricaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AltaricaPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ABSTRACT_DECLARATION:
      {
        AbstractDeclaration abstractDeclaration = (AbstractDeclaration)theEObject;
        T result = caseAbstractDeclaration(abstractDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = caseAbstractDeclaration(namedElement);
        if (result == null) result = caseDeclaration(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ABSTRACT_DEFINITION_CONSTANT:
      {
        AbstractDefinitionConstant abstractDefinitionConstant = (AbstractDefinitionConstant)theEObject;
        T result = caseAbstractDefinitionConstant(abstractDefinitionConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EXPRESSION_CONSTANT:
      {
        ExpressionConstant expressionConstant = (ExpressionConstant)theEObject;
        T result = caseExpressionConstant(expressionConstant);
        if (result == null) result = caseAbstractDefinitionConstant(expressionConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.DOMAIN_CONSTANT:
      {
        DomainConstant domainConstant = (DomainConstant)theEObject;
        T result = caseDomainConstant(domainConstant);
        if (result == null) result = caseAbstractDefinitionConstant(domainConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ABSTRACT_DOMAIN:
      {
        AbstractDomain abstractDomain = (AbstractDomain)theEObject;
        T result = caseAbstractDomain(abstractDomain);
        if (result == null) result = caseAbstractTypeRef(abstractDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = caseAbstractDomain(range);
        if (result == null) result = caseAbstractTypeRef(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseAbstractDomain(enumeration);
        if (result == null) result = caseAbstractTypeRef(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.BASE_TYPE:
      {
        BaseType baseType = (BaseType)theEObject;
        T result = caseBaseType(baseType);
        if (result == null) result = caseAbstractDomain(baseType);
        if (result == null) result = caseType(baseType);
        if (result == null) result = caseAbstractTypeRef(baseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.CLASS_TYPE:
      {
        ClassType classType = (ClassType)theEObject;
        T result = caseClassType(classType);
        if (result == null) result = caseType(classType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.LABELED_TRANSITION:
      {
        LabeledTransition labeledTransition = (LabeledTransition)theEObject;
        T result = caseLabeledTransition(labeledTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.TRANSITION_EXPRESSION:
      {
        TransitionExpression transitionExpression = (TransitionExpression)theEObject;
        T result = caseTransitionExpression(transitionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ITRANSITION:
      {
        ITransition iTransition = (ITransition)theEObject;
        T result = caseITransition(iTransition);
        if (result == null) result = caseTransitionExpression(iTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.INSTRUCTION:
      {
        Instruction instruction = (Instruction)theEObject;
        T result = caseInstruction(instruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.IF_THEN_ELSE:
      {
        IfThenElse ifThenElse = (IfThenElse)theEObject;
        T result = caseIfThenElse(ifThenElse);
        if (result == null) result = caseInstruction(ifThenElse);
        if (result == null) result = caseAbstractExpression(ifThenElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseAbstractExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AR_BOOLEAN:
      {
        ARBoolean arBoolean = (ARBoolean)theEObject;
        T result = caseARBoolean(arBoolean);
        if (result == null) result = caseExpression(arBoolean);
        if (result == null) result = caseAbstractExpression(arBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AR_STRING:
      {
        ARString arString = (ARString)theEObject;
        T result = caseARString(arString);
        if (result == null) result = caseExpression(arString);
        if (result == null) result = caseAbstractExpression(arString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AR_INTEGER:
      {
        ARInteger arInteger = (ARInteger)theEObject;
        T result = caseARInteger(arInteger);
        if (result == null) result = caseExpression(arInteger);
        if (result == null) result = caseAbstractExpression(arInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NAME_REF:
      {
        NameRef nameRef = (NameRef)theEObject;
        T result = caseNameRef(nameRef);
        if (result == null) result = caseExpression(nameRef);
        if (result == null) result = caseAbstractExpression(nameRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.VARIABLE_ATTRIBUTE:
      {
        VariableAttribute variableAttribute = (VariableAttribute)theEObject;
        T result = caseVariableAttribute(variableAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ABSTRACT_TYPE_REF:
      {
        AbstractTypeRef abstractTypeRef = (AbstractTypeRef)theEObject;
        T result = caseAbstractTypeRef(abstractTypeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.DOMAIN_REF:
      {
        DomainRef domainRef = (DomainRef)theEObject;
        T result = caseDomainRef(domainRef);
        if (result == null) result = caseAbstractTypeRef(domainRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ABSTRACT_EXPRESSION:
      {
        AbstractExpression abstractExpression = (AbstractExpression)theEObject;
        T result = caseAbstractExpression(abstractExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.SWITCH:
      {
        org.osate.altarica.altarica.Switch switch_ = (org.osate.altarica.altarica.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseAbstractExpression(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.CASE_EXPRESSION:
      {
        CaseExpression caseExpression = (CaseExpression)theEObject;
        T result = caseCaseExpression(caseExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.CONSTANT_DEFINITION:
      {
        ConstantDefinition constantDefinition = (ConstantDefinition)theEObject;
        T result = caseConstantDefinition(constantDefinition);
        if (result == null) result = caseNamedElement(constantDefinition);
        if (result == null) result = caseAbstractDeclaration(constantDefinition);
        if (result == null) result = caseDeclaration(constantDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = caseNamedElement(domain);
        if (result == null) result = caseAbstractDeclaration(domain);
        if (result == null) result = caseDeclaration(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ENUMERATION_LITERAL:
      {
        EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
        T result = caseEnumerationLiteral(enumerationLiteral);
        if (result == null) result = caseNamedElement(enumerationLiteral);
        if (result == null) result = caseAbstractDeclaration(enumerationLiteral);
        if (result == null) result = caseDeclaration(enumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseNamedElement(node);
        if (result == null) result = caseAbstractDeclaration(node);
        if (result == null) result = caseDeclaration(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseNamedElement(variable);
        if (result == null) result = caseAbstractDeclaration(variable);
        if (result == null) result = caseDeclaration(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseNamedElement(attribute);
        if (result == null) result = caseAbstractDeclaration(attribute);
        if (result == null) result = caseDeclaration(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseNamedElement(event);
        if (result == null) result = caseAbstractDeclaration(event);
        if (result == null) result = caseDeclaration(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseNamedElement(parameter);
        if (result == null) result = caseAbstractDeclaration(parameter);
        if (result == null) result = caseDeclaration(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.OBSERVER:
      {
        Observer observer = (Observer)theEObject;
        T result = caseObserver(observer);
        if (result == null) result = caseNamedElement(observer);
        if (result == null) result = caseAbstractDeclaration(observer);
        if (result == null) result = caseDeclaration(observer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.TRANSITION_AND:
      {
        TransitionAnd transitionAnd = (TransitionAnd)theEObject;
        T result = caseTransitionAnd(transitionAnd);
        if (result == null) result = caseTransitionExpression(transitionAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.TRANSITION_OR:
      {
        TransitionOr transitionOr = (TransitionOr)theEObject;
        T result = caseTransitionOr(transitionOr);
        if (result == null) result = caseTransitionExpression(transitionOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.SKIP:
      {
        Skip skip = (Skip)theEObject;
        T result = caseSkip(skip);
        if (result == null) result = caseInstruction(skip);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseInstruction(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseInstruction(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.LOGICAL:
      {
        Logical logical = (Logical)theEObject;
        T result = caseLogical(logical);
        if (result == null) result = caseExpression(logical);
        if (result == null) result = caseAbstractExpression(logical);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EQUAL:
      {
        Equal equal = (Equal)theEObject;
        T result = caseEqual(equal);
        if (result == null) result = caseExpression(equal);
        if (result == null) result = caseAbstractExpression(equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseExpression(addition);
        if (result == null) result = caseAbstractExpression(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseExpression(multiplication);
        if (result == null) result = caseAbstractExpression(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseExpression(not);
        if (result == null) result = caseAbstractExpression(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = caseAbstractExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDeclaration(AbstractDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Definition Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Definition Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDefinitionConstant(AbstractDefinitionConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionConstant(ExpressionConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainConstant(DomainConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDomain(AbstractDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseType(BaseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassType(ClassType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Labeled Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Labeled Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabeledTransition(LabeledTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionExpression(TransitionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ITransition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ITransition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseITransition(ITransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstruction(Instruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Then Else</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfThenElse(IfThenElse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AR Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AR Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARBoolean(ARBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AR String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AR String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARString(ARString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AR Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AR Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseARInteger(ARInteger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameRef(NameRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAttribute(VariableAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractTypeRef(AbstractTypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainRef(DomainRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractExpression(AbstractExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(org.osate.altarica.altarica.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseExpression(CaseExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantDefinition(ConstantDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationLiteral(EnumerationLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Observer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObserver(Observer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionAnd(TransitionAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionOr(TransitionOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Skip</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSkip(Skip object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogical(Logical object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqual(Equal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddition(Addition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AltaricaSwitch
