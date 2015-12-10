/**
 */
package org.osate.altarica.altarica.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
import org.osate.altarica.altarica.Priority;
import org.osate.altarica.altarica.Range;
import org.osate.altarica.altarica.State;
import org.osate.altarica.altarica.StateSpecification;
import org.osate.altarica.altarica.StrictLower;
import org.osate.altarica.altarica.StrictUpper;
import org.osate.altarica.altarica.Transition;
import org.osate.altarica.altarica.TransitionSpecification;
import org.osate.altarica.altarica.Upper;
import org.osate.altarica.altarica.VariableAttribute;
import org.osate.altarica.altarica.VariableRef;
import org.osate.altarica.altarica.Vector;
import org.osate.altarica.altarica.VectorParameter;
import org.osate.altarica.altarica.VectorSpecification;

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
      case AltaricaPackage.SYSTEM:
      {
        org.osate.altarica.altarica.System system = (org.osate.altarica.altarica.System)theEObject;
        T result = caseSystem(system);
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
      case AltaricaPackage.PRIMITIVE_TYPE:
      {
        PrimitiveType primitiveType = (PrimitiveType)theEObject;
        T result = casePrimitiveType(primitiveType);
        if (result == null) result = caseAbstractDomain(primitiveType);
        if (result == null) result = caseAbstractTypeRef(primitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ABSTRACT_SPECIFICATION:
      {
        AbstractSpecification abstractSpecification = (AbstractSpecification)theEObject;
        T result = caseAbstractSpecification(abstractSpecification);
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
      case AltaricaPackage.INIT_SPECIFICATION:
      {
        InitSpecification initSpecification = (InitSpecification)theEObject;
        T result = caseInitSpecification(initSpecification);
        if (result == null) result = caseAbstractSpecification(initSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.INIT_STATEMENT:
      {
        InitStatement initStatement = (InitStatement)theEObject;
        T result = caseInitStatement(initStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EXTERNAL_SPECIFICATION:
      {
        ExternalSpecification externalSpecification = (ExternalSpecification)theEObject;
        T result = caseExternalSpecification(externalSpecification);
        if (result == null) result = caseAbstractSpecification(externalSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EXTERNAL_DIRECTIVE:
      {
        ExternalDirective externalDirective = (ExternalDirective)theEObject;
        T result = caseExternalDirective(externalDirective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.FLOW_SPECIFICATION:
      {
        FlowSpecification flowSpecification = (FlowSpecification)theEObject;
        T result = caseFlowSpecification(flowSpecification);
        if (result == null) result = caseAbstractSpecification(flowSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EVENT_SPECIFICATION:
      {
        EventSpecification eventSpecification = (EventSpecification)theEObject;
        T result = caseEventSpecification(eventSpecification);
        if (result == null) result = caseAbstractSpecification(eventSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.PRIORITY:
      {
        Priority priority = (Priority)theEObject;
        T result = casePriority(priority);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.STATE_SPECIFICATION:
      {
        StateSpecification stateSpecification = (StateSpecification)theEObject;
        T result = caseStateSpecification(stateSpecification);
        if (result == null) result = caseAbstractSpecification(stateSpecification);
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
      case AltaricaPackage.NODE_INSTANCE_SPECIFICATION:
      {
        NodeInstanceSpecification nodeInstanceSpecification = (NodeInstanceSpecification)theEObject;
        T result = caseNodeInstanceSpecification(nodeInstanceSpecification);
        if (result == null) result = caseAbstractSpecification(nodeInstanceSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ASSERT_SPECIFICATION:
      {
        AssertSpecification assertSpecification = (AssertSpecification)theEObject;
        T result = caseAssertSpecification(assertSpecification);
        if (result == null) result = caseAbstractSpecification(assertSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ASSERT:
      {
        Assert assert_ = (Assert)theEObject;
        T result = caseAssert(assert_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.VECTOR_SPECIFICATION:
      {
        VectorSpecification vectorSpecification = (VectorSpecification)theEObject;
        T result = caseVectorSpecification(vectorSpecification);
        if (result == null) result = caseAbstractSpecification(vectorSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.VECTOR:
      {
        Vector vector = (Vector)theEObject;
        T result = caseVector(vector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.VECTOR_PARAMETER:
      {
        VectorParameter vectorParameter = (VectorParameter)theEObject;
        T result = caseVectorParameter(vectorParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.CARDINALITY:
      {
        Cardinality cardinality = (Cardinality)theEObject;
        T result = caseCardinality(cardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.TRANSITION_SPECIFICATION:
      {
        TransitionSpecification transitionSpecification = (TransitionSpecification)theEObject;
        T result = caseTransitionSpecification(transitionSpecification);
        if (result == null) result = caseAbstractSpecification(transitionSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
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
      case AltaricaPackage.ABSTRACT_BOOLEAN_EXPRESSION:
      {
        AbstractBooleanExpression abstractBooleanExpression = (AbstractBooleanExpression)theEObject;
        T result = caseAbstractBooleanExpression(abstractBooleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.SWITCH:
      {
        org.osate.altarica.altarica.Switch switch_ = (org.osate.altarica.altarica.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseAbstractExpression(switch_);
        if (result == null) result = caseAbstractBooleanExpression(switch_);
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
      case AltaricaPackage.IF_THEN_ELSE:
      {
        IfThenElse ifThenElse = (IfThenElse)theEObject;
        T result = caseIfThenElse(ifThenElse);
        if (result == null) result = caseAbstractExpression(ifThenElse);
        if (result == null) result = caseAbstractBooleanExpression(ifThenElse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseAbstractExpression(expression);
        if (result == null) result = caseAbstractBooleanExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EVENT_REF:
      {
        EventRef eventRef = (EventRef)theEObject;
        T result = caseEventRef(eventRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.VARIABLE_REF:
      {
        VariableRef variableRef = (VariableRef)theEObject;
        T result = caseVariableRef(variableRef);
        if (result == null) result = caseExpression(variableRef);
        if (result == null) result = caseAbstractExpression(variableRef);
        if (result == null) result = caseAbstractBooleanExpression(variableRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AR_BOOLEAN:
      {
        ARBoolean arBoolean = (ARBoolean)theEObject;
        T result = caseARBoolean(arBoolean);
        if (result == null) result = caseExpression(arBoolean);
        if (result == null) result = caseAbstractExpression(arBoolean);
        if (result == null) result = caseAbstractBooleanExpression(arBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AR_STRING:
      {
        ARString arString = (ARString)theEObject;
        T result = caseARString(arString);
        if (result == null) result = caseExpression(arString);
        if (result == null) result = caseAbstractExpression(arString);
        if (result == null) result = caseAbstractBooleanExpression(arString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AR_INTEGER:
      {
        ARInteger arInteger = (ARInteger)theEObject;
        T result = caseARInteger(arInteger);
        if (result == null) result = caseExpression(arInteger);
        if (result == null) result = caseAbstractExpression(arInteger);
        if (result == null) result = caseAbstractBooleanExpression(arInteger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.CONSTANT_DEFINITION:
      {
        ConstantDefinition constantDefinition = (ConstantDefinition)theEObject;
        T result = caseConstantDefinition(constantDefinition);
        if (result == null) result = caseNamedElement(constantDefinition);
        if (result == null) result = caseAbstractDeclaration(constantDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = caseNamedElement(domain);
        if (result == null) result = caseAbstractDeclaration(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ENUMERATION_LITERAL:
      {
        EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
        T result = caseEnumerationLiteral(enumerationLiteral);
        if (result == null) result = caseNamedElement(enumerationLiteral);
        if (result == null) result = caseAbstractDeclaration(enumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NODE:
      {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = caseNamedElement(node);
        if (result == null) result = caseAbstractDeclaration(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.FLOW:
      {
        Flow flow = (Flow)theEObject;
        T result = caseFlow(flow);
        if (result == null) result = caseNamedElement(flow);
        if (result == null) result = caseAbstractDeclaration(flow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseNamedElement(event);
        if (result == null) result = caseAbstractDeclaration(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseNamedElement(state);
        if (result == null) result = caseAbstractDeclaration(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NODE_INSTANCE:
      {
        NodeInstance nodeInstance = (NodeInstance)theEObject;
        T result = caseNodeInstance(nodeInstance);
        if (result == null) result = caseNamedElement(nodeInstance);
        if (result == null) result = caseAbstractDeclaration(nodeInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.ADDITION:
      {
        Addition addition = (Addition)theEObject;
        T result = caseAddition(addition);
        if (result == null) result = caseExpression(addition);
        if (result == null) result = caseAbstractExpression(addition);
        if (result == null) result = caseAbstractBooleanExpression(addition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = caseAbstractExpression(minus);
        if (result == null) result = caseAbstractBooleanExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseExpression(multiplication);
        if (result == null) result = caseAbstractExpression(multiplication);
        if (result == null) result = caseAbstractBooleanExpression(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.DIVISION:
      {
        Division division = (Division)theEObject;
        T result = caseDivision(division);
        if (result == null) result = caseExpression(division);
        if (result == null) result = caseAbstractExpression(division);
        if (result == null) result = caseAbstractBooleanExpression(division);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpression(and);
        if (result == null) result = caseAbstractExpression(and);
        if (result == null) result = caseAbstractBooleanExpression(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpression(or);
        if (result == null) result = caseAbstractExpression(or);
        if (result == null) result = caseAbstractBooleanExpression(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.EQUAL:
      {
        Equal equal = (Equal)theEObject;
        T result = caseEqual(equal);
        if (result == null) result = caseExpression(equal);
        if (result == null) result = caseAbstractExpression(equal);
        if (result == null) result = caseAbstractBooleanExpression(equal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NOT_EQUAL:
      {
        NotEqual notEqual = (NotEqual)theEObject;
        T result = caseNotEqual(notEqual);
        if (result == null) result = caseExpression(notEqual);
        if (result == null) result = caseAbstractExpression(notEqual);
        if (result == null) result = caseAbstractBooleanExpression(notEqual);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.STRICT_LOWER:
      {
        StrictLower strictLower = (StrictLower)theEObject;
        T result = caseStrictLower(strictLower);
        if (result == null) result = caseExpression(strictLower);
        if (result == null) result = caseAbstractExpression(strictLower);
        if (result == null) result = caseAbstractBooleanExpression(strictLower);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.LOWER:
      {
        Lower lower = (Lower)theEObject;
        T result = caseLower(lower);
        if (result == null) result = caseExpression(lower);
        if (result == null) result = caseAbstractExpression(lower);
        if (result == null) result = caseAbstractBooleanExpression(lower);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.STRICT_UPPER:
      {
        StrictUpper strictUpper = (StrictUpper)theEObject;
        T result = caseStrictUpper(strictUpper);
        if (result == null) result = caseExpression(strictUpper);
        if (result == null) result = caseAbstractExpression(strictUpper);
        if (result == null) result = caseAbstractBooleanExpression(strictUpper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.UPPER:
      {
        Upper upper = (Upper)theEObject;
        T result = caseUpper(upper);
        if (result == null) result = caseExpression(upper);
        if (result == null) result = caseAbstractExpression(upper);
        if (result == null) result = caseAbstractBooleanExpression(upper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.IMPLY:
      {
        Imply imply = (Imply)theEObject;
        T result = caseImply(imply);
        if (result == null) result = caseExpression(imply);
        if (result == null) result = caseAbstractExpression(imply);
        if (result == null) result = caseAbstractBooleanExpression(imply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NESTED_QUALIFIED_EVENT_REF:
      {
        NestedQualifiedEventRef nestedQualifiedEventRef = (NestedQualifiedEventRef)theEObject;
        T result = caseNestedQualifiedEventRef(nestedQualifiedEventRef);
        if (result == null) result = caseEventRef(nestedQualifiedEventRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AltaricaPackage.NESTED_QUALIFIED_VARIABLE_REF:
      {
        NestedQualifiedVariableRef nestedQualifiedVariableRef = (NestedQualifiedVariableRef)theEObject;
        T result = caseNestedQualifiedVariableRef(nestedQualifiedVariableRef);
        if (result == null) result = caseVariableRef(nestedQualifiedVariableRef);
        if (result == null) result = caseExpression(nestedQualifiedVariableRef);
        if (result == null) result = caseAbstractExpression(nestedQualifiedVariableRef);
        if (result == null) result = caseAbstractBooleanExpression(nestedQualifiedVariableRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystem(org.osate.altarica.altarica.System object)
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
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveType(PrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractSpecification(AbstractSpecification object)
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
   * Returns the result of interpreting the object as an instance of '<em>Init Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitSpecification(InitSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitStatement(InitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalSpecification(ExternalSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Directive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Directive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalDirective(ExternalDirective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowSpecification(FlowSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventSpecification(EventSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePriority(Priority object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateSpecification(StateSpecification object)
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
   * Returns the result of interpreting the object as an instance of '<em>Node Instance Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Instance Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeInstanceSpecification(NodeInstanceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertSpecification(AssertSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssert(Assert object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVectorSpecification(VectorSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVector(Vector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vector Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vector Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVectorParameter(VectorParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardinality(Cardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionSpecification(TransitionSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
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
   * Returns the result of interpreting the object as an instance of '<em>Abstract Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractBooleanExpression(AbstractBooleanExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Event Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventRef(EventRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableRef(VariableRef object)
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
   * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlow(Flow object)
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
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeInstance(NodeInstance object)
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
   * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivision(Division object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
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
   * Returns the result of interpreting the object as an instance of '<em>Not Equal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Equal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotEqual(NotEqual object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strict Lower</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strict Lower</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrictLower(StrictLower object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLower(Lower object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strict Upper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strict Upper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrictUpper(StrictUpper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Upper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Upper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpper(Upper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImply(Imply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Qualified Event Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Qualified Event Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedQualifiedEventRef(NestedQualifiedEventRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Qualified Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Qualified Variable Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedQualifiedVariableRef(NestedQualifiedVariableRef object)
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
