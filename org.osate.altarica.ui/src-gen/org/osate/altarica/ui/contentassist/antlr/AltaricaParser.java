/*
 * generated by Xtext
 */
package org.osate.altarica.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.altarica.services.AltaricaGrammarAccess;

public class AltaricaParser extends AbstractContentAssistParser {
	
	@Inject
	private AltaricaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.altarica.ui.contentassist.antlr.internal.InternalAltaricaParser createParser() {
		org.osate.altarica.ui.contentassist.antlr.internal.InternalAltaricaParser result = new org.osate.altarica.ui.contentassist.antlr.internal.InternalAltaricaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractDeclarationAccess().getAlternatives(), "rule__AbstractDeclaration__Alternatives");
					put(grammarAccess.getAbstractDefinitionConstantAccess().getAlternatives(), "rule__AbstractDefinitionConstant__Alternatives");
					put(grammarAccess.getAbstractDomainAccess().getAlternatives(), "rule__AbstractDomain__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getLogicalAccess().getOpAlternatives_1_0_1_0(), "rule__Logical__OpAlternatives_1_0_1_0");
					put(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0(), "rule__Relation__OpAlternatives_1_0_1_0");
					put(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0(), "rule__Addition__OpAlternatives_1_0_1_0");
					put(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0(), "rule__Multiplication__OpAlternatives_1_0_1_0");
					put(grammarAccess.getNegAccess().getAlternatives(), "rule__Neg__Alternatives");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0(), "rule__BooleanLiteral__ValueAlternatives_0");
					put(grammarAccess.getAbstractTypeRefAccess().getAlternatives(), "rule__AbstractTypeRef__Alternatives");
					put(grammarAccess.getAbstractExpressionAccess().getAlternatives(), "rule__AbstractExpression__Alternatives");
					put(grammarAccess.getBaseTypeEnumAccess().getAlternatives(), "rule__BaseTypeEnum__Alternatives");
					put(grammarAccess.getConstantDefinitionAccess().getGroup(), "rule__ConstantDefinition__Group__0");
					put(grammarAccess.getExpressionConstantAccess().getGroup(), "rule__ExpressionConstant__Group__0");
					put(grammarAccess.getDomainConstantAccess().getGroup(), "rule__DomainConstant__Group__0");
					put(grammarAccess.getDomainConstantAccess().getGroup_2(), "rule__DomainConstant__Group_2__0");
					put(grammarAccess.getDomainAccess().getGroup(), "rule__Domain__Group__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_2(), "rule__Enumeration__Group_2__0");
					put(grammarAccess.getEnumerationAccess().getGroup_2_1(), "rule__Enumeration__Group_2_1__0");
					put(grammarAccess.getSymbolicConstantAccess().getGroup(), "rule__SymbolicConstant__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_4(), "rule__Class__Group_4__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3(), "rule__VariableDeclaration__Group_3__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3_2(), "rule__VariableDeclaration__Group_3_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup(), "rule__EventDeclaration__Group__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_3(), "rule__EventDeclaration__Group_3__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_3_2(), "rule__EventDeclaration__Group_3_2__0");
					put(grammarAccess.getParameterDeclarationAccess().getGroup(), "rule__ParameterDeclaration__Group__0");
					put(grammarAccess.getObserverDeclarationAccess().getGroup(), "rule__ObserverDeclaration__Group__0");
					put(grammarAccess.getLabeledTransitionAccess().getGroup(), "rule__LabeledTransition__Group__0");
					put(grammarAccess.getTransitionAndAccess().getGroup(), "rule__TransitionAnd__Group__0");
					put(grammarAccess.getTransitionAndAccess().getGroup_1(), "rule__TransitionAnd__Group_1__0");
					put(grammarAccess.getTransitionOrAccess().getGroup(), "rule__TransitionOr__Group__0");
					put(grammarAccess.getTransitionOrAccess().getGroup_1(), "rule__TransitionOr__Group_1__0");
					put(grammarAccess.getITransitionAccess().getGroup(), "rule__ITransition__Group__0");
					put(grammarAccess.getSkipAccess().getGroup(), "rule__Skip__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getIfThenElseAccess().getGroup(), "rule__IfThenElse__Group__0");
					put(grammarAccess.getIfThenElseAccess().getGroup_4(), "rule__IfThenElse__Group_4__0");
					put(grammarAccess.getLogicalAccess().getGroup(), "rule__Logical__Group__0");
					put(grammarAccess.getLogicalAccess().getGroup_1(), "rule__Logical__Group_1__0");
					put(grammarAccess.getLogicalAccess().getGroup_1_0(), "rule__Logical__Group_1_0__0");
					put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
					put(grammarAccess.getRelationAccess().getGroup_1(), "rule__Relation__Group_1__0");
					put(grammarAccess.getRelationAccess().getGroup_1_0(), "rule__Relation__Group_1_0__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0(), "rule__Addition__Group_1_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0(), "rule__Multiplication__Group_1_0__0");
					put(grammarAccess.getNegAccess().getGroup_0(), "rule__Neg__Group_0__0");
					put(grammarAccess.getNegAccess().getGroup_1(), "rule__Neg__Group_1__0");
					put(grammarAccess.getAtomAccess().getGroup_4(), "rule__Atom__Group_4__0");
					put(grammarAccess.getNameRefAccess().getGroup(), "rule__NameRef__Group__0");
					put(grammarAccess.getNameRefAccess().getGroup_1(), "rule__NameRef__Group_1__0");
					put(grammarAccess.getNameRefAccess().getGroup_1_0(), "rule__NameRef__Group_1_0__0");
					put(grammarAccess.getSwitchAccess().getGroup(), "rule__Switch__Group__0");
					put(grammarAccess.getCaseExpressionAccess().getGroup(), "rule__CaseExpression__Group__0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment(), "rule__Model__DeclarationsAssignment");
					put(grammarAccess.getConstantDefinitionAccess().getNameAssignment_2(), "rule__ConstantDefinition__NameAssignment_2");
					put(grammarAccess.getConstantDefinitionAccess().getExpressionAssignment_3(), "rule__ConstantDefinition__ExpressionAssignment_3");
					put(grammarAccess.getExpressionConstantAccess().getOwnedExpressionAssignment_1(), "rule__ExpressionConstant__OwnedExpressionAssignment_1");
					put(grammarAccess.getDomainConstantAccess().getDomainAssignment_1(), "rule__DomainConstant__DomainAssignment_1");
					put(grammarAccess.getDomainConstantAccess().getOwnedExpressionAssignment_2_1(), "rule__DomainConstant__OwnedExpressionAssignment_2_1");
					put(grammarAccess.getDomainAccess().getNameAssignment_2(), "rule__Domain__NameAssignment_2");
					put(grammarAccess.getDomainAccess().getDomainAssignment_3(), "rule__Domain__DomainAssignment_3");
					put(grammarAccess.getRangeAccess().getLowerAssignment_1(), "rule__Range__LowerAssignment_1");
					put(grammarAccess.getRangeAccess().getUpperAssignment_3(), "rule__Range__UpperAssignment_3");
					put(grammarAccess.getEnumerationAccess().getOwnedSymbolsAssignment_2_0(), "rule__Enumeration__OwnedSymbolsAssignment_2_0");
					put(grammarAccess.getEnumerationAccess().getOwnedSymbolsAssignment_2_1_1(), "rule__Enumeration__OwnedSymbolsAssignment_2_1_1");
					put(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1(), "rule__SymbolicConstant__NameAssignment_1");
					put(grammarAccess.getBaseTypeAccess().getNameAssignment(), "rule__BaseType__NameAssignment");
					put(grammarAccess.getNamedTypeAccess().getRefAssignment(), "rule__NamedType__RefAssignment");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getDeclarationsAssignment_3(), "rule__Class__DeclarationsAssignment_3");
					put(grammarAccess.getClassAccess().getTransitionsAssignment_4_1(), "rule__Class__TransitionsAssignment_4_1");
					put(grammarAccess.getClassAccess().getAssertionsAssignment_5_1(), "rule__Class__AssertionsAssignment_5_1");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1(), "rule__VariableDeclaration__TypeAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2(), "rule__VariableDeclaration__NameAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1(), "rule__VariableDeclaration__AttributesAssignment_3_1");
					put(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1(), "rule__VariableDeclaration__AttributesAssignment_3_2_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getValueAssignment_3(), "rule__Attribute__ValueAssignment_3");
					put(grammarAccess.getEventDeclarationAccess().getNameAssignment_2(), "rule__EventDeclaration__NameAssignment_2");
					put(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1(), "rule__EventDeclaration__AttributesAssignment_3_1");
					put(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1(), "rule__EventDeclaration__AttributesAssignment_3_2_1");
					put(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2(), "rule__ParameterDeclaration__TypeAssignment_2");
					put(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3(), "rule__ParameterDeclaration__NameAssignment_3");
					put(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5(), "rule__ParameterDeclaration__ValueAssignment_5");
					put(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2(), "rule__ObserverDeclaration__TypeAssignment_2");
					put(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3(), "rule__ObserverDeclaration__NameAssignment_3");
					put(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5(), "rule__ObserverDeclaration__ValueAssignment_5");
					put(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0(), "rule__LabeledTransition__EventAssignment_0");
					put(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2(), "rule__LabeledTransition__ExpressionAssignment_2");
					put(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2(), "rule__TransitionAnd__RightAssignment_1_2");
					put(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2(), "rule__TransitionOr__RightAssignment_1_2");
					put(grammarAccess.getAssignmentAccess().getVariableAssignment_1(), "rule__Assignment__VariableAssignment_1");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_3(), "rule__Assignment__ValueAssignment_3");
					put(grammarAccess.getBlockAccess().getInstructionsAssignment_2(), "rule__Block__InstructionsAssignment_2");
					put(grammarAccess.getIfThenElseAccess().getConditionAssignment_1(), "rule__IfThenElse__ConditionAssignment_1");
					put(grammarAccess.getIfThenElseAccess().getThenAssignment_3(), "rule__IfThenElse__ThenAssignment_3");
					put(grammarAccess.getIfThenElseAccess().getElseAssignment_4_1(), "rule__IfThenElse__ElseAssignment_4_1");
					put(grammarAccess.getLogicalAccess().getOpAssignment_1_0_1(), "rule__Logical__OpAssignment_1_0_1");
					put(grammarAccess.getLogicalAccess().getRightAssignment_1_0_2(), "rule__Logical__RightAssignment_1_0_2");
					put(grammarAccess.getRelationAccess().getOpAssignment_1_0_1(), "rule__Relation__OpAssignment_1_0_1");
					put(grammarAccess.getRelationAccess().getRightAssignment_1_0_2(), "rule__Relation__RightAssignment_1_0_2");
					put(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1(), "rule__Addition__OpAssignment_1_0_1");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2(), "rule__Addition__RightAssignment_1_0_2");
					put(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1(), "rule__Multiplication__OpAssignment_1_0_1");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2(), "rule__Multiplication__RightAssignment_1_0_2");
					put(grammarAccess.getNegAccess().getExpressionAssignment_0_2(), "rule__Neg__ExpressionAssignment_0_2");
					put(grammarAccess.getNegAccess().getExpressionAssignment_1_2(), "rule__Neg__ExpressionAssignment_1_2");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getIntegerLiteralAccess().getValueAssignment(), "rule__IntegerLiteral__ValueAssignment");
					put(grammarAccess.getNameRefAccess().getVariableAssignment_0(), "rule__NameRef__VariableAssignment_0");
					put(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2(), "rule__NameRef__VariableAssignment_1_0_2");
					put(grammarAccess.getVariableAttributeAccess().getNameAssignment(), "rule__VariableAttribute__NameAssignment");
					put(grammarAccess.getDomainRefAccess().getReferenceAssignment(), "rule__DomainRef__ReferenceAssignment");
					put(grammarAccess.getSwitchAccess().getOwnedCasesAssignment_1(), "rule__Switch__OwnedCasesAssignment_1");
					put(grammarAccess.getSwitchAccess().getDefaultAssignment_3(), "rule__Switch__DefaultAssignment_3");
					put(grammarAccess.getCaseExpressionAccess().getConditionAssignment_0(), "rule__CaseExpression__ConditionAssignment_0");
					put(grammarAccess.getCaseExpressionAccess().getBodyAssignment_2(), "rule__CaseExpression__BodyAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.altarica.ui.contentassist.antlr.internal.InternalAltaricaParser typedParser = (org.osate.altarica.ui.contentassist.antlr.internal.InternalAltaricaParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AltaricaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AltaricaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
