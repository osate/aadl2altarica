package org.osate.altarica.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.osate.altarica.services.AltaricaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAltaricaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'Integer'", "'Boolean'", "'domain'", "'{'", "'}'", "','", "'class'", "'end'", "'transition'", "'assertion'", "';'", "'('", "')'", "'='", "'event'", "'parameter'", "'observer'", "':'", "'&'", "'|'", "'->'", "'skip'", "':='", "'if'", "'then'", "'else'", "'switch'", "'not'", "'.'", "'or'", "'and'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_REGULAR_ID=9;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_ALPHA=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_STRING_ID=10;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAltaricaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAltaricaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAltaricaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g"; }


     
     	private AltaricaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AltaricaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:62:1: ( ruleModel EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:70:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:74:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:76:1: ( rule__Model__DeclarationsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:77:1: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:77:2: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel100);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:89:1: entryRuleAbstractDeclaration : ruleAbstractDeclaration EOF ;
    public final void entryRuleAbstractDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:90:1: ( ruleAbstractDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:91:1: ruleAbstractDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration128);
            ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclaration135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractDeclaration"


    // $ANTLR start "ruleAbstractDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:98:1: ruleAbstractDeclaration : ( ( rule__AbstractDeclaration__Alternatives ) ) ;
    public final void ruleAbstractDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:102:2: ( ( ( rule__AbstractDeclaration__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:103:1: ( ( rule__AbstractDeclaration__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:103:1: ( ( rule__AbstractDeclaration__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:104:1: ( rule__AbstractDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDeclarationAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:105:1: ( rule__AbstractDeclaration__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:105:2: rule__AbstractDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDeclaration__Alternatives_in_ruleAbstractDeclaration161);
            rule__AbstractDeclaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractDeclaration"


    // $ANTLR start "entryRuleDomain"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:117:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:118:1: ( ruleDomain EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:119:1: ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain188);
            ruleDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:126:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:130:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:131:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:131:1: ( ( rule__Domain__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:132:1: ( rule__Domain__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:133:1: ( rule__Domain__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:133:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain221);
            rule__Domain__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleSymbolicConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:145:1: entryRuleSymbolicConstant : ruleSymbolicConstant EOF ;
    public final void entryRuleSymbolicConstant() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:146:1: ( ruleSymbolicConstant EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:147:1: ruleSymbolicConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_entryRuleSymbolicConstant248);
            ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolicConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicConstant255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbolicConstant"


    // $ANTLR start "ruleSymbolicConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:154:1: ruleSymbolicConstant : ( ( rule__SymbolicConstant__Group__0 ) ) ;
    public final void ruleSymbolicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:158:2: ( ( ( rule__SymbolicConstant__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:159:1: ( ( rule__SymbolicConstant__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:159:1: ( ( rule__SymbolicConstant__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:160:1: ( rule__SymbolicConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:161:1: ( rule__SymbolicConstant__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:161:2: rule__SymbolicConstant__Group__0
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__0_in_ruleSymbolicConstant281);
            rule__SymbolicConstant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolicConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolicConstant"


    // $ANTLR start "entryRuleType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:173:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:174:1: ( ruleType EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:175:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType308);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType315); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:182:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:186:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:187:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:187:1: ( ( rule__Type__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:188:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:189:1: ( rule__Type__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:189:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType341);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBaseType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:201:1: entryRuleBaseType : ruleBaseType EOF ;
    public final void entryRuleBaseType() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:202:1: ( ruleBaseType EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:203:1: ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType368);
            ruleBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType375); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:210:1: ruleBaseType : ( ( rule__BaseType__NameAssignment ) ) ;
    public final void ruleBaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:214:2: ( ( ( rule__BaseType__NameAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:215:1: ( ( rule__BaseType__NameAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:215:1: ( ( rule__BaseType__NameAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:216:1: ( rule__BaseType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:217:1: ( rule__BaseType__NameAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:217:2: rule__BaseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BaseType__NameAssignment_in_ruleBaseType401);
            rule__BaseType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleNamedType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:229:1: entryRuleNamedType : ruleNamedType EOF ;
    public final void entryRuleNamedType() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:230:1: ( ruleNamedType EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:231:1: ruleNamedType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType428);
            ruleNamedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType435); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:238:1: ruleNamedType : ( ( rule__NamedType__RefAssignment ) ) ;
    public final void ruleNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:242:2: ( ( ( rule__NamedType__RefAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:243:1: ( ( rule__NamedType__RefAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:243:1: ( ( rule__NamedType__RefAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:244:1: ( rule__NamedType__RefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:245:1: ( rule__NamedType__RefAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:245:2: rule__NamedType__RefAssignment
            {
            pushFollow(FOLLOW_rule__NamedType__RefAssignment_in_ruleNamedType461);
            rule__NamedType__RefAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypeAccess().getRefAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleClass"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:257:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:258:1: ( ruleClass EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:259:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass488);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass495); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:266:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:270:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:271:1: ( ( rule__Class__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:271:1: ( ( rule__Class__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:272:1: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:273:1: ( rule__Class__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:273:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass521);
            rule__Class__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:285:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:286:1: ( ruleDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:287:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration548);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration555); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:294:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:298:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:299:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:299:1: ( ( rule__Declaration__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:300:1: ( rule__Declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:301:1: ( rule__Declaration__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:301:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration581);
            rule__Declaration__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:313:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:314:1: ( ruleVariableDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:315:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration608);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration615); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:322:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:326:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:327:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:327:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:328:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:329:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:329:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration641);
            rule__VariableDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAttribute"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:341:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:342:1: ( ruleAttribute EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:343:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute668);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute675); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:350:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:354:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:355:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:355:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:356:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:357:1: ( rule__Attribute__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:357:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute701);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEventDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:369:1: entryRuleEventDeclaration : ruleEventDeclaration EOF ;
    public final void entryRuleEventDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:370:1: ( ruleEventDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:371:1: ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration728);
            ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclaration735); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:378:1: ruleEventDeclaration : ( ( rule__EventDeclaration__Group__0 ) ) ;
    public final void ruleEventDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:382:2: ( ( ( rule__EventDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:383:1: ( ( rule__EventDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:383:1: ( ( rule__EventDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:384:1: ( rule__EventDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:385:1: ( rule__EventDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:385:2: rule__EventDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__0_in_ruleEventDeclaration761);
            rule__EventDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:397:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:398:1: ( ruleParameterDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:399:1: ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration788);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration795); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:406:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:410:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:411:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:411:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:412:1: ( rule__ParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:413:1: ( rule__ParameterDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:413:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration821);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleObserverDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:425:1: entryRuleObserverDeclaration : ruleObserverDeclaration EOF ;
    public final void entryRuleObserverDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:426:1: ( ruleObserverDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:427:1: ruleObserverDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration848);
            ruleObserverDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObserverDeclaration855); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObserverDeclaration"


    // $ANTLR start "ruleObserverDeclaration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:434:1: ruleObserverDeclaration : ( ( rule__ObserverDeclaration__Group__0 ) ) ;
    public final void ruleObserverDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:438:2: ( ( ( rule__ObserverDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:439:1: ( ( rule__ObserverDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:439:1: ( ( rule__ObserverDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:440:1: ( rule__ObserverDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:441:1: ( rule__ObserverDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:441:2: rule__ObserverDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__0_in_ruleObserverDeclaration881);
            rule__ObserverDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObserverDeclaration"


    // $ANTLR start "entryRuleLabeledTransition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:453:1: entryRuleLabeledTransition : ruleLabeledTransition EOF ;
    public final void entryRuleLabeledTransition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:454:1: ( ruleLabeledTransition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:455:1: ruleLabeledTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition908);
            ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledTransition915); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabeledTransition"


    // $ANTLR start "ruleLabeledTransition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:462:1: ruleLabeledTransition : ( ( rule__LabeledTransition__Group__0 ) ) ;
    public final void ruleLabeledTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:466:2: ( ( ( rule__LabeledTransition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:467:1: ( ( rule__LabeledTransition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:467:1: ( ( rule__LabeledTransition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:468:1: ( rule__LabeledTransition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:469:1: ( rule__LabeledTransition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:469:2: rule__LabeledTransition__Group__0
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__0_in_ruleLabeledTransition941);
            rule__LabeledTransition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabeledTransition"


    // $ANTLR start "entryRuleTransitionAnd"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:481:1: entryRuleTransitionAnd : ruleTransitionAnd EOF ;
    public final void entryRuleTransitionAnd() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:482:1: ( ruleTransitionAnd EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:483:1: ruleTransitionAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd968);
            ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionAnd975); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionAnd"


    // $ANTLR start "ruleTransitionAnd"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:490:1: ruleTransitionAnd : ( ( rule__TransitionAnd__Group__0 ) ) ;
    public final void ruleTransitionAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:494:2: ( ( ( rule__TransitionAnd__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:495:1: ( ( rule__TransitionAnd__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:495:1: ( ( rule__TransitionAnd__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:496:1: ( rule__TransitionAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:497:1: ( rule__TransitionAnd__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:497:2: rule__TransitionAnd__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__0_in_ruleTransitionAnd1001);
            rule__TransitionAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionAnd"


    // $ANTLR start "entryRuleTransitionOr"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:509:1: entryRuleTransitionOr : ruleTransitionOr EOF ;
    public final void entryRuleTransitionOr() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:510:1: ( ruleTransitionOr EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:511:1: ruleTransitionOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr1028);
            ruleTransitionOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionOr1035); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionOr"


    // $ANTLR start "ruleTransitionOr"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:518:1: ruleTransitionOr : ( ( rule__TransitionOr__Group__0 ) ) ;
    public final void ruleTransitionOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:522:2: ( ( ( rule__TransitionOr__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:523:1: ( ( rule__TransitionOr__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:523:1: ( ( rule__TransitionOr__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:524:1: ( rule__TransitionOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:525:1: ( rule__TransitionOr__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:525:2: rule__TransitionOr__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__0_in_ruleTransitionOr1061);
            rule__TransitionOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionOr"


    // $ANTLR start "entryRuleTransition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:537:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:538:1: ( ruleTransition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:539:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1088);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1095); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:546:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:550:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:551:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:551:1: ( ( rule__Transition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:552:1: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:553:1: ( rule__Transition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:553:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition1121);
            rule__Transition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInstruction"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:565:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:566:1: ( ruleInstruction EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:567:1: ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1148);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1155); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:574:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:578:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:579:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:579:1: ( ( rule__Instruction__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:580:1: ( rule__Instruction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:581:1: ( rule__Instruction__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:581:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction1181);
            rule__Instruction__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleSkip"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:593:1: entryRuleSkip : ruleSkip EOF ;
    public final void entryRuleSkip() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:594:1: ( ruleSkip EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:595:1: ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip1208);
            ruleSkip();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip1215); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:602:1: ruleSkip : ( ( rule__Skip__Group__0 ) ) ;
    public final void ruleSkip() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:606:2: ( ( ( rule__Skip__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:607:1: ( ( rule__Skip__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:607:1: ( ( rule__Skip__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:608:1: ( rule__Skip__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:609:1: ( rule__Skip__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:609:2: rule__Skip__Group__0
            {
            pushFollow(FOLLOW_rule__Skip__Group__0_in_ruleSkip1241);
            rule__Skip__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:621:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:622:1: ( ruleAssignment EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:623:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1268);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1275); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:630:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:634:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:635:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:635:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:636:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:637:1: ( rule__Assignment__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:637:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1301);
            rule__Assignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleBlock"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:649:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:650:1: ( ruleBlock EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:651:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1328);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1335); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:658:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:662:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:663:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:663:1: ( ( rule__Block__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:664:1: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:665:1: ( rule__Block__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:665:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1361);
            rule__Block__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleConditional"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:677:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:678:1: ( ruleConditional EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:679:1: ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional1388);
            ruleConditional();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional1395); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:686:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:690:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:691:1: ( ( rule__Conditional__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:691:1: ( ( rule__Conditional__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:692:1: ( rule__Conditional__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:693:1: ( rule__Conditional__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:693:2: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0_in_ruleConditional1421);
            rule__Conditional__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleSwitch"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:705:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:706:1: ( ruleSwitch EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:707:1: ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch1448);
            ruleSwitch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch1455); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:714:1: ruleSwitch : ( ( rule__Switch__Group__0 ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:718:2: ( ( ( rule__Switch__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:719:1: ( ( rule__Switch__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:719:1: ( ( rule__Switch__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:720:1: ( rule__Switch__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:721:1: ( rule__Switch__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:721:2: rule__Switch__Group__0
            {
            pushFollow(FOLLOW_rule__Switch__Group__0_in_ruleSwitch1481);
            rule__Switch__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:733:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:734:1: ( ruleExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:735:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1508);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1515); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:742:1: ruleExpression : ( ruleLogicalOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:746:2: ( ( ruleLogicalOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:747:1: ( ruleLogicalOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:747:1: ( ruleLogicalOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:748:1: ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_ruleExpression1541);
            ruleLogicalOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalOr"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:761:1: entryRuleLogicalOr : ruleLogicalOr EOF ;
    public final void entryRuleLogicalOr() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:762:1: ( ruleLogicalOr EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:763:1: ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr1567);
            ruleLogicalOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOr1574); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalOr"


    // $ANTLR start "ruleLogicalOr"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:770:1: ruleLogicalOr : ( ( rule__LogicalOr__Group__0 ) ) ;
    public final void ruleLogicalOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:774:2: ( ( ( rule__LogicalOr__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:775:1: ( ( rule__LogicalOr__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:775:1: ( ( rule__LogicalOr__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:776:1: ( rule__LogicalOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:777:1: ( rule__LogicalOr__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:777:2: rule__LogicalOr__Group__0
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group__0_in_ruleLogicalOr1600);
            rule__LogicalOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOr"


    // $ANTLR start "entryRuleLogicalAnd"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:789:1: entryRuleLogicalAnd : ruleLogicalAnd EOF ;
    public final void entryRuleLogicalAnd() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:790:1: ( ruleLogicalAnd EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:791:1: ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd1627);
            ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAnd1634); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalAnd"


    // $ANTLR start "ruleLogicalAnd"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:798:1: ruleLogicalAnd : ( ( rule__LogicalAnd__Group__0 ) ) ;
    public final void ruleLogicalAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:802:2: ( ( ( rule__LogicalAnd__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:803:1: ( ( rule__LogicalAnd__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:803:1: ( ( rule__LogicalAnd__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:804:1: ( rule__LogicalAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:805:1: ( rule__LogicalAnd__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:805:2: rule__LogicalAnd__Group__0
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group__0_in_ruleLogicalAnd1660);
            rule__LogicalAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAnd"


    // $ANTLR start "entryRuleRelation"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:817:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:818:1: ( ruleRelation EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:819:1: ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1687);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1694); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:826:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:830:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:831:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:831:1: ( ( rule__Relation__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:832:1: ( rule__Relation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:833:1: ( rule__Relation__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:833:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation1720);
            rule__Relation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAddition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:845:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:846:1: ( ruleAddition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:847:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1747);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1754); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:854:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:858:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:859:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:859:1: ( ( rule__Addition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:860:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:861:1: ( rule__Addition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:861:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1780);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:873:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:874:1: ( ruleMultiplication EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:875:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1807);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1814); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:882:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:886:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:887:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:887:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:888:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:889:1: ( rule__Multiplication__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:889:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1840);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNeg"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:901:1: entryRuleNeg : ruleNeg EOF ;
    public final void entryRuleNeg() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:902:1: ( ruleNeg EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:903:1: ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_entryRuleNeg1867);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg1874); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNeg"


    // $ANTLR start "ruleNeg"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:910:1: ruleNeg : ( ( rule__Neg__Alternatives ) ) ;
    public final void ruleNeg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:914:2: ( ( ( rule__Neg__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:915:1: ( ( rule__Neg__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:915:1: ( ( rule__Neg__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:916:1: ( rule__Neg__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:917:1: ( rule__Neg__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:917:2: rule__Neg__Alternatives
            {
            pushFollow(FOLLOW_rule__Neg__Alternatives_in_ruleNeg1900);
            rule__Neg__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeg"


    // $ANTLR start "entryRuleAtom"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:929:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:930:1: ( ruleAtom EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:931:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1927);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1934); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:938:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:942:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:943:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:943:1: ( ( rule__Atom__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:944:1: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:945:1: ( rule__Atom__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:945:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom1960);
            rule__Atom__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:957:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:958:1: ( ruleBooleanLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:959:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1987);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1994); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:966:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:970:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:971:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:971:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:972:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:973:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:973:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2020);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:985:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:986:1: ( ruleStringLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:987:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2047);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2054); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:994:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:998:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:999:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:999:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1000:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1001:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1001:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2080);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1013:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1014:1: ( ruleIntegerLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1015:1: ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2107);
            ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral2114); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1022:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1026:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1027:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1027:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1028:1: ( rule__IntegerLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1029:1: ( rule__IntegerLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1029:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral2140);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleNameRef"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1041:1: entryRuleNameRef : ruleNameRef EOF ;
    public final void entryRuleNameRef() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1042:1: ( ruleNameRef EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1043:1: ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_entryRuleNameRef2167);
            ruleNameRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameRef2174); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameRef"


    // $ANTLR start "ruleNameRef"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1050:1: ruleNameRef : ( ( rule__NameRef__Group__0 ) ) ;
    public final void ruleNameRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1054:2: ( ( ( rule__NameRef__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1055:1: ( ( rule__NameRef__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1055:1: ( ( rule__NameRef__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1056:1: ( rule__NameRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1057:1: ( rule__NameRef__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1057:2: rule__NameRef__Group__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0_in_ruleNameRef2200);
            rule__NameRef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameRef"


    // $ANTLR start "entryRuleSwitchExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1069:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1070:1: ( ruleSwitchExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1071:1: ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression2227);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchExpression2234); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1078:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Group__0 ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1082:2: ( ( ( rule__SwitchExpression__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1083:1: ( ( rule__SwitchExpression__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1083:1: ( ( rule__SwitchExpression__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1084:1: ( rule__SwitchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1085:1: ( rule__SwitchExpression__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1085:2: rule__SwitchExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__0_in_ruleSwitchExpression2260);
            rule__SwitchExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleCaseExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1097:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1098:1: ( ruleCaseExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1099:1: ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression2287);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression2294); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1106:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1110:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1111:1: ( ( rule__CaseExpression__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1111:1: ( ( rule__CaseExpression__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1112:1: ( rule__CaseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1113:1: ( rule__CaseExpression__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1113:2: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression2320);
            rule__CaseExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "ruleBaseTypeEnum"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1126:1: ruleBaseTypeEnum : ( ( rule__BaseTypeEnum__Alternatives ) ) ;
    public final void ruleBaseTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1130:1: ( ( ( rule__BaseTypeEnum__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1131:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1131:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1132:1: ( rule__BaseTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1133:1: ( rule__BaseTypeEnum__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1133:2: rule__BaseTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2357);
            rule__BaseTypeEnum__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseTypeEnum"


    // $ANTLR start "rule__AbstractDeclaration__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1144:1: rule__AbstractDeclaration__Alternatives : ( ( ruleDomain ) | ( ruleClass ) );
    public final void rule__AbstractDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1148:1: ( ( ruleDomain ) | ( ruleClass ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==33) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1149:1: ( ruleDomain )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1149:1: ( ruleDomain )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1150:1: ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDomain_in_rule__AbstractDeclaration__Alternatives2392);
                    ruleDomain();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1155:6: ( ruleClass )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1155:6: ( ruleClass )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1156:1: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClass_in_rule__AbstractDeclaration__Alternatives2409);
                    ruleClass();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractDeclaration__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1166:1: rule__Type__Alternatives : ( ( ( ruleBaseType ) ) | ( ruleNamedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1170:1: ( ( ( ruleBaseType ) ) | ( ruleNamedType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=27 && LA3_0<=28)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1171:1: ( ( ruleBaseType ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1171:1: ( ( ruleBaseType ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1172:1: ( ruleBaseType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1173:1: ( ruleBaseType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1173:3: ruleBaseType
                    {
                    pushFollow(FOLLOW_ruleBaseType_in_rule__Type__Alternatives2442);
                    ruleBaseType();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:6: ( ruleNamedType )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:6: ( ruleNamedType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1178:1: ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNamedType_in_rule__Type__Alternatives2460);
                    ruleNamedType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Declaration__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1188:1: rule__Declaration__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1192:1: ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 27:
            case 28:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case 43:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1193:1: ( ruleVariableDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1193:1: ( ruleVariableDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1194:1: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2492);
                    ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1199:6: ( ruleEventDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1199:6: ( ruleEventDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1200:1: ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2509);
                    ruleEventDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1205:6: ( ruleParameterDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1205:6: ( ruleParameterDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1206:1: ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2526);
                    ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1211:6: ( ruleObserverDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1211:6: ( ruleObserverDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1212:1: ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2543);
                    ruleObserverDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Instruction__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1222:1: rule__Instruction__Alternatives : ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1226:1: ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            case 50:
                {
                alt5=4;
                }
                break;
            case 53:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1227:1: ( ruleSkip )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1227:1: ( ruleSkip )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1228:1: ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2575);
                    ruleSkip();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1233:6: ( ruleAssignment )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1233:6: ( ruleAssignment )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1234:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2592);
                    ruleAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1239:6: ( ruleBlock )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1239:6: ( ruleBlock )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1240:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2609);
                    ruleBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1245:6: ( ruleConditional )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1245:6: ( ruleConditional )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1246:1: ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleConditional_in_rule__Instruction__Alternatives2626);
                    ruleConditional();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1251:6: ( ruleSwitch )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1251:6: ( ruleSwitch )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1252:1: ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSwitch_in_rule__Instruction__Alternatives2643);
                    ruleSwitch();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Relation__OpAlternatives_1_0_1_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1262:1: rule__Relation__OpAlternatives_1_0_1_0 : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Relation__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1266:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1267:1: ( '==' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1267:1: ( '==' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1268:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Relation__OpAlternatives_1_0_1_02676); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1275:6: ( '!=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1275:6: ( '!=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1276:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Relation__OpAlternatives_1_0_1_02696); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1283:6: ( '<' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1283:6: ( '<' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1284:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_02716); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1291:6: ( '<=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1291:6: ( '<=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1292:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_02736); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1299:6: ( '>=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1299:6: ( '>=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1300:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Relation__OpAlternatives_1_0_1_02756); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1307:6: ( '>' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1307:6: ( '>' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1308:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Relation__OpAlternatives_1_0_1_02776); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Addition__OpAlternatives_1_0_1_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1320:1: rule__Addition__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1324:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1325:1: ( '+' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1325:1: ( '+' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1326:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Addition__OpAlternatives_1_0_1_02811); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1333:6: ( '-' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1333:6: ( '-' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1334:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Addition__OpAlternatives_1_0_1_02831); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Multiplication__OpAlternatives_1_0_1_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1346:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1350:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1351:1: ( '*' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1351:1: ( '*' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1352:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Multiplication__OpAlternatives_1_0_1_02866); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1359:6: ( '/' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1359:6: ( '/' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1360:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Multiplication__OpAlternatives_1_0_1_02886); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Neg__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1372:1: rule__Neg__Alternatives : ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) );
    public final void rule__Neg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1376:1: ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 25:
            case 26:
            case 38:
            case 53:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1377:1: ( ( rule__Neg__Group_0__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1377:1: ( ( rule__Neg__Group_0__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1378:1: ( rule__Neg__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1379:1: ( rule__Neg__Group_0__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1379:2: rule__Neg__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives2920);
                    rule__Neg__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1383:6: ( ( rule__Neg__Group_1__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1383:6: ( ( rule__Neg__Group_1__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1384:1: ( rule__Neg__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1385:1: ( rule__Neg__Group_1__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1385:2: rule__Neg__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives2938);
                    rule__Neg__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1389:6: ( ruleAtom )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1389:6: ( ruleAtom )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1390:1: ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAtom_in_rule__Neg__Alternatives2956);
                    ruleAtom();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1400:1: rule__Atom__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ruleSwitchExpression ) | ( ( rule__Atom__Group_5__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1404:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ruleSwitchExpression ) | ( ( rule__Atom__Group_5__0 ) ) )
            int alt10=6;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=4;
                }
                break;
            case 53:
                {
                alt10=5;
                }
                break;
            case 38:
                {
                alt10=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1405:1: ( ruleBooleanLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1405:1: ( ruleBooleanLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1406:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives2988);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1411:6: ( ruleStringLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1411:6: ( ruleStringLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1412:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives3005);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1417:6: ( ruleIntegerLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1417:6: ( ruleIntegerLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1418:1: ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives3022);
                    ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1423:6: ( ruleNameRef )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1423:6: ( ruleNameRef )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1424:1: ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleNameRef_in_rule__Atom__Alternatives3039);
                    ruleNameRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1429:6: ( ruleSwitchExpression )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1429:6: ( ruleSwitchExpression )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1430:1: ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getSwitchExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSwitchExpression_in_rule__Atom__Alternatives3056);
                    ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getSwitchExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1435:6: ( ( rule__Atom__Group_5__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1435:6: ( ( rule__Atom__Group_5__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1436:1: ( rule__Atom__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_5()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1437:1: ( rule__Atom__Group_5__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1437:2: rule__Atom__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_5__0_in_rule__Atom__Alternatives3073);
                    rule__Atom__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1446:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1450:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1451:1: ( 'true' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1451:1: ( 'true' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1452:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__BooleanLiteral__ValueAlternatives_03107); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1459:6: ( 'false' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1459:6: ( 'false' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1460:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__BooleanLiteral__ValueAlternatives_03127); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_0"


    // $ANTLR start "rule__BaseTypeEnum__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1472:1: rule__BaseTypeEnum__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__BaseTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1476:1: ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1477:1: ( ( 'Integer' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1477:1: ( ( 'Integer' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1478:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1479:1: ( 'Integer' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1479:3: 'Integer'
                    {
                    match(input,27,FOLLOW_27_in_rule__BaseTypeEnum__Alternatives3162); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1484:6: ( ( 'Boolean' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1484:6: ( ( 'Boolean' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1485:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1486:1: ( 'Boolean' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1486:3: 'Boolean'
                    {
                    match(input,28,FOLLOW_28_in_rule__BaseTypeEnum__Alternatives3183); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseTypeEnum__Alternatives"


    // $ANTLR start "rule__Domain__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1498:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1502:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1503:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03216);
            rule__Domain__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03219);
            rule__Domain__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1510:1: rule__Domain__Group__0__Impl : ( () ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1514:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1515:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1515:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1516:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1517:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1519:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getDomainAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1529:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1533:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1534:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13277);
            rule__Domain__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13280);
            rule__Domain__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1541:1: rule__Domain__Group__1__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1545:1: ( ( 'domain' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1546:1: ( 'domain' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1546:1: ( 'domain' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1547:1: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Domain__Group__1__Impl3308); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1560:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1564:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1565:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23339);
            rule__Domain__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23342);
            rule__Domain__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1572:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1576:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1577:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1577:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1578:1: ( rule__Domain__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1579:1: ( rule__Domain__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1579:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3369);
            rule__Domain__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1589:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1593:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1594:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33399);
            rule__Domain__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33402);
            rule__Domain__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1601:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1605:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1606:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1606:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1607:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__Domain__Group__3__Impl3430); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1620:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1624:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1625:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43461);
            rule__Domain__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43464);
            rule__Domain__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1632:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__Group_4__0 )? ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1636:1: ( ( ( rule__Domain__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1637:1: ( ( rule__Domain__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1637:1: ( ( rule__Domain__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1638:1: ( rule__Domain__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1639:1: ( rule__Domain__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1639:2: rule__Domain__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Domain__Group_4__0_in_rule__Domain__Group__4__Impl3491);
                    rule__Domain__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1649:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1653:1: ( rule__Domain__Group__5__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1654:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53522);
            rule__Domain__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1660:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1664:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1665:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1665:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1666:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,31,FOLLOW_31_in_rule__Domain__Group__5__Impl3550); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group_4__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1691:1: rule__Domain__Group_4__0 : rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 ;
    public final void rule__Domain__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1695:1: ( rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1696:2: rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_4__0__Impl_in_rule__Domain__Group_4__03593);
            rule__Domain__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group_4__1_in_rule__Domain__Group_4__03596);
            rule__Domain__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__0"


    // $ANTLR start "rule__Domain__Group_4__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1703:1: rule__Domain__Group_4__0__Impl : ( ( rule__Domain__ConstantsAssignment_4_0 ) ) ;
    public final void rule__Domain__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1707:1: ( ( ( rule__Domain__ConstantsAssignment_4_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1708:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1708:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1709:1: ( rule__Domain__ConstantsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1710:1: ( rule__Domain__ConstantsAssignment_4_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1710:2: rule__Domain__ConstantsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Domain__ConstantsAssignment_4_0_in_rule__Domain__Group_4__0__Impl3623);
            rule__Domain__ConstantsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getConstantsAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__0__Impl"


    // $ANTLR start "rule__Domain__Group_4__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1720:1: rule__Domain__Group_4__1 : rule__Domain__Group_4__1__Impl ;
    public final void rule__Domain__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1724:1: ( rule__Domain__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1725:2: rule__Domain__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_4__1__Impl_in_rule__Domain__Group_4__13653);
            rule__Domain__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__1"


    // $ANTLR start "rule__Domain__Group_4__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1731:1: rule__Domain__Group_4__1__Impl : ( ( rule__Domain__Group_4_1__0 )* ) ;
    public final void rule__Domain__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1735:1: ( ( ( rule__Domain__Group_4_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1736:1: ( ( rule__Domain__Group_4_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1736:1: ( ( rule__Domain__Group_4_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1737:1: ( rule__Domain__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1738:1: ( rule__Domain__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1738:2: rule__Domain__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_4_1__0_in_rule__Domain__Group_4__1__Impl3680);
            	    rule__Domain__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__1__Impl"


    // $ANTLR start "rule__Domain__Group_4_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1752:1: rule__Domain__Group_4_1__0 : rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 ;
    public final void rule__Domain__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1756:1: ( rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1757:2: rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_4_1__0__Impl_in_rule__Domain__Group_4_1__03715);
            rule__Domain__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group_4_1__1_in_rule__Domain__Group_4_1__03718);
            rule__Domain__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4_1__0"


    // $ANTLR start "rule__Domain__Group_4_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1764:1: rule__Domain__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1768:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1769:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1769:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1770:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Domain__Group_4_1__0__Impl3746); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4_1__0__Impl"


    // $ANTLR start "rule__Domain__Group_4_1__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1783:1: rule__Domain__Group_4_1__1 : rule__Domain__Group_4_1__1__Impl ;
    public final void rule__Domain__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1787:1: ( rule__Domain__Group_4_1__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1788:2: rule__Domain__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_4_1__1__Impl_in_rule__Domain__Group_4_1__13777);
            rule__Domain__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4_1__1"


    // $ANTLR start "rule__Domain__Group_4_1__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1794:1: rule__Domain__Group_4_1__1__Impl : ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) ;
    public final void rule__Domain__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1798:1: ( ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1799:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1799:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1800:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1801:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1801:2: rule__Domain__ConstantsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Domain__ConstantsAssignment_4_1_1_in_rule__Domain__Group_4_1__1__Impl3804);
            rule__Domain__ConstantsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getConstantsAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4_1__1__Impl"


    // $ANTLR start "rule__SymbolicConstant__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1815:1: rule__SymbolicConstant__Group__0 : rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 ;
    public final void rule__SymbolicConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1819:1: ( rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1820:2: rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__0__Impl_in_rule__SymbolicConstant__Group__03838);
            rule__SymbolicConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__1_in_rule__SymbolicConstant__Group__03841);
            rule__SymbolicConstant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolicConstant__Group__0"


    // $ANTLR start "rule__SymbolicConstant__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1827:1: rule__SymbolicConstant__Group__0__Impl : ( () ) ;
    public final void rule__SymbolicConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1831:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1832:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1832:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1833:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1834:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1836:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolicConstant__Group__0__Impl"


    // $ANTLR start "rule__SymbolicConstant__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1846:1: rule__SymbolicConstant__Group__1 : rule__SymbolicConstant__Group__1__Impl ;
    public final void rule__SymbolicConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1850:1: ( rule__SymbolicConstant__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1851:2: rule__SymbolicConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__1__Impl_in_rule__SymbolicConstant__Group__13899);
            rule__SymbolicConstant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolicConstant__Group__1"


    // $ANTLR start "rule__SymbolicConstant__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1857:1: rule__SymbolicConstant__Group__1__Impl : ( ( rule__SymbolicConstant__NameAssignment_1 ) ) ;
    public final void rule__SymbolicConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1861:1: ( ( ( rule__SymbolicConstant__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1862:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1862:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1863:1: ( rule__SymbolicConstant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1864:1: ( rule__SymbolicConstant__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1864:2: rule__SymbolicConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__NameAssignment_1_in_rule__SymbolicConstant__Group__1__Impl3926);
            rule__SymbolicConstant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolicConstant__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1878:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1882:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1883:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__03960);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__03963);
            rule__Class__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1890:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1894:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1895:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1895:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1896:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNodeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1897:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1899:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNodeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1909:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1913:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1914:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__14021);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__14024);
            rule__Class__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1921:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1925:1: ( ( 'class' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1926:1: ( 'class' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1926:1: ( 'class' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1927:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Class__Group__1__Impl4052); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1940:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1944:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1945:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24083);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24086);
            rule__Class__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1952:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1956:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1957:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1957:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1958:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1959:1: ( rule__Class__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1959:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4113);
            rule__Class__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1969:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1973:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1974:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34143);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34146);
            rule__Class__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1981:1: rule__Class__Group__3__Impl : ( ( rule__Class__DeclarationsAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1985:1: ( ( ( rule__Class__DeclarationsAssignment_3 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1986:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1986:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1987:1: ( rule__Class__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1988:1: ( rule__Class__DeclarationsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=27 && LA15_0<=28)||(LA15_0>=41 && LA15_0<=43)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1988:2: rule__Class__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl4173);
            	    rule__Class__DeclarationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1998:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2002:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2003:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__44204);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__44207);
            rule__Class__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2010:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2014:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2015:1: ( ( rule__Class__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2015:1: ( ( rule__Class__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2016:1: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2017:1: ( rule__Class__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2017:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl4234);
                    rule__Class__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2027:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2031:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2032:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__54265);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__54268);
            rule__Class__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2039:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2043:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2044:1: ( ( rule__Class__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2044:1: ( ( rule__Class__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2045:1: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2046:1: ( rule__Class__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2046:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl4295);
                    rule__Class__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2056:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2060:1: ( rule__Class__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2061:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__64326);
            rule__Class__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2067:1: rule__Class__Group__6__Impl : ( 'end' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2071:1: ( ( 'end' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2072:1: ( 'end' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2072:1: ( 'end' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2073:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }
            match(input,34,FOLLOW_34_in_rule__Class__Group__6__Impl4354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2100:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2104:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2105:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__04399);
            rule__Class__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__04402);
            rule__Class__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2112:1: rule__Class__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2116:1: ( ( 'transition' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2117:1: ( 'transition' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2117:1: ( 'transition' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2118:1: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Class__Group_4__0__Impl4430); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2131:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2135:1: ( rule__Class__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2136:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__14461);
            rule__Class__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2142:1: rule__Class__Group_4__1__Impl : ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2146:1: ( ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2147:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2147:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2148:1: ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2148:1: ( ( rule__Class__TransitionsAssignment_4_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2149:1: ( rule__Class__TransitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2150:1: ( rule__Class__TransitionsAssignment_4_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2150:2: rule__Class__TransitionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4490);
            rule__Class__TransitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2153:1: ( ( rule__Class__TransitionsAssignment_4_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2154:1: ( rule__Class__TransitionsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2155:1: ( rule__Class__TransitionsAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2155:2: rule__Class__TransitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4502);
            	    rule__Class__TransitionsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2170:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2174:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2175:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__04539);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__04542);
            rule__Class__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2182:1: rule__Class__Group_5__0__Impl : ( 'assertion' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2186:1: ( ( 'assertion' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2187:1: ( 'assertion' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2187:1: ( 'assertion' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2188:1: 'assertion'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Class__Group_5__0__Impl4570); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2201:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2205:1: ( rule__Class__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2206:2: rule__Class__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__14601);
            rule__Class__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2212:1: rule__Class__Group_5__1__Impl : ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2216:1: ( ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2217:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2217:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2218:1: ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2218:1: ( ( rule__Class__AssertionsAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2219:1: ( rule__Class__AssertionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2220:1: ( rule__Class__AssertionsAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2220:2: rule__Class__AssertionsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4630);
            rule__Class__AssertionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2223:1: ( ( rule__Class__AssertionsAssignment_5_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2224:1: ( rule__Class__AssertionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2225:1: ( rule__Class__AssertionsAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==30||LA19_0==48||LA19_0==50||LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2225:2: rule__Class__AssertionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4642);
            	    rule__Class__AssertionsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2240:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2244:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2245:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04679);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04682);
            rule__VariableDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2252:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2256:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2257:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2257:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2258:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2259:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2261:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2271:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2275:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2276:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14740);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14743);
            rule__VariableDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2287:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2288:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2288:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2289:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2290:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2290:2: rule__VariableDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4770);
            rule__VariableDeclaration__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2300:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2304:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2305:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24800);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24803);
            rule__VariableDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2312:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2316:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2317:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2317:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2318:1: ( rule__VariableDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2319:1: ( rule__VariableDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2319:2: rule__VariableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl4830);
            rule__VariableDeclaration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2329:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2333:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2334:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34860);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__34863);
            rule__VariableDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2341:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2345:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2346:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2346:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2347:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2348:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2348:2: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl4890);
                    rule__VariableDeclaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2358:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2362:1: ( rule__VariableDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2363:2: rule__VariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__44921);
            rule__VariableDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__4"


    // $ANTLR start "rule__VariableDeclaration__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2369:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2373:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2374:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2374:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2375:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__VariableDeclaration__Group__4__Impl4949); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__4__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2398:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2402:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2403:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__04990);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__04993);
            rule__VariableDeclaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__0"


    // $ANTLR start "rule__VariableDeclaration__Group_3__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2410:1: rule__VariableDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2414:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2415:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2415:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2416:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl5021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2429:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2433:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2434:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__15052);
            rule__VariableDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__15055);
            rule__VariableDeclaration__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__1"


    // $ANTLR start "rule__VariableDeclaration__Group_3__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2441:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2445:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2446:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2446:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2447:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2448:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2448:2: rule__VariableDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5082);
            rule__VariableDeclaration__AttributesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2458:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2462:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2463:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25112);
            rule__VariableDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25115);
            rule__VariableDeclaration__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__2"


    // $ANTLR start "rule__VariableDeclaration__Group_3__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2470:1: rule__VariableDeclaration__Group_3__2__Impl : ( ( rule__VariableDeclaration__Group_3_2__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2474:1: ( ( ( rule__VariableDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2475:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2475:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2476:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2477:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2477:2: rule__VariableDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5142);
            	    rule__VariableDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2487:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2491:1: ( rule__VariableDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2492:2: rule__VariableDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__35173);
            rule__VariableDeclaration__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__3"


    // $ANTLR start "rule__VariableDeclaration__Group_3__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2498:1: rule__VariableDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2502:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2503:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2503:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2504:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__VariableDeclaration__Group_3__3__Impl5201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3__3__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3_2__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2525:1: rule__VariableDeclaration__Group_3_2__0 : rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 ;
    public final void rule__VariableDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2529:1: ( rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2530:2: rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__05240);
            rule__VariableDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__05243);
            rule__VariableDeclaration__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_2__0"


    // $ANTLR start "rule__VariableDeclaration__Group_3_2__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2537:1: rule__VariableDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2541:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2542:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2542:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2543:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__VariableDeclaration__Group_3_2__0__Impl5271); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group_3_2__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2556:1: rule__VariableDeclaration__Group_3_2__1 : rule__VariableDeclaration__Group_3_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2560:1: ( rule__VariableDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2561:2: rule__VariableDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__15302);
            rule__VariableDeclaration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_2__1"


    // $ANTLR start "rule__VariableDeclaration__Group_3_2__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2567:1: rule__VariableDeclaration__Group_3_2__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2571:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2572:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2572:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2573:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2574:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2574:2: rule__VariableDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl5329);
            rule__VariableDeclaration__AttributesAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2588:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2592:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2593:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05363);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05366);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2600:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2604:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2605:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2605:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2606:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2607:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2609:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2619:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2623:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2624:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15424);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15427);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2631:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2635:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2636:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2636:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2637:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2638:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2638:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5454);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2648:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2652:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2653:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25484);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25487);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2660:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2664:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2665:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2665:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2666:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__Attribute__Group__2__Impl5515); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2679:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2683:1: ( rule__Attribute__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2684:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35546);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2690:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2694:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2695:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2695:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2696:1: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2697:1: ( rule__Attribute__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2697:2: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl5573);
            rule__Attribute__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2715:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2719:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2720:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__05611);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__05614);
            rule__EventDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__0"


    // $ANTLR start "rule__EventDeclaration__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2727:1: rule__EventDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2731:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2732:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2732:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2733:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2734:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2736:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2746:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2750:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2751:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__15672);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__15675);
            rule__EventDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__1"


    // $ANTLR start "rule__EventDeclaration__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2758:1: rule__EventDeclaration__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2762:1: ( ( 'event' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2763:1: ( 'event' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2763:1: ( 'event' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2764:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__EventDeclaration__Group__1__Impl5703); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2777:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2781:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2782:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__25734);
            rule__EventDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__25737);
            rule__EventDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__2"


    // $ANTLR start "rule__EventDeclaration__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2789:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2793:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2794:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2794:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2795:1: ( rule__EventDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2796:1: ( rule__EventDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2796:2: rule__EventDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl5764);
            rule__EventDeclaration__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2806:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2810:1: ( rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2811:2: rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__35794);
            rule__EventDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__4_in_rule__EventDeclaration__Group__35797);
            rule__EventDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__3"


    // $ANTLR start "rule__EventDeclaration__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2818:1: rule__EventDeclaration__Group__3__Impl : ( ( rule__EventDeclaration__Group_3__0 )? ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2822:1: ( ( ( rule__EventDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2823:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2823:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2824:1: ( rule__EventDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2825:1: ( rule__EventDeclaration__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2825:2: rule__EventDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl5824);
                    rule__EventDeclaration__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2835:1: rule__EventDeclaration__Group__4 : rule__EventDeclaration__Group__4__Impl ;
    public final void rule__EventDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2839:1: ( rule__EventDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2840:2: rule__EventDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__4__Impl_in_rule__EventDeclaration__Group__45855);
            rule__EventDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__4"


    // $ANTLR start "rule__EventDeclaration__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2846:1: rule__EventDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__EventDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2850:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2851:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2851:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2852:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__EventDeclaration__Group__4__Impl5883); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_3__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2875:1: rule__EventDeclaration__Group_3__0 : rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 ;
    public final void rule__EventDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2879:1: ( rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2880:2: rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__05924);
            rule__EventDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__05927);
            rule__EventDeclaration__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__0"


    // $ANTLR start "rule__EventDeclaration__Group_3__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2887:1: rule__EventDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2891:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2892:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2892:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2893:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EventDeclaration__Group_3__0__Impl5955); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_3__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2906:1: rule__EventDeclaration__Group_3__1 : rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 ;
    public final void rule__EventDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2910:1: ( rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2911:2: rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__15986);
            rule__EventDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__15989);
            rule__EventDeclaration__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__1"


    // $ANTLR start "rule__EventDeclaration__Group_3__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2918:1: rule__EventDeclaration__Group_3__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__EventDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2922:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2923:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2923:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2924:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2925:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2925:2: rule__EventDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl6016);
            rule__EventDeclaration__AttributesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_3__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2935:1: rule__EventDeclaration__Group_3__2 : rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 ;
    public final void rule__EventDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2939:1: ( rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2940:2: rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__26046);
            rule__EventDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__26049);
            rule__EventDeclaration__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__2"


    // $ANTLR start "rule__EventDeclaration__Group_3__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2947:1: rule__EventDeclaration__Group_3__2__Impl : ( ( rule__EventDeclaration__Group_3_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2951:1: ( ( ( rule__EventDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2952:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2952:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2953:1: ( rule__EventDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2954:1: ( rule__EventDeclaration__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2954:2: rule__EventDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl6076);
            	    rule__EventDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_3__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2964:1: rule__EventDeclaration__Group_3__3 : rule__EventDeclaration__Group_3__3__Impl ;
    public final void rule__EventDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2968:1: ( rule__EventDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2969:2: rule__EventDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36107);
            rule__EventDeclaration__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__3"


    // $ANTLR start "rule__EventDeclaration__Group_3__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2975:1: rule__EventDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2979:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2980:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2980:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2981:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__EventDeclaration__Group_3__3__Impl6135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3__3__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_3_2__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3002:1: rule__EventDeclaration__Group_3_2__0 : rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 ;
    public final void rule__EventDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3006:1: ( rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3007:2: rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__06174);
            rule__EventDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__06177);
            rule__EventDeclaration__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3_2__0"


    // $ANTLR start "rule__EventDeclaration__Group_3_2__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3014:1: rule__EventDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3018:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3019:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3019:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3020:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__EventDeclaration__Group_3_2__0__Impl6205); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3_2__0__Impl"


    // $ANTLR start "rule__EventDeclaration__Group_3_2__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3033:1: rule__EventDeclaration__Group_3_2__1 : rule__EventDeclaration__Group_3_2__1__Impl ;
    public final void rule__EventDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3037:1: ( rule__EventDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3038:2: rule__EventDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__16236);
            rule__EventDeclaration__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3_2__1"


    // $ANTLR start "rule__EventDeclaration__Group_3_2__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3044:1: rule__EventDeclaration__Group_3_2__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3048:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3049:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3049:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3050:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3051:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3051:2: rule__EventDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl6263);
            rule__EventDeclaration__AttributesAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__Group_3_2__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3065:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3069:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3070:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06297);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06300);
            rule__ParameterDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3077:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3081:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3082:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3082:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3083:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3084:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3086:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3096:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3100:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3101:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16358);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__16361);
            rule__ParameterDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3108:1: rule__ParameterDeclaration__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3112:1: ( ( 'parameter' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3113:1: ( 'parameter' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3113:1: ( 'parameter' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3114:1: 'parameter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ParameterDeclaration__Group__1__Impl6389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3127:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3131:1: ( rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3132:2: rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__26420);
            rule__ParameterDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__26423);
            rule__ParameterDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__2"


    // $ANTLR start "rule__ParameterDeclaration__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3139:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3143:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3144:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3144:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3145:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3146:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3146:2: rule__ParameterDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl6450);
            rule__ParameterDeclaration__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3156:1: rule__ParameterDeclaration__Group__3 : rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 ;
    public final void rule__ParameterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3160:1: ( rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3161:2: rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__36480);
            rule__ParameterDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__36483);
            rule__ParameterDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__3"


    // $ANTLR start "rule__ParameterDeclaration__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3168:1: rule__ParameterDeclaration__Group__3__Impl : ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ParameterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3172:1: ( ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3173:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3173:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3174:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3175:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3175:2: rule__ParameterDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl6510);
            rule__ParameterDeclaration__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3185:1: rule__ParameterDeclaration__Group__4 : rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 ;
    public final void rule__ParameterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3189:1: ( rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3190:2: rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__46540);
            rule__ParameterDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__46543);
            rule__ParameterDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__4"


    // $ANTLR start "rule__ParameterDeclaration__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3197:1: rule__ParameterDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ParameterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3201:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3202:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3202:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3203:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__ParameterDeclaration__Group__4__Impl6571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3216:1: rule__ParameterDeclaration__Group__5 : rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 ;
    public final void rule__ParameterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3220:1: ( rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3221:2: rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__56602);
            rule__ParameterDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__56605);
            rule__ParameterDeclaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__5"


    // $ANTLR start "rule__ParameterDeclaration__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3228:1: rule__ParameterDeclaration__Group__5__Impl : ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ParameterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3232:1: ( ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3233:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3233:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3234:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3235:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3235:2: rule__ParameterDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl6632);
            rule__ParameterDeclaration__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__6"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3245:1: rule__ParameterDeclaration__Group__6 : rule__ParameterDeclaration__Group__6__Impl ;
    public final void rule__ParameterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3249:1: ( rule__ParameterDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3250:2: rule__ParameterDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__66662);
            rule__ParameterDeclaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__6"


    // $ANTLR start "rule__ParameterDeclaration__Group__6__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3256:1: rule__ParameterDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ParameterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3260:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3261:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3261:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3262:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParameterDeclaration__Group__6__Impl6690); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3289:1: rule__ObserverDeclaration__Group__0 : rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 ;
    public final void rule__ObserverDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3293:1: ( rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3294:2: rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__06735);
            rule__ObserverDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__06738);
            rule__ObserverDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__0"


    // $ANTLR start "rule__ObserverDeclaration__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3301:1: rule__ObserverDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ObserverDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3305:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3306:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3306:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3307:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3308:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3310:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3320:1: rule__ObserverDeclaration__Group__1 : rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 ;
    public final void rule__ObserverDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3324:1: ( rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3325:2: rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__16796);
            rule__ObserverDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__16799);
            rule__ObserverDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__1"


    // $ANTLR start "rule__ObserverDeclaration__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3332:1: rule__ObserverDeclaration__Group__1__Impl : ( 'observer' ) ;
    public final void rule__ObserverDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3336:1: ( ( 'observer' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3337:1: ( 'observer' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3337:1: ( 'observer' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3338:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ObserverDeclaration__Group__1__Impl6827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3351:1: rule__ObserverDeclaration__Group__2 : rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 ;
    public final void rule__ObserverDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3355:1: ( rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3356:2: rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__26858);
            rule__ObserverDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__26861);
            rule__ObserverDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__2"


    // $ANTLR start "rule__ObserverDeclaration__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3363:1: rule__ObserverDeclaration__Group__2__Impl : ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ObserverDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3367:1: ( ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3368:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3368:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3369:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3370:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3370:2: rule__ObserverDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl6888);
            rule__ObserverDeclaration__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3380:1: rule__ObserverDeclaration__Group__3 : rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 ;
    public final void rule__ObserverDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3384:1: ( rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3385:2: rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__36918);
            rule__ObserverDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__36921);
            rule__ObserverDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__3"


    // $ANTLR start "rule__ObserverDeclaration__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3392:1: rule__ObserverDeclaration__Group__3__Impl : ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObserverDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3396:1: ( ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3397:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3397:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3398:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3399:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3399:2: rule__ObserverDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl6948);
            rule__ObserverDeclaration__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3409:1: rule__ObserverDeclaration__Group__4 : rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 ;
    public final void rule__ObserverDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3413:1: ( rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3414:2: rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__46978);
            rule__ObserverDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__46981);
            rule__ObserverDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__4"


    // $ANTLR start "rule__ObserverDeclaration__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3421:1: rule__ObserverDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ObserverDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3425:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3426:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3426:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3427:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__ObserverDeclaration__Group__4__Impl7009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3440:1: rule__ObserverDeclaration__Group__5 : rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 ;
    public final void rule__ObserverDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3444:1: ( rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3445:2: rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__57040);
            rule__ObserverDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__57043);
            rule__ObserverDeclaration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__5"


    // $ANTLR start "rule__ObserverDeclaration__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3452:1: rule__ObserverDeclaration__Group__5__Impl : ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ObserverDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3456:1: ( ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3457:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3457:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3458:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3459:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3459:2: rule__ObserverDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl7070);
            rule__ObserverDeclaration__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ObserverDeclaration__Group__6"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3469:1: rule__ObserverDeclaration__Group__6 : rule__ObserverDeclaration__Group__6__Impl ;
    public final void rule__ObserverDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3473:1: ( rule__ObserverDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3474:2: rule__ObserverDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67100);
            rule__ObserverDeclaration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__6"


    // $ANTLR start "rule__ObserverDeclaration__Group__6__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3480:1: rule__ObserverDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ObserverDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3484:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3485:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3485:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3486:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ObserverDeclaration__Group__6__Impl7128); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__Group__6__Impl"


    // $ANTLR start "rule__LabeledTransition__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3513:1: rule__LabeledTransition__Group__0 : rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 ;
    public final void rule__LabeledTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3517:1: ( rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3518:2: rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__07173);
            rule__LabeledTransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__07176);
            rule__LabeledTransition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__Group__0"


    // $ANTLR start "rule__LabeledTransition__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3525:1: rule__LabeledTransition__Group__0__Impl : ( ( rule__LabeledTransition__EventAssignment_0 ) ) ;
    public final void rule__LabeledTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3529:1: ( ( ( rule__LabeledTransition__EventAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3530:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3530:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3531:1: ( rule__LabeledTransition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3532:1: ( rule__LabeledTransition__EventAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3532:2: rule__LabeledTransition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl7203);
            rule__LabeledTransition__EventAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__Group__0__Impl"


    // $ANTLR start "rule__LabeledTransition__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3542:1: rule__LabeledTransition__Group__1 : rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 ;
    public final void rule__LabeledTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3546:1: ( rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3547:2: rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__17233);
            rule__LabeledTransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__17236);
            rule__LabeledTransition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__Group__1"


    // $ANTLR start "rule__LabeledTransition__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3554:1: rule__LabeledTransition__Group__1__Impl : ( ':' ) ;
    public final void rule__LabeledTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3558:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3559:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3559:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3560:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__LabeledTransition__Group__1__Impl7264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__Group__1__Impl"


    // $ANTLR start "rule__LabeledTransition__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3573:1: rule__LabeledTransition__Group__2 : rule__LabeledTransition__Group__2__Impl ;
    public final void rule__LabeledTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3577:1: ( rule__LabeledTransition__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3578:2: rule__LabeledTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__27295);
            rule__LabeledTransition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__Group__2"


    // $ANTLR start "rule__LabeledTransition__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3584:1: rule__LabeledTransition__Group__2__Impl : ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) ;
    public final void rule__LabeledTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3588:1: ( ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3589:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3589:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3590:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3591:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3591:2: rule__LabeledTransition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl7322);
            rule__LabeledTransition__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__Group__2__Impl"


    // $ANTLR start "rule__TransitionAnd__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3607:1: rule__TransitionAnd__Group__0 : rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 ;
    public final void rule__TransitionAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3611:1: ( rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3612:2: rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__07358);
            rule__TransitionAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__07361);
            rule__TransitionAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group__0"


    // $ANTLR start "rule__TransitionAnd__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3619:1: rule__TransitionAnd__Group__0__Impl : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3623:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3624:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3624:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3625:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl7388);
            ruleTransitionOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group__0__Impl"


    // $ANTLR start "rule__TransitionAnd__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3636:1: rule__TransitionAnd__Group__1 : rule__TransitionAnd__Group__1__Impl ;
    public final void rule__TransitionAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3640:1: ( rule__TransitionAnd__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3641:2: rule__TransitionAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__17417);
            rule__TransitionAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group__1"


    // $ANTLR start "rule__TransitionAnd__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3647:1: rule__TransitionAnd__Group__1__Impl : ( ( rule__TransitionAnd__Group_1__0 )* ) ;
    public final void rule__TransitionAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3651:1: ( ( ( rule__TransitionAnd__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3652:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3652:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3653:1: ( rule__TransitionAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3654:1: ( rule__TransitionAnd__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3654:2: rule__TransitionAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl7444);
            	    rule__TransitionAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group__1__Impl"


    // $ANTLR start "rule__TransitionAnd__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3668:1: rule__TransitionAnd__Group_1__0 : rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 ;
    public final void rule__TransitionAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3672:1: ( rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3673:2: rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__07479);
            rule__TransitionAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__07482);
            rule__TransitionAnd__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group_1__0"


    // $ANTLR start "rule__TransitionAnd__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3680:1: rule__TransitionAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3684:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3685:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3685:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3686:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3687:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3689:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group_1__0__Impl"


    // $ANTLR start "rule__TransitionAnd__Group_1__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3699:1: rule__TransitionAnd__Group_1__1 : rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 ;
    public final void rule__TransitionAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3703:1: ( rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3704:2: rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__17540);
            rule__TransitionAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__17543);
            rule__TransitionAnd__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group_1__1"


    // $ANTLR start "rule__TransitionAnd__Group_1__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3711:1: rule__TransitionAnd__Group_1__1__Impl : ( '&' ) ;
    public final void rule__TransitionAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3715:1: ( ( '&' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3716:1: ( '&' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3716:1: ( '&' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3717:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__TransitionAnd__Group_1__1__Impl7571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group_1__1__Impl"


    // $ANTLR start "rule__TransitionAnd__Group_1__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3730:1: rule__TransitionAnd__Group_1__2 : rule__TransitionAnd__Group_1__2__Impl ;
    public final void rule__TransitionAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3734:1: ( rule__TransitionAnd__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3735:2: rule__TransitionAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__27602);
            rule__TransitionAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group_1__2"


    // $ANTLR start "rule__TransitionAnd__Group_1__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3741:1: rule__TransitionAnd__Group_1__2__Impl : ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3745:1: ( ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3746:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3746:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3747:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3748:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3748:2: rule__TransitionAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl7629);
            rule__TransitionAnd__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__Group_1__2__Impl"


    // $ANTLR start "rule__TransitionOr__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3764:1: rule__TransitionOr__Group__0 : rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 ;
    public final void rule__TransitionOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3768:1: ( rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3769:2: rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__07665);
            rule__TransitionOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__07668);
            rule__TransitionOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group__0"


    // $ANTLR start "rule__TransitionOr__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3776:1: rule__TransitionOr__Group__0__Impl : ( ruleTransition ) ;
    public final void rule__TransitionOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3780:1: ( ( ruleTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3781:1: ( ruleTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3781:1: ( ruleTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3782:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionOr__Group__0__Impl7695);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group__0__Impl"


    // $ANTLR start "rule__TransitionOr__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3793:1: rule__TransitionOr__Group__1 : rule__TransitionOr__Group__1__Impl ;
    public final void rule__TransitionOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3797:1: ( rule__TransitionOr__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3798:2: rule__TransitionOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__17724);
            rule__TransitionOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group__1"


    // $ANTLR start "rule__TransitionOr__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3804:1: rule__TransitionOr__Group__1__Impl : ( ( rule__TransitionOr__Group_1__0 )* ) ;
    public final void rule__TransitionOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3808:1: ( ( ( rule__TransitionOr__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3809:1: ( ( rule__TransitionOr__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3809:1: ( ( rule__TransitionOr__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3810:1: ( rule__TransitionOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3811:1: ( rule__TransitionOr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3811:2: rule__TransitionOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl7751);
            	    rule__TransitionOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group__1__Impl"


    // $ANTLR start "rule__TransitionOr__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3825:1: rule__TransitionOr__Group_1__0 : rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 ;
    public final void rule__TransitionOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3829:1: ( rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3830:2: rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__07786);
            rule__TransitionOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__07789);
            rule__TransitionOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group_1__0"


    // $ANTLR start "rule__TransitionOr__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3837:1: rule__TransitionOr__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3841:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3842:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3842:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3843:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3844:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3846:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group_1__0__Impl"


    // $ANTLR start "rule__TransitionOr__Group_1__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3856:1: rule__TransitionOr__Group_1__1 : rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 ;
    public final void rule__TransitionOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3860:1: ( rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3861:2: rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__17847);
            rule__TransitionOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__17850);
            rule__TransitionOr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group_1__1"


    // $ANTLR start "rule__TransitionOr__Group_1__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3868:1: rule__TransitionOr__Group_1__1__Impl : ( '|' ) ;
    public final void rule__TransitionOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3872:1: ( ( '|' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3873:1: ( '|' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3873:1: ( '|' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3874:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__TransitionOr__Group_1__1__Impl7878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group_1__1__Impl"


    // $ANTLR start "rule__TransitionOr__Group_1__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3887:1: rule__TransitionOr__Group_1__2 : rule__TransitionOr__Group_1__2__Impl ;
    public final void rule__TransitionOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3891:1: ( rule__TransitionOr__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3892:2: rule__TransitionOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__27909);
            rule__TransitionOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group_1__2"


    // $ANTLR start "rule__TransitionOr__Group_1__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3898:1: rule__TransitionOr__Group_1__2__Impl : ( ( rule__TransitionOr__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3902:1: ( ( ( rule__TransitionOr__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3903:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3903:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3904:1: ( rule__TransitionOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3905:1: ( rule__TransitionOr__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3905:2: rule__TransitionOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl7936);
            rule__TransitionOr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__Group_1__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3921:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3925:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3926:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07972);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07975);
            rule__Transition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3933:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3937:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3938:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3938:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3939:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3940:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3942:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3952:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3956:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3957:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18033);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__18036);
            rule__Transition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3964:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__GuardAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3968:1: ( ( ( rule__Transition__GuardAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3969:1: ( ( rule__Transition__GuardAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3969:1: ( ( rule__Transition__GuardAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3970:1: ( rule__Transition__GuardAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3971:1: ( rule__Transition__GuardAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3971:2: rule__Transition__GuardAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl8063);
            rule__Transition__GuardAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3981:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3985:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3986:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28093);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28096);
            rule__Transition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3993:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3997:1: ( ( '->' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3998:1: ( '->' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3998:1: ( '->' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3999:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__Transition__Group__2__Impl8124); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4012:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4016:1: ( rule__Transition__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4017:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38155);
            rule__Transition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4023:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__ActionAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4027:1: ( ( ( rule__Transition__ActionAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4028:1: ( ( rule__Transition__ActionAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4028:1: ( ( rule__Transition__ActionAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4029:1: ( rule__Transition__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4030:1: ( rule__Transition__ActionAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4030:2: rule__Transition__ActionAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_3_in_rule__Transition__Group__3__Impl8182);
            rule__Transition__ActionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getActionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Skip__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4048:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4052:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4053:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08220);
            rule__Skip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08223);
            rule__Skip__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__0"


    // $ANTLR start "rule__Skip__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4060:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4064:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4065:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4065:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4066:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4067:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4069:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__0__Impl"


    // $ANTLR start "rule__Skip__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4079:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl rule__Skip__Group__2 ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4083:1: ( rule__Skip__Group__1__Impl rule__Skip__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4084:2: rule__Skip__Group__1__Impl rule__Skip__Group__2
            {
            pushFollow(FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18281);
            rule__Skip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18284);
            rule__Skip__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__1"


    // $ANTLR start "rule__Skip__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4091:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4095:1: ( ( 'skip' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4096:1: ( 'skip' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4096:1: ( 'skip' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4097:1: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__Skip__Group__1__Impl8312); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__1__Impl"


    // $ANTLR start "rule__Skip__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4110:1: rule__Skip__Group__2 : rule__Skip__Group__2__Impl ;
    public final void rule__Skip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4114:1: ( rule__Skip__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4115:2: rule__Skip__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__28343);
            rule__Skip__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__2"


    // $ANTLR start "rule__Skip__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4121:1: rule__Skip__Group__2__Impl : ( ';' ) ;
    public final void rule__Skip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4125:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4126:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4126:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4127:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Skip__Group__2__Impl8371); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Skip__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4146:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4150:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4151:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08408);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08411);
            rule__Assignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4158:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4162:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4163:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4163:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4164:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4165:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4167:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4177:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4181:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4182:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18469);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18472);
            rule__Assignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4189:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__VariableAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4193:1: ( ( ( rule__Assignment__VariableAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4194:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4194:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4195:1: ( rule__Assignment__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4196:1: ( rule__Assignment__VariableAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4196:2: rule__Assignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl8499);
            rule__Assignment__VariableAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4206:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4210:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4211:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28529);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__28532);
            rule__Assignment__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4218:1: rule__Assignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4222:1: ( ( ':=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4223:1: ( ':=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4223:1: ( ':=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4224:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__Assignment__Group__2__Impl8560); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4237:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4241:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4242:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__38591);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__38594);
            rule__Assignment__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4249:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4253:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4254:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4254:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4255:1: ( rule__Assignment__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4256:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4256:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl8621);
            rule__Assignment__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4266:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4270:1: ( rule__Assignment__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4271:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__48651);
            rule__Assignment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4"


    // $ANTLR start "rule__Assignment__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4277:1: rule__Assignment__Group__4__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4281:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4282:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4282:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4283:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Assignment__Group__4__Impl8679); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4306:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4310:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4311:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08720);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08723);
            rule__Block__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4318:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4322:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4323:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4323:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4324:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4325:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4327:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4337:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4341:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4342:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18781);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18784);
            rule__Block__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4349:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4353:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4354:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4354:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4355:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Block__Group__1__Impl8812); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4368:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4372:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4373:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28843);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28846);
            rule__Block__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4380:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4384:1: ( ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4385:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4385:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4386:1: ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4386:1: ( ( rule__Block__InstructionsAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4387:1: ( rule__Block__InstructionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4388:1: ( rule__Block__InstructionsAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4388:2: rule__Block__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8875);
            rule__Block__InstructionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4391:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4392:1: ( rule__Block__InstructionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4393:1: ( rule__Block__InstructionsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==30||LA26_0==48||LA26_0==50||LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4393:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8887);
            	    rule__Block__InstructionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4404:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4408:1: ( rule__Block__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4409:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38920);
            rule__Block__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4415:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4419:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4420:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4420:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4421:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__Block__Group__3__Impl8948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4442:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4446:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4447:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08987);
            rule__Conditional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08990);
            rule__Conditional__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4454:1: rule__Conditional__Group__0__Impl : ( () ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4458:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4459:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4459:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4460:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionalAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4461:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4463:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getConditionalAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4473:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4477:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4478:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__19048);
            rule__Conditional__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__19051);
            rule__Conditional__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4485:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4489:1: ( ( 'if' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4490:1: ( 'if' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4490:1: ( 'if' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4491:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__Conditional__Group__1__Impl9079); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4504:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4508:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4509:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__29110);
            rule__Conditional__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__29113);
            rule__Conditional__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4516:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4520:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4521:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4521:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4522:1: ( rule__Conditional__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4523:1: ( rule__Conditional__ConditionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4523:2: rule__Conditional__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl9140);
            rule__Conditional__ConditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4533:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4537:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4538:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39170);
            rule__Conditional__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39173);
            rule__Conditional__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4545:1: rule__Conditional__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4549:1: ( ( 'then' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4550:1: ( 'then' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4550:1: ( 'then' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4551:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__Conditional__Group__3__Impl9201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getThenKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4564:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4568:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4569:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49232);
            rule__Conditional__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49235);
            rule__Conditional__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4576:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ThenAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4580:1: ( ( ( rule__Conditional__ThenAssignment_4 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4581:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4581:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4582:1: ( rule__Conditional__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenAssignment_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4583:1: ( rule__Conditional__ThenAssignment_4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4583:2: rule__Conditional__ThenAssignment_4
            {
            pushFollow(FOLLOW_rule__Conditional__ThenAssignment_4_in_rule__Conditional__Group__4__Impl9262);
            rule__Conditional__ThenAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getThenAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4593:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4597:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4598:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59292);
            rule__Conditional__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59295);
            rule__Conditional__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4605:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Group_5__0 )? ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4609:1: ( ( ( rule__Conditional__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4610:1: ( ( rule__Conditional__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4610:1: ( ( rule__Conditional__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4611:1: ( rule__Conditional__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4612:1: ( rule__Conditional__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4612:2: rule__Conditional__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Conditional__Group_5__0_in_rule__Conditional__Group__5__Impl9322);
                    rule__Conditional__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__Conditional__Group__6"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4622:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4626:1: ( rule__Conditional__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4627:2: rule__Conditional__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69353);
            rule__Conditional__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6"


    // $ANTLR start "rule__Conditional__Group__6__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4633:1: rule__Conditional__Group__6__Impl : ( ';' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4637:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4638:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4638:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4639:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__Conditional__Group__6__Impl9381); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__6__Impl"


    // $ANTLR start "rule__Conditional__Group_5__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4666:1: rule__Conditional__Group_5__0 : rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 ;
    public final void rule__Conditional__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4670:1: ( rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4671:2: rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group_5__0__Impl_in_rule__Conditional__Group_5__09426);
            rule__Conditional__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group_5__1_in_rule__Conditional__Group_5__09429);
            rule__Conditional__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_5__0"


    // $ANTLR start "rule__Conditional__Group_5__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4678:1: rule__Conditional__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Conditional__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4682:1: ( ( ( 'else' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4683:1: ( ( 'else' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4683:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4684:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseKeyword_5_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4685:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4686:2: 'else'
            {
            match(input,52,FOLLOW_52_in_rule__Conditional__Group_5__0__Impl9458); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getElseKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_5__0__Impl"


    // $ANTLR start "rule__Conditional__Group_5__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4697:1: rule__Conditional__Group_5__1 : rule__Conditional__Group_5__1__Impl ;
    public final void rule__Conditional__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4701:1: ( rule__Conditional__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4702:2: rule__Conditional__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group_5__1__Impl_in_rule__Conditional__Group_5__19490);
            rule__Conditional__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_5__1"


    // $ANTLR start "rule__Conditional__Group_5__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4708:1: rule__Conditional__Group_5__1__Impl : ( ( rule__Conditional__ElseAssignment_5_1 ) ) ;
    public final void rule__Conditional__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4712:1: ( ( ( rule__Conditional__ElseAssignment_5_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4713:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4713:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4714:1: ( rule__Conditional__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4715:1: ( rule__Conditional__ElseAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4715:2: rule__Conditional__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Conditional__ElseAssignment_5_1_in_rule__Conditional__Group_5__1__Impl9517);
            rule__Conditional__ElseAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getElseAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group_5__1__Impl"


    // $ANTLR start "rule__Switch__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4729:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4733:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4734:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
            {
            pushFollow(FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__09551);
            rule__Switch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__09554);
            rule__Switch__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__0"


    // $ANTLR start "rule__Switch__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4741:1: rule__Switch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4745:1: ( ( 'switch' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4746:1: ( 'switch' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4746:1: ( 'switch' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4747:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Switch__Group__0__Impl9582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__0__Impl"


    // $ANTLR start "rule__Switch__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4760:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4764:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4765:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__19613);
            rule__Switch__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__19616);
            rule__Switch__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__1"


    // $ANTLR start "rule__Switch__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4772:1: rule__Switch__Group__1__Impl : ( '{' ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4776:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4777:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4777:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4778:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Switch__Group__1__Impl9644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__1__Impl"


    // $ANTLR start "rule__Switch__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4791:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4795:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4796:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__29675);
            rule__Switch__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__29678);
            rule__Switch__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__2"


    // $ANTLR start "rule__Switch__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4803:1: rule__Switch__Group__2__Impl : ( ( rule__Switch__CasesAssignment_2 )* ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4807:1: ( ( ( rule__Switch__CasesAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4808:1: ( ( rule__Switch__CasesAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4808:1: ( ( rule__Switch__CasesAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4809:1: ( rule__Switch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4810:1: ( rule__Switch__CasesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||LA28_0==22||(LA28_0>=25 && LA28_0<=26)||LA28_0==38||(LA28_0>=53 && LA28_0<=54)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4810:2: rule__Switch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Switch__CasesAssignment_2_in_rule__Switch__Group__2__Impl9705);
            	    rule__Switch__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getCasesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__2__Impl"


    // $ANTLR start "rule__Switch__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4820:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4824:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4825:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__39736);
            rule__Switch__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__39739);
            rule__Switch__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__3"


    // $ANTLR start "rule__Switch__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4832:1: rule__Switch__Group__3__Impl : ( 'else' ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4836:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4837:1: ( 'else' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4837:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4838:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__Switch__Group__3__Impl9767); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getElseKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__3__Impl"


    // $ANTLR start "rule__Switch__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4851:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl rule__Switch__Group__5 ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4855:1: ( rule__Switch__Group__4__Impl rule__Switch__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4856:2: rule__Switch__Group__4__Impl rule__Switch__Group__5
            {
            pushFollow(FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__49798);
            rule__Switch__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__49801);
            rule__Switch__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__4"


    // $ANTLR start "rule__Switch__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4863:1: rule__Switch__Group__4__Impl : ( ':' ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4867:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4868:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4868:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4869:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getColonKeyword_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__Switch__Group__4__Impl9829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getColonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__4__Impl"


    // $ANTLR start "rule__Switch__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4882:1: rule__Switch__Group__5 : rule__Switch__Group__5__Impl rule__Switch__Group__6 ;
    public final void rule__Switch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4886:1: ( rule__Switch__Group__5__Impl rule__Switch__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4887:2: rule__Switch__Group__5__Impl rule__Switch__Group__6
            {
            pushFollow(FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__59860);
            rule__Switch__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__59863);
            rule__Switch__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__5"


    // $ANTLR start "rule__Switch__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4894:1: rule__Switch__Group__5__Impl : ( ( rule__Switch__ElseAssignment_5 ) ) ;
    public final void rule__Switch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4898:1: ( ( ( rule__Switch__ElseAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4899:1: ( ( rule__Switch__ElseAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4899:1: ( ( rule__Switch__ElseAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4900:1: ( rule__Switch__ElseAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4901:1: ( rule__Switch__ElseAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4901:2: rule__Switch__ElseAssignment_5
            {
            pushFollow(FOLLOW_rule__Switch__ElseAssignment_5_in_rule__Switch__Group__5__Impl9890);
            rule__Switch__ElseAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getElseAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__5__Impl"


    // $ANTLR start "rule__Switch__Group__6"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4911:1: rule__Switch__Group__6 : rule__Switch__Group__6__Impl ;
    public final void rule__Switch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4915:1: ( rule__Switch__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4916:2: rule__Switch__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__69920);
            rule__Switch__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__6"


    // $ANTLR start "rule__Switch__Group__6__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4922:1: rule__Switch__Group__6__Impl : ( '}' ) ;
    public final void rule__Switch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4926:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4927:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4927:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4928:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,31,FOLLOW_31_in_rule__Switch__Group__6__Impl9948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__Group__6__Impl"


    // $ANTLR start "rule__LogicalOr__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4955:1: rule__LogicalOr__Group__0 : rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 ;
    public final void rule__LogicalOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4959:1: ( rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4960:2: rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group__0__Impl_in_rule__LogicalOr__Group__09993);
            rule__LogicalOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalOr__Group__1_in_rule__LogicalOr__Group__09996);
            rule__LogicalOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__0"


    // $ANTLR start "rule__LogicalOr__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4967:1: rule__LogicalOr__Group__0__Impl : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4971:1: ( ( ruleLogicalAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4972:1: ( ruleLogicalAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4972:1: ( ruleLogicalAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4973:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__Group__0__Impl10023);
            ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__0__Impl"


    // $ANTLR start "rule__LogicalOr__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4984:1: rule__LogicalOr__Group__1 : rule__LogicalOr__Group__1__Impl ;
    public final void rule__LogicalOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4988:1: ( rule__LogicalOr__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4989:2: rule__LogicalOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group__1__Impl_in_rule__LogicalOr__Group__110052);
            rule__LogicalOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__1"


    // $ANTLR start "rule__LogicalOr__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4995:1: rule__LogicalOr__Group__1__Impl : ( ( rule__LogicalOr__Group_1__0 )* ) ;
    public final void rule__LogicalOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4999:1: ( ( ( rule__LogicalOr__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5000:1: ( ( rule__LogicalOr__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5000:1: ( ( rule__LogicalOr__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5001:1: ( rule__LogicalOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5002:1: ( rule__LogicalOr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5002:2: rule__LogicalOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LogicalOr__Group_1__0_in_rule__LogicalOr__Group__1__Impl10079);
            	    rule__LogicalOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group__1__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5016:1: rule__LogicalOr__Group_1__0 : rule__LogicalOr__Group_1__0__Impl ;
    public final void rule__LogicalOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5020:1: ( rule__LogicalOr__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5021:2: rule__LogicalOr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1__0__Impl_in_rule__LogicalOr__Group_1__010114);
            rule__LogicalOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__0"


    // $ANTLR start "rule__LogicalOr__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5027:1: rule__LogicalOr__Group_1__0__Impl : ( ( rule__LogicalOr__Group_1_0__0 ) ) ;
    public final void rule__LogicalOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5031:1: ( ( ( rule__LogicalOr__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5032:1: ( ( rule__LogicalOr__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5032:1: ( ( rule__LogicalOr__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5033:1: ( rule__LogicalOr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5034:1: ( rule__LogicalOr__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5034:2: rule__LogicalOr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__0_in_rule__LogicalOr__Group_1__0__Impl10141);
            rule__LogicalOr__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5046:1: rule__LogicalOr__Group_1_0__0 : rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1 ;
    public final void rule__LogicalOr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5050:1: ( rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5051:2: rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__0__Impl_in_rule__LogicalOr__Group_1_0__010173);
            rule__LogicalOr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__1_in_rule__LogicalOr__Group_1_0__010176);
            rule__LogicalOr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1_0__0"


    // $ANTLR start "rule__LogicalOr__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5058:1: rule__LogicalOr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalOr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5062:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5063:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5063:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5064:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5065:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5067:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1_0__0__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5077:1: rule__LogicalOr__Group_1_0__1 : rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2 ;
    public final void rule__LogicalOr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5081:1: ( rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5082:2: rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__1__Impl_in_rule__LogicalOr__Group_1_0__110234);
            rule__LogicalOr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__2_in_rule__LogicalOr__Group_1_0__110237);
            rule__LogicalOr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1_0__1"


    // $ANTLR start "rule__LogicalOr__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5089:1: rule__LogicalOr__Group_1_0__1__Impl : ( ( rule__LogicalOr__OpAssignment_1_0_1 ) ) ;
    public final void rule__LogicalOr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5093:1: ( ( ( rule__LogicalOr__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5094:1: ( ( rule__LogicalOr__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5094:1: ( ( rule__LogicalOr__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5095:1: ( rule__LogicalOr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5096:1: ( rule__LogicalOr__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5096:2: rule__LogicalOr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__LogicalOr__OpAssignment_1_0_1_in_rule__LogicalOr__Group_1_0__1__Impl10264);
            rule__LogicalOr__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1_0__1__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5106:1: rule__LogicalOr__Group_1_0__2 : rule__LogicalOr__Group_1_0__2__Impl ;
    public final void rule__LogicalOr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5110:1: ( rule__LogicalOr__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5111:2: rule__LogicalOr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__2__Impl_in_rule__LogicalOr__Group_1_0__210294);
            rule__LogicalOr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1_0__2"


    // $ANTLR start "rule__LogicalOr__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5117:1: rule__LogicalOr__Group_1_0__2__Impl : ( ( rule__LogicalOr__RightAssignment_1_0_2 ) ) ;
    public final void rule__LogicalOr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5121:1: ( ( ( rule__LogicalOr__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5122:1: ( ( rule__LogicalOr__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5122:1: ( ( rule__LogicalOr__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5123:1: ( rule__LogicalOr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5124:1: ( rule__LogicalOr__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5124:2: rule__LogicalOr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__LogicalOr__RightAssignment_1_0_2_in_rule__LogicalOr__Group_1_0__2__Impl10321);
            rule__LogicalOr__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1_0__2__Impl"


    // $ANTLR start "rule__LogicalAnd__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5140:1: rule__LogicalAnd__Group__0 : rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 ;
    public final void rule__LogicalAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5144:1: ( rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5145:2: rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group__0__Impl_in_rule__LogicalAnd__Group__010357);
            rule__LogicalAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalAnd__Group__1_in_rule__LogicalAnd__Group__010360);
            rule__LogicalAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__0"


    // $ANTLR start "rule__LogicalAnd__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5152:1: rule__LogicalAnd__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__LogicalAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5156:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5157:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5157:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5158:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__LogicalAnd__Group__0__Impl10387);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getRelationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__0__Impl"


    // $ANTLR start "rule__LogicalAnd__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5169:1: rule__LogicalAnd__Group__1 : rule__LogicalAnd__Group__1__Impl ;
    public final void rule__LogicalAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5173:1: ( rule__LogicalAnd__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5174:2: rule__LogicalAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group__1__Impl_in_rule__LogicalAnd__Group__110416);
            rule__LogicalAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__1"


    // $ANTLR start "rule__LogicalAnd__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5180:1: rule__LogicalAnd__Group__1__Impl : ( ( rule__LogicalAnd__Group_1__0 )* ) ;
    public final void rule__LogicalAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5184:1: ( ( ( rule__LogicalAnd__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5185:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5185:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5186:1: ( rule__LogicalAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5187:1: ( rule__LogicalAnd__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==57) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5187:2: rule__LogicalAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LogicalAnd__Group_1__0_in_rule__LogicalAnd__Group__1__Impl10443);
            	    rule__LogicalAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group__1__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5201:1: rule__LogicalAnd__Group_1__0 : rule__LogicalAnd__Group_1__0__Impl ;
    public final void rule__LogicalAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5205:1: ( rule__LogicalAnd__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5206:2: rule__LogicalAnd__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1__0__Impl_in_rule__LogicalAnd__Group_1__010478);
            rule__LogicalAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__0"


    // $ANTLR start "rule__LogicalAnd__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5212:1: rule__LogicalAnd__Group_1__0__Impl : ( ( rule__LogicalAnd__Group_1_0__0 ) ) ;
    public final void rule__LogicalAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5216:1: ( ( ( rule__LogicalAnd__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5217:1: ( ( rule__LogicalAnd__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5217:1: ( ( rule__LogicalAnd__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5218:1: ( rule__LogicalAnd__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5219:1: ( rule__LogicalAnd__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5219:2: rule__LogicalAnd__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__0_in_rule__LogicalAnd__Group_1__0__Impl10505);
            rule__LogicalAnd__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5231:1: rule__LogicalAnd__Group_1_0__0 : rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1 ;
    public final void rule__LogicalAnd__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5235:1: ( rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5236:2: rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__0__Impl_in_rule__LogicalAnd__Group_1_0__010537);
            rule__LogicalAnd__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__1_in_rule__LogicalAnd__Group_1_0__010540);
            rule__LogicalAnd__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1_0__0"


    // $ANTLR start "rule__LogicalAnd__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5243:1: rule__LogicalAnd__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalAnd__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5247:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5248:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5248:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5249:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5250:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5252:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1_0__0__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5262:1: rule__LogicalAnd__Group_1_0__1 : rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2 ;
    public final void rule__LogicalAnd__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5266:1: ( rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5267:2: rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__1__Impl_in_rule__LogicalAnd__Group_1_0__110598);
            rule__LogicalAnd__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__2_in_rule__LogicalAnd__Group_1_0__110601);
            rule__LogicalAnd__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1_0__1"


    // $ANTLR start "rule__LogicalAnd__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5274:1: rule__LogicalAnd__Group_1_0__1__Impl : ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) ) ;
    public final void rule__LogicalAnd__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5278:1: ( ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5279:1: ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5279:1: ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5280:1: ( rule__LogicalAnd__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5281:1: ( rule__LogicalAnd__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5281:2: rule__LogicalAnd__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__LogicalAnd__OpAssignment_1_0_1_in_rule__LogicalAnd__Group_1_0__1__Impl10628);
            rule__LogicalAnd__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1_0__1__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5291:1: rule__LogicalAnd__Group_1_0__2 : rule__LogicalAnd__Group_1_0__2__Impl ;
    public final void rule__LogicalAnd__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5295:1: ( rule__LogicalAnd__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5296:2: rule__LogicalAnd__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__2__Impl_in_rule__LogicalAnd__Group_1_0__210658);
            rule__LogicalAnd__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1_0__2"


    // $ANTLR start "rule__LogicalAnd__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5302:1: rule__LogicalAnd__Group_1_0__2__Impl : ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) ) ;
    public final void rule__LogicalAnd__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5306:1: ( ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5307:1: ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5307:1: ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5308:1: ( rule__LogicalAnd__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5309:1: ( rule__LogicalAnd__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5309:2: rule__LogicalAnd__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__LogicalAnd__RightAssignment_1_0_2_in_rule__LogicalAnd__Group_1_0__2__Impl10685);
            rule__LogicalAnd__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1_0__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5325:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5329:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5330:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010721);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010724);
            rule__Relation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5337:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5341:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5342:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5342:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5343:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10751);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5354:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5358:1: ( rule__Relation__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5359:2: rule__Relation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110780);
            rule__Relation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5365:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )* ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5369:1: ( ( ( rule__Relation__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5370:1: ( ( rule__Relation__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5370:1: ( ( rule__Relation__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5371:1: ( rule__Relation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5372:1: ( rule__Relation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=15 && LA31_0<=20)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5372:2: rule__Relation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10807);
            	    rule__Relation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5386:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5390:1: ( rule__Relation__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5391:2: rule__Relation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__010842);
            rule__Relation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0"


    // $ANTLR start "rule__Relation__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5397:1: rule__Relation__Group_1__0__Impl : ( ( rule__Relation__Group_1_0__0 ) ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5401:1: ( ( ( rule__Relation__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5402:1: ( ( rule__Relation__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5402:1: ( ( rule__Relation__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5403:1: ( rule__Relation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5404:1: ( rule__Relation__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5404:2: rule__Relation__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl10869);
            rule__Relation__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5416:1: rule__Relation__Group_1_0__0 : rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 ;
    public final void rule__Relation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5420:1: ( rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5421:2: rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__010901);
            rule__Relation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__010904);
            rule__Relation__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0__0"


    // $ANTLR start "rule__Relation__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5428:1: rule__Relation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5432:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5433:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5433:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5434:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5435:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5437:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0__0__Impl"


    // $ANTLR start "rule__Relation__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5447:1: rule__Relation__Group_1_0__1 : rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 ;
    public final void rule__Relation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5451:1: ( rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5452:2: rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__110962);
            rule__Relation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__110965);
            rule__Relation__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0__1"


    // $ANTLR start "rule__Relation__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5459:1: rule__Relation__Group_1_0__1__Impl : ( ( rule__Relation__OpAssignment_1_0_1 ) ) ;
    public final void rule__Relation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5463:1: ( ( ( rule__Relation__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5464:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5464:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5465:1: ( rule__Relation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5466:1: ( rule__Relation__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5466:2: rule__Relation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl10992);
            rule__Relation__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0__1__Impl"


    // $ANTLR start "rule__Relation__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5476:1: rule__Relation__Group_1_0__2 : rule__Relation__Group_1_0__2__Impl ;
    public final void rule__Relation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5480:1: ( rule__Relation__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5481:2: rule__Relation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__211022);
            rule__Relation__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0__2"


    // $ANTLR start "rule__Relation__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5487:1: rule__Relation__Group_1_0__2__Impl : ( ( rule__Relation__RightAssignment_1_0_2 ) ) ;
    public final void rule__Relation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5491:1: ( ( ( rule__Relation__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5492:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5492:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5493:1: ( rule__Relation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5494:1: ( rule__Relation__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5494:2: rule__Relation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl11049);
            rule__Relation__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1_0__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5510:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5514:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5515:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__011085);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__011088);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5522:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5526:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5527:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5527:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5528:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl11115);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5539:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5543:1: ( rule__Addition__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5544:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__111144);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5550:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5554:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5555:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5555:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5556:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:1: ( rule__Addition__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl11171);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5571:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5575:1: ( rule__Addition__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5576:2: rule__Addition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011206);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5582:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5586:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5587:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5587:1: ( ( rule__Addition__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5588:1: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5589:1: ( rule__Addition__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5589:2: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11233);
            rule__Addition__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5601:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5605:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5606:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011265);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011268);
            rule__Addition__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0"


    // $ANTLR start "rule__Addition__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5613:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5617:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5618:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5618:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5619:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5620:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5622:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5632:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5636:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5637:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111326);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111329);
            rule__Addition__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1"


    // $ANTLR start "rule__Addition__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5644:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OpAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5648:1: ( ( ( rule__Addition__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5649:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5649:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5650:1: ( rule__Addition__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5651:1: ( rule__Addition__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5651:2: rule__Addition__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11356);
            rule__Addition__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5661:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5665:1: ( rule__Addition__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5666:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211386);
            rule__Addition__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__2"


    // $ANTLR start "rule__Addition__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5672:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5676:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5677:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5677:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5678:1: ( rule__Addition__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5679:1: ( rule__Addition__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5679:2: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11413);
            rule__Addition__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5695:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5699:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5700:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011449);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011452);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5707:1: rule__Multiplication__Group__0__Impl : ( ruleNeg ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5711:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5712:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5712:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5713:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11479);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5724:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5728:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5729:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111508);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5735:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5739:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5740:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5740:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5741:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5742:1: ( rule__Multiplication__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=23 && LA33_0<=24)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5742:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11535);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5756:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5760:1: ( rule__Multiplication__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5761:2: rule__Multiplication__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011570);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5767:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5771:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5772:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5772:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5773:1: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5774:1: ( rule__Multiplication__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5774:2: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11597);
            rule__Multiplication__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5786:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5790:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5791:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011629);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011632);
            rule__Multiplication__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5798:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5802:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5803:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5803:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5804:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5805:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5807:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5817:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5821:1: ( rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5822:2: rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111690);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111693);
            rule__Multiplication__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5829:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5833:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5834:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5834:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5835:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5836:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5836:2: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11720);
            rule__Multiplication__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5846:1: rule__Multiplication__Group_1_0__2 : rule__Multiplication__Group_1_0__2__Impl ;
    public final void rule__Multiplication__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5850:1: ( rule__Multiplication__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5851:2: rule__Multiplication__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211750);
            rule__Multiplication__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__2"


    // $ANTLR start "rule__Multiplication__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5857:1: rule__Multiplication__Group_1_0__2__Impl : ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) ;
    public final void rule__Multiplication__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5861:1: ( ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5862:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5862:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5863:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5864:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5864:2: rule__Multiplication__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11777);
            rule__Multiplication__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__2__Impl"


    // $ANTLR start "rule__Neg__Group_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5880:1: rule__Neg__Group_0__0 : rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 ;
    public final void rule__Neg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5884:1: ( rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5885:2: rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011813);
            rule__Neg__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011816);
            rule__Neg__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_0__0"


    // $ANTLR start "rule__Neg__Group_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5892:1: rule__Neg__Group_0__0__Impl : ( () ) ;
    public final void rule__Neg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5896:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5897:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5897:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5898:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5899:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5901:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_0__0__Impl"


    // $ANTLR start "rule__Neg__Group_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5911:1: rule__Neg__Group_0__1 : rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 ;
    public final void rule__Neg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5915:1: ( rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5916:2: rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__111874);
            rule__Neg__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__111877);
            rule__Neg__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_0__1"


    // $ANTLR start "rule__Neg__Group_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5923:1: rule__Neg__Group_0__1__Impl : ( ( 'not' ) ) ;
    public final void rule__Neg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5927:1: ( ( ( 'not' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5928:1: ( ( 'not' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5928:1: ( ( 'not' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5929:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5930:1: ( 'not' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5931:2: 'not'
            {
            match(input,54,FOLLOW_54_in_rule__Neg__Group_0__1__Impl11906); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_0__1__Impl"


    // $ANTLR start "rule__Neg__Group_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5942:1: rule__Neg__Group_0__2 : rule__Neg__Group_0__2__Impl ;
    public final void rule__Neg__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5946:1: ( rule__Neg__Group_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5947:2: rule__Neg__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__211938);
            rule__Neg__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_0__2"


    // $ANTLR start "rule__Neg__Group_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5953:1: rule__Neg__Group_0__2__Impl : ( ( rule__Neg__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Neg__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5957:1: ( ( ( rule__Neg__ExpressionAssignment_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5958:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5958:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5959:1: ( rule__Neg__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5960:1: ( rule__Neg__ExpressionAssignment_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5960:2: rule__Neg__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl11965);
            rule__Neg__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_0__2__Impl"


    // $ANTLR start "rule__Neg__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5976:1: rule__Neg__Group_1__0 : rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 ;
    public final void rule__Neg__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5980:1: ( rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5981:2: rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__012001);
            rule__Neg__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__012004);
            rule__Neg__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_1__0"


    // $ANTLR start "rule__Neg__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5988:1: rule__Neg__Group_1__0__Impl : ( () ) ;
    public final void rule__Neg__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5992:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5993:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5993:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5994:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5995:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5997:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_1__0__Impl"


    // $ANTLR start "rule__Neg__Group_1__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6007:1: rule__Neg__Group_1__1 : rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 ;
    public final void rule__Neg__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6011:1: ( rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6012:2: rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__112062);
            rule__Neg__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__112065);
            rule__Neg__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_1__1"


    // $ANTLR start "rule__Neg__Group_1__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6019:1: rule__Neg__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Neg__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6023:1: ( ( ( '-' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6024:1: ( ( '-' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6024:1: ( ( '-' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6025:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6026:1: ( '-' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6027:2: '-'
            {
            match(input,22,FOLLOW_22_in_rule__Neg__Group_1__1__Impl12094); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_1__1__Impl"


    // $ANTLR start "rule__Neg__Group_1__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6038:1: rule__Neg__Group_1__2 : rule__Neg__Group_1__2__Impl ;
    public final void rule__Neg__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6042:1: ( rule__Neg__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6043:2: rule__Neg__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__212126);
            rule__Neg__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_1__2"


    // $ANTLR start "rule__Neg__Group_1__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6049:1: rule__Neg__Group_1__2__Impl : ( ( rule__Neg__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Neg__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6053:1: ( ( ( rule__Neg__ExpressionAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6054:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6054:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6055:1: ( rule__Neg__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6056:1: ( rule__Neg__ExpressionAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6056:2: rule__Neg__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl12153);
            rule__Neg__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group_5__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6072:1: rule__Atom__Group_5__0 : rule__Atom__Group_5__0__Impl rule__Atom__Group_5__1 ;
    public final void rule__Atom__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6076:1: ( rule__Atom__Group_5__0__Impl rule__Atom__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6077:2: rule__Atom__Group_5__0__Impl rule__Atom__Group_5__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_5__0__Impl_in_rule__Atom__Group_5__012189);
            rule__Atom__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_5__1_in_rule__Atom__Group_5__012192);
            rule__Atom__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_5__0"


    // $ANTLR start "rule__Atom__Group_5__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6084:1: rule__Atom__Group_5__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6088:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6089:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6089:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6090:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Atom__Group_5__0__Impl12220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_5__0__Impl"


    // $ANTLR start "rule__Atom__Group_5__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6103:1: rule__Atom__Group_5__1 : rule__Atom__Group_5__1__Impl rule__Atom__Group_5__2 ;
    public final void rule__Atom__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6107:1: ( rule__Atom__Group_5__1__Impl rule__Atom__Group_5__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6108:2: rule__Atom__Group_5__1__Impl rule__Atom__Group_5__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_5__1__Impl_in_rule__Atom__Group_5__112251);
            rule__Atom__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_5__2_in_rule__Atom__Group_5__112254);
            rule__Atom__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_5__1"


    // $ANTLR start "rule__Atom__Group_5__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6115:1: rule__Atom__Group_5__1__Impl : ( ruleExpression ) ;
    public final void rule__Atom__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6119:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6120:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6120:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6121:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExpressionParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Atom__Group_5__1__Impl12281);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getExpressionParserRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_5__1__Impl"


    // $ANTLR start "rule__Atom__Group_5__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6132:1: rule__Atom__Group_5__2 : rule__Atom__Group_5__2__Impl ;
    public final void rule__Atom__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6136:1: ( rule__Atom__Group_5__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6137:2: rule__Atom__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_5__2__Impl_in_rule__Atom__Group_5__212310);
            rule__Atom__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_5__2"


    // $ANTLR start "rule__Atom__Group_5__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6143:1: rule__Atom__Group_5__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6147:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6148:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6148:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6149:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_5_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__Atom__Group_5__2__Impl12338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_5__2__Impl"


    // $ANTLR start "rule__NameRef__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6168:1: rule__NameRef__Group__0 : rule__NameRef__Group__0__Impl rule__NameRef__Group__1 ;
    public final void rule__NameRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6172:1: ( rule__NameRef__Group__0__Impl rule__NameRef__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6173:2: rule__NameRef__Group__0__Impl rule__NameRef__Group__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012375);
            rule__NameRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012378);
            rule__NameRef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group__0"


    // $ANTLR start "rule__NameRef__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6180:1: rule__NameRef__Group__0__Impl : ( ( rule__NameRef__VariableAssignment_0 ) ) ;
    public final void rule__NameRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6184:1: ( ( ( rule__NameRef__VariableAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6185:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6185:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6186:1: ( rule__NameRef__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6187:1: ( rule__NameRef__VariableAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6187:2: rule__NameRef__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12405);
            rule__NameRef__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group__0__Impl"


    // $ANTLR start "rule__NameRef__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6197:1: rule__NameRef__Group__1 : rule__NameRef__Group__1__Impl ;
    public final void rule__NameRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6201:1: ( rule__NameRef__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6202:2: rule__NameRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112435);
            rule__NameRef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group__1"


    // $ANTLR start "rule__NameRef__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6208:1: rule__NameRef__Group__1__Impl : ( ( rule__NameRef__Group_1__0 )* ) ;
    public final void rule__NameRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6212:1: ( ( ( rule__NameRef__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6213:1: ( ( rule__NameRef__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6213:1: ( ( rule__NameRef__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6214:1: ( rule__NameRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6215:1: ( rule__NameRef__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==55) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6215:2: rule__NameRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12462);
            	    rule__NameRef__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group__1__Impl"


    // $ANTLR start "rule__NameRef__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6229:1: rule__NameRef__Group_1__0 : rule__NameRef__Group_1__0__Impl ;
    public final void rule__NameRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6233:1: ( rule__NameRef__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6234:2: rule__NameRef__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012497);
            rule__NameRef__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1__0"


    // $ANTLR start "rule__NameRef__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6240:1: rule__NameRef__Group_1__0__Impl : ( ( rule__NameRef__Group_1_0__0 ) ) ;
    public final void rule__NameRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6244:1: ( ( ( rule__NameRef__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6245:1: ( ( rule__NameRef__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6245:1: ( ( rule__NameRef__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6246:1: ( rule__NameRef__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6247:1: ( rule__NameRef__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6247:2: rule__NameRef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12524);
            rule__NameRef__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1__0__Impl"


    // $ANTLR start "rule__NameRef__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6259:1: rule__NameRef__Group_1_0__0 : rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 ;
    public final void rule__NameRef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6263:1: ( rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6264:2: rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012556);
            rule__NameRef__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012559);
            rule__NameRef__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1_0__0"


    // $ANTLR start "rule__NameRef__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6271:1: rule__NameRef__Group_1_0__0__Impl : ( () ) ;
    public final void rule__NameRef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6275:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6276:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6276:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6277:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6278:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6280:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1_0__0__Impl"


    // $ANTLR start "rule__NameRef__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6290:1: rule__NameRef__Group_1_0__1 : rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 ;
    public final void rule__NameRef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6294:1: ( rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6295:2: rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112617);
            rule__NameRef__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112620);
            rule__NameRef__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1_0__1"


    // $ANTLR start "rule__NameRef__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6302:1: rule__NameRef__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__NameRef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6306:1: ( ( '.' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6307:1: ( '.' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6307:1: ( '.' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6308:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,55,FOLLOW_55_in_rule__NameRef__Group_1_0__1__Impl12648); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1_0__1__Impl"


    // $ANTLR start "rule__NameRef__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6321:1: rule__NameRef__Group_1_0__2 : rule__NameRef__Group_1_0__2__Impl ;
    public final void rule__NameRef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6325:1: ( rule__NameRef__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6326:2: rule__NameRef__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212679);
            rule__NameRef__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1_0__2"


    // $ANTLR start "rule__NameRef__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6332:1: rule__NameRef__Group_1_0__2__Impl : ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) ;
    public final void rule__NameRef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6336:1: ( ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6337:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6337:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6338:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6339:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6339:2: rule__NameRef__VariableAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12706);
            rule__NameRef__VariableAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__Group_1_0__2__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6355:1: rule__SwitchExpression__Group__0 : rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 ;
    public final void rule__SwitchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6359:1: ( rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6360:2: rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__0__Impl_in_rule__SwitchExpression__Group__012742);
            rule__SwitchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SwitchExpression__Group__1_in_rule__SwitchExpression__Group__012745);
            rule__SwitchExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__0"


    // $ANTLR start "rule__SwitchExpression__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6367:1: rule__SwitchExpression__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6371:1: ( ( 'switch' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6372:1: ( 'switch' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6372:1: ( 'switch' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6373:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__SwitchExpression__Group__0__Impl12773); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__0__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6386:1: rule__SwitchExpression__Group__1 : rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 ;
    public final void rule__SwitchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6390:1: ( rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6391:2: rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__1__Impl_in_rule__SwitchExpression__Group__112804);
            rule__SwitchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SwitchExpression__Group__2_in_rule__SwitchExpression__Group__112807);
            rule__SwitchExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__1"


    // $ANTLR start "rule__SwitchExpression__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6398:1: rule__SwitchExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SwitchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6402:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6403:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6403:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6404:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__SwitchExpression__Group__1__Impl12835); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__1__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6417:1: rule__SwitchExpression__Group__2 : rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 ;
    public final void rule__SwitchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6421:1: ( rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6422:2: rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__2__Impl_in_rule__SwitchExpression__Group__212866);
            rule__SwitchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SwitchExpression__Group__3_in_rule__SwitchExpression__Group__212869);
            rule__SwitchExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__2"


    // $ANTLR start "rule__SwitchExpression__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6429:1: rule__SwitchExpression__Group__2__Impl : ( ( rule__SwitchExpression__CasesAssignment_2 )* ) ;
    public final void rule__SwitchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6433:1: ( ( ( rule__SwitchExpression__CasesAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6434:1: ( ( rule__SwitchExpression__CasesAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6434:1: ( ( rule__SwitchExpression__CasesAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6435:1: ( rule__SwitchExpression__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getCasesAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6436:1: ( rule__SwitchExpression__CasesAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==22||(LA35_0>=25 && LA35_0<=26)||LA35_0==38||(LA35_0>=53 && LA35_0<=54)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6436:2: rule__SwitchExpression__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SwitchExpression__CasesAssignment_2_in_rule__SwitchExpression__Group__2__Impl12896);
            	    rule__SwitchExpression__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getCasesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__2__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6446:1: rule__SwitchExpression__Group__3 : rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4 ;
    public final void rule__SwitchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6450:1: ( rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6451:2: rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__3__Impl_in_rule__SwitchExpression__Group__312927);
            rule__SwitchExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SwitchExpression__Group__4_in_rule__SwitchExpression__Group__312930);
            rule__SwitchExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__3"


    // $ANTLR start "rule__SwitchExpression__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6458:1: rule__SwitchExpression__Group__3__Impl : ( 'else' ) ;
    public final void rule__SwitchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6462:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6463:1: ( 'else' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6463:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6464:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getElseKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__SwitchExpression__Group__3__Impl12958); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getElseKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__3__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6477:1: rule__SwitchExpression__Group__4 : rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5 ;
    public final void rule__SwitchExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6481:1: ( rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6482:2: rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__4__Impl_in_rule__SwitchExpression__Group__412989);
            rule__SwitchExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SwitchExpression__Group__5_in_rule__SwitchExpression__Group__412992);
            rule__SwitchExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__4"


    // $ANTLR start "rule__SwitchExpression__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6489:1: rule__SwitchExpression__Group__4__Impl : ( ':' ) ;
    public final void rule__SwitchExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6493:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6494:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6494:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6495:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getColonKeyword_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__SwitchExpression__Group__4__Impl13020); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getColonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__4__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6508:1: rule__SwitchExpression__Group__5 : rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6 ;
    public final void rule__SwitchExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6512:1: ( rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6513:2: rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__5__Impl_in_rule__SwitchExpression__Group__513051);
            rule__SwitchExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SwitchExpression__Group__6_in_rule__SwitchExpression__Group__513054);
            rule__SwitchExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__5"


    // $ANTLR start "rule__SwitchExpression__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6520:1: rule__SwitchExpression__Group__5__Impl : ( ( rule__SwitchExpression__DefaultAssignment_5 ) ) ;
    public final void rule__SwitchExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6524:1: ( ( ( rule__SwitchExpression__DefaultAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6525:1: ( ( rule__SwitchExpression__DefaultAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6525:1: ( ( rule__SwitchExpression__DefaultAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6526:1: ( rule__SwitchExpression__DefaultAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6527:1: ( rule__SwitchExpression__DefaultAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6527:2: rule__SwitchExpression__DefaultAssignment_5
            {
            pushFollow(FOLLOW_rule__SwitchExpression__DefaultAssignment_5_in_rule__SwitchExpression__Group__5__Impl13081);
            rule__SwitchExpression__DefaultAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getDefaultAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__5__Impl"


    // $ANTLR start "rule__SwitchExpression__Group__6"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6537:1: rule__SwitchExpression__Group__6 : rule__SwitchExpression__Group__6__Impl ;
    public final void rule__SwitchExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6541:1: ( rule__SwitchExpression__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6542:2: rule__SwitchExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SwitchExpression__Group__6__Impl_in_rule__SwitchExpression__Group__613111);
            rule__SwitchExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__6"


    // $ANTLR start "rule__SwitchExpression__Group__6__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6548:1: rule__SwitchExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__SwitchExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6552:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6553:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6553:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6554:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,31,FOLLOW_31_in_rule__SwitchExpression__Group__6__Impl13139); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__Group__6__Impl"


    // $ANTLR start "rule__CaseExpression__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6581:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6585:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6586:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__013184);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__013187);
            rule__CaseExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__0"


    // $ANTLR start "rule__CaseExpression__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6593:1: rule__CaseExpression__Group__0__Impl : ( ( rule__CaseExpression__ConditionAssignment_0 ) ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6597:1: ( ( ( rule__CaseExpression__ConditionAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6598:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6598:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6599:1: ( rule__CaseExpression__ConditionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6600:1: ( rule__CaseExpression__ConditionAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6600:2: rule__CaseExpression__ConditionAssignment_0
            {
            pushFollow(FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl13214);
            rule__CaseExpression__ConditionAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getConditionAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__0__Impl"


    // $ANTLR start "rule__CaseExpression__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6610:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6614:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6615:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__113244);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__113247);
            rule__CaseExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__1"


    // $ANTLR start "rule__CaseExpression__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6622:1: rule__CaseExpression__Group__1__Impl : ( ':' ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6626:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6627:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6627:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6628:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getColonKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__CaseExpression__Group__1__Impl13275); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__1__Impl"


    // $ANTLR start "rule__CaseExpression__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6641:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6645:1: ( rule__CaseExpression__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6646:2: rule__CaseExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__213306);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__2"


    // $ANTLR start "rule__CaseExpression__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6652:1: rule__CaseExpression__Group__2__Impl : ( ( rule__CaseExpression__CaseAssignment_2 ) ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6656:1: ( ( ( rule__CaseExpression__CaseAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6657:1: ( ( rule__CaseExpression__CaseAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6657:1: ( ( rule__CaseExpression__CaseAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6658:1: ( rule__CaseExpression__CaseAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6659:1: ( rule__CaseExpression__CaseAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6659:2: rule__CaseExpression__CaseAssignment_2
            {
            pushFollow(FOLLOW_rule__CaseExpression__CaseAssignment_2_in_rule__CaseExpression__Group__2__Impl13333);
            rule__CaseExpression__CaseAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__Group__2__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6676:1: rule__Model__DeclarationsAssignment : ( ruleAbstractDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6680:1: ( ( ruleAbstractDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6681:1: ( ruleAbstractDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6681:1: ( ruleAbstractDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6682:1: ruleAbstractDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment13374);
            ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__Domain__NameAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6691:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6695:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6696:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6696:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6697:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_213405); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_2"


    // $ANTLR start "rule__Domain__ConstantsAssignment_4_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6706:1: rule__Domain__ConstantsAssignment_4_0 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6710:1: ( ( ruleSymbolicConstant ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6711:1: ( ruleSymbolicConstant )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6711:1: ( ruleSymbolicConstant )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6712:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_013436);
            ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ConstantsAssignment_4_0"


    // $ANTLR start "rule__Domain__ConstantsAssignment_4_1_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6721:1: rule__Domain__ConstantsAssignment_4_1_1 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6725:1: ( ( ruleSymbolicConstant ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6726:1: ( ruleSymbolicConstant )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6726:1: ( ruleSymbolicConstant )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6727:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_1_113467);
            ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ConstantsAssignment_4_1_1"


    // $ANTLR start "rule__SymbolicConstant__NameAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6736:1: rule__SymbolicConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolicConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6740:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6741:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6741:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6742:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolicConstant__NameAssignment_113498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolicConstant__NameAssignment_1"


    // $ANTLR start "rule__BaseType__NameAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6751:1: rule__BaseType__NameAssignment : ( ruleBaseTypeEnum ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6755:1: ( ( ruleBaseTypeEnum ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6756:1: ( ruleBaseTypeEnum )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6756:1: ( ruleBaseTypeEnum )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6757:1: ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment13529);
            ruleBaseTypeEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseType__NameAssignment"


    // $ANTLR start "rule__NamedType__RefAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6766:1: rule__NamedType__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NamedType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6770:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6771:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6771:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6772:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6773:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6774:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedType__RefAssignment13564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypeAccess().getRefNamedElementIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedType__RefAssignment"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6785:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6789:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6790:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6790:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6791:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_213599); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__DeclarationsAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6800:1: rule__Class__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Class__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6804:1: ( ( ruleDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6805:1: ( ruleDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6805:1: ( ruleDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6806:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_313630);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__DeclarationsAssignment_3"


    // $ANTLR start "rule__Class__TransitionsAssignment_4_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6815:1: rule__Class__TransitionsAssignment_4_1 : ( ruleLabeledTransition ) ;
    public final void rule__Class__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6819:1: ( ( ruleLabeledTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6820:1: ( ruleLabeledTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6820:1: ( ruleLabeledTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6821:1: ruleLabeledTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_113661);
            ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__TransitionsAssignment_4_1"


    // $ANTLR start "rule__Class__AssertionsAssignment_5_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6830:1: rule__Class__AssertionsAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Class__AssertionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6834:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6835:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6835:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6836:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_113692);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AssertionsAssignment_5_1"


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6845:1: rule__VariableDeclaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6849:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6850:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6850:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6851:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_113723);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6860:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6864:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6865:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6865:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6866:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_213754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_2"


    // $ANTLR start "rule__VariableDeclaration__AttributesAssignment_3_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6875:1: rule__VariableDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6879:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6880:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6880:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6881:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_113785);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__AttributesAssignment_3_1"


    // $ANTLR start "rule__VariableDeclaration__AttributesAssignment_3_2_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6890:1: rule__VariableDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6894:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6895:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6895:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6896:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_113816);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__AttributesAssignment_3_2_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6905:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6909:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6910:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6910:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6911:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113847); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__ValueAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6920:1: rule__Attribute__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6924:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6925:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6925:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6926:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313878);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_3"


    // $ANTLR start "rule__EventDeclaration__NameAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6935:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6939:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6940:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6940:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6941:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__NameAssignment_2"


    // $ANTLR start "rule__EventDeclaration__AttributesAssignment_3_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6950:1: rule__EventDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6954:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6955:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6955:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6956:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113940);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__AttributesAssignment_3_1"


    // $ANTLR start "rule__EventDeclaration__AttributesAssignment_3_2_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6965:1: rule__EventDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6969:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6970:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6970:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6971:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113971);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventDeclaration__AttributesAssignment_3_2_1"


    // $ANTLR start "rule__ParameterDeclaration__TypeAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6980:1: rule__ParameterDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6984:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6985:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6985:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6986:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_214002);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__ParameterDeclaration__NameAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6995:1: rule__ParameterDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6999:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7000:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7000:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7001:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_314033); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__NameAssignment_3"


    // $ANTLR start "rule__ParameterDeclaration__ValueAssignment_5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7010:1: rule__ParameterDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ParameterDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7014:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7015:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7015:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7016:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_514064);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__ValueAssignment_5"


    // $ANTLR start "rule__ObserverDeclaration__TypeAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7025:1: rule__ObserverDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ObserverDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7029:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7030:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7030:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7031:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_214095);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__ObserverDeclaration__NameAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7040:1: rule__ObserverDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObserverDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7044:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7045:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7045:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7046:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_314126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__NameAssignment_3"


    // $ANTLR start "rule__ObserverDeclaration__ValueAssignment_5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7055:1: rule__ObserverDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ObserverDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7059:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7060:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7060:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7061:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_514157);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObserverDeclaration__ValueAssignment_5"


    // $ANTLR start "rule__LabeledTransition__EventAssignment_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7070:1: rule__LabeledTransition__EventAssignment_0 : ( ruleNameRef ) ;
    public final void rule__LabeledTransition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7074:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7075:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7075:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7076:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_014188);
            ruleNameRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__EventAssignment_0"


    // $ANTLR start "rule__LabeledTransition__ExpressionAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7085:1: rule__LabeledTransition__ExpressionAssignment_2 : ( ruleTransitionAnd ) ;
    public final void rule__LabeledTransition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7089:1: ( ( ruleTransitionAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7090:1: ( ruleTransitionAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7090:1: ( ruleTransitionAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7091:1: ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_214219);
            ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledTransition__ExpressionAssignment_2"


    // $ANTLR start "rule__TransitionAnd__RightAssignment_1_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7100:1: rule__TransitionAnd__RightAssignment_1_2 : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7104:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7105:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7105:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7106:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_214250);
            ruleTransitionOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionAnd__RightAssignment_1_2"


    // $ANTLR start "rule__TransitionOr__RightAssignment_1_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7115:1: rule__TransitionOr__RightAssignment_1_2 : ( ruleTransition ) ;
    public final void rule__TransitionOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7119:1: ( ( ruleTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7120:1: ( ruleTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7120:1: ( ruleTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7121:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionOr__RightAssignment_1_214281);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionOr__RightAssignment_1_2"


    // $ANTLR start "rule__Transition__GuardAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7130:1: rule__Transition__GuardAssignment_1 : ( ruleExpression ) ;
    public final void rule__Transition__GuardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7134:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7135:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7135:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7136:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_114312);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardAssignment_1"


    // $ANTLR start "rule__Transition__ActionAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7145:1: rule__Transition__ActionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7149:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7150:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7150:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7151:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Transition__ActionAssignment_314343);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionAssignment_3"


    // $ANTLR start "rule__Assignment__VariableAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7160:1: rule__Assignment__VariableAssignment_1 : ( ruleNameRef ) ;
    public final void rule__Assignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7164:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7165:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7165:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7166:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_114374);
            ruleNameRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__VariableAssignment_1"


    // $ANTLR start "rule__Assignment__ValueAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7175:1: rule__Assignment__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7179:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7180:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7180:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7181:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_314405);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_3"


    // $ANTLR start "rule__Block__InstructionsAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7190:1: rule__Block__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7194:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7195:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7195:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7196:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_214436);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__InstructionsAssignment_2"


    // $ANTLR start "rule__Conditional__ConditionAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7205:1: rule__Conditional__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7209:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7210:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7210:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7211:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Conditional__ConditionAssignment_214467);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ConditionAssignment_2"


    // $ANTLR start "rule__Conditional__ThenAssignment_4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7220:1: rule__Conditional__ThenAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Conditional__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7224:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7225:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7225:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7226:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Conditional__ThenAssignment_414498);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ThenAssignment_4"


    // $ANTLR start "rule__Conditional__ElseAssignment_5_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7235:1: rule__Conditional__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Conditional__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7239:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7240:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7240:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7241:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Conditional__ElseAssignment_5_114529);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ElseAssignment_5_1"


    // $ANTLR start "rule__Switch__CasesAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7250:1: rule__Switch__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__Switch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7254:1: ( ( ruleCaseExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7255:1: ( ruleCaseExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7255:1: ( ruleCaseExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7256:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_rule__Switch__CasesAssignment_214560);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__CasesAssignment_2"


    // $ANTLR start "rule__Switch__ElseAssignment_5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7265:1: rule__Switch__ElseAssignment_5 : ( ruleExpression ) ;
    public final void rule__Switch__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7269:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7270:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7270:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7271:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Switch__ElseAssignment_514591);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__ElseAssignment_5"


    // $ANTLR start "rule__LogicalOr__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7280:1: rule__LogicalOr__OpAssignment_1_0_1 : ( ( 'or' ) ) ;
    public final void rule__LogicalOr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7284:1: ( ( ( 'or' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7285:1: ( ( 'or' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7285:1: ( ( 'or' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7286:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7287:1: ( 'or' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7288:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__LogicalOr__OpAssignment_1_0_114627); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__OpAssignment_1_0_1"


    // $ANTLR start "rule__LogicalOr__RightAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7303:1: rule__LogicalOr__RightAssignment_1_0_2 : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7307:1: ( ( ruleLogicalAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7308:1: ( ruleLogicalAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7308:1: ( ruleLogicalAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7309:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__RightAssignment_1_0_214666);
            ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__RightAssignment_1_0_2"


    // $ANTLR start "rule__LogicalAnd__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7318:1: rule__LogicalAnd__OpAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__LogicalAnd__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7322:1: ( ( ( 'and' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7323:1: ( ( 'and' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7323:1: ( ( 'and' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7324:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7325:1: ( 'and' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7326:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__LogicalAnd__OpAssignment_1_0_114702); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__OpAssignment_1_0_1"


    // $ANTLR start "rule__LogicalAnd__RightAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7341:1: rule__LogicalAnd__RightAssignment_1_0_2 : ( ruleRelation ) ;
    public final void rule__LogicalAnd__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7345:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7346:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7346:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7347:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__LogicalAnd__RightAssignment_1_0_214741);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__RightAssignment_1_0_2"


    // $ANTLR start "rule__Relation__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7356:1: rule__Relation__OpAssignment_1_0_1 : ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Relation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7360:1: ( ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7361:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7361:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7362:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7363:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7363:2: rule__Relation__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_114772);
            rule__Relation__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OpAssignment_1_0_1"


    // $ANTLR start "rule__Relation__RightAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7372:1: rule__Relation__RightAssignment_1_0_2 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7376:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7377:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7377:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7378:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_214805);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__RightAssignment_1_0_2"


    // $ANTLR start "rule__Addition__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7387:1: rule__Addition__OpAssignment_1_0_1 : ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Addition__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7391:1: ( ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7392:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7392:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7393:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7394:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7394:2: rule__Addition__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_114836);
            rule__Addition__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OpAssignment_1_0_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7403:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7407:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7408:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7408:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7409:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214869);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_0_2"


    // $ANTLR start "rule__Multiplication__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7418:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7422:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7423:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7423:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7424:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7425:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7425:2: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114900);
            rule__Multiplication__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OpAssignment_1_0_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7434:1: rule__Multiplication__RightAssignment_1_0_2 : ( ruleNeg ) ;
    public final void rule__Multiplication__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7438:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7439:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7439:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7440:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214933);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_0_2"


    // $ANTLR start "rule__Neg__ExpressionAssignment_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7449:1: rule__Neg__ExpressionAssignment_0_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7453:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7454:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7454:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7455:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214964);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__ExpressionAssignment_0_2"


    // $ANTLR start "rule__Neg__ExpressionAssignment_1_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7464:1: rule__Neg__ExpressionAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7468:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7469:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7469:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7470:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214995);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__ExpressionAssignment_1_2"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7479:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7483:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7484:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7484:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7485:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7486:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7486:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment15026);
            rule__BooleanLiteral__ValueAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7495:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7499:1: ( ( RULE_STRING ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7500:1: ( RULE_STRING )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7500:1: ( RULE_STRING )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7501:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment15059); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7510:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7514:1: ( ( RULE_INT ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7515:1: ( RULE_INT )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7515:1: ( RULE_INT )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7516:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment15090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__NameRef__VariableAssignment_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7525:1: rule__NameRef__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7529:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7530:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7530:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7531:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7532:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7533:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_015125); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__VariableAssignment_0"


    // $ANTLR start "rule__NameRef__VariableAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7544:1: rule__NameRef__VariableAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7548:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7549:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7549:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7550:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7551:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7552:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_215164); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_1_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameRef__VariableAssignment_1_0_2"


    // $ANTLR start "rule__SwitchExpression__CasesAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7563:1: rule__SwitchExpression__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__SwitchExpression__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7567:1: ( ( ruleCaseExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7568:1: ( ruleCaseExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7568:1: ( ruleCaseExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7569:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_rule__SwitchExpression__CasesAssignment_215199);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__CasesAssignment_2"


    // $ANTLR start "rule__SwitchExpression__DefaultAssignment_5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7578:1: rule__SwitchExpression__DefaultAssignment_5 : ( ruleExpression ) ;
    public final void rule__SwitchExpression__DefaultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7582:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7583:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7583:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7584:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SwitchExpression__DefaultAssignment_515230);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SwitchExpression__DefaultAssignment_5"


    // $ANTLR start "rule__CaseExpression__ConditionAssignment_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7593:1: rule__CaseExpression__ConditionAssignment_0 : ( ruleLogicalOr ) ;
    public final void rule__CaseExpression__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7597:1: ( ( ruleLogicalOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7598:1: ( ruleLogicalOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7598:1: ( ruleLogicalOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7599:1: ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_rule__CaseExpression__ConditionAssignment_015261);
            ruleLogicalOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__ConditionAssignment_0"


    // $ANTLR start "rule__CaseExpression__CaseAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7608:1: rule__CaseExpression__CaseAssignment_2 : ( ruleExpression ) ;
    public final void rule__CaseExpression__CaseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7612:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7613:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7613:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7614:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__CaseAssignment_215292);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__CaseAssignment_2"

    // $ANTLR start synpred46_InternalAltarica
    public final void synpred46_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:2: ( rule__Addition__Group_1__0 )
        // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:2: rule__Addition__Group_1__0
        {
        pushFollow(FOLLOW_rule__Addition__Group_1__0_in_synpred46_InternalAltarica11171);
        rule__Addition__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalAltarica

    // Delegated rules

    public final boolean synpred46_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\34\uffff";
    static final String DFA32_eofS =
        "\1\1\33\uffff";
    static final String DFA32_minS =
        "\1\4\21\uffff\1\0\11\uffff";
    static final String DFA32_maxS =
        "\1\71\21\uffff\1\0\11\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\31\uffff\1\1";
    static final String DFA32_specialS =
        "\22\uffff\1\0\11\uffff}>";
    static final String[] DFA32_transitionS = {
            "\3\1\10\uffff\6\1\1\33\1\22\2\uffff\2\1\4\uffff\2\1\4\uffff\3\1\4\uffff\1\1\2\uffff\1\1\3\uffff\4\1\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 5557:1: ( rule__Addition__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_18 = input.LA(1);

                         
                        int index32_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_InternalAltarica()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000220000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDeclaration__Alternatives_in_ruleAbstractDeclaration161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_entryRuleSymbolicConstant248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicConstant255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__0_in_ruleSymbolicConstant281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__NameAssignment_in_ruleBaseType401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedType__RefAssignment_in_ruleNamedType461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclaration735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__0_in_ruleEventDeclaration761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObserverDeclaration855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__0_in_ruleObserverDeclaration881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledTransition915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__0_in_ruleLabeledTransition941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionAnd975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__0_in_ruleTransitionAnd1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionOr1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__0_in_ruleTransitionOr1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0_in_ruleSkip1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0_in_ruleConditional1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0_in_ruleSwitch1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_ruleExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOr1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__0_in_ruleLogicalOr1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAnd1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__0_in_ruleLogicalAnd1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_entryRuleNeg1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Alternatives_in_ruleNeg1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_entryRuleNameRef2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameRef2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0_in_ruleNameRef2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchExpression2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__0_in_ruleSwitchExpression2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression2287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__AbstractDeclaration__Alternatives2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__AbstractDeclaration__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_rule__Type__Alternatives2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_rule__Type__Alternatives2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_rule__Instruction__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_rule__Instruction__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Relation__OpAlternatives_1_0_1_02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Relation__OpAlternatives_1_0_1_02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_02736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Relation__OpAlternatives_1_0_1_02756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Relation__OpAlternatives_1_0_1_02776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Addition__OpAlternatives_1_0_1_02811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Addition__OpAlternatives_1_0_1_02831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Multiplication__OpAlternatives_1_0_1_02866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Multiplication__OpAlternatives_1_0_1_02886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__Alternatives2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Atom__Alternatives3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_rule__Atom__Alternatives3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_5__0_in_rule__Atom__Alternatives3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanLiteral__ValueAlternatives_03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanLiteral__ValueAlternatives_03127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BaseTypeEnum__Alternatives3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BaseTypeEnum__Alternatives3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03216 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Domain__Group__1__Impl3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23339 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33399 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Domain__Group__3__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43461 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__0_in_rule__Domain__Group__4__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Domain__Group__5__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__0__Impl_in_rule__Domain__Group_4__03593 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__1_in_rule__Domain__Group_4__03596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ConstantsAssignment_4_0_in_rule__Domain__Group_4__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__1__Impl_in_rule__Domain__Group_4__13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__0_in_rule__Domain__Group_4__1__Impl3680 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__0__Impl_in_rule__Domain__Group_4_1__03715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__1_in_rule__Domain__Group_4_1__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Domain__Group_4_1__0__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__1__Impl_in_rule__Domain__Group_4_1__13777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ConstantsAssignment_4_1_1_in_rule__Domain__Group_4_1__1__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__0__Impl_in_rule__SymbolicConstant__Group__03838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__1_in_rule__SymbolicConstant__Group__03841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__1__Impl_in_rule__SymbolicConstant__Group__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__NameAssignment_1_in_rule__SymbolicConstant__Group__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__03960 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__14021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Class__Group__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24083 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34143 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl4173 = new BitSet(new long[]{0x00000E0018000012L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__44204 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__44207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__54265 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__54268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__64326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Class__Group__6__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__04399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__04402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Class__Group_4__0__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__14461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4490 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4502 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__04539 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__04542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Class__Group_5__0__Impl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__14601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4630 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4642 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04679 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24800 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34860 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__34863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__44921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VariableDeclaration__Group__4__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__04990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__04993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__15052 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25112 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5142 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__35173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VariableDeclaration__Group_3__3__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__05240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__05243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VariableDeclaration__Group_3_2__0__Impl5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__15302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15424 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25484 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attribute__Group__2__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__05611 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__05614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__15672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__15675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EventDeclaration__Group__1__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__25734 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__25737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__35794 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__4_in_rule__EventDeclaration__Group__35797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl5824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__4__Impl_in_rule__EventDeclaration__Group__45855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EventDeclaration__Group__4__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__05924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__05927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EventDeclaration__Group_3__0__Impl5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__15986 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__26046 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__26049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl6076 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventDeclaration__Group_3__3__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__06174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__06177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EventDeclaration__Group_3_2__0__Impl6205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__16236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06297 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16358 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__16361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ParameterDeclaration__Group__1__Impl6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__26420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__26423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__36480 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__36483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__46540 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__46543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ParameterDeclaration__Group__4__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__56602 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__56605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__66662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterDeclaration__Group__6__Impl6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__06735 = new BitSet(new long[]{0x00000E0018000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__06738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__16796 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__16799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ObserverDeclaration__Group__1__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__26858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__26861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__36918 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__36921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__46978 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__46981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ObserverDeclaration__Group__4__Impl7009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__57040 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__57043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObserverDeclaration__Group__6__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__07173 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__07176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__17233 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__17236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LabeledTransition__Group__1__Impl7264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__27295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__07358 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__07361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__17417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl7444 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__07479 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__07482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__17540 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__17543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TransitionAnd__Group_1__1__Impl7571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__27602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__07665 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__07668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionOr__Group__0__Impl7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__17724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl7751 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__07786 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__07789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__17847 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__17850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TransitionOr__Group_1__1__Impl7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__27909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07972 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__18033 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__18036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28093 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Transition__Group__2__Impl8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_3_in_rule__Transition__Group__3__Impl8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08220 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18281 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Skip__Group__1__Impl8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__28343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Skip__Group__2__Impl8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18469 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28529 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__28532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Assignment__Group__2__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__38591 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__38594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl8621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__48651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Assignment__Group__4__Impl8679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08720 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18781 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Block__Group__1__Impl8812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28843 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8875 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8887 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Block__Group__3__Impl8948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08987 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__19048 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__19051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Conditional__Group__1__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__29110 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__29113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39170 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Conditional__Group__3__Impl9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49232 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ThenAssignment_4_in_rule__Conditional__Group__4__Impl9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59292 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__0_in_rule__Conditional__Group__5__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Conditional__Group__6__Impl9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__0__Impl_in_rule__Conditional__Group_5__09426 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__1_in_rule__Conditional__Group_5__09429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Conditional__Group_5__0__Impl9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__1__Impl_in_rule__Conditional__Group_5__19490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ElseAssignment_5_1_in_rule__Conditional__Group_5__1__Impl9517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__09551 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__09554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Switch__Group__0__Impl9582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__19613 = new BitSet(new long[]{0x0070004006400070L});
    public static final BitSet FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__19616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Switch__Group__1__Impl9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__29675 = new BitSet(new long[]{0x0070004006400070L});
    public static final BitSet FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__29678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__CasesAssignment_2_in_rule__Switch__Group__2__Impl9705 = new BitSet(new long[]{0x0060004006400072L});
    public static final BitSet FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__39736 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__39739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Switch__Group__3__Impl9767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__49798 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__49801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Switch__Group__4__Impl9829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__59860 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__59863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__ElseAssignment_5_in_rule__Switch__Group__5__Impl9890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__69920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Switch__Group__6__Impl9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__0__Impl_in_rule__LogicalOr__Group__09993 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__1_in_rule__LogicalOr__Group__09996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__Group__0__Impl10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__1__Impl_in_rule__LogicalOr__Group__110052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1__0_in_rule__LogicalOr__Group__1__Impl10079 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1__0__Impl_in_rule__LogicalOr__Group_1__010114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__0_in_rule__LogicalOr__Group_1__0__Impl10141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__0__Impl_in_rule__LogicalOr__Group_1_0__010173 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__1_in_rule__LogicalOr__Group_1_0__010176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__1__Impl_in_rule__LogicalOr__Group_1_0__110234 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__2_in_rule__LogicalOr__Group_1_0__110237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__OpAssignment_1_0_1_in_rule__LogicalOr__Group_1_0__1__Impl10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__2__Impl_in_rule__LogicalOr__Group_1_0__210294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__RightAssignment_1_0_2_in_rule__LogicalOr__Group_1_0__2__Impl10321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__0__Impl_in_rule__LogicalAnd__Group__010357 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__1_in_rule__LogicalAnd__Group__010360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__LogicalAnd__Group__0__Impl10387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__1__Impl_in_rule__LogicalAnd__Group__110416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__0_in_rule__LogicalAnd__Group__1__Impl10443 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__0__Impl_in_rule__LogicalAnd__Group_1__010478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__0_in_rule__LogicalAnd__Group_1__0__Impl10505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__0__Impl_in_rule__LogicalAnd__Group_1_0__010537 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__1_in_rule__LogicalAnd__Group_1_0__010540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__1__Impl_in_rule__LogicalAnd__Group_1_0__110598 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__2_in_rule__LogicalAnd__Group_1_0__110601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__OpAssignment_1_0_1_in_rule__LogicalAnd__Group_1_0__1__Impl10628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__2__Impl_in_rule__LogicalAnd__Group_1_0__210658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__RightAssignment_1_0_2_in_rule__LogicalAnd__Group_1_0__2__Impl10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010721 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10807 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__010842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl10869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__010901 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__010904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__110962 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__110965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl10992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__211022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__011085 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__011088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__111144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl11171 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011265 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111326 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011449 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11535 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011629 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111690 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011813 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__111874 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__111877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Neg__Group_0__1__Impl11906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__211938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__012001 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__012004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__112062 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__112065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Neg__Group_1__1__Impl12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__212126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl12153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_5__0__Impl_in_rule__Atom__Group_5__012189 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__Atom__Group_5__1_in_rule__Atom__Group_5__012192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Atom__Group_5__0__Impl12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_5__1__Impl_in_rule__Atom__Group_5__112251 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_5__2_in_rule__Atom__Group_5__112254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atom__Group_5__1__Impl12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_5__2__Impl_in_rule__Atom__Group_5__212310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Atom__Group_5__2__Impl12338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012375 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12462 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012556 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__NameRef__Group_1_0__1__Impl12648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__0__Impl_in_rule__SwitchExpression__Group__012742 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__1_in_rule__SwitchExpression__Group__012745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__SwitchExpression__Group__0__Impl12773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__1__Impl_in_rule__SwitchExpression__Group__112804 = new BitSet(new long[]{0x0070004006400070L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__2_in_rule__SwitchExpression__Group__112807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SwitchExpression__Group__1__Impl12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__2__Impl_in_rule__SwitchExpression__Group__212866 = new BitSet(new long[]{0x0070004006400070L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__3_in_rule__SwitchExpression__Group__212869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__CasesAssignment_2_in_rule__SwitchExpression__Group__2__Impl12896 = new BitSet(new long[]{0x0060004006400072L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__3__Impl_in_rule__SwitchExpression__Group__312927 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__4_in_rule__SwitchExpression__Group__312930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__SwitchExpression__Group__3__Impl12958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__4__Impl_in_rule__SwitchExpression__Group__412989 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__5_in_rule__SwitchExpression__Group__412992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SwitchExpression__Group__4__Impl13020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__5__Impl_in_rule__SwitchExpression__Group__513051 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__6_in_rule__SwitchExpression__Group__513054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__DefaultAssignment_5_in_rule__SwitchExpression__Group__5__Impl13081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SwitchExpression__Group__6__Impl_in_rule__SwitchExpression__Group__613111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SwitchExpression__Group__6__Impl13139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__013184 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__013187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl13214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__113244 = new BitSet(new long[]{0x0060004006400070L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__113247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CaseExpression__Group__1__Impl13275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__213306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__CaseAssignment_2_in_rule__CaseExpression__Group__2__Impl13333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_213405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_013436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_1_113467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolicConstant__NameAssignment_113498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment13529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedType__RefAssignment13564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_213599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_313630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_113661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_113692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_113723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_213754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_113785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_113816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_214002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_314033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_514064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_214095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_314126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_514157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_014188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_214219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_214250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionOr__RightAssignment_1_214281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_114312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Transition__ActionAssignment_314343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_114374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_314405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_214436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Conditional__ConditionAssignment_214467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Conditional__ThenAssignment_414498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Conditional__ElseAssignment_5_114529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rule__Switch__CasesAssignment_214560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Switch__ElseAssignment_514591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LogicalOr__OpAssignment_1_0_114627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__RightAssignment_1_0_214666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__LogicalAnd__OpAssignment_1_0_114702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__LogicalAnd__RightAssignment_1_0_214741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_114772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_214805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_114836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment15026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment15059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment15090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_015125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_215164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rule__SwitchExpression__CasesAssignment_215199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SwitchExpression__DefaultAssignment_515230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_rule__CaseExpression__ConditionAssignment_015261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__CaseAssignment_215292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_synpred46_InternalAltarica11171 = new BitSet(new long[]{0x0000000000000002L});

}