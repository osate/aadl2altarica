/*
 * generated by Xtext
 */
package org.osate.altarica.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.altarica.altarica.ARBoolean;
import org.osate.altarica.altarica.ARNumber;
import org.osate.altarica.altarica.ARString;
import org.osate.altarica.altarica.Addition;
import org.osate.altarica.altarica.AltaricaPackage;
import org.osate.altarica.altarica.Assignment;
import org.osate.altarica.altarica.Attribute;
import org.osate.altarica.altarica.BaseType;
import org.osate.altarica.altarica.Block;
import org.osate.altarica.altarica.CaseExpression;
import org.osate.altarica.altarica.Conditional;
import org.osate.altarica.altarica.Domain;
import org.osate.altarica.altarica.Equal;
import org.osate.altarica.altarica.Event;
import org.osate.altarica.altarica.FunctionCall;
import org.osate.altarica.altarica.Instruction;
import org.osate.altarica.altarica.LabeledTransition;
import org.osate.altarica.altarica.LogicalAnd;
import org.osate.altarica.altarica.LogicalOr;
import org.osate.altarica.altarica.Minus;
import org.osate.altarica.altarica.Model;
import org.osate.altarica.altarica.Multiplication;
import org.osate.altarica.altarica.NameRef;
import org.osate.altarica.altarica.NamedType;
import org.osate.altarica.altarica.Node;
import org.osate.altarica.altarica.Not;
import org.osate.altarica.altarica.Observer;
import org.osate.altarica.altarica.Parameter;
import org.osate.altarica.altarica.Skip;
import org.osate.altarica.altarica.SwitchExpression;
import org.osate.altarica.altarica.SymbolicConstant;
import org.osate.altarica.altarica.Transition;
import org.osate.altarica.altarica.TransitionAnd;
import org.osate.altarica.altarica.TransitionOr;
import org.osate.altarica.altarica.Variable;
import org.osate.altarica.services.AltaricaGrammarAccess;

