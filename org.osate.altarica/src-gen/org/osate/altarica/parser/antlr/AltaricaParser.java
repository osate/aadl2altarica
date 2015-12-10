/*
 * generated by Xtext
 */
package org.osate.altarica.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.osate.altarica.services.AltaricaGrammarAccess;

public class AltaricaParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AltaricaGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.osate.altarica.parser.antlr.internal.InternalAltaricaParser createParser(XtextTokenStream stream) {
		return new org.osate.altarica.parser.antlr.internal.InternalAltaricaParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "System";
	}
	
	public AltaricaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AltaricaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
