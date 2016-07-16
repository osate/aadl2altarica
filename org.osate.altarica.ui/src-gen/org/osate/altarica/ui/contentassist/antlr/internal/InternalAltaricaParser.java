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


    // $ANTLR start "entryRuleCaseExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:733:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:734:1: ( ruleCaseExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:735:1: ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression1508);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression1515); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:742:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:746:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:747:1: ( ( rule__CaseExpression__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:747:1: ( ( rule__CaseExpression__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:748:1: ( rule__CaseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:749:1: ( rule__CaseExpression__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:749:2: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression1541);
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


    // $ANTLR start "entryRuleExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:761:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:762:1: ( ruleExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:763:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1568);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1575); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:770:1: ruleExpression : ( ruleLogicalOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:774:2: ( ( ruleLogicalOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:775:1: ( ruleLogicalOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:775:1: ( ruleLogicalOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:776:1: ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_ruleExpression1601);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:789:1: entryRuleLogicalOr : ruleLogicalOr EOF ;
    public final void entryRuleLogicalOr() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:790:1: ( ruleLogicalOr EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:791:1: ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr1627);
            ruleLogicalOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOr1634); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:798:1: ruleLogicalOr : ( ( rule__LogicalOr__Group__0 ) ) ;
    public final void ruleLogicalOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:802:2: ( ( ( rule__LogicalOr__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:803:1: ( ( rule__LogicalOr__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:803:1: ( ( rule__LogicalOr__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:804:1: ( rule__LogicalOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:805:1: ( rule__LogicalOr__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:805:2: rule__LogicalOr__Group__0
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group__0_in_ruleLogicalOr1660);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:817:1: entryRuleLogicalAnd : ruleLogicalAnd EOF ;
    public final void entryRuleLogicalAnd() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:818:1: ( ruleLogicalAnd EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:819:1: ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd1687);
            ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAnd1694); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:826:1: ruleLogicalAnd : ( ( rule__LogicalAnd__Group__0 ) ) ;
    public final void ruleLogicalAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:830:2: ( ( ( rule__LogicalAnd__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:831:1: ( ( rule__LogicalAnd__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:831:1: ( ( rule__LogicalAnd__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:832:1: ( rule__LogicalAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:833:1: ( rule__LogicalAnd__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:833:2: rule__LogicalAnd__Group__0
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group__0_in_ruleLogicalAnd1720);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:845:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:846:1: ( ruleRelation EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:847:1: ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1747);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1754); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:854:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:858:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:859:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:859:1: ( ( rule__Relation__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:860:1: ( rule__Relation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:861:1: ( rule__Relation__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:861:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation1780);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:873:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:874:1: ( ruleAddition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:875:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1807);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1814); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:882:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:886:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:887:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:887:1: ( ( rule__Addition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:888:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:889:1: ( rule__Addition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:889:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1840);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:901:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:902:1: ( ruleMultiplication EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:903:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1867);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1874); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:910:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:914:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:915:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:915:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:916:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:917:1: ( rule__Multiplication__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:917:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1900);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:929:1: entryRuleNeg : ruleNeg EOF ;
    public final void entryRuleNeg() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:930:1: ( ruleNeg EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:931:1: ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_entryRuleNeg1927);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg1934); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:938:1: ruleNeg : ( ( rule__Neg__Alternatives ) ) ;
    public final void ruleNeg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:942:2: ( ( ( rule__Neg__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:943:1: ( ( rule__Neg__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:943:1: ( ( rule__Neg__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:944:1: ( rule__Neg__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:945:1: ( rule__Neg__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:945:2: rule__Neg__Alternatives
            {
            pushFollow(FOLLOW_rule__Neg__Alternatives_in_ruleNeg1960);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:957:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:958:1: ( ruleAtom EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:959:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1987);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1994); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:966:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:970:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:971:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:971:1: ( ( rule__Atom__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:972:1: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:973:1: ( rule__Atom__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:973:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom2020);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:985:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:986:1: ( ruleBooleanLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:987:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2047);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2054); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:994:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:998:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:999:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:999:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1000:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1001:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1001:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2080);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1013:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1014:1: ( ruleStringLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1015:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2107);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2114); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1022:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1026:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1027:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1027:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1028:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1029:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1029:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2140);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1041:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1042:1: ( ruleIntegerLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1043:1: ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2167);
            ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral2174); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1050:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1054:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1055:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1055:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1056:1: ( rule__IntegerLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1057:1: ( rule__IntegerLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1057:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral2200);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1069:1: entryRuleNameRef : ruleNameRef EOF ;
    public final void entryRuleNameRef() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1070:1: ( ruleNameRef EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1071:1: ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_entryRuleNameRef2227);
            ruleNameRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameRef2234); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1078:1: ruleNameRef : ( ( rule__NameRef__Group__0 ) ) ;
    public final void ruleNameRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1082:2: ( ( ( rule__NameRef__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1083:1: ( ( rule__NameRef__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1083:1: ( ( rule__NameRef__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1084:1: ( rule__NameRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1085:1: ( rule__NameRef__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1085:2: rule__NameRef__Group__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0_in_ruleNameRef2260);
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


    // $ANTLR start "ruleBaseTypeEnum"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1098:1: ruleBaseTypeEnum : ( ( rule__BaseTypeEnum__Alternatives ) ) ;
    public final void ruleBaseTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1102:1: ( ( ( rule__BaseTypeEnum__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1103:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1103:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1104:1: ( rule__BaseTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1105:1: ( rule__BaseTypeEnum__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1105:2: rule__BaseTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2297);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1116:1: rule__AbstractDeclaration__Alternatives : ( ( ruleDomain ) | ( ruleClass ) );
    public final void rule__AbstractDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1120:1: ( ( ruleDomain ) | ( ruleClass ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1121:1: ( ruleDomain )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1121:1: ( ruleDomain )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1122:1: ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDomain_in_rule__AbstractDeclaration__Alternatives2332);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1127:6: ( ruleClass )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1127:6: ( ruleClass )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1128:1: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClass_in_rule__AbstractDeclaration__Alternatives2349);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1138:1: rule__Type__Alternatives : ( ( ( ruleBaseType ) ) | ( ruleNamedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1142:1: ( ( ( ruleBaseType ) ) | ( ruleNamedType ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1143:1: ( ( ruleBaseType ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1143:1: ( ( ruleBaseType ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1144:1: ( ruleBaseType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1145:1: ( ruleBaseType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1145:3: ruleBaseType
                    {
                    pushFollow(FOLLOW_ruleBaseType_in_rule__Type__Alternatives2382);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1149:6: ( ruleNamedType )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1149:6: ( ruleNamedType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1150:1: ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNamedType_in_rule__Type__Alternatives2400);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1160:1: rule__Declaration__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1164:1: ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1165:1: ( ruleVariableDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1165:1: ( ruleVariableDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1166:1: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2432);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1171:6: ( ruleEventDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1171:6: ( ruleEventDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1172:1: ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2449);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:6: ( ruleParameterDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:6: ( ruleParameterDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1178:1: ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2466);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1183:6: ( ruleObserverDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1183:6: ( ruleObserverDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1184:1: ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2483);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1194:1: rule__Instruction__Alternatives : ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1198:1: ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1199:1: ( ruleSkip )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1199:1: ( ruleSkip )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1200:1: ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2515);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1205:6: ( ruleAssignment )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1205:6: ( ruleAssignment )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1206:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2532);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1211:6: ( ruleBlock )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1211:6: ( ruleBlock )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1212:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2549);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1217:6: ( ruleConditional )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1217:6: ( ruleConditional )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1218:1: ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleConditional_in_rule__Instruction__Alternatives2566);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1223:6: ( ruleSwitch )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1223:6: ( ruleSwitch )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1224:1: ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSwitch_in_rule__Instruction__Alternatives2583);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1234:1: rule__Relation__OpAlternatives_1_0_1_0 : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Relation__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1238:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1239:1: ( '==' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1239:1: ( '==' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1240:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Relation__OpAlternatives_1_0_1_02616); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1247:6: ( '!=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1247:6: ( '!=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1248:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Relation__OpAlternatives_1_0_1_02636); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1255:6: ( '<' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1255:6: ( '<' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1256:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_02656); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1263:6: ( '<=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1263:6: ( '<=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1264:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_02676); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1271:6: ( '>=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1271:6: ( '>=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1272:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Relation__OpAlternatives_1_0_1_02696); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1279:6: ( '>' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1279:6: ( '>' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1280:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Relation__OpAlternatives_1_0_1_02716); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1292:1: rule__Addition__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1296:1: ( ( '+' ) | ( '-' ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1297:1: ( '+' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1297:1: ( '+' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1298:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Addition__OpAlternatives_1_0_1_02751); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1305:6: ( '-' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1305:6: ( '-' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1306:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Addition__OpAlternatives_1_0_1_02771); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1318:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1322:1: ( ( '*' ) | ( '/' ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1323:1: ( '*' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1323:1: ( '*' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1324:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Multiplication__OpAlternatives_1_0_1_02806); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1331:6: ( '/' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1331:6: ( '/' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1332:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Multiplication__OpAlternatives_1_0_1_02826); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1344:1: rule__Neg__Alternatives : ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) );
    public final void rule__Neg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1348:1: ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1349:1: ( ( rule__Neg__Group_0__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1349:1: ( ( rule__Neg__Group_0__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1350:1: ( rule__Neg__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1351:1: ( rule__Neg__Group_0__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1351:2: rule__Neg__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives2860);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1355:6: ( ( rule__Neg__Group_1__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1355:6: ( ( rule__Neg__Group_1__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1356:1: ( rule__Neg__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1357:1: ( rule__Neg__Group_1__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1357:2: rule__Neg__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives2878);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1361:6: ( ruleAtom )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1361:6: ( ruleAtom )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1362:1: ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAtom_in_rule__Neg__Alternatives2896);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1372:1: rule__Atom__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ( rule__Atom__Group_4__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1376:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ( rule__Atom__Group_4__0 ) ) )
            int alt10=5;
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
            case 38:
                {
                alt10=5;
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1377:1: ( ruleBooleanLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1377:1: ( ruleBooleanLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1378:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives2928);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1383:6: ( ruleStringLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1383:6: ( ruleStringLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1384:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives2945);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1389:6: ( ruleIntegerLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1389:6: ( ruleIntegerLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1390:1: ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives2962);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1395:6: ( ruleNameRef )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1395:6: ( ruleNameRef )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1396:1: ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleNameRef_in_rule__Atom__Alternatives2979);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1401:6: ( ( rule__Atom__Group_4__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1401:6: ( ( rule__Atom__Group_4__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1402:1: ( rule__Atom__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_4()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1403:1: ( rule__Atom__Group_4__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1403:2: rule__Atom__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives2996);
                    rule__Atom__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_4()); 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1412:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1416:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1417:1: ( 'true' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1417:1: ( 'true' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1418:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__BooleanLiteral__ValueAlternatives_03030); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1425:6: ( 'false' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1425:6: ( 'false' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1426:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__BooleanLiteral__ValueAlternatives_03050); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1438:1: rule__BaseTypeEnum__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__BaseTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1442:1: ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1443:1: ( ( 'Integer' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1443:1: ( ( 'Integer' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1444:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1445:1: ( 'Integer' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1445:3: 'Integer'
                    {
                    match(input,27,FOLLOW_27_in_rule__BaseTypeEnum__Alternatives3085); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1450:6: ( ( 'Boolean' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1450:6: ( ( 'Boolean' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1451:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1452:1: ( 'Boolean' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1452:3: 'Boolean'
                    {
                    match(input,28,FOLLOW_28_in_rule__BaseTypeEnum__Alternatives3106); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1464:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1468:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1469:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03139);
            rule__Domain__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03142);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1476:1: rule__Domain__Group__0__Impl : ( () ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1480:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1481:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1481:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1482:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1483:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1485:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1495:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1499:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1500:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13200);
            rule__Domain__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13203);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1507:1: rule__Domain__Group__1__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1511:1: ( ( 'domain' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1512:1: ( 'domain' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1512:1: ( 'domain' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1513:1: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Domain__Group__1__Impl3231); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1526:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1530:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1531:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23262);
            rule__Domain__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23265);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1538:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1542:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1543:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1543:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1544:1: ( rule__Domain__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1545:1: ( rule__Domain__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1545:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3292);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1555:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1559:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1560:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33322);
            rule__Domain__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33325);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1567:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1571:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1572:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1572:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1573:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__Domain__Group__3__Impl3353); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1586:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1590:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1591:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43384);
            rule__Domain__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43387);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1598:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__Group_4__0 )? ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1602:1: ( ( ( rule__Domain__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1603:1: ( ( rule__Domain__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1603:1: ( ( rule__Domain__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1604:1: ( rule__Domain__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1605:1: ( rule__Domain__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1605:2: rule__Domain__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Domain__Group_4__0_in_rule__Domain__Group__4__Impl3414);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1615:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1619:1: ( rule__Domain__Group__5__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1620:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53445);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1626:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1630:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1631:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1631:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1632:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,31,FOLLOW_31_in_rule__Domain__Group__5__Impl3473); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1657:1: rule__Domain__Group_4__0 : rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 ;
    public final void rule__Domain__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1661:1: ( rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1662:2: rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_4__0__Impl_in_rule__Domain__Group_4__03516);
            rule__Domain__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group_4__1_in_rule__Domain__Group_4__03519);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1669:1: rule__Domain__Group_4__0__Impl : ( ( rule__Domain__ConstantsAssignment_4_0 ) ) ;
    public final void rule__Domain__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1673:1: ( ( ( rule__Domain__ConstantsAssignment_4_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1674:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1674:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1675:1: ( rule__Domain__ConstantsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1676:1: ( rule__Domain__ConstantsAssignment_4_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1676:2: rule__Domain__ConstantsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Domain__ConstantsAssignment_4_0_in_rule__Domain__Group_4__0__Impl3546);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1686:1: rule__Domain__Group_4__1 : rule__Domain__Group_4__1__Impl ;
    public final void rule__Domain__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1690:1: ( rule__Domain__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1691:2: rule__Domain__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_4__1__Impl_in_rule__Domain__Group_4__13576);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1697:1: rule__Domain__Group_4__1__Impl : ( ( rule__Domain__Group_4_1__0 )* ) ;
    public final void rule__Domain__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1701:1: ( ( ( rule__Domain__Group_4_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1702:1: ( ( rule__Domain__Group_4_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1702:1: ( ( rule__Domain__Group_4_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1703:1: ( rule__Domain__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1704:1: ( rule__Domain__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1704:2: rule__Domain__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_4_1__0_in_rule__Domain__Group_4__1__Impl3603);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1718:1: rule__Domain__Group_4_1__0 : rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 ;
    public final void rule__Domain__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1722:1: ( rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1723:2: rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_4_1__0__Impl_in_rule__Domain__Group_4_1__03638);
            rule__Domain__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group_4_1__1_in_rule__Domain__Group_4_1__03641);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1730:1: rule__Domain__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1734:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1735:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1735:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1736:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Domain__Group_4_1__0__Impl3669); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1749:1: rule__Domain__Group_4_1__1 : rule__Domain__Group_4_1__1__Impl ;
    public final void rule__Domain__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1753:1: ( rule__Domain__Group_4_1__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1754:2: rule__Domain__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_4_1__1__Impl_in_rule__Domain__Group_4_1__13700);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1760:1: rule__Domain__Group_4_1__1__Impl : ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) ;
    public final void rule__Domain__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1764:1: ( ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1765:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1765:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1766:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1767:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1767:2: rule__Domain__ConstantsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Domain__ConstantsAssignment_4_1_1_in_rule__Domain__Group_4_1__1__Impl3727);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1781:1: rule__SymbolicConstant__Group__0 : rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 ;
    public final void rule__SymbolicConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1785:1: ( rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1786:2: rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__0__Impl_in_rule__SymbolicConstant__Group__03761);
            rule__SymbolicConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__1_in_rule__SymbolicConstant__Group__03764);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1793:1: rule__SymbolicConstant__Group__0__Impl : ( () ) ;
    public final void rule__SymbolicConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1797:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1798:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1798:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1799:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1800:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1802:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1812:1: rule__SymbolicConstant__Group__1 : rule__SymbolicConstant__Group__1__Impl ;
    public final void rule__SymbolicConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1816:1: ( rule__SymbolicConstant__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1817:2: rule__SymbolicConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__1__Impl_in_rule__SymbolicConstant__Group__13822);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1823:1: rule__SymbolicConstant__Group__1__Impl : ( ( rule__SymbolicConstant__NameAssignment_1 ) ) ;
    public final void rule__SymbolicConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1827:1: ( ( ( rule__SymbolicConstant__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1828:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1828:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1829:1: ( rule__SymbolicConstant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1830:1: ( rule__SymbolicConstant__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1830:2: rule__SymbolicConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__NameAssignment_1_in_rule__SymbolicConstant__Group__1__Impl3849);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1844:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1848:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1849:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__03883);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__03886);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1856:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1860:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1861:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1861:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1862:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNodeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1863:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1865:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1875:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1879:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1880:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__13944);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__13947);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1887:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1891:1: ( ( 'class' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1892:1: ( 'class' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1892:1: ( 'class' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1893:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Class__Group__1__Impl3975); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1906:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1910:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1911:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24006);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24009);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1918:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1922:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1923:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1923:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1924:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1925:1: ( rule__Class__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1925:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4036);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1935:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1939:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1940:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34066);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34069);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1947:1: rule__Class__Group__3__Impl : ( ( rule__Class__DeclarationsAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1951:1: ( ( ( rule__Class__DeclarationsAssignment_3 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1952:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1952:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1953:1: ( rule__Class__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1954:1: ( rule__Class__DeclarationsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=27 && LA15_0<=28)||(LA15_0>=41 && LA15_0<=43)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1954:2: rule__Class__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl4096);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1964:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1968:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1969:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__44127);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__44130);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1976:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1980:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1981:1: ( ( rule__Class__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1981:1: ( ( rule__Class__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1982:1: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1983:1: ( rule__Class__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1983:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl4157);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1993:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1997:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1998:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__54188);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__54191);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2005:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2009:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2010:1: ( ( rule__Class__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2010:1: ( ( rule__Class__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2011:1: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2012:1: ( rule__Class__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2012:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl4218);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2022:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2026:1: ( rule__Class__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2027:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__64249);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2033:1: rule__Class__Group__6__Impl : ( 'end' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2037:1: ( ( 'end' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2038:1: ( 'end' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2038:1: ( 'end' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2039:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }
            match(input,34,FOLLOW_34_in_rule__Class__Group__6__Impl4277); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2066:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2070:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2071:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__04322);
            rule__Class__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__04325);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2078:1: rule__Class__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2082:1: ( ( 'transition' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2083:1: ( 'transition' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2083:1: ( 'transition' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2084:1: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Class__Group_4__0__Impl4353); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2097:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2101:1: ( rule__Class__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2102:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__14384);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2108:1: rule__Class__Group_4__1__Impl : ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2112:1: ( ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2113:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2113:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2114:1: ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2114:1: ( ( rule__Class__TransitionsAssignment_4_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2115:1: ( rule__Class__TransitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2116:1: ( rule__Class__TransitionsAssignment_4_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2116:2: rule__Class__TransitionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4413);
            rule__Class__TransitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2119:1: ( ( rule__Class__TransitionsAssignment_4_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2120:1: ( rule__Class__TransitionsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2121:1: ( rule__Class__TransitionsAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2121:2: rule__Class__TransitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4425);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2136:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2140:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2141:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__04462);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__04465);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2148:1: rule__Class__Group_5__0__Impl : ( 'assertion' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2152:1: ( ( 'assertion' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2153:1: ( 'assertion' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2153:1: ( 'assertion' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2154:1: 'assertion'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Class__Group_5__0__Impl4493); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2167:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2171:1: ( rule__Class__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2172:2: rule__Class__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__14524);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2178:1: rule__Class__Group_5__1__Impl : ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2182:1: ( ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2183:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2183:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2184:1: ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2184:1: ( ( rule__Class__AssertionsAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2185:1: ( rule__Class__AssertionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2186:1: ( rule__Class__AssertionsAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2186:2: rule__Class__AssertionsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4553);
            rule__Class__AssertionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2189:1: ( ( rule__Class__AssertionsAssignment_5_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2190:1: ( rule__Class__AssertionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2191:1: ( rule__Class__AssertionsAssignment_5_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==30||LA19_0==48||LA19_0==50||LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2191:2: rule__Class__AssertionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4565);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2206:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2210:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2211:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04602);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04605);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2218:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2222:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2223:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2223:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2224:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2225:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2227:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2237:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2241:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2242:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14663);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14666);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2249:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2253:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2254:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2254:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2255:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2256:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2256:2: rule__VariableDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4693);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2266:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2270:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2271:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24723);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24726);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2278:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2282:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2284:1: ( rule__VariableDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2285:1: ( rule__VariableDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2285:2: rule__VariableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl4753);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2295:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2299:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2300:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34783);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__34786);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2307:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2311:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2312:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2312:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2313:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2314:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2314:2: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl4813);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2324:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2328:1: ( rule__VariableDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2329:2: rule__VariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__44844);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2335:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2339:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2340:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2340:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2341:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__VariableDeclaration__Group__4__Impl4872); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2364:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2368:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2369:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__04913);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__04916);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2376:1: rule__VariableDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2380:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2381:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2381:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2382:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl4944); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2395:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2399:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2400:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__14975);
            rule__VariableDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__14978);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2407:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2411:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2412:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2412:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2413:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2414:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2414:2: rule__VariableDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5005);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2424:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2428:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2429:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25035);
            rule__VariableDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25038);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2436:1: rule__VariableDeclaration__Group_3__2__Impl : ( ( rule__VariableDeclaration__Group_3_2__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2440:1: ( ( ( rule__VariableDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2441:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2441:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2442:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2443:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2443:2: rule__VariableDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5065);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2453:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2457:1: ( rule__VariableDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2458:2: rule__VariableDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__35096);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2464:1: rule__VariableDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2468:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2469:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2469:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2470:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__VariableDeclaration__Group_3__3__Impl5124); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2491:1: rule__VariableDeclaration__Group_3_2__0 : rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 ;
    public final void rule__VariableDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2495:1: ( rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2496:2: rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__05163);
            rule__VariableDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__05166);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2503:1: rule__VariableDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2507:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2508:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2508:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2509:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__VariableDeclaration__Group_3_2__0__Impl5194); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2522:1: rule__VariableDeclaration__Group_3_2__1 : rule__VariableDeclaration__Group_3_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2526:1: ( rule__VariableDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2527:2: rule__VariableDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__15225);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2533:1: rule__VariableDeclaration__Group_3_2__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2537:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2538:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2538:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2539:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2540:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2540:2: rule__VariableDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl5252);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2554:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2558:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2559:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05286);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05289);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2566:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2570:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2571:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2571:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2572:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2573:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2575:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2585:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2589:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2590:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15347);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15350);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2597:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2601:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2602:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2602:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2603:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2604:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2604:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5377);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2614:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2618:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2619:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25407);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25410);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2626:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2630:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2631:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2631:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2632:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__Attribute__Group__2__Impl5438); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2645:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2649:1: ( rule__Attribute__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2650:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35469);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2656:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2660:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2661:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2661:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2662:1: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2663:1: ( rule__Attribute__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2663:2: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl5496);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2681:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2685:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2686:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__05534);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__05537);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2693:1: rule__EventDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2697:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2698:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2698:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2699:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2700:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2702:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2712:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2716:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2717:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__15595);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__15598);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2724:1: rule__EventDeclaration__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2728:1: ( ( 'event' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2729:1: ( 'event' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2729:1: ( 'event' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2730:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__EventDeclaration__Group__1__Impl5626); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2743:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2747:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2748:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__25657);
            rule__EventDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__25660);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2755:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2759:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2760:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2760:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2761:1: ( rule__EventDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2762:1: ( rule__EventDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2762:2: rule__EventDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl5687);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2772:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2776:1: ( rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2777:2: rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__35717);
            rule__EventDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__4_in_rule__EventDeclaration__Group__35720);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2784:1: rule__EventDeclaration__Group__3__Impl : ( ( rule__EventDeclaration__Group_3__0 )? ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2788:1: ( ( ( rule__EventDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2789:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2789:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2790:1: ( rule__EventDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2791:1: ( rule__EventDeclaration__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2791:2: rule__EventDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl5747);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2801:1: rule__EventDeclaration__Group__4 : rule__EventDeclaration__Group__4__Impl ;
    public final void rule__EventDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2805:1: ( rule__EventDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2806:2: rule__EventDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__4__Impl_in_rule__EventDeclaration__Group__45778);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2812:1: rule__EventDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__EventDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2816:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2817:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2817:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2818:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__EventDeclaration__Group__4__Impl5806); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2841:1: rule__EventDeclaration__Group_3__0 : rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 ;
    public final void rule__EventDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2845:1: ( rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2846:2: rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__05847);
            rule__EventDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__05850);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2853:1: rule__EventDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2857:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2858:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2858:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2859:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EventDeclaration__Group_3__0__Impl5878); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2872:1: rule__EventDeclaration__Group_3__1 : rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 ;
    public final void rule__EventDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2876:1: ( rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2877:2: rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__15909);
            rule__EventDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__15912);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2884:1: rule__EventDeclaration__Group_3__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__EventDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2888:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2889:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2889:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2890:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2891:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2891:2: rule__EventDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl5939);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2901:1: rule__EventDeclaration__Group_3__2 : rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 ;
    public final void rule__EventDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2905:1: ( rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2906:2: rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__25969);
            rule__EventDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__25972);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2913:1: rule__EventDeclaration__Group_3__2__Impl : ( ( rule__EventDeclaration__Group_3_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2917:1: ( ( ( rule__EventDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2918:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2918:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2919:1: ( rule__EventDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2920:1: ( rule__EventDeclaration__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2920:2: rule__EventDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl5999);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2930:1: rule__EventDeclaration__Group_3__3 : rule__EventDeclaration__Group_3__3__Impl ;
    public final void rule__EventDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2934:1: ( rule__EventDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2935:2: rule__EventDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36030);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2941:1: rule__EventDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2945:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2946:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2946:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2947:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__EventDeclaration__Group_3__3__Impl6058); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2968:1: rule__EventDeclaration__Group_3_2__0 : rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 ;
    public final void rule__EventDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2972:1: ( rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2973:2: rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__06097);
            rule__EventDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__06100);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2980:1: rule__EventDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2984:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2985:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2985:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2986:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__EventDeclaration__Group_3_2__0__Impl6128); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2999:1: rule__EventDeclaration__Group_3_2__1 : rule__EventDeclaration__Group_3_2__1__Impl ;
    public final void rule__EventDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3003:1: ( rule__EventDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3004:2: rule__EventDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__16159);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3010:1: rule__EventDeclaration__Group_3_2__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3014:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3015:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3015:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3016:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3017:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3017:2: rule__EventDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl6186);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3031:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3035:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3036:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06220);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06223);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3043:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3047:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3048:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3048:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3049:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3050:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3052:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3062:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3066:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3067:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16281);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__16284);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3074:1: rule__ParameterDeclaration__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3078:1: ( ( 'parameter' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3079:1: ( 'parameter' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3079:1: ( 'parameter' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3080:1: 'parameter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ParameterDeclaration__Group__1__Impl6312); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3093:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3097:1: ( rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3098:2: rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__26343);
            rule__ParameterDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__26346);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3105:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3109:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3110:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3110:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3111:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3112:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3112:2: rule__ParameterDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl6373);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3122:1: rule__ParameterDeclaration__Group__3 : rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 ;
    public final void rule__ParameterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3126:1: ( rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3127:2: rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__36403);
            rule__ParameterDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__36406);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3134:1: rule__ParameterDeclaration__Group__3__Impl : ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ParameterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3138:1: ( ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3139:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3139:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3140:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3141:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3141:2: rule__ParameterDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl6433);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3151:1: rule__ParameterDeclaration__Group__4 : rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 ;
    public final void rule__ParameterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3155:1: ( rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3156:2: rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__46463);
            rule__ParameterDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__46466);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3163:1: rule__ParameterDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ParameterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3167:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3168:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3168:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3169:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__ParameterDeclaration__Group__4__Impl6494); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3182:1: rule__ParameterDeclaration__Group__5 : rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 ;
    public final void rule__ParameterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3186:1: ( rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3187:2: rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__56525);
            rule__ParameterDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__56528);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3194:1: rule__ParameterDeclaration__Group__5__Impl : ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ParameterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3198:1: ( ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3199:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3199:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3200:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3201:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3201:2: rule__ParameterDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl6555);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3211:1: rule__ParameterDeclaration__Group__6 : rule__ParameterDeclaration__Group__6__Impl ;
    public final void rule__ParameterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3215:1: ( rule__ParameterDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3216:2: rule__ParameterDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__66585);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3222:1: rule__ParameterDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ParameterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3226:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3227:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3227:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3228:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParameterDeclaration__Group__6__Impl6613); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3255:1: rule__ObserverDeclaration__Group__0 : rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 ;
    public final void rule__ObserverDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3259:1: ( rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3260:2: rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__06658);
            rule__ObserverDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__06661);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3267:1: rule__ObserverDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ObserverDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3271:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3272:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3272:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3273:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3274:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3276:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3286:1: rule__ObserverDeclaration__Group__1 : rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 ;
    public final void rule__ObserverDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3290:1: ( rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3291:2: rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__16719);
            rule__ObserverDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__16722);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3298:1: rule__ObserverDeclaration__Group__1__Impl : ( 'observer' ) ;
    public final void rule__ObserverDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3302:1: ( ( 'observer' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3303:1: ( 'observer' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3303:1: ( 'observer' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3304:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ObserverDeclaration__Group__1__Impl6750); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3317:1: rule__ObserverDeclaration__Group__2 : rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 ;
    public final void rule__ObserverDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3321:1: ( rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3322:2: rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__26781);
            rule__ObserverDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__26784);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3329:1: rule__ObserverDeclaration__Group__2__Impl : ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ObserverDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3333:1: ( ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3334:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3334:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3335:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3336:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3336:2: rule__ObserverDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl6811);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3346:1: rule__ObserverDeclaration__Group__3 : rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 ;
    public final void rule__ObserverDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3350:1: ( rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3351:2: rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__36841);
            rule__ObserverDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__36844);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3358:1: rule__ObserverDeclaration__Group__3__Impl : ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObserverDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3362:1: ( ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3363:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3363:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3364:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3365:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3365:2: rule__ObserverDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl6871);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3375:1: rule__ObserverDeclaration__Group__4 : rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 ;
    public final void rule__ObserverDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3379:1: ( rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3380:2: rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__46901);
            rule__ObserverDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__46904);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3387:1: rule__ObserverDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ObserverDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3391:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3392:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3392:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3393:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__ObserverDeclaration__Group__4__Impl6932); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3406:1: rule__ObserverDeclaration__Group__5 : rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 ;
    public final void rule__ObserverDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3410:1: ( rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3411:2: rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__56963);
            rule__ObserverDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__56966);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3418:1: rule__ObserverDeclaration__Group__5__Impl : ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ObserverDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3422:1: ( ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3423:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3423:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3424:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3425:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3425:2: rule__ObserverDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl6993);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3435:1: rule__ObserverDeclaration__Group__6 : rule__ObserverDeclaration__Group__6__Impl ;
    public final void rule__ObserverDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3439:1: ( rule__ObserverDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3440:2: rule__ObserverDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67023);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3446:1: rule__ObserverDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ObserverDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3450:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3451:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3451:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3452:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ObserverDeclaration__Group__6__Impl7051); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3479:1: rule__LabeledTransition__Group__0 : rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 ;
    public final void rule__LabeledTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3483:1: ( rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3484:2: rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__07096);
            rule__LabeledTransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__07099);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3491:1: rule__LabeledTransition__Group__0__Impl : ( ( rule__LabeledTransition__EventAssignment_0 ) ) ;
    public final void rule__LabeledTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3495:1: ( ( ( rule__LabeledTransition__EventAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3496:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3496:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3497:1: ( rule__LabeledTransition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3498:1: ( rule__LabeledTransition__EventAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3498:2: rule__LabeledTransition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl7126);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3508:1: rule__LabeledTransition__Group__1 : rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 ;
    public final void rule__LabeledTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3512:1: ( rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3513:2: rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__17156);
            rule__LabeledTransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__17159);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3520:1: rule__LabeledTransition__Group__1__Impl : ( ':' ) ;
    public final void rule__LabeledTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3524:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3525:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3525:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3526:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__LabeledTransition__Group__1__Impl7187); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3539:1: rule__LabeledTransition__Group__2 : rule__LabeledTransition__Group__2__Impl ;
    public final void rule__LabeledTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3543:1: ( rule__LabeledTransition__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3544:2: rule__LabeledTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__27218);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3550:1: rule__LabeledTransition__Group__2__Impl : ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) ;
    public final void rule__LabeledTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3554:1: ( ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3555:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3555:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3556:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3557:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3557:2: rule__LabeledTransition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl7245);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3573:1: rule__TransitionAnd__Group__0 : rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 ;
    public final void rule__TransitionAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3577:1: ( rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3578:2: rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__07281);
            rule__TransitionAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__07284);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3585:1: rule__TransitionAnd__Group__0__Impl : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3589:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3590:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3590:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3591:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl7311);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3602:1: rule__TransitionAnd__Group__1 : rule__TransitionAnd__Group__1__Impl ;
    public final void rule__TransitionAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3606:1: ( rule__TransitionAnd__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3607:2: rule__TransitionAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__17340);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3613:1: rule__TransitionAnd__Group__1__Impl : ( ( rule__TransitionAnd__Group_1__0 )* ) ;
    public final void rule__TransitionAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3617:1: ( ( ( rule__TransitionAnd__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3618:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3618:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3619:1: ( rule__TransitionAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3620:1: ( rule__TransitionAnd__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3620:2: rule__TransitionAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl7367);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3634:1: rule__TransitionAnd__Group_1__0 : rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 ;
    public final void rule__TransitionAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3638:1: ( rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3639:2: rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__07402);
            rule__TransitionAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__07405);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3646:1: rule__TransitionAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3650:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3651:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3651:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3652:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3653:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3655:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3665:1: rule__TransitionAnd__Group_1__1 : rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 ;
    public final void rule__TransitionAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3669:1: ( rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3670:2: rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__17463);
            rule__TransitionAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__17466);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3677:1: rule__TransitionAnd__Group_1__1__Impl : ( '&' ) ;
    public final void rule__TransitionAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3681:1: ( ( '&' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3682:1: ( '&' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3682:1: ( '&' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3683:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__TransitionAnd__Group_1__1__Impl7494); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3696:1: rule__TransitionAnd__Group_1__2 : rule__TransitionAnd__Group_1__2__Impl ;
    public final void rule__TransitionAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3700:1: ( rule__TransitionAnd__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3701:2: rule__TransitionAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__27525);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3707:1: rule__TransitionAnd__Group_1__2__Impl : ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3711:1: ( ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3712:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3712:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3713:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3714:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3714:2: rule__TransitionAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl7552);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3730:1: rule__TransitionOr__Group__0 : rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 ;
    public final void rule__TransitionOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3734:1: ( rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3735:2: rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__07588);
            rule__TransitionOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__07591);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3742:1: rule__TransitionOr__Group__0__Impl : ( ruleTransition ) ;
    public final void rule__TransitionOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3746:1: ( ( ruleTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3747:1: ( ruleTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3747:1: ( ruleTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3748:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionOr__Group__0__Impl7618);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3759:1: rule__TransitionOr__Group__1 : rule__TransitionOr__Group__1__Impl ;
    public final void rule__TransitionOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3763:1: ( rule__TransitionOr__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3764:2: rule__TransitionOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__17647);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3770:1: rule__TransitionOr__Group__1__Impl : ( ( rule__TransitionOr__Group_1__0 )* ) ;
    public final void rule__TransitionOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3774:1: ( ( ( rule__TransitionOr__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3775:1: ( ( rule__TransitionOr__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3775:1: ( ( rule__TransitionOr__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3776:1: ( rule__TransitionOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3777:1: ( rule__TransitionOr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3777:2: rule__TransitionOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl7674);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3791:1: rule__TransitionOr__Group_1__0 : rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 ;
    public final void rule__TransitionOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3795:1: ( rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3796:2: rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__07709);
            rule__TransitionOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__07712);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3803:1: rule__TransitionOr__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3807:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3808:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3808:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3809:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3810:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3812:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3822:1: rule__TransitionOr__Group_1__1 : rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 ;
    public final void rule__TransitionOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3826:1: ( rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3827:2: rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__17770);
            rule__TransitionOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__17773);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3834:1: rule__TransitionOr__Group_1__1__Impl : ( '|' ) ;
    public final void rule__TransitionOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3838:1: ( ( '|' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3839:1: ( '|' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3839:1: ( '|' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3840:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__TransitionOr__Group_1__1__Impl7801); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3853:1: rule__TransitionOr__Group_1__2 : rule__TransitionOr__Group_1__2__Impl ;
    public final void rule__TransitionOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3857:1: ( rule__TransitionOr__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3858:2: rule__TransitionOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__27832);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3864:1: rule__TransitionOr__Group_1__2__Impl : ( ( rule__TransitionOr__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3868:1: ( ( ( rule__TransitionOr__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3869:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3869:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3870:1: ( rule__TransitionOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3871:1: ( rule__TransitionOr__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3871:2: rule__TransitionOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl7859);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3887:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3891:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3892:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07895);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07898);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3899:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3903:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3904:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3904:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3905:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3906:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3908:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3918:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3922:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3923:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17956);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17959);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3930:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__GuardAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3934:1: ( ( ( rule__Transition__GuardAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3935:1: ( ( rule__Transition__GuardAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3935:1: ( ( rule__Transition__GuardAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3936:1: ( rule__Transition__GuardAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3937:1: ( rule__Transition__GuardAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3937:2: rule__Transition__GuardAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl7986);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3947:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3951:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3952:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28016);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28019);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3959:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3963:1: ( ( '->' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3964:1: ( '->' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3964:1: ( '->' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3965:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__Transition__Group__2__Impl8047); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3978:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3982:1: ( rule__Transition__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3983:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38078);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3989:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__ActionAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3993:1: ( ( ( rule__Transition__ActionAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3994:1: ( ( rule__Transition__ActionAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3994:1: ( ( rule__Transition__ActionAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3995:1: ( rule__Transition__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3996:1: ( rule__Transition__ActionAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3996:2: rule__Transition__ActionAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_3_in_rule__Transition__Group__3__Impl8105);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4014:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4018:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4019:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08143);
            rule__Skip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08146);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4026:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4030:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4031:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4031:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4032:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4033:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4035:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4045:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl rule__Skip__Group__2 ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4049:1: ( rule__Skip__Group__1__Impl rule__Skip__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4050:2: rule__Skip__Group__1__Impl rule__Skip__Group__2
            {
            pushFollow(FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18204);
            rule__Skip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18207);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4057:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4061:1: ( ( 'skip' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4062:1: ( 'skip' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4062:1: ( 'skip' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4063:1: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__Skip__Group__1__Impl8235); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4076:1: rule__Skip__Group__2 : rule__Skip__Group__2__Impl ;
    public final void rule__Skip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4080:1: ( rule__Skip__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4081:2: rule__Skip__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__28266);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4087:1: rule__Skip__Group__2__Impl : ( ';' ) ;
    public final void rule__Skip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4091:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4092:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4092:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4093:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Skip__Group__2__Impl8294); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4112:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4116:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4117:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08331);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08334);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4124:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4128:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4129:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4129:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4130:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4131:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4133:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4143:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4147:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4148:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18392);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18395);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4155:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__VariableAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4159:1: ( ( ( rule__Assignment__VariableAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4160:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4160:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4161:1: ( rule__Assignment__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4162:1: ( rule__Assignment__VariableAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4162:2: rule__Assignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl8422);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4172:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4176:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4177:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28452);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__28455);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4184:1: rule__Assignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4188:1: ( ( ':=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4189:1: ( ':=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4189:1: ( ':=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4190:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__Assignment__Group__2__Impl8483); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4203:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4207:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4208:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__38514);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__38517);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4215:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4219:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4220:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4220:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4221:1: ( rule__Assignment__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4222:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4222:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl8544);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4232:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4236:1: ( rule__Assignment__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4237:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__48574);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4243:1: rule__Assignment__Group__4__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4247:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4248:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4248:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4249:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Assignment__Group__4__Impl8602); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4272:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4276:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4277:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08643);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08646);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4284:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4288:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4289:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4289:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4290:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4291:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4293:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4303:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4307:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4308:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18704);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18707);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4315:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4319:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4320:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4320:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4321:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Block__Group__1__Impl8735); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4334:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4338:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4339:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28766);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28769);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4346:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4350:1: ( ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4351:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4351:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4352:1: ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4352:1: ( ( rule__Block__InstructionsAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4353:1: ( rule__Block__InstructionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4354:1: ( rule__Block__InstructionsAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4354:2: rule__Block__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8798);
            rule__Block__InstructionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4357:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4358:1: ( rule__Block__InstructionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4359:1: ( rule__Block__InstructionsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==30||LA26_0==48||LA26_0==50||LA26_0==53) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4359:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8810);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4370:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4374:1: ( rule__Block__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4375:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38843);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4381:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4385:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4386:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4386:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4387:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,31,FOLLOW_31_in_rule__Block__Group__3__Impl8871); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4408:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4412:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4413:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08910);
            rule__Conditional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08913);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4420:1: rule__Conditional__Group__0__Impl : ( () ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4424:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4425:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4425:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4426:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionalAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4427:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4429:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4439:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4443:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4444:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__18971);
            rule__Conditional__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__18974);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4451:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4455:1: ( ( 'if' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4456:1: ( 'if' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4456:1: ( 'if' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4457:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__Conditional__Group__1__Impl9002); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4470:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4474:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4475:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__29033);
            rule__Conditional__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__29036);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4482:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4486:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4487:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4487:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4488:1: ( rule__Conditional__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4489:1: ( rule__Conditional__ConditionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4489:2: rule__Conditional__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl9063);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4499:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4503:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4504:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39093);
            rule__Conditional__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39096);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4511:1: rule__Conditional__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4515:1: ( ( 'then' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4516:1: ( 'then' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4516:1: ( 'then' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4517:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__Conditional__Group__3__Impl9124); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4530:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4534:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4535:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49155);
            rule__Conditional__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49158);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4542:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ThenAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4546:1: ( ( ( rule__Conditional__ThenAssignment_4 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4547:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4547:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4548:1: ( rule__Conditional__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenAssignment_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4549:1: ( rule__Conditional__ThenAssignment_4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4549:2: rule__Conditional__ThenAssignment_4
            {
            pushFollow(FOLLOW_rule__Conditional__ThenAssignment_4_in_rule__Conditional__Group__4__Impl9185);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4559:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4563:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4564:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59215);
            rule__Conditional__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59218);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4571:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Group_5__0 )? ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4575:1: ( ( ( rule__Conditional__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4576:1: ( ( rule__Conditional__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4576:1: ( ( rule__Conditional__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4577:1: ( rule__Conditional__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4578:1: ( rule__Conditional__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4578:2: rule__Conditional__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Conditional__Group_5__0_in_rule__Conditional__Group__5__Impl9245);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4588:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4592:1: ( rule__Conditional__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4593:2: rule__Conditional__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69276);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4599:1: rule__Conditional__Group__6__Impl : ( ';' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4603:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4604:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4604:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4605:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__Conditional__Group__6__Impl9304); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4632:1: rule__Conditional__Group_5__0 : rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 ;
    public final void rule__Conditional__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4636:1: ( rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4637:2: rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group_5__0__Impl_in_rule__Conditional__Group_5__09349);
            rule__Conditional__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group_5__1_in_rule__Conditional__Group_5__09352);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4644:1: rule__Conditional__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Conditional__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4648:1: ( ( ( 'else' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4649:1: ( ( 'else' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4649:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4650:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseKeyword_5_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4651:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4652:2: 'else'
            {
            match(input,52,FOLLOW_52_in_rule__Conditional__Group_5__0__Impl9381); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4663:1: rule__Conditional__Group_5__1 : rule__Conditional__Group_5__1__Impl ;
    public final void rule__Conditional__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4667:1: ( rule__Conditional__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4668:2: rule__Conditional__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group_5__1__Impl_in_rule__Conditional__Group_5__19413);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4674:1: rule__Conditional__Group_5__1__Impl : ( ( rule__Conditional__ElseAssignment_5_1 ) ) ;
    public final void rule__Conditional__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4678:1: ( ( ( rule__Conditional__ElseAssignment_5_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4679:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4679:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4680:1: ( rule__Conditional__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4681:1: ( rule__Conditional__ElseAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4681:2: rule__Conditional__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Conditional__ElseAssignment_5_1_in_rule__Conditional__Group_5__1__Impl9440);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4695:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4699:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4700:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
            {
            pushFollow(FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__09474);
            rule__Switch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__09477);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4707:1: rule__Switch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4711:1: ( ( 'switch' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4712:1: ( 'switch' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4712:1: ( 'switch' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4713:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Switch__Group__0__Impl9505); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4726:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4730:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4731:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__19536);
            rule__Switch__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__19539);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4738:1: rule__Switch__Group__1__Impl : ( '{' ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4742:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4743:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4743:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4744:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Switch__Group__1__Impl9567); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4757:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4761:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4762:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__29598);
            rule__Switch__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__29601);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4769:1: rule__Switch__Group__2__Impl : ( ( rule__Switch__CasesAssignment_2 )* ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4773:1: ( ( ( rule__Switch__CasesAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4774:1: ( ( rule__Switch__CasesAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4774:1: ( ( rule__Switch__CasesAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4775:1: ( rule__Switch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4776:1: ( rule__Switch__CasesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||LA28_0==22||(LA28_0>=25 && LA28_0<=26)||LA28_0==38||LA28_0==54) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4776:2: rule__Switch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Switch__CasesAssignment_2_in_rule__Switch__Group__2__Impl9628);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4786:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4790:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4791:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__39659);
            rule__Switch__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__39662);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4798:1: rule__Switch__Group__3__Impl : ( 'else' ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4802:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4803:1: ( 'else' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4803:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4804:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseKeyword_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__Switch__Group__3__Impl9690); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4817:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl rule__Switch__Group__5 ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4821:1: ( rule__Switch__Group__4__Impl rule__Switch__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4822:2: rule__Switch__Group__4__Impl rule__Switch__Group__5
            {
            pushFollow(FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__49721);
            rule__Switch__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__49724);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4829:1: rule__Switch__Group__4__Impl : ( ':' ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4833:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4834:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4834:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4835:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getColonKeyword_4()); 
            }
            match(input,44,FOLLOW_44_in_rule__Switch__Group__4__Impl9752); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4848:1: rule__Switch__Group__5 : rule__Switch__Group__5__Impl rule__Switch__Group__6 ;
    public final void rule__Switch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4852:1: ( rule__Switch__Group__5__Impl rule__Switch__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4853:2: rule__Switch__Group__5__Impl rule__Switch__Group__6
            {
            pushFollow(FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__59783);
            rule__Switch__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__59786);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4860:1: rule__Switch__Group__5__Impl : ( ( rule__Switch__ElseAssignment_5 ) ) ;
    public final void rule__Switch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4864:1: ( ( ( rule__Switch__ElseAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4865:1: ( ( rule__Switch__ElseAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4865:1: ( ( rule__Switch__ElseAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4866:1: ( rule__Switch__ElseAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4867:1: ( rule__Switch__ElseAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4867:2: rule__Switch__ElseAssignment_5
            {
            pushFollow(FOLLOW_rule__Switch__ElseAssignment_5_in_rule__Switch__Group__5__Impl9813);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4877:1: rule__Switch__Group__6 : rule__Switch__Group__6__Impl ;
    public final void rule__Switch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4881:1: ( rule__Switch__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4882:2: rule__Switch__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__69843);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4888:1: rule__Switch__Group__6__Impl : ( '}' ) ;
    public final void rule__Switch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4892:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4893:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4893:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4894:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,31,FOLLOW_31_in_rule__Switch__Group__6__Impl9871); if (state.failed) return ;
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


    // $ANTLR start "rule__CaseExpression__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4921:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4925:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4926:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__09916);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__09919);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4933:1: rule__CaseExpression__Group__0__Impl : ( ( rule__CaseExpression__ConditionAssignment_0 ) ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4937:1: ( ( ( rule__CaseExpression__ConditionAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4938:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4938:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4939:1: ( rule__CaseExpression__ConditionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4940:1: ( rule__CaseExpression__ConditionAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4940:2: rule__CaseExpression__ConditionAssignment_0
            {
            pushFollow(FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl9946);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4950:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4954:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4955:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__19976);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__19979);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4962:1: rule__CaseExpression__Group__1__Impl : ( ':' ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4966:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4967:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4967:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4968:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getColonKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__CaseExpression__Group__1__Impl10007); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4981:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4985:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4986:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__210038);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__210041);
            rule__CaseExpression__Group__3();

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4993:1: rule__CaseExpression__Group__2__Impl : ( ( rule__CaseExpression__ThenAssignment_2 ) ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4997:1: ( ( ( rule__CaseExpression__ThenAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4998:1: ( ( rule__CaseExpression__ThenAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4998:1: ( ( rule__CaseExpression__ThenAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4999:1: ( rule__CaseExpression__ThenAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getThenAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5000:1: ( rule__CaseExpression__ThenAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5000:2: rule__CaseExpression__ThenAssignment_2
            {
            pushFollow(FOLLOW_rule__CaseExpression__ThenAssignment_2_in_rule__CaseExpression__Group__2__Impl10068);
            rule__CaseExpression__ThenAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getThenAssignment_2()); 
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


    // $ANTLR start "rule__CaseExpression__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5010:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5014:1: ( rule__CaseExpression__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5015:2: rule__CaseExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__310098);
            rule__CaseExpression__Group__3__Impl();

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
    // $ANTLR end "rule__CaseExpression__Group__3"


    // $ANTLR start "rule__CaseExpression__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5021:1: rule__CaseExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5025:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5026:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5026:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5027:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCommaKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__CaseExpression__Group__3__Impl10126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCommaKeyword_3()); 
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
    // $ANTLR end "rule__CaseExpression__Group__3__Impl"


    // $ANTLR start "rule__LogicalOr__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5048:1: rule__LogicalOr__Group__0 : rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 ;
    public final void rule__LogicalOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5052:1: ( rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5053:2: rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group__0__Impl_in_rule__LogicalOr__Group__010165);
            rule__LogicalOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalOr__Group__1_in_rule__LogicalOr__Group__010168);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5060:1: rule__LogicalOr__Group__0__Impl : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5064:1: ( ( ruleLogicalAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5065:1: ( ruleLogicalAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5065:1: ( ruleLogicalAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5066:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__Group__0__Impl10195);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5077:1: rule__LogicalOr__Group__1 : rule__LogicalOr__Group__1__Impl ;
    public final void rule__LogicalOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5081:1: ( rule__LogicalOr__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5082:2: rule__LogicalOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group__1__Impl_in_rule__LogicalOr__Group__110224);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5088:1: rule__LogicalOr__Group__1__Impl : ( ( rule__LogicalOr__Group_1__0 )* ) ;
    public final void rule__LogicalOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5092:1: ( ( ( rule__LogicalOr__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5093:1: ( ( rule__LogicalOr__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5093:1: ( ( rule__LogicalOr__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5094:1: ( rule__LogicalOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5095:1: ( rule__LogicalOr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5095:2: rule__LogicalOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LogicalOr__Group_1__0_in_rule__LogicalOr__Group__1__Impl10251);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5109:1: rule__LogicalOr__Group_1__0 : rule__LogicalOr__Group_1__0__Impl ;
    public final void rule__LogicalOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5113:1: ( rule__LogicalOr__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5114:2: rule__LogicalOr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1__0__Impl_in_rule__LogicalOr__Group_1__010286);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5120:1: rule__LogicalOr__Group_1__0__Impl : ( ( rule__LogicalOr__Group_1_0__0 ) ) ;
    public final void rule__LogicalOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5124:1: ( ( ( rule__LogicalOr__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5125:1: ( ( rule__LogicalOr__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5125:1: ( ( rule__LogicalOr__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5126:1: ( rule__LogicalOr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5127:1: ( rule__LogicalOr__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5127:2: rule__LogicalOr__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__0_in_rule__LogicalOr__Group_1__0__Impl10313);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5139:1: rule__LogicalOr__Group_1_0__0 : rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1 ;
    public final void rule__LogicalOr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5143:1: ( rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5144:2: rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__0__Impl_in_rule__LogicalOr__Group_1_0__010345);
            rule__LogicalOr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__1_in_rule__LogicalOr__Group_1_0__010348);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5151:1: rule__LogicalOr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalOr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5155:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5156:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5156:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5157:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5158:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5160:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5170:1: rule__LogicalOr__Group_1_0__1 : rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2 ;
    public final void rule__LogicalOr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5174:1: ( rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5175:2: rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__1__Impl_in_rule__LogicalOr__Group_1_0__110406);
            rule__LogicalOr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__2_in_rule__LogicalOr__Group_1_0__110409);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5182:1: rule__LogicalOr__Group_1_0__1__Impl : ( ( rule__LogicalOr__OpAssignment_1_0_1 ) ) ;
    public final void rule__LogicalOr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5186:1: ( ( ( rule__LogicalOr__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5187:1: ( ( rule__LogicalOr__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5187:1: ( ( rule__LogicalOr__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5188:1: ( rule__LogicalOr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5189:1: ( rule__LogicalOr__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5189:2: rule__LogicalOr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__LogicalOr__OpAssignment_1_0_1_in_rule__LogicalOr__Group_1_0__1__Impl10436);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5199:1: rule__LogicalOr__Group_1_0__2 : rule__LogicalOr__Group_1_0__2__Impl ;
    public final void rule__LogicalOr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5203:1: ( rule__LogicalOr__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5204:2: rule__LogicalOr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicalOr__Group_1_0__2__Impl_in_rule__LogicalOr__Group_1_0__210466);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5210:1: rule__LogicalOr__Group_1_0__2__Impl : ( ( rule__LogicalOr__RightAssignment_1_0_2 ) ) ;
    public final void rule__LogicalOr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5214:1: ( ( ( rule__LogicalOr__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5215:1: ( ( rule__LogicalOr__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5215:1: ( ( rule__LogicalOr__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5216:1: ( rule__LogicalOr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5217:1: ( rule__LogicalOr__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5217:2: rule__LogicalOr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__LogicalOr__RightAssignment_1_0_2_in_rule__LogicalOr__Group_1_0__2__Impl10493);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5233:1: rule__LogicalAnd__Group__0 : rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 ;
    public final void rule__LogicalAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5237:1: ( rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5238:2: rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group__0__Impl_in_rule__LogicalAnd__Group__010529);
            rule__LogicalAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalAnd__Group__1_in_rule__LogicalAnd__Group__010532);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5245:1: rule__LogicalAnd__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__LogicalAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5249:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5250:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5250:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5251:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__LogicalAnd__Group__0__Impl10559);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5262:1: rule__LogicalAnd__Group__1 : rule__LogicalAnd__Group__1__Impl ;
    public final void rule__LogicalAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5266:1: ( rule__LogicalAnd__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5267:2: rule__LogicalAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group__1__Impl_in_rule__LogicalAnd__Group__110588);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5273:1: rule__LogicalAnd__Group__1__Impl : ( ( rule__LogicalAnd__Group_1__0 )* ) ;
    public final void rule__LogicalAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5277:1: ( ( ( rule__LogicalAnd__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5278:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5278:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5279:1: ( rule__LogicalAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5280:1: ( rule__LogicalAnd__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==57) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5280:2: rule__LogicalAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LogicalAnd__Group_1__0_in_rule__LogicalAnd__Group__1__Impl10615);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5294:1: rule__LogicalAnd__Group_1__0 : rule__LogicalAnd__Group_1__0__Impl ;
    public final void rule__LogicalAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5298:1: ( rule__LogicalAnd__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5299:2: rule__LogicalAnd__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1__0__Impl_in_rule__LogicalAnd__Group_1__010650);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5305:1: rule__LogicalAnd__Group_1__0__Impl : ( ( rule__LogicalAnd__Group_1_0__0 ) ) ;
    public final void rule__LogicalAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5309:1: ( ( ( rule__LogicalAnd__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5310:1: ( ( rule__LogicalAnd__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5310:1: ( ( rule__LogicalAnd__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5311:1: ( rule__LogicalAnd__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5312:1: ( rule__LogicalAnd__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5312:2: rule__LogicalAnd__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__0_in_rule__LogicalAnd__Group_1__0__Impl10677);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5324:1: rule__LogicalAnd__Group_1_0__0 : rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1 ;
    public final void rule__LogicalAnd__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5328:1: ( rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5329:2: rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__0__Impl_in_rule__LogicalAnd__Group_1_0__010709);
            rule__LogicalAnd__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__1_in_rule__LogicalAnd__Group_1_0__010712);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5336:1: rule__LogicalAnd__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalAnd__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5340:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5341:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5341:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5342:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5343:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5345:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5355:1: rule__LogicalAnd__Group_1_0__1 : rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2 ;
    public final void rule__LogicalAnd__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5359:1: ( rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5360:2: rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__1__Impl_in_rule__LogicalAnd__Group_1_0__110770);
            rule__LogicalAnd__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__2_in_rule__LogicalAnd__Group_1_0__110773);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5367:1: rule__LogicalAnd__Group_1_0__1__Impl : ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) ) ;
    public final void rule__LogicalAnd__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5371:1: ( ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5372:1: ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5372:1: ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5373:1: ( rule__LogicalAnd__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5374:1: ( rule__LogicalAnd__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5374:2: rule__LogicalAnd__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__LogicalAnd__OpAssignment_1_0_1_in_rule__LogicalAnd__Group_1_0__1__Impl10800);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5384:1: rule__LogicalAnd__Group_1_0__2 : rule__LogicalAnd__Group_1_0__2__Impl ;
    public final void rule__LogicalAnd__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5388:1: ( rule__LogicalAnd__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5389:2: rule__LogicalAnd__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicalAnd__Group_1_0__2__Impl_in_rule__LogicalAnd__Group_1_0__210830);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5395:1: rule__LogicalAnd__Group_1_0__2__Impl : ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) ) ;
    public final void rule__LogicalAnd__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5399:1: ( ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5400:1: ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5400:1: ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5401:1: ( rule__LogicalAnd__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5402:1: ( rule__LogicalAnd__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5402:2: rule__LogicalAnd__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__LogicalAnd__RightAssignment_1_0_2_in_rule__LogicalAnd__Group_1_0__2__Impl10857);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5418:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5422:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5423:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010893);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010896);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5430:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5434:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5435:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5435:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5436:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10923);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5447:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5451:1: ( rule__Relation__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5452:2: rule__Relation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110952);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5458:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )* ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5462:1: ( ( ( rule__Relation__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5463:1: ( ( rule__Relation__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5463:1: ( ( rule__Relation__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5464:1: ( rule__Relation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5465:1: ( rule__Relation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=15 && LA31_0<=20)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5465:2: rule__Relation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10979);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5479:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5483:1: ( rule__Relation__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5484:2: rule__Relation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__011014);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5490:1: rule__Relation__Group_1__0__Impl : ( ( rule__Relation__Group_1_0__0 ) ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5494:1: ( ( ( rule__Relation__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5495:1: ( ( rule__Relation__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5495:1: ( ( rule__Relation__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5496:1: ( rule__Relation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5497:1: ( rule__Relation__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5497:2: rule__Relation__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl11041);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5509:1: rule__Relation__Group_1_0__0 : rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 ;
    public final void rule__Relation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5513:1: ( rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5514:2: rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__011073);
            rule__Relation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__011076);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5521:1: rule__Relation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5525:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5526:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5526:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5527:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5528:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5530:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5540:1: rule__Relation__Group_1_0__1 : rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 ;
    public final void rule__Relation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5544:1: ( rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5545:2: rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__111134);
            rule__Relation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__111137);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5552:1: rule__Relation__Group_1_0__1__Impl : ( ( rule__Relation__OpAssignment_1_0_1 ) ) ;
    public final void rule__Relation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5556:1: ( ( ( rule__Relation__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5558:1: ( rule__Relation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5559:1: ( rule__Relation__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5559:2: rule__Relation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl11164);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5569:1: rule__Relation__Group_1_0__2 : rule__Relation__Group_1_0__2__Impl ;
    public final void rule__Relation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5573:1: ( rule__Relation__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5574:2: rule__Relation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__211194);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5580:1: rule__Relation__Group_1_0__2__Impl : ( ( rule__Relation__RightAssignment_1_0_2 ) ) ;
    public final void rule__Relation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5584:1: ( ( ( rule__Relation__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5585:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5585:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5586:1: ( rule__Relation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5587:1: ( rule__Relation__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5587:2: rule__Relation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl11221);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5603:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5607:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5608:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__011257);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__011260);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5615:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5619:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5620:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5620:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5621:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl11287);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5632:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5636:1: ( rule__Addition__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5637:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__111316);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5643:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5647:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5648:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5648:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5649:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5650:1: ( rule__Addition__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=21 && LA32_0<=22)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5650:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl11343);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5664:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5668:1: ( rule__Addition__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5669:2: rule__Addition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011378);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5675:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5679:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5680:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5680:1: ( ( rule__Addition__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5681:1: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5682:1: ( rule__Addition__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5682:2: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11405);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5694:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5698:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5699:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011437);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011440);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5706:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5710:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5711:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5711:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5712:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5713:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5715:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5725:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5729:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5730:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111498);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111501);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5737:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OpAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5741:1: ( ( ( rule__Addition__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5742:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5742:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5743:1: ( rule__Addition__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5744:1: ( rule__Addition__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5744:2: rule__Addition__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11528);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5754:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5758:1: ( rule__Addition__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5759:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211558);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5765:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5769:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5770:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5770:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5771:1: ( rule__Addition__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5772:1: ( rule__Addition__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5772:2: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11585);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5788:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5792:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5793:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011621);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011624);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5800:1: rule__Multiplication__Group__0__Impl : ( ruleNeg ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5804:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5805:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5805:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5806:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11651);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5817:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5821:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5822:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111680);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5828:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5832:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5833:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5833:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5834:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5835:1: ( rule__Multiplication__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=23 && LA33_0<=24)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5835:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11707);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5849:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5853:1: ( rule__Multiplication__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5854:2: rule__Multiplication__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011742);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5860:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5864:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5865:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5865:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5866:1: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5867:1: ( rule__Multiplication__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5867:2: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11769);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5879:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5883:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5884:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011801);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011804);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5891:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5895:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5896:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5896:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5897:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5898:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5900:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5910:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5914:1: ( rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5915:2: rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111862);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111865);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5922:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5926:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5927:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5927:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5928:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5929:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5929:2: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11892);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5939:1: rule__Multiplication__Group_1_0__2 : rule__Multiplication__Group_1_0__2__Impl ;
    public final void rule__Multiplication__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5943:1: ( rule__Multiplication__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5944:2: rule__Multiplication__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211922);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5950:1: rule__Multiplication__Group_1_0__2__Impl : ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) ;
    public final void rule__Multiplication__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5954:1: ( ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5955:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5955:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5956:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5957:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5957:2: rule__Multiplication__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11949);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5973:1: rule__Neg__Group_0__0 : rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 ;
    public final void rule__Neg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5977:1: ( rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5978:2: rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011985);
            rule__Neg__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011988);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5985:1: rule__Neg__Group_0__0__Impl : ( () ) ;
    public final void rule__Neg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5989:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5990:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5990:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5991:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5992:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5994:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6004:1: rule__Neg__Group_0__1 : rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 ;
    public final void rule__Neg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6008:1: ( rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6009:2: rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__112046);
            rule__Neg__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__112049);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6016:1: rule__Neg__Group_0__1__Impl : ( ( 'not' ) ) ;
    public final void rule__Neg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6020:1: ( ( ( 'not' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6021:1: ( ( 'not' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6021:1: ( ( 'not' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6022:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6023:1: ( 'not' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6024:2: 'not'
            {
            match(input,54,FOLLOW_54_in_rule__Neg__Group_0__1__Impl12078); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6035:1: rule__Neg__Group_0__2 : rule__Neg__Group_0__2__Impl ;
    public final void rule__Neg__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6039:1: ( rule__Neg__Group_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6040:2: rule__Neg__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__212110);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6046:1: rule__Neg__Group_0__2__Impl : ( ( rule__Neg__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Neg__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6050:1: ( ( ( rule__Neg__ExpressionAssignment_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6051:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6051:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6052:1: ( rule__Neg__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6053:1: ( rule__Neg__ExpressionAssignment_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6053:2: rule__Neg__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl12137);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6069:1: rule__Neg__Group_1__0 : rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 ;
    public final void rule__Neg__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6073:1: ( rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6074:2: rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__012173);
            rule__Neg__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__012176);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6081:1: rule__Neg__Group_1__0__Impl : ( () ) ;
    public final void rule__Neg__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6085:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6086:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6086:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6087:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6088:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6090:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6100:1: rule__Neg__Group_1__1 : rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 ;
    public final void rule__Neg__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6104:1: ( rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6105:2: rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__112234);
            rule__Neg__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__112237);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6112:1: rule__Neg__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Neg__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6116:1: ( ( ( '-' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6117:1: ( ( '-' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6117:1: ( ( '-' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6118:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6119:1: ( '-' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6120:2: '-'
            {
            match(input,22,FOLLOW_22_in_rule__Neg__Group_1__1__Impl12266); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6131:1: rule__Neg__Group_1__2 : rule__Neg__Group_1__2__Impl ;
    public final void rule__Neg__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6135:1: ( rule__Neg__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6136:2: rule__Neg__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__212298);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6142:1: rule__Neg__Group_1__2__Impl : ( ( rule__Neg__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Neg__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6146:1: ( ( ( rule__Neg__ExpressionAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6147:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6147:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6148:1: ( rule__Neg__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6149:1: ( rule__Neg__ExpressionAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6149:2: rule__Neg__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl12325);
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


    // $ANTLR start "rule__Atom__Group_4__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6165:1: rule__Atom__Group_4__0 : rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 ;
    public final void rule__Atom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6169:1: ( rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6170:2: rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__012361);
            rule__Atom__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__012364);
            rule__Atom__Group_4__1();

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
    // $ANTLR end "rule__Atom__Group_4__0"


    // $ANTLR start "rule__Atom__Group_4__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6177:1: rule__Atom__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6181:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6182:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6182:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6183:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Atom__Group_4__0__Impl12392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0()); 
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
    // $ANTLR end "rule__Atom__Group_4__0__Impl"


    // $ANTLR start "rule__Atom__Group_4__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6196:1: rule__Atom__Group_4__1 : rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2 ;
    public final void rule__Atom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6200:1: ( rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6201:2: rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__112423);
            rule__Atom__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__2_in_rule__Atom__Group_4__112426);
            rule__Atom__Group_4__2();

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
    // $ANTLR end "rule__Atom__Group_4__1"


    // $ANTLR start "rule__Atom__Group_4__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6208:1: rule__Atom__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__Atom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6212:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6213:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6213:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6214:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Atom__Group_4__1__Impl12453);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1()); 
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
    // $ANTLR end "rule__Atom__Group_4__1__Impl"


    // $ANTLR start "rule__Atom__Group_4__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6225:1: rule__Atom__Group_4__2 : rule__Atom__Group_4__2__Impl ;
    public final void rule__Atom__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6229:1: ( rule__Atom__Group_4__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6230:2: rule__Atom__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__2__Impl_in_rule__Atom__Group_4__212482);
            rule__Atom__Group_4__2__Impl();

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
    // $ANTLR end "rule__Atom__Group_4__2"


    // $ANTLR start "rule__Atom__Group_4__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6236:1: rule__Atom__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6240:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6241:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6241:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6242:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__Atom__Group_4__2__Impl12510); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2()); 
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
    // $ANTLR end "rule__Atom__Group_4__2__Impl"


    // $ANTLR start "rule__NameRef__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6261:1: rule__NameRef__Group__0 : rule__NameRef__Group__0__Impl rule__NameRef__Group__1 ;
    public final void rule__NameRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6265:1: ( rule__NameRef__Group__0__Impl rule__NameRef__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6266:2: rule__NameRef__Group__0__Impl rule__NameRef__Group__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012547);
            rule__NameRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012550);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6273:1: rule__NameRef__Group__0__Impl : ( ( rule__NameRef__VariableAssignment_0 ) ) ;
    public final void rule__NameRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6277:1: ( ( ( rule__NameRef__VariableAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6278:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6278:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6279:1: ( rule__NameRef__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6280:1: ( rule__NameRef__VariableAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6280:2: rule__NameRef__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12577);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6290:1: rule__NameRef__Group__1 : rule__NameRef__Group__1__Impl ;
    public final void rule__NameRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6294:1: ( rule__NameRef__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6295:2: rule__NameRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112607);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6301:1: rule__NameRef__Group__1__Impl : ( ( rule__NameRef__Group_1__0 )* ) ;
    public final void rule__NameRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6305:1: ( ( ( rule__NameRef__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6306:1: ( ( rule__NameRef__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6306:1: ( ( rule__NameRef__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6307:1: ( rule__NameRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6308:1: ( rule__NameRef__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==55) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6308:2: rule__NameRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12634);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6322:1: rule__NameRef__Group_1__0 : rule__NameRef__Group_1__0__Impl ;
    public final void rule__NameRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6326:1: ( rule__NameRef__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6327:2: rule__NameRef__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012669);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6333:1: rule__NameRef__Group_1__0__Impl : ( ( rule__NameRef__Group_1_0__0 ) ) ;
    public final void rule__NameRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6337:1: ( ( ( rule__NameRef__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6338:1: ( ( rule__NameRef__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6338:1: ( ( rule__NameRef__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6339:1: ( rule__NameRef__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6340:1: ( rule__NameRef__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6340:2: rule__NameRef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12696);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6352:1: rule__NameRef__Group_1_0__0 : rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 ;
    public final void rule__NameRef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6356:1: ( rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6357:2: rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012728);
            rule__NameRef__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012731);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6364:1: rule__NameRef__Group_1_0__0__Impl : ( () ) ;
    public final void rule__NameRef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6368:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6369:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6369:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6370:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6371:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6373:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6383:1: rule__NameRef__Group_1_0__1 : rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 ;
    public final void rule__NameRef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6387:1: ( rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6388:2: rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112789);
            rule__NameRef__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112792);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6395:1: rule__NameRef__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__NameRef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6399:1: ( ( '.' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6400:1: ( '.' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6400:1: ( '.' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6401:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,55,FOLLOW_55_in_rule__NameRef__Group_1_0__1__Impl12820); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6414:1: rule__NameRef__Group_1_0__2 : rule__NameRef__Group_1_0__2__Impl ;
    public final void rule__NameRef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6418:1: ( rule__NameRef__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6419:2: rule__NameRef__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212851);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6425:1: rule__NameRef__Group_1_0__2__Impl : ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) ;
    public final void rule__NameRef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6429:1: ( ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6430:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6430:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6431:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6432:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6432:2: rule__NameRef__VariableAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12878);
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


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6449:1: rule__Model__DeclarationsAssignment : ( ruleAbstractDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6453:1: ( ( ruleAbstractDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6454:1: ( ruleAbstractDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6454:1: ( ruleAbstractDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6455:1: ruleAbstractDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment12919);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6464:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6468:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6469:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6469:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6470:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_212950); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6479:1: rule__Domain__ConstantsAssignment_4_0 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6483:1: ( ( ruleSymbolicConstant ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6484:1: ( ruleSymbolicConstant )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6484:1: ( ruleSymbolicConstant )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6485:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_012981);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6494:1: rule__Domain__ConstantsAssignment_4_1_1 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6498:1: ( ( ruleSymbolicConstant ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6499:1: ( ruleSymbolicConstant )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6499:1: ( ruleSymbolicConstant )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6500:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_1_113012);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6509:1: rule__SymbolicConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolicConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6513:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6514:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6514:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6515:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolicConstant__NameAssignment_113043); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6524:1: rule__BaseType__NameAssignment : ( ruleBaseTypeEnum ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6528:1: ( ( ruleBaseTypeEnum ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6529:1: ( ruleBaseTypeEnum )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6529:1: ( ruleBaseTypeEnum )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6530:1: ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment13074);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6539:1: rule__NamedType__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NamedType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6543:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6544:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6544:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6545:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6546:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6547:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedType__RefAssignment13109); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6558:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6562:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6563:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6563:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6564:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_213144); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6573:1: rule__Class__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Class__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6577:1: ( ( ruleDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6578:1: ( ruleDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6578:1: ( ruleDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6579:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_313175);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6588:1: rule__Class__TransitionsAssignment_4_1 : ( ruleLabeledTransition ) ;
    public final void rule__Class__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6592:1: ( ( ruleLabeledTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6593:1: ( ruleLabeledTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6593:1: ( ruleLabeledTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6594:1: ruleLabeledTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_113206);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6603:1: rule__Class__AssertionsAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Class__AssertionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6607:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6608:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6608:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6609:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_113237);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6618:1: rule__VariableDeclaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6622:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6623:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6623:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6624:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_113268);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6633:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6637:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6638:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6638:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6639:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_213299); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6648:1: rule__VariableDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6652:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6653:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6653:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6654:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_113330);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6663:1: rule__VariableDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6667:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6668:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6668:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6669:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_113361);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6678:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6682:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6683:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6683:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6684:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113392); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6693:1: rule__Attribute__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6697:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6698:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6698:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6699:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313423);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6708:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6712:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6713:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6713:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6714:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213454); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6723:1: rule__EventDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6727:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6728:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6728:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6729:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113485);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6738:1: rule__EventDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6742:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6743:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6743:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6744:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113516);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6753:1: rule__ParameterDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6757:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6758:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6758:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6759:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_213547);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6768:1: rule__ParameterDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6772:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6773:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6773:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6774:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_313578); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6783:1: rule__ParameterDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ParameterDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6787:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6788:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6788:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6789:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_513609);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6798:1: rule__ObserverDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ObserverDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6802:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6803:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6803:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6804:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_213640);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6813:1: rule__ObserverDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObserverDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6817:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6818:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6818:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6819:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_313671); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6828:1: rule__ObserverDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ObserverDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6832:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6833:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6833:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6834:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_513702);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6843:1: rule__LabeledTransition__EventAssignment_0 : ( ruleNameRef ) ;
    public final void rule__LabeledTransition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6847:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6848:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6848:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6849:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_013733);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6858:1: rule__LabeledTransition__ExpressionAssignment_2 : ( ruleTransitionAnd ) ;
    public final void rule__LabeledTransition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6862:1: ( ( ruleTransitionAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6863:1: ( ruleTransitionAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6863:1: ( ruleTransitionAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6864:1: ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_213764);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6873:1: rule__TransitionAnd__RightAssignment_1_2 : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6877:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6878:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6878:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6879:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_213795);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6888:1: rule__TransitionOr__RightAssignment_1_2 : ( ruleTransition ) ;
    public final void rule__TransitionOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6892:1: ( ( ruleTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6893:1: ( ruleTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6893:1: ( ruleTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6894:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionOr__RightAssignment_1_213826);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6903:1: rule__Transition__GuardAssignment_1 : ( ruleExpression ) ;
    public final void rule__Transition__GuardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6907:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6908:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6908:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6909:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_113857);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6918:1: rule__Transition__ActionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6922:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6923:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6923:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6924:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Transition__ActionAssignment_313888);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6933:1: rule__Assignment__VariableAssignment_1 : ( ruleNameRef ) ;
    public final void rule__Assignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6937:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6938:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6938:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6939:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_113919);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6948:1: rule__Assignment__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6952:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6953:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6953:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6954:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_313950);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6963:1: rule__Block__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6967:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6968:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6968:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6969:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_213981);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6978:1: rule__Conditional__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6982:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6983:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6983:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6984:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Conditional__ConditionAssignment_214012);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6993:1: rule__Conditional__ThenAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Conditional__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6997:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6998:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6998:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6999:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Conditional__ThenAssignment_414043);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7008:1: rule__Conditional__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Conditional__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7012:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7013:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7013:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7014:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Conditional__ElseAssignment_5_114074);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7023:1: rule__Switch__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__Switch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7027:1: ( ( ruleCaseExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7028:1: ( ruleCaseExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7028:1: ( ruleCaseExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7029:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_rule__Switch__CasesAssignment_214105);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7038:1: rule__Switch__ElseAssignment_5 : ( ruleExpression ) ;
    public final void rule__Switch__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7042:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7043:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7043:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7044:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Switch__ElseAssignment_514136);
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


    // $ANTLR start "rule__CaseExpression__ConditionAssignment_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7053:1: rule__CaseExpression__ConditionAssignment_0 : ( ruleExpression ) ;
    public final void rule__CaseExpression__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7057:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7058:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7058:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7059:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__ConditionAssignment_014167);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getConditionExpressionParserRuleCall_0_0()); 
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


    // $ANTLR start "rule__CaseExpression__ThenAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7068:1: rule__CaseExpression__ThenAssignment_2 : ( ruleInstruction ) ;
    public final void rule__CaseExpression__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7072:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7073:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7073:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7074:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getThenInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__CaseExpression__ThenAssignment_214198);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getThenInstructionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__CaseExpression__ThenAssignment_2"


    // $ANTLR start "rule__LogicalOr__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7083:1: rule__LogicalOr__OpAssignment_1_0_1 : ( ( 'or' ) ) ;
    public final void rule__LogicalOr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7087:1: ( ( ( 'or' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7088:1: ( ( 'or' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7088:1: ( ( 'or' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7089:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7090:1: ( 'or' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7091:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__LogicalOr__OpAssignment_1_0_114234); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7106:1: rule__LogicalOr__RightAssignment_1_0_2 : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7110:1: ( ( ruleLogicalAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7111:1: ( ruleLogicalAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7111:1: ( ruleLogicalAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7112:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__RightAssignment_1_0_214273);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7121:1: rule__LogicalAnd__OpAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__LogicalAnd__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7125:1: ( ( ( 'and' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7126:1: ( ( 'and' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7126:1: ( ( 'and' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7127:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7128:1: ( 'and' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7129:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__LogicalAnd__OpAssignment_1_0_114309); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7144:1: rule__LogicalAnd__RightAssignment_1_0_2 : ( ruleRelation ) ;
    public final void rule__LogicalAnd__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7148:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7149:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7149:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7150:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__LogicalAnd__RightAssignment_1_0_214348);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7159:1: rule__Relation__OpAssignment_1_0_1 : ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Relation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7163:1: ( ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7164:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7164:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7165:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7166:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7166:2: rule__Relation__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_114379);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7175:1: rule__Relation__RightAssignment_1_0_2 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7179:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7180:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7180:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7181:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_214412);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7190:1: rule__Addition__OpAssignment_1_0_1 : ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Addition__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7194:1: ( ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7195:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7195:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7196:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7197:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7197:2: rule__Addition__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_114443);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7206:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7210:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7211:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7211:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7212:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214476);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7221:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7225:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7226:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7226:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7227:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7228:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7228:2: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114507);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7237:1: rule__Multiplication__RightAssignment_1_0_2 : ( ruleNeg ) ;
    public final void rule__Multiplication__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7241:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7242:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7242:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7243:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214540);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7252:1: rule__Neg__ExpressionAssignment_0_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7256:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7257:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7257:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7258:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214571);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7267:1: rule__Neg__ExpressionAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7271:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7272:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7272:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7273:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214602);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7282:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7286:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7287:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7287:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7288:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7289:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7289:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment14633);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7298:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7302:1: ( ( RULE_STRING ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7303:1: ( RULE_STRING )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7303:1: ( RULE_STRING )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7304:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14666); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7313:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7317:1: ( ( RULE_INT ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7318:1: ( RULE_INT )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7318:1: ( RULE_INT )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7319:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment14697); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7328:1: rule__NameRef__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7332:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7333:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7333:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7334:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7335:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7336:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_014732); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7347:1: rule__NameRef__VariableAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7351:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7352:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7352:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7353:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7354:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7355:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_214771); if (state.failed) return ;
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

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_ruleExpression1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOr1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__0_in_ruleLogicalOr1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAnd1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__0_in_ruleLogicalAnd1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_entryRuleNeg1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Alternatives_in_ruleNeg1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_entryRuleNameRef2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameRef2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0_in_ruleNameRef2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__AbstractDeclaration__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__AbstractDeclaration__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_rule__Type__Alternatives2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_rule__Type__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_rule__Instruction__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_rule__Instruction__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Relation__OpAlternatives_1_0_1_02616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Relation__OpAlternatives_1_0_1_02636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_02656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Relation__OpAlternatives_1_0_1_02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Relation__OpAlternatives_1_0_1_02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Addition__OpAlternatives_1_0_1_02751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Addition__OpAlternatives_1_0_1_02771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Multiplication__OpAlternatives_1_0_1_02806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Multiplication__OpAlternatives_1_0_1_02826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__Alternatives2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Atom__Alternatives2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanLiteral__ValueAlternatives_03030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanLiteral__ValueAlternatives_03050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BaseTypeEnum__Alternatives3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BaseTypeEnum__Alternatives3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03139 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Domain__Group__1__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23262 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33322 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Domain__Group__3__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43384 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__0_in_rule__Domain__Group__4__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Domain__Group__5__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__0__Impl_in_rule__Domain__Group_4__03516 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__1_in_rule__Domain__Group_4__03519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ConstantsAssignment_4_0_in_rule__Domain__Group_4__0__Impl3546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__1__Impl_in_rule__Domain__Group_4__13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__0_in_rule__Domain__Group_4__1__Impl3603 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__0__Impl_in_rule__Domain__Group_4_1__03638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__1_in_rule__Domain__Group_4_1__03641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Domain__Group_4_1__0__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__1__Impl_in_rule__Domain__Group_4_1__13700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ConstantsAssignment_4_1_1_in_rule__Domain__Group_4_1__1__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__0__Impl_in_rule__SymbolicConstant__Group__03761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__1_in_rule__SymbolicConstant__Group__03764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__1__Impl_in_rule__SymbolicConstant__Group__13822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__NameAssignment_1_in_rule__SymbolicConstant__Group__1__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__03883 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__03886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__13944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__13947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Class__Group__1__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24006 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34066 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl4096 = new BitSet(new long[]{0x00000E0018000012L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__44127 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__44130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__54188 = new BitSet(new long[]{0x00000E1C18000010L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__54191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__64249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Class__Group__6__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__04322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__04325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Class__Group_4__0__Impl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__14384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4413 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4425 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__04462 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Class__Group_5__0__Impl4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4553 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4565 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04602 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24723 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34783 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__34786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__44844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VariableDeclaration__Group__4__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__04913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__04916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__14975 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__14978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25035 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5065 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__35096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VariableDeclaration__Group_3__3__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__05163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__05166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VariableDeclaration__Group_3_2__0__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15347 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25407 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attribute__Group__2__Impl5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__05534 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__05537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__15595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__15598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EventDeclaration__Group__1__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__25657 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__25660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__35717 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__4_in_rule__EventDeclaration__Group__35720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__4__Impl_in_rule__EventDeclaration__Group__45778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EventDeclaration__Group__4__Impl5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__05847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__05850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EventDeclaration__Group_3__0__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__15909 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__15912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__25969 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__25972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl5999 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventDeclaration__Group_3__3__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__06097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__06100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EventDeclaration__Group_3_2__0__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__16159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06220 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16281 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__16284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ParameterDeclaration__Group__1__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__26343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__26346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__36403 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__36406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl6433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__46463 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__46466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ParameterDeclaration__Group__4__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__56525 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__56528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__66585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterDeclaration__Group__6__Impl6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__06658 = new BitSet(new long[]{0x00000E0018000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__06661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__16719 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__16722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ObserverDeclaration__Group__1__Impl6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__26781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__26784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__36841 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__36844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__46901 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__46904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ObserverDeclaration__Group__4__Impl6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__56963 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__56966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObserverDeclaration__Group__6__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__07096 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__07099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl7126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__17156 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__17159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LabeledTransition__Group__1__Impl7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__27218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__07281 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__07284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__17340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl7367 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__07402 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__17463 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__17466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TransitionAnd__Group_1__1__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__27525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__07588 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__07591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionOr__Group__0__Impl7618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__17647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl7674 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__07709 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__07712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__17770 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__17773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TransitionOr__Group_1__1__Impl7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__27832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07895 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17956 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl7986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28016 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Transition__Group__2__Impl8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_3_in_rule__Transition__Group__3__Impl8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08143 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18204 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Skip__Group__1__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__28266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Skip__Group__2__Impl8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18392 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28452 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__28455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Assignment__Group__2__Impl8483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__38514 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__38517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl8544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__48574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Assignment__Group__4__Impl8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08643 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18704 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Block__Group__1__Impl8735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28766 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8798 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8810 = new BitSet(new long[]{0x0025000040000012L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Block__Group__3__Impl8871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08910 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__18971 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__18974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Conditional__Group__1__Impl9002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__29033 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__29036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl9063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39093 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Conditional__Group__3__Impl9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49155 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ThenAssignment_4_in_rule__Conditional__Group__4__Impl9185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59215 = new BitSet(new long[]{0x0010002000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__0_in_rule__Conditional__Group__5__Impl9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Conditional__Group__6__Impl9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__0__Impl_in_rule__Conditional__Group_5__09349 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__1_in_rule__Conditional__Group_5__09352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Conditional__Group_5__0__Impl9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__1__Impl_in_rule__Conditional__Group_5__19413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ElseAssignment_5_1_in_rule__Conditional__Group_5__1__Impl9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__09474 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__09477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Switch__Group__0__Impl9505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__19536 = new BitSet(new long[]{0x0050004006400070L});
    public static final BitSet FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__19539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Switch__Group__1__Impl9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__29598 = new BitSet(new long[]{0x0050004006400070L});
    public static final BitSet FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__29601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__CasesAssignment_2_in_rule__Switch__Group__2__Impl9628 = new BitSet(new long[]{0x0040004006400072L});
    public static final BitSet FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__39659 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__39662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Switch__Group__3__Impl9690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__49721 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__49724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Switch__Group__4__Impl9752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__59783 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__59786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__ElseAssignment_5_in_rule__Switch__Group__5__Impl9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__69843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Switch__Group__6__Impl9871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__09916 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__09919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl9946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__19976 = new BitSet(new long[]{0x0025000040000010L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__19979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__CaseExpression__Group__1__Impl10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__210038 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__210041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ThenAssignment_2_in_rule__CaseExpression__Group__2__Impl10068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__310098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__CaseExpression__Group__3__Impl10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__0__Impl_in_rule__LogicalOr__Group__010165 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__1_in_rule__LogicalOr__Group__010168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__Group__0__Impl10195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group__1__Impl_in_rule__LogicalOr__Group__110224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1__0_in_rule__LogicalOr__Group__1__Impl10251 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1__0__Impl_in_rule__LogicalOr__Group_1__010286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__0_in_rule__LogicalOr__Group_1__0__Impl10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__0__Impl_in_rule__LogicalOr__Group_1_0__010345 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__1_in_rule__LogicalOr__Group_1_0__010348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__1__Impl_in_rule__LogicalOr__Group_1_0__110406 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__2_in_rule__LogicalOr__Group_1_0__110409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__OpAssignment_1_0_1_in_rule__LogicalOr__Group_1_0__1__Impl10436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__Group_1_0__2__Impl_in_rule__LogicalOr__Group_1_0__210466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOr__RightAssignment_1_0_2_in_rule__LogicalOr__Group_1_0__2__Impl10493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__0__Impl_in_rule__LogicalAnd__Group__010529 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__1_in_rule__LogicalAnd__Group__010532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__LogicalAnd__Group__0__Impl10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group__1__Impl_in_rule__LogicalAnd__Group__110588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__0_in_rule__LogicalAnd__Group__1__Impl10615 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1__0__Impl_in_rule__LogicalAnd__Group_1__010650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__0_in_rule__LogicalAnd__Group_1__0__Impl10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__0__Impl_in_rule__LogicalAnd__Group_1_0__010709 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__1_in_rule__LogicalAnd__Group_1_0__010712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__1__Impl_in_rule__LogicalAnd__Group_1_0__110770 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__2_in_rule__LogicalAnd__Group_1_0__110773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__OpAssignment_1_0_1_in_rule__LogicalAnd__Group_1_0__1__Impl10800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__Group_1_0__2__Impl_in_rule__LogicalAnd__Group_1_0__210830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalAnd__RightAssignment_1_0_2_in_rule__LogicalAnd__Group_1_0__2__Impl10857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010893 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10979 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__011014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl11041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__011073 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__011076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__111134 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__111137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__211194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl11221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__011257 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__011260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl11287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__111316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl11343 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011437 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111498 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011621 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11707 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011801 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111862 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011985 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__112046 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__112049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Neg__Group_0__1__Impl12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__212110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl12137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__012173 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__012176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__112234 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__112237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Neg__Group_1__1__Impl12266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__212298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl12325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__012361 = new BitSet(new long[]{0x0040004006400070L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__012364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Atom__Group_4__0__Impl12392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__112423 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__2_in_rule__Atom__Group_4__112426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atom__Group_4__1__Impl12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__2__Impl_in_rule__Atom__Group_4__212482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Atom__Group_4__2__Impl12510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012547 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12634 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012728 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__NameRef__Group_1_0__1__Impl12820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_212950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_012981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_1_113012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolicConstant__NameAssignment_113043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment13074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedType__RefAssignment13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_213144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_313175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_113206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_113237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_113268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_213299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_113330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_113361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_213547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_313578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_513609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_213640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_313671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_513702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_013733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_213764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_213795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionOr__RightAssignment_1_213826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_113857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Transition__ActionAssignment_313888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_113919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_313950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_213981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Conditional__ConditionAssignment_214012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Conditional__ThenAssignment_414043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Conditional__ElseAssignment_5_114074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rule__Switch__CasesAssignment_214105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Switch__ElseAssignment_514136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__ConditionAssignment_014167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__CaseExpression__ThenAssignment_214198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LogicalOr__OpAssignment_1_0_114234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_rule__LogicalOr__RightAssignment_1_0_214273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__LogicalAnd__OpAssignment_1_0_114309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__LogicalAnd__RightAssignment_1_0_214348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_114379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_214412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_114443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment14633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment14697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_014732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_214771 = new BitSet(new long[]{0x0000000000000002L});

}