@SuppressWarnings("all")
public class AltaricaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AltaricaGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AltaricaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AltaricaPackage.AR_BOOLEAN:
				sequence_BooleanLiteral(context, (ARBoolean) semanticObject); 
				return; 
			case AltaricaPackage.AR_NUMBER:
				sequence_NumberLiteral(context, (ARNumber) semanticObject); 
				return; 
			case AltaricaPackage.AR_STRING:
				sequence_StringLiteral(context, (ARString) semanticObject); 
				return; 
			case AltaricaPackage.ADDITION:
				sequence_Addition(context, (Addition) semanticObject); 
				return; 
			case AltaricaPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case AltaricaPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case AltaricaPackage.BASE_TYPE:
				sequence_BaseType(context, (BaseType) semanticObject); 
				return; 
			case AltaricaPackage.BLOCK:
				sequence_Block(context, (Block) semanticObject); 
				return; 
			case AltaricaPackage.CASE_EXPRESSION:
				sequence_CaseExpression(context, (CaseExpression) semanticObject); 
				return; 
			case AltaricaPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case AltaricaPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case AltaricaPackage.EQUAL:
				sequence_Relation(context, (Equal) semanticObject); 
				return; 
			case AltaricaPackage.EVENT:
				sequence_EventDeclaration(context, (Event) semanticObject); 
				return; 
			case AltaricaPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case AltaricaPackage.INSTRUCTION:
				sequence_Switch(context, (Instruction) semanticObject); 
				return; 
			case AltaricaPackage.LABELED_TRANSITION:
				sequence_LabeledTransition(context, (LabeledTransition) semanticObject); 
				return; 
			case AltaricaPackage.LOGICAL_AND:
				sequence_LogicalAnd(context, (LogicalAnd) semanticObject); 
				return; 
			case AltaricaPackage.LOGICAL_OR:
				sequence_LogicalOr(context, (LogicalOr) semanticObject); 
				return; 
			case AltaricaPackage.MINUS:
				sequence_Neg(context, (Minus) semanticObject); 
				return; 
			case AltaricaPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AltaricaPackage.MULTIPLICATION:
				sequence_Multiplication(context, (Multiplication) semanticObject); 
				return; 
			case AltaricaPackage.NAME_REF:
				sequence_NameRef(context, (NameRef) semanticObject); 
				return; 
			case AltaricaPackage.NAMED_TYPE:
				sequence_NamedType(context, (NamedType) semanticObject); 
				return; 
			case AltaricaPackage.NODE:
				sequence_Class(context, (Node) semanticObject); 
				return; 
			case AltaricaPackage.NOT:
				sequence_Neg(context, (Not) semanticObject); 
				return; 
			case AltaricaPackage.OBSERVER:
				sequence_ObserverDeclaration(context, (Observer) semanticObject); 
				return; 
			case AltaricaPackage.PARAMETER:
				sequence_ParameterDeclaration(context, (Parameter) semanticObject); 
				return; 
			case AltaricaPackage.SKIP:
				sequence_Skip(context, (Skip) semanticObject); 
				return; 
			case AltaricaPackage.SWITCH_EXPRESSION:
				sequence_SwitchExpression(context, (SwitchExpression) semanticObject); 
				return; 
			case AltaricaPackage.SYMBOLIC_CONSTANT:
				sequence_SymbolicConstant(context, (SymbolicConstant) semanticObject); 
				return; 
			case AltaricaPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case AltaricaPackage.TRANSITION_AND:
				sequence_TransitionAnd(context, (TransitionAnd) semanticObject); 
				return; 
			case AltaricaPackage.TRANSITION_OR:
				sequence_TransitionOr(context, (TransitionOr) semanticObject); 
				return; 
			case AltaricaPackage.VARIABLE:
				sequence_VariableDeclaration(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Addition_1_0_0 (op='+' | op='-') right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Addition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=NameRef value=Expression)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Expression)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=BaseTypeEnum
	 */
	protected void sequence_BaseType(EObject context, BaseType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.BASE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.BASE_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     instructions+=Instruction+
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_BooleanLiteral(EObject context, ARBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=LogicalOr case=Expression)
	 */
	protected void sequence_CaseExpression(EObject context, CaseExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.CASE_EXPRESSION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.CASE_EXPRESSION__CONDITION));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.CASE_EXPRESSION__CASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.CASE_EXPRESSION__CASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_3_0(), semanticObject.getCase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID declarations+=Declaration* transitions+=LabeledTransition* assertions+=Instruction*)
	 */
	protected void sequence_Class(EObject context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression then=Instruction else=Instruction?)
	 */
	protected void sequence_Conditional(EObject context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (constants+=SymbolicConstant constants+=SymbolicConstant*)?)
	 */
	protected void sequence_Domain(EObject context, Domain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (attributes+=Attribute attributes+=Attribute*)?)
	 */
	protected void sequence_EventDeclaration(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name='exponential' | name='Dirac' | name='constant') (parameters+=Expression parameters+=Expression*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=NameRef expression=TransitionAnd)
	 */
	protected void sequence_LabeledTransition(EObject context, LabeledTransition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LABELED_TRANSITION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LABELED_TRANSITION__EVENT));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LABELED_TRANSITION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LABELED_TRANSITION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=LogicalAnd_LogicalAnd_1_0_0 op='and' right=Relation)
	 */
	protected void sequence_LogicalAnd(EObject context, LogicalAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LOGICAL_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LOGICAL_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LOGICAL_AND__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LOGICAL_AND__OP));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LOGICAL_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LOGICAL_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=LogicalOr_LogicalOr_1_0_0 op='or' right=LogicalAnd)
	 */
	protected void sequence_LogicalOr(EObject context, LogicalOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LOGICAL_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LOGICAL_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LOGICAL_OR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LOGICAL_OR__OP));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.LOGICAL_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.LOGICAL_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declarations+=AbstractDeclaration*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multiplication_1_0_0 (op='*' | op='/') right=Neg)
	 */
	protected void sequence_Multiplication(EObject context, Multiplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((nested=NameRef_NameRef_1_0_0 variable=[NamedElement|ID]) | variable=[NamedElement|ID])
	 */
	protected void sequence_NameRef(EObject context, NameRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[NamedElement|ID]
	 */
	protected void sequence_NamedType(EObject context, NamedType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.NAMED_TYPE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.NAMED_TYPE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedTypeAccess().getRefNamedElementIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Atom
	 */
	protected void sequence_Neg(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.MINUS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.MINUS__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Atom
	 */
	protected void sequence_Neg(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.NOT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_NumberLiteral(EObject context, ARNumber semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.AR_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.AR_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNUMBERTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID value=Expression)
	 */
	protected void sequence_ObserverDeclaration(EObject context, Observer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.OBSERVER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.OBSERVER__TYPE));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.OBSERVER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.OBSERVER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID value=Expression)
	 */
	protected void sequence_ParameterDeclaration(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=Relation_Equal_1_0_0 
	 *         (
	 *             op='==' | 
	 *             op='!=' | 
	 *             op='<' | 
	 *             op='<=' | 
	 *             op='>=' | 
	 *             op='>'
	 *         ) 
	 *         right=Addition
	 *     )
	 */
	protected void sequence_Relation(EObject context, Equal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Skip}
	 */
	protected void sequence_Skip(EObject context, Skip semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, ARString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.AR_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.AR_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=CaseExpression* default=Expression)
	 */
	protected void sequence_SwitchExpression(EObject context, SwitchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=CaseExpression* else=Expression)
	 */
	protected void sequence_Switch(EObject context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SymbolicConstant(EObject context, SymbolicConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=TransitionAnd_TransitionAnd_1_0 right=TransitionOr)
	 */
	protected void sequence_TransitionAnd(EObject context, TransitionAnd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.TRANSITION_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.TRANSITION_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.TRANSITION_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.TRANSITION_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=TransitionOr_TransitionOr_1_0 right=Transition)
	 */
	protected void sequence_TransitionOr(EObject context, TransitionOr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.TRANSITION_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.TRANSITION_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.TRANSITION_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.TRANSITION_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (guard=Expression action=Instruction)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.TRANSITION__GUARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.TRANSITION__GUARD));
			if(transientValues.isValueTransient(semanticObject, AltaricaPackage.Literals.TRANSITION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AltaricaPackage.Literals.TRANSITION__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0(), semanticObject.getGuard());
		feeder.accept(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=ID (attributes+=Attribute attributes+=Attribute*)?)
	 */
	protected void sequence_VariableDeclaration(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
