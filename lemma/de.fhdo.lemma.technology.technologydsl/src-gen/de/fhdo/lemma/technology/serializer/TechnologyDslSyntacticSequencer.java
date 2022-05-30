/*
 * generated by Xtext 2.25.0
 */
package de.fhdo.lemma.technology.serializer;

import com.google.inject.Inject;
import de.fhdo.lemma.technology.services.TechnologyDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TechnologyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TechnologyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DataOperation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_3__q;
	protected AbstractElementAlias match_ListType_CollectionKeyword_0_0_0_or_ListKeyword_0_0_1;
	protected AbstractElementAlias match_ListType_CollectionKeyword_1_0_0_or_ListKeyword_1_0_1;
	protected AbstractElementAlias match_OperationAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__;
	protected AbstractElementAlias match_ServiceAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__;
	protected AbstractElementAlias match_TechnologySpecificListType_CollectionKeyword_0_0_or_ListKeyword_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TechnologyDslGrammarAccess) access;
		match_DataOperation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDataOperationAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDataOperationAccess().getRightParenthesisKeyword_3_3()));
		match_ListType_CollectionKeyword_0_0_0_or_ListKeyword_0_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getListTypeAccess().getCollectionKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getListTypeAccess().getListKeyword_0_0_1()));
		match_ListType_CollectionKeyword_1_0_0_or_ListKeyword_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getListTypeAccess().getCollectionKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getListTypeAccess().getListKeyword_1_0_1()));
		match_OperationAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationAspectAccess().getLeftCurlyBracketKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getOperationAspectAccess().getRightCurlyBracketKeyword_6_0_3())), new TokenAlias(false, false, grammarAccess.getOperationAspectAccess().getSemicolonKeyword_6_1()));
		match_ServiceAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getServiceAspectAccess().getLeftCurlyBracketKeyword_6_0_0()), new TokenAlias(false, false, grammarAccess.getServiceAspectAccess().getRightCurlyBracketKeyword_6_0_3())), new TokenAlias(false, false, grammarAccess.getServiceAspectAccess().getSemicolonKeyword_6_1()));
		match_TechnologySpecificListType_CollectionKeyword_0_0_or_ListKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTechnologySpecificListTypeAccess().getCollectionKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getTechnologySpecificListTypeAccess().getListKeyword_0_1()));
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
			if (match_DataOperation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_3__q.equals(syntax))
				emit_DataOperation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListType_CollectionKeyword_0_0_0_or_ListKeyword_0_0_1.equals(syntax))
				emit_ListType_CollectionKeyword_0_0_0_or_ListKeyword_0_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ListType_CollectionKeyword_1_0_0_or_ListKeyword_1_0_1.equals(syntax))
				emit_ListType_CollectionKeyword_1_0_0_or_ListKeyword_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperationAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__.equals(syntax))
				emit_OperationAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ServiceAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__.equals(syntax))
				emit_ServiceAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TechnologySpecificListType_CollectionKeyword_0_0_or_ListKeyword_0_1.equals(syntax))
				emit_TechnologySpecificListType_CollectionKeyword_0_0_or_ListKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) '<' features+=DataOperationFeature
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_DataOperation___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'collection' | 'list'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_ListType_CollectionKeyword_0_0_0_or_ListKeyword_0_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'collection' | 'list'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_ListType_CollectionKeyword_1_0_0_or_ListKeyword_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     joinPoints+=OperationJoinPointType (ambiguity) (rule end)
	 */
	protected void emit_OperationAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     joinPoints+=ServiceJoinPointType (ambiguity) (rule end)
	 */
	protected void emit_ServiceAspect_SemicolonKeyword_6_1_or___LeftCurlyBracketKeyword_6_0_0_RightCurlyBracketKeyword_6_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'collection' | 'list'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'type' name=ID
	 */
	protected void emit_TechnologySpecificListType_CollectionKeyword_0_0_or_ListKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}