/*
 * generated by Xtext
 */
package org.osate.altarica.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.altarica.services.AltaricaGrammarAccess;

@SuppressWarnings("all")
public class AltaricaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AltaricaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Atom_LeftParenthesisKeyword_5_0_a;
	protected AbstractElementAlias match_Atom_LeftParenthesisKeyword_5_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AltaricaGrammarAccess) access;
		match_Atom_LeftParenthesisKeyword_5_0_a = new TokenAlias(true, true, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_5_0());
		match_Atom_LeftParenthesisKeyword_5_0_p = new TokenAlias(true, false, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_5_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Atom_LeftParenthesisKeyword_5_0_a.equals(syntax))
				emit_Atom_LeftParenthesisKeyword_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Atom_LeftParenthesisKeyword_5_0_p.equals(syntax))
				emit_Atom_LeftParenthesisKeyword_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=Atom
	 *     (rule start) (ambiguity) 'not' expression=Atom
	 *     (rule start) (ambiguity) 'switch' '{' 'else' ':' default=Expression
	 *     (rule start) (ambiguity) 'switch' '{' cases+=CaseExpression
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) variable=[NamedElement|ID]
	 *     (rule start) (ambiguity) {Addition.left=}
	 *     (rule start) (ambiguity) {Equal.left=}
	 *     (rule start) (ambiguity) {LogicalAnd.left=}
	 *     (rule start) (ambiguity) {LogicalOr.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 *     (rule start) (ambiguity) {NameRef.nested=}
	 */
	protected void emit_Atom_LeftParenthesisKeyword_5_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=Atom
	 *     (rule start) (ambiguity) 'not' expression=Atom
	 *     (rule start) (ambiguity) {Addition.left=}
	 *     (rule start) (ambiguity) {Equal.left=}
	 *     (rule start) (ambiguity) {LogicalAnd.left=}
	 *     (rule start) (ambiguity) {LogicalOr.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 */
	protected void emit_Atom_LeftParenthesisKeyword_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
