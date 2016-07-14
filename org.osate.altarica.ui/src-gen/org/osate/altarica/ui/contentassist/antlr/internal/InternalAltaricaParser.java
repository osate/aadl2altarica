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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'Integer'", "'Boolean'", "'domain'", "'{'", "'}'", "','", "'class'", "'end'", "'transition'", "'assertion'", "';'", "'('", "')'", "'='", "'event'", "'parameter'", "'observer'", "':'", "'&'", "'|'", "'->'", "'skip'", "':='", "'if'", "'then'", "'else'", "'switch'", "'not'", "'.'"
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

                if ( (LA1_0==31||LA1_0==35) ) {
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:770:1: ruleExpression : ( ruleLogical ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:774:2: ( ( ruleLogical ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:775:1: ( ruleLogical )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:775:1: ( ruleLogical )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:776:1: ruleLogical
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleLogical_in_ruleExpression1601);
            ruleLogical();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleLogical"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:789:1: entryRuleLogical : ruleLogical EOF ;
    public final void entryRuleLogical() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:790:1: ( ruleLogical EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:791:1: ruleLogical EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical1627);
            ruleLogical();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical1634); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogical"


    // $ANTLR start "ruleLogical"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:798:1: ruleLogical : ( ( rule__Logical__Group__0 ) ) ;
    public final void ruleLogical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:802:2: ( ( ( rule__Logical__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:803:1: ( ( rule__Logical__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:803:1: ( ( rule__Logical__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:804:1: ( rule__Logical__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:805:1: ( rule__Logical__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:805:2: rule__Logical__Group__0
            {
            pushFollow(FOLLOW_rule__Logical__Group__0_in_ruleLogical1660);
            rule__Logical__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogical"


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


    // $ANTLR start "ruleBaseTypeEnum"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1070:1: ruleBaseTypeEnum : ( ( rule__BaseTypeEnum__Alternatives ) ) ;
    public final void ruleBaseTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1074:1: ( ( ( rule__BaseTypeEnum__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1075:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1075:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1076:1: ( rule__BaseTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1077:1: ( rule__BaseTypeEnum__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1077:2: rule__BaseTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2237);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1088:1: rule__AbstractDeclaration__Alternatives : ( ( ruleDomain ) | ( ruleClass ) );
    public final void rule__AbstractDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1092:1: ( ( ruleDomain ) | ( ruleClass ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1093:1: ( ruleDomain )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1093:1: ( ruleDomain )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1094:1: ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleDomain_in_rule__AbstractDeclaration__Alternatives2272);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1099:6: ( ruleClass )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1099:6: ( ruleClass )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1100:1: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClass_in_rule__AbstractDeclaration__Alternatives2289);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1110:1: rule__Type__Alternatives : ( ( ( ruleBaseType ) ) | ( ruleNamedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1114:1: ( ( ( ruleBaseType ) ) | ( ruleNamedType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=29 && LA3_0<=30)) ) {
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1115:1: ( ( ruleBaseType ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1115:1: ( ( ruleBaseType ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1116:1: ( ruleBaseType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1117:1: ( ruleBaseType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1117:3: ruleBaseType
                    {
                    pushFollow(FOLLOW_ruleBaseType_in_rule__Type__Alternatives2322);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1121:6: ( ruleNamedType )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1121:6: ( ruleNamedType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1122:1: ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNamedType_in_rule__Type__Alternatives2340);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1132:1: rule__Declaration__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1136:1: ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 29:
            case 30:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case 45:
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1137:1: ( ruleVariableDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1137:1: ( ruleVariableDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1138:1: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2372);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1143:6: ( ruleEventDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1143:6: ( ruleEventDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1144:1: ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2389);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1149:6: ( ruleParameterDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1149:6: ( ruleParameterDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1150:1: ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2406);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1155:6: ( ruleObserverDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1155:6: ( ruleObserverDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1156:1: ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2423);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1166:1: rule__Instruction__Alternatives : ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1170:1: ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 32:
                {
                alt5=3;
                }
                break;
            case 52:
                {
                alt5=4;
                }
                break;
            case 55:
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1171:1: ( ruleSkip )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1171:1: ( ruleSkip )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1172:1: ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2455);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:6: ( ruleAssignment )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:6: ( ruleAssignment )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1178:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2472);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1183:6: ( ruleBlock )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1183:6: ( ruleBlock )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1184:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2489);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1189:6: ( ruleConditional )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1189:6: ( ruleConditional )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1190:1: ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleConditional_in_rule__Instruction__Alternatives2506);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1195:6: ( ruleSwitch )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1195:6: ( ruleSwitch )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1196:1: ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSwitch_in_rule__Instruction__Alternatives2523);
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


    // $ANTLR start "rule__Logical__OpAlternatives_1_0_1_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1206:1: rule__Logical__OpAlternatives_1_0_1_0 : ( ( 'and' ) | ( 'or' ) );
    public final void rule__Logical__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1210:1: ( ( 'and' ) | ( 'or' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1211:1: ( 'and' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1211:1: ( 'and' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1212:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalAccess().getOpAndKeyword_1_0_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Logical__OpAlternatives_1_0_1_02556); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalAccess().getOpAndKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1219:6: ( 'or' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1219:6: ( 'or' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1220:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalAccess().getOpOrKeyword_1_0_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Logical__OpAlternatives_1_0_1_02576); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalAccess().getOpOrKeyword_1_0_1_0_1()); 
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
    // $ANTLR end "rule__Logical__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Relation__OpAlternatives_1_0_1_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1232:1: rule__Relation__OpAlternatives_1_0_1_0 : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Relation__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1236:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1237:1: ( '==' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1237:1: ( '==' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1238:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_02611); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1245:6: ( '!=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1245:6: ( '!=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1246:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_02631); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1253:6: ( '<' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1253:6: ( '<' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1254:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Relation__OpAlternatives_1_0_1_02651); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1261:6: ( '<=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1261:6: ( '<=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1262:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Relation__OpAlternatives_1_0_1_02671); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1269:6: ( '>=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1269:6: ( '>=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1270:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Relation__OpAlternatives_1_0_1_02691); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1277:6: ( '>' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1277:6: ( '>' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1278:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Relation__OpAlternatives_1_0_1_02711); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1290:1: rule__Addition__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1294:1: ( ( '+' ) | ( '-' ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1295:1: ( '+' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1295:1: ( '+' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1296:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Addition__OpAlternatives_1_0_1_02746); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1303:6: ( '-' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1303:6: ( '-' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1304:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Addition__OpAlternatives_1_0_1_02766); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1316:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1320:1: ( ( '*' ) | ( '/' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1321:1: ( '*' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1321:1: ( '*' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1322:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__Multiplication__OpAlternatives_1_0_1_02801); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1329:6: ( '/' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1329:6: ( '/' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1330:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Multiplication__OpAlternatives_1_0_1_02821); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1342:1: rule__Neg__Alternatives : ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) );
    public final void rule__Neg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1346:1: ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 27:
            case 28:
            case 40:
                {
                alt10=3;
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1347:1: ( ( rule__Neg__Group_0__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1347:1: ( ( rule__Neg__Group_0__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1348:1: ( rule__Neg__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1349:1: ( rule__Neg__Group_0__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1349:2: rule__Neg__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives2855);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1353:6: ( ( rule__Neg__Group_1__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1353:6: ( ( rule__Neg__Group_1__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1354:1: ( rule__Neg__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1355:1: ( rule__Neg__Group_1__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1355:2: rule__Neg__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives2873);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1359:6: ( ruleAtom )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1359:6: ( ruleAtom )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1360:1: ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAtom_in_rule__Neg__Alternatives2891);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1370:1: rule__Atom__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ( rule__Atom__Group_4__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1374:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ( rule__Atom__Group_4__0 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 27:
            case 28:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case RULE_ID:
                {
                alt11=4;
                }
                break;
            case 40:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1375:1: ( ruleBooleanLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1375:1: ( ruleBooleanLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1376:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives2923);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1381:6: ( ruleStringLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1381:6: ( ruleStringLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1382:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives2940);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1387:6: ( ruleIntegerLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1387:6: ( ruleIntegerLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1388:1: ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives2957);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1393:6: ( ruleNameRef )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1393:6: ( ruleNameRef )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1394:1: ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleNameRef_in_rule__Atom__Alternatives2974);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1399:6: ( ( rule__Atom__Group_4__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1399:6: ( ( rule__Atom__Group_4__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1400:1: ( rule__Atom__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_4()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1401:1: ( rule__Atom__Group_4__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1401:2: rule__Atom__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives2991);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1410:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1414:1: ( ( 'true' ) | ( 'false' ) )
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1415:1: ( 'true' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1415:1: ( 'true' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1416:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__BooleanLiteral__ValueAlternatives_03025); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1423:6: ( 'false' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1423:6: ( 'false' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1424:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__BooleanLiteral__ValueAlternatives_03045); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1436:1: rule__BaseTypeEnum__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__BaseTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1440:1: ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1441:1: ( ( 'Integer' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1441:1: ( ( 'Integer' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1442:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1443:1: ( 'Integer' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1443:3: 'Integer'
                    {
                    match(input,29,FOLLOW_29_in_rule__BaseTypeEnum__Alternatives3080); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1448:6: ( ( 'Boolean' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1448:6: ( ( 'Boolean' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1449:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1450:1: ( 'Boolean' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1450:3: 'Boolean'
                    {
                    match(input,30,FOLLOW_30_in_rule__BaseTypeEnum__Alternatives3101); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1462:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1466:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1467:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03134);
            rule__Domain__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03137);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1474:1: rule__Domain__Group__0__Impl : ( () ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1478:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1479:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1479:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1480:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1481:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1483:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1493:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1497:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1498:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13195);
            rule__Domain__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13198);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1505:1: rule__Domain__Group__1__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1509:1: ( ( 'domain' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1510:1: ( 'domain' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1510:1: ( 'domain' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1511:1: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Domain__Group__1__Impl3226); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1524:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1528:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1529:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23257);
            rule__Domain__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23260);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1536:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1540:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1541:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1541:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1542:1: ( rule__Domain__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1543:1: ( rule__Domain__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1543:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3287);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1553:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1557:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1558:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33317);
            rule__Domain__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33320);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1565:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1569:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1570:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1570:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1571:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Domain__Group__3__Impl3348); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1584:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1588:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1589:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43379);
            rule__Domain__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43382);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1596:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__Group_4__0 )? ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1600:1: ( ( ( rule__Domain__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1601:1: ( ( rule__Domain__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1601:1: ( ( rule__Domain__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1602:1: ( rule__Domain__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1603:1: ( rule__Domain__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1603:2: rule__Domain__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Domain__Group_4__0_in_rule__Domain__Group__4__Impl3409);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1613:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1617:1: ( rule__Domain__Group__5__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1618:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53440);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1624:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1628:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1629:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1629:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1630:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,33,FOLLOW_33_in_rule__Domain__Group__5__Impl3468); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1655:1: rule__Domain__Group_4__0 : rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 ;
    public final void rule__Domain__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1659:1: ( rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1660:2: rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_4__0__Impl_in_rule__Domain__Group_4__03511);
            rule__Domain__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group_4__1_in_rule__Domain__Group_4__03514);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1667:1: rule__Domain__Group_4__0__Impl : ( ( rule__Domain__ConstantsAssignment_4_0 ) ) ;
    public final void rule__Domain__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1671:1: ( ( ( rule__Domain__ConstantsAssignment_4_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1672:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1672:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1673:1: ( rule__Domain__ConstantsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1674:1: ( rule__Domain__ConstantsAssignment_4_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1674:2: rule__Domain__ConstantsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Domain__ConstantsAssignment_4_0_in_rule__Domain__Group_4__0__Impl3541);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1684:1: rule__Domain__Group_4__1 : rule__Domain__Group_4__1__Impl ;
    public final void rule__Domain__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1688:1: ( rule__Domain__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1689:2: rule__Domain__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_4__1__Impl_in_rule__Domain__Group_4__13571);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1695:1: rule__Domain__Group_4__1__Impl : ( ( rule__Domain__Group_4_1__0 )* ) ;
    public final void rule__Domain__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1699:1: ( ( ( rule__Domain__Group_4_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1700:1: ( ( rule__Domain__Group_4_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1700:1: ( ( rule__Domain__Group_4_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1701:1: ( rule__Domain__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1702:1: ( rule__Domain__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1702:2: rule__Domain__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_4_1__0_in_rule__Domain__Group_4__1__Impl3598);
            	    rule__Domain__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1716:1: rule__Domain__Group_4_1__0 : rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 ;
    public final void rule__Domain__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1720:1: ( rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1721:2: rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_4_1__0__Impl_in_rule__Domain__Group_4_1__03633);
            rule__Domain__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group_4_1__1_in_rule__Domain__Group_4_1__03636);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1728:1: rule__Domain__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1732:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1733:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1733:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1734:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Domain__Group_4_1__0__Impl3664); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1747:1: rule__Domain__Group_4_1__1 : rule__Domain__Group_4_1__1__Impl ;
    public final void rule__Domain__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1751:1: ( rule__Domain__Group_4_1__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1752:2: rule__Domain__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_4_1__1__Impl_in_rule__Domain__Group_4_1__13695);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1758:1: rule__Domain__Group_4_1__1__Impl : ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) ;
    public final void rule__Domain__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1762:1: ( ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1763:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1763:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1764:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1765:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1765:2: rule__Domain__ConstantsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Domain__ConstantsAssignment_4_1_1_in_rule__Domain__Group_4_1__1__Impl3722);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1779:1: rule__SymbolicConstant__Group__0 : rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 ;
    public final void rule__SymbolicConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1783:1: ( rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1784:2: rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__0__Impl_in_rule__SymbolicConstant__Group__03756);
            rule__SymbolicConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__1_in_rule__SymbolicConstant__Group__03759);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1791:1: rule__SymbolicConstant__Group__0__Impl : ( () ) ;
    public final void rule__SymbolicConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1795:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1796:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1796:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1797:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1798:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1800:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1810:1: rule__SymbolicConstant__Group__1 : rule__SymbolicConstant__Group__1__Impl ;
    public final void rule__SymbolicConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1814:1: ( rule__SymbolicConstant__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1815:2: rule__SymbolicConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__Group__1__Impl_in_rule__SymbolicConstant__Group__13817);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1821:1: rule__SymbolicConstant__Group__1__Impl : ( ( rule__SymbolicConstant__NameAssignment_1 ) ) ;
    public final void rule__SymbolicConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1825:1: ( ( ( rule__SymbolicConstant__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1826:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1826:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1827:1: ( rule__SymbolicConstant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1828:1: ( rule__SymbolicConstant__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1828:2: rule__SymbolicConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SymbolicConstant__NameAssignment_1_in_rule__SymbolicConstant__Group__1__Impl3844);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1842:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1846:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1847:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__03878);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__03881);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1854:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1858:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1859:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1859:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1860:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNodeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1861:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1863:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1873:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1877:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1878:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__13939);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__13942);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1885:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1889:1: ( ( 'class' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1890:1: ( 'class' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1890:1: ( 'class' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1891:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Class__Group__1__Impl3970); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1904:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1908:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1909:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24001);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24004);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1916:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1920:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1921:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1921:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1922:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1923:1: ( rule__Class__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1923:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4031);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1933:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1937:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1938:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34061);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34064);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1945:1: rule__Class__Group__3__Impl : ( ( rule__Class__DeclarationsAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1949:1: ( ( ( rule__Class__DeclarationsAssignment_3 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1950:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1950:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1951:1: ( rule__Class__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1952:1: ( rule__Class__DeclarationsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=29 && LA16_0<=30)||(LA16_0>=43 && LA16_0<=45)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1952:2: rule__Class__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl4091);
            	    rule__Class__DeclarationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1962:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1966:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1967:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__44122);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__44125);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1974:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1978:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1979:1: ( ( rule__Class__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1979:1: ( ( rule__Class__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1980:1: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1981:1: ( rule__Class__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1981:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl4152);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1991:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1995:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1996:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__54183);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__54186);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2003:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2007:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2008:1: ( ( rule__Class__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2008:1: ( ( rule__Class__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2009:1: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2010:1: ( rule__Class__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2010:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl4213);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2020:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2024:1: ( rule__Class__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2025:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__64244);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2031:1: rule__Class__Group__6__Impl : ( 'end' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2035:1: ( ( 'end' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2036:1: ( 'end' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2036:1: ( 'end' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2037:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }
            match(input,36,FOLLOW_36_in_rule__Class__Group__6__Impl4272); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2064:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2068:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2069:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__04317);
            rule__Class__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__04320);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2076:1: rule__Class__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2080:1: ( ( 'transition' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2081:1: ( 'transition' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2081:1: ( 'transition' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2082:1: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Class__Group_4__0__Impl4348); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2095:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2099:1: ( rule__Class__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2100:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__14379);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2106:1: rule__Class__Group_4__1__Impl : ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2110:1: ( ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2111:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2111:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2112:1: ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2112:1: ( ( rule__Class__TransitionsAssignment_4_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2113:1: ( rule__Class__TransitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2114:1: ( rule__Class__TransitionsAssignment_4_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2114:2: rule__Class__TransitionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4408);
            rule__Class__TransitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2117:1: ( ( rule__Class__TransitionsAssignment_4_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2118:1: ( rule__Class__TransitionsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2119:1: ( rule__Class__TransitionsAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2119:2: rule__Class__TransitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4420);
            	    rule__Class__TransitionsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2134:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2138:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2139:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__04457);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__04460);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2146:1: rule__Class__Group_5__0__Impl : ( 'assertion' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2150:1: ( ( 'assertion' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2151:1: ( 'assertion' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2151:1: ( 'assertion' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2152:1: 'assertion'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Class__Group_5__0__Impl4488); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2165:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2169:1: ( rule__Class__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2170:2: rule__Class__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__14519);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2176:1: rule__Class__Group_5__1__Impl : ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2180:1: ( ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2181:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2181:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2182:1: ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2182:1: ( ( rule__Class__AssertionsAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2183:1: ( rule__Class__AssertionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2184:1: ( rule__Class__AssertionsAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2184:2: rule__Class__AssertionsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4548);
            rule__Class__AssertionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2187:1: ( ( rule__Class__AssertionsAssignment_5_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2188:1: ( rule__Class__AssertionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2189:1: ( rule__Class__AssertionsAssignment_5_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==32||LA20_0==50||LA20_0==52||LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2189:2: rule__Class__AssertionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4560);
            	    rule__Class__AssertionsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2204:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2208:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2209:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04597);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04600);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2216:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2220:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2221:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2221:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2222:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2223:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2225:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2235:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2239:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2240:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14658);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14661);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2247:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2251:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2252:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2252:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2253:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2254:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2254:2: rule__VariableDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4688);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2264:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2268:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2269:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24718);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24721);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2276:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2280:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2281:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2281:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2282:1: ( rule__VariableDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:1: ( rule__VariableDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:2: rule__VariableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl4748);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2293:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2297:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2298:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34778);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__34781);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2305:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2309:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2310:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2310:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2311:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2312:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2312:2: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl4808);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2322:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2326:1: ( rule__VariableDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2327:2: rule__VariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__44839);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2333:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2337:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2338:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2338:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2339:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__VariableDeclaration__Group__4__Impl4867); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2362:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2366:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2367:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__04908);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__04911);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2374:1: rule__VariableDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2378:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2379:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2379:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2380:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__VariableDeclaration__Group_3__0__Impl4939); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2393:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2397:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2398:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__14970);
            rule__VariableDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__14973);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2405:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2409:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2410:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2410:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2411:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2412:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2412:2: rule__VariableDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5000);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2422:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2426:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2427:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25030);
            rule__VariableDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25033);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2434:1: rule__VariableDeclaration__Group_3__2__Impl : ( ( rule__VariableDeclaration__Group_3_2__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2438:1: ( ( ( rule__VariableDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2439:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2439:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2440:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2441:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2441:2: rule__VariableDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5060);
            	    rule__VariableDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2451:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2455:1: ( rule__VariableDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2456:2: rule__VariableDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__35091);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2462:1: rule__VariableDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2466:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2467:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2467:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2468:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__VariableDeclaration__Group_3__3__Impl5119); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2489:1: rule__VariableDeclaration__Group_3_2__0 : rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 ;
    public final void rule__VariableDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2493:1: ( rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2494:2: rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__05158);
            rule__VariableDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__05161);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2501:1: rule__VariableDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2505:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2506:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2506:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2507:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__VariableDeclaration__Group_3_2__0__Impl5189); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2520:1: rule__VariableDeclaration__Group_3_2__1 : rule__VariableDeclaration__Group_3_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2524:1: ( rule__VariableDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2525:2: rule__VariableDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__15220);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2531:1: rule__VariableDeclaration__Group_3_2__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2535:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2536:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2536:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2537:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2538:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2538:2: rule__VariableDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl5247);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2552:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2556:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2557:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05281);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05284);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2564:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2568:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2569:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2569:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2570:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2571:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2573:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2583:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2587:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2588:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15342);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15345);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2595:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2599:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2600:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2600:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2601:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2602:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2602:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5372);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2612:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2616:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2617:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25402);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25405);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2624:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2628:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2629:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2629:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2630:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__Attribute__Group__2__Impl5433); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2643:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2647:1: ( rule__Attribute__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2648:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35464);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2654:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2658:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2659:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2659:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2660:1: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2661:1: ( rule__Attribute__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2661:2: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl5491);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2679:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2683:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2684:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__05529);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__05532);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2691:1: rule__EventDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2695:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2696:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2696:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2697:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2698:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2700:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2710:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2714:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2715:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__15590);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__15593);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2722:1: rule__EventDeclaration__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2726:1: ( ( 'event' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2727:1: ( 'event' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2727:1: ( 'event' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2728:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__EventDeclaration__Group__1__Impl5621); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2741:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2745:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2746:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__25652);
            rule__EventDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__25655);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2753:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2757:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2758:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2758:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2759:1: ( rule__EventDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2760:1: ( rule__EventDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2760:2: rule__EventDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl5682);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2770:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2774:1: ( rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2775:2: rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__35712);
            rule__EventDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__4_in_rule__EventDeclaration__Group__35715);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2782:1: rule__EventDeclaration__Group__3__Impl : ( ( rule__EventDeclaration__Group_3__0 )? ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2786:1: ( ( ( rule__EventDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2787:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2787:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2788:1: ( rule__EventDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2789:1: ( rule__EventDeclaration__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2789:2: rule__EventDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl5742);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2799:1: rule__EventDeclaration__Group__4 : rule__EventDeclaration__Group__4__Impl ;
    public final void rule__EventDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2803:1: ( rule__EventDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2804:2: rule__EventDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__4__Impl_in_rule__EventDeclaration__Group__45773);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2810:1: rule__EventDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__EventDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2814:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2815:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2815:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2816:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__EventDeclaration__Group__4__Impl5801); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2839:1: rule__EventDeclaration__Group_3__0 : rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 ;
    public final void rule__EventDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2843:1: ( rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2844:2: rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__05842);
            rule__EventDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__05845);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2851:1: rule__EventDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2855:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2856:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2856:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2857:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__EventDeclaration__Group_3__0__Impl5873); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2870:1: rule__EventDeclaration__Group_3__1 : rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 ;
    public final void rule__EventDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2874:1: ( rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2875:2: rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__15904);
            rule__EventDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__15907);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2882:1: rule__EventDeclaration__Group_3__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__EventDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2886:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2887:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2887:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2888:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2889:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2889:2: rule__EventDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl5934);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2899:1: rule__EventDeclaration__Group_3__2 : rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 ;
    public final void rule__EventDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2903:1: ( rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2904:2: rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__25964);
            rule__EventDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__25967);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2911:1: rule__EventDeclaration__Group_3__2__Impl : ( ( rule__EventDeclaration__Group_3_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2915:1: ( ( ( rule__EventDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2916:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2916:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2917:1: ( rule__EventDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2918:1: ( rule__EventDeclaration__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2918:2: rule__EventDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl5994);
            	    rule__EventDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2928:1: rule__EventDeclaration__Group_3__3 : rule__EventDeclaration__Group_3__3__Impl ;
    public final void rule__EventDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2932:1: ( rule__EventDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2933:2: rule__EventDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36025);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2939:1: rule__EventDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2943:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2944:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2944:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2945:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__EventDeclaration__Group_3__3__Impl6053); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2966:1: rule__EventDeclaration__Group_3_2__0 : rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 ;
    public final void rule__EventDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2970:1: ( rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2971:2: rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__06092);
            rule__EventDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__06095);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2978:1: rule__EventDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2982:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2983:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2983:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2984:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__EventDeclaration__Group_3_2__0__Impl6123); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2997:1: rule__EventDeclaration__Group_3_2__1 : rule__EventDeclaration__Group_3_2__1__Impl ;
    public final void rule__EventDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3001:1: ( rule__EventDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3002:2: rule__EventDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__16154);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3008:1: rule__EventDeclaration__Group_3_2__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3012:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3013:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3013:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3014:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3015:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3015:2: rule__EventDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl6181);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3029:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3033:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3034:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06215);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06218);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3041:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3045:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3046:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3046:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3047:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3048:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3050:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3060:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3064:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3065:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16276);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__16279);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3072:1: rule__ParameterDeclaration__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3076:1: ( ( 'parameter' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3077:1: ( 'parameter' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3077:1: ( 'parameter' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3078:1: 'parameter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__ParameterDeclaration__Group__1__Impl6307); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3091:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3095:1: ( rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3096:2: rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__26338);
            rule__ParameterDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__26341);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3103:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3107:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3108:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3108:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3109:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3110:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3110:2: rule__ParameterDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl6368);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3120:1: rule__ParameterDeclaration__Group__3 : rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 ;
    public final void rule__ParameterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3124:1: ( rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3125:2: rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__36398);
            rule__ParameterDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__36401);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3132:1: rule__ParameterDeclaration__Group__3__Impl : ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ParameterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3136:1: ( ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3137:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3137:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3138:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3139:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3139:2: rule__ParameterDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl6428);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3149:1: rule__ParameterDeclaration__Group__4 : rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 ;
    public final void rule__ParameterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3153:1: ( rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3154:2: rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__46458);
            rule__ParameterDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__46461);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3161:1: rule__ParameterDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ParameterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3165:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3166:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3166:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3167:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__ParameterDeclaration__Group__4__Impl6489); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3180:1: rule__ParameterDeclaration__Group__5 : rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 ;
    public final void rule__ParameterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3184:1: ( rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3185:2: rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__56520);
            rule__ParameterDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__56523);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3192:1: rule__ParameterDeclaration__Group__5__Impl : ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ParameterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3196:1: ( ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3197:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3197:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3198:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3199:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3199:2: rule__ParameterDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl6550);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3209:1: rule__ParameterDeclaration__Group__6 : rule__ParameterDeclaration__Group__6__Impl ;
    public final void rule__ParameterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3213:1: ( rule__ParameterDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3214:2: rule__ParameterDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__66580);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3220:1: rule__ParameterDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ParameterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3224:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3225:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3225:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3226:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__ParameterDeclaration__Group__6__Impl6608); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3253:1: rule__ObserverDeclaration__Group__0 : rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 ;
    public final void rule__ObserverDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3257:1: ( rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3258:2: rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__06653);
            rule__ObserverDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__06656);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3265:1: rule__ObserverDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ObserverDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3269:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3270:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3270:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3271:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3272:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3274:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3284:1: rule__ObserverDeclaration__Group__1 : rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 ;
    public final void rule__ObserverDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3288:1: ( rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3289:2: rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__16714);
            rule__ObserverDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__16717);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3296:1: rule__ObserverDeclaration__Group__1__Impl : ( 'observer' ) ;
    public final void rule__ObserverDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3300:1: ( ( 'observer' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3301:1: ( 'observer' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3301:1: ( 'observer' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3302:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__ObserverDeclaration__Group__1__Impl6745); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3315:1: rule__ObserverDeclaration__Group__2 : rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 ;
    public final void rule__ObserverDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3319:1: ( rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3320:2: rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__26776);
            rule__ObserverDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__26779);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3327:1: rule__ObserverDeclaration__Group__2__Impl : ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ObserverDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3331:1: ( ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3332:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3332:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3333:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3334:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3334:2: rule__ObserverDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl6806);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3344:1: rule__ObserverDeclaration__Group__3 : rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 ;
    public final void rule__ObserverDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3348:1: ( rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3349:2: rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__36836);
            rule__ObserverDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__36839);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3356:1: rule__ObserverDeclaration__Group__3__Impl : ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObserverDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3360:1: ( ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3361:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3361:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3362:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3363:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3363:2: rule__ObserverDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl6866);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3373:1: rule__ObserverDeclaration__Group__4 : rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 ;
    public final void rule__ObserverDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3377:1: ( rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3378:2: rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__46896);
            rule__ObserverDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__46899);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3385:1: rule__ObserverDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ObserverDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3389:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3390:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3390:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3391:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,42,FOLLOW_42_in_rule__ObserverDeclaration__Group__4__Impl6927); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3404:1: rule__ObserverDeclaration__Group__5 : rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 ;
    public final void rule__ObserverDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3408:1: ( rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3409:2: rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__56958);
            rule__ObserverDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__56961);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3416:1: rule__ObserverDeclaration__Group__5__Impl : ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ObserverDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3420:1: ( ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3421:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3421:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3422:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3423:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3423:2: rule__ObserverDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl6988);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3433:1: rule__ObserverDeclaration__Group__6 : rule__ObserverDeclaration__Group__6__Impl ;
    public final void rule__ObserverDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3437:1: ( rule__ObserverDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3438:2: rule__ObserverDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67018);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3444:1: rule__ObserverDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ObserverDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3448:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3449:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3449:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3450:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__ObserverDeclaration__Group__6__Impl7046); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3477:1: rule__LabeledTransition__Group__0 : rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 ;
    public final void rule__LabeledTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3481:1: ( rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3482:2: rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__07091);
            rule__LabeledTransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__07094);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3489:1: rule__LabeledTransition__Group__0__Impl : ( ( rule__LabeledTransition__EventAssignment_0 ) ) ;
    public final void rule__LabeledTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3493:1: ( ( ( rule__LabeledTransition__EventAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3494:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3494:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3495:1: ( rule__LabeledTransition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3496:1: ( rule__LabeledTransition__EventAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3496:2: rule__LabeledTransition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl7121);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3506:1: rule__LabeledTransition__Group__1 : rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 ;
    public final void rule__LabeledTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3510:1: ( rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3511:2: rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__17151);
            rule__LabeledTransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__17154);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3518:1: rule__LabeledTransition__Group__1__Impl : ( ':' ) ;
    public final void rule__LabeledTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3522:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3523:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3523:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3524:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__LabeledTransition__Group__1__Impl7182); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3537:1: rule__LabeledTransition__Group__2 : rule__LabeledTransition__Group__2__Impl ;
    public final void rule__LabeledTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3541:1: ( rule__LabeledTransition__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3542:2: rule__LabeledTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__27213);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3548:1: rule__LabeledTransition__Group__2__Impl : ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) ;
    public final void rule__LabeledTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3552:1: ( ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3553:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3553:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3554:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3555:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3555:2: rule__LabeledTransition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl7240);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3571:1: rule__TransitionAnd__Group__0 : rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 ;
    public final void rule__TransitionAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3575:1: ( rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3576:2: rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__07276);
            rule__TransitionAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__07279);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3583:1: rule__TransitionAnd__Group__0__Impl : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3587:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3588:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3588:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3589:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl7306);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3600:1: rule__TransitionAnd__Group__1 : rule__TransitionAnd__Group__1__Impl ;
    public final void rule__TransitionAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3604:1: ( rule__TransitionAnd__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3605:2: rule__TransitionAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__17335);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3611:1: rule__TransitionAnd__Group__1__Impl : ( ( rule__TransitionAnd__Group_1__0 )* ) ;
    public final void rule__TransitionAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3615:1: ( ( ( rule__TransitionAnd__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3616:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3616:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3617:1: ( rule__TransitionAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3618:1: ( rule__TransitionAnd__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==47) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3618:2: rule__TransitionAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl7362);
            	    rule__TransitionAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3632:1: rule__TransitionAnd__Group_1__0 : rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 ;
    public final void rule__TransitionAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3636:1: ( rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3637:2: rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__07397);
            rule__TransitionAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__07400);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3644:1: rule__TransitionAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3648:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3649:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3649:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3650:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3651:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3653:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3663:1: rule__TransitionAnd__Group_1__1 : rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 ;
    public final void rule__TransitionAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3667:1: ( rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3668:2: rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__17458);
            rule__TransitionAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__17461);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3675:1: rule__TransitionAnd__Group_1__1__Impl : ( '&' ) ;
    public final void rule__TransitionAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3679:1: ( ( '&' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3680:1: ( '&' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3680:1: ( '&' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3681:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,47,FOLLOW_47_in_rule__TransitionAnd__Group_1__1__Impl7489); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3694:1: rule__TransitionAnd__Group_1__2 : rule__TransitionAnd__Group_1__2__Impl ;
    public final void rule__TransitionAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3698:1: ( rule__TransitionAnd__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3699:2: rule__TransitionAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__27520);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3705:1: rule__TransitionAnd__Group_1__2__Impl : ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3709:1: ( ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3710:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3710:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3711:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3712:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3712:2: rule__TransitionAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl7547);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3728:1: rule__TransitionOr__Group__0 : rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 ;
    public final void rule__TransitionOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3732:1: ( rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3733:2: rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__07583);
            rule__TransitionOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__07586);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3740:1: rule__TransitionOr__Group__0__Impl : ( ruleTransition ) ;
    public final void rule__TransitionOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3744:1: ( ( ruleTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3745:1: ( ruleTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3745:1: ( ruleTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3746:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionOr__Group__0__Impl7613);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3757:1: rule__TransitionOr__Group__1 : rule__TransitionOr__Group__1__Impl ;
    public final void rule__TransitionOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3761:1: ( rule__TransitionOr__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3762:2: rule__TransitionOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__17642);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3768:1: rule__TransitionOr__Group__1__Impl : ( ( rule__TransitionOr__Group_1__0 )* ) ;
    public final void rule__TransitionOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3772:1: ( ( ( rule__TransitionOr__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3773:1: ( ( rule__TransitionOr__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3773:1: ( ( rule__TransitionOr__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3774:1: ( rule__TransitionOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3775:1: ( rule__TransitionOr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==48) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3775:2: rule__TransitionOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl7669);
            	    rule__TransitionOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3789:1: rule__TransitionOr__Group_1__0 : rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 ;
    public final void rule__TransitionOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3793:1: ( rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3794:2: rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__07704);
            rule__TransitionOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__07707);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3801:1: rule__TransitionOr__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3805:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3806:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3806:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3807:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3808:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3810:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3820:1: rule__TransitionOr__Group_1__1 : rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 ;
    public final void rule__TransitionOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3824:1: ( rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3825:2: rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__17765);
            rule__TransitionOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__17768);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3832:1: rule__TransitionOr__Group_1__1__Impl : ( '|' ) ;
    public final void rule__TransitionOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3836:1: ( ( '|' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3837:1: ( '|' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3837:1: ( '|' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3838:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__TransitionOr__Group_1__1__Impl7796); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3851:1: rule__TransitionOr__Group_1__2 : rule__TransitionOr__Group_1__2__Impl ;
    public final void rule__TransitionOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3855:1: ( rule__TransitionOr__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3856:2: rule__TransitionOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__27827);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3862:1: rule__TransitionOr__Group_1__2__Impl : ( ( rule__TransitionOr__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3866:1: ( ( ( rule__TransitionOr__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3867:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3867:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3868:1: ( rule__TransitionOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3869:1: ( rule__TransitionOr__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3869:2: rule__TransitionOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl7854);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3885:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3889:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3890:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07890);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07893);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3897:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3901:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3902:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3902:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3903:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3904:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3906:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3916:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3920:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3921:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17951);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17954);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3928:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__GuardAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3932:1: ( ( ( rule__Transition__GuardAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3933:1: ( ( rule__Transition__GuardAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3933:1: ( ( rule__Transition__GuardAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3934:1: ( rule__Transition__GuardAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3935:1: ( rule__Transition__GuardAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3935:2: rule__Transition__GuardAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl7981);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3945:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3949:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3950:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28011);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28014);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3957:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3961:1: ( ( '->' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3962:1: ( '->' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3962:1: ( '->' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3963:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__Transition__Group__2__Impl8042); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3976:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3980:1: ( rule__Transition__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3981:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38073);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3987:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__ActionAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3991:1: ( ( ( rule__Transition__ActionAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3992:1: ( ( rule__Transition__ActionAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3992:1: ( ( rule__Transition__ActionAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3993:1: ( rule__Transition__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3994:1: ( rule__Transition__ActionAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3994:2: rule__Transition__ActionAssignment_3
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_3_in_rule__Transition__Group__3__Impl8100);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4012:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4016:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4017:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08138);
            rule__Skip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08141);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4024:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4028:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4029:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4029:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4030:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4031:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4033:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4043:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl rule__Skip__Group__2 ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4047:1: ( rule__Skip__Group__1__Impl rule__Skip__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4048:2: rule__Skip__Group__1__Impl rule__Skip__Group__2
            {
            pushFollow(FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18199);
            rule__Skip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18202);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4055:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4059:1: ( ( 'skip' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4060:1: ( 'skip' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4060:1: ( 'skip' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4061:1: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }
            match(input,50,FOLLOW_50_in_rule__Skip__Group__1__Impl8230); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4074:1: rule__Skip__Group__2 : rule__Skip__Group__2__Impl ;
    public final void rule__Skip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4078:1: ( rule__Skip__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4079:2: rule__Skip__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__28261);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4085:1: rule__Skip__Group__2__Impl : ( ';' ) ;
    public final void rule__Skip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4089:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4090:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4090:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4091:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__Skip__Group__2__Impl8289); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4110:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4114:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4115:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08326);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08329);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4122:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4126:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4127:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4127:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4128:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4129:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4131:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4141:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4145:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4146:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18387);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18390);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4153:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__VariableAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4157:1: ( ( ( rule__Assignment__VariableAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4158:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4158:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4159:1: ( rule__Assignment__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4160:1: ( rule__Assignment__VariableAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4160:2: rule__Assignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl8417);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4170:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4174:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4175:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28447);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__28450);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4182:1: rule__Assignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4186:1: ( ( ':=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4187:1: ( ':=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4187:1: ( ':=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4188:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Assignment__Group__2__Impl8478); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4201:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4205:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4206:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__38509);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__38512);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4213:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4217:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4218:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4218:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4219:1: ( rule__Assignment__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4220:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4220:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl8539);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4230:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4234:1: ( rule__Assignment__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4235:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__48569);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4241:1: rule__Assignment__Group__4__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4245:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4246:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4246:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4247:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,39,FOLLOW_39_in_rule__Assignment__Group__4__Impl8597); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4270:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4274:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4275:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08638);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08641);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4282:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4286:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4287:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4287:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4288:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4289:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4291:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4301:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4305:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4306:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18699);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18702);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4313:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4317:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4318:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4318:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4319:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Block__Group__1__Impl8730); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4332:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4336:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4337:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28761);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28764);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4344:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4348:1: ( ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4349:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4349:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4350:1: ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4350:1: ( ( rule__Block__InstructionsAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4351:1: ( rule__Block__InstructionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4352:1: ( rule__Block__InstructionsAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4352:2: rule__Block__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8793);
            rule__Block__InstructionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4355:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4356:1: ( rule__Block__InstructionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4357:1: ( rule__Block__InstructionsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==32||LA27_0==50||LA27_0==52||LA27_0==55) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4357:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8805);
            	    rule__Block__InstructionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4368:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4372:1: ( rule__Block__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4373:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38838);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4379:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4383:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4384:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4384:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4385:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__Block__Group__3__Impl8866); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4406:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4410:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4411:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08905);
            rule__Conditional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08908);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4418:1: rule__Conditional__Group__0__Impl : ( () ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4422:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4423:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4423:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4424:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionalAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4425:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4427:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4437:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4441:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4442:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__18966);
            rule__Conditional__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__18969);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4449:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4453:1: ( ( 'if' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4454:1: ( 'if' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4454:1: ( 'if' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4455:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__Conditional__Group__1__Impl8997); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4468:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4472:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4473:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__29028);
            rule__Conditional__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__29031);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4480:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4484:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4485:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4485:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4486:1: ( rule__Conditional__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4487:1: ( rule__Conditional__ConditionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4487:2: rule__Conditional__ConditionAssignment_2
            {
            pushFollow(FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl9058);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4497:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4501:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4502:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39088);
            rule__Conditional__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39091);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4509:1: rule__Conditional__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4513:1: ( ( 'then' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4514:1: ( 'then' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4514:1: ( 'then' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4515:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenKeyword_3()); 
            }
            match(input,53,FOLLOW_53_in_rule__Conditional__Group__3__Impl9119); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4528:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4532:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4533:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49150);
            rule__Conditional__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49153);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4540:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ThenAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4544:1: ( ( ( rule__Conditional__ThenAssignment_4 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4545:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4545:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4546:1: ( rule__Conditional__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenAssignment_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4547:1: ( rule__Conditional__ThenAssignment_4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4547:2: rule__Conditional__ThenAssignment_4
            {
            pushFollow(FOLLOW_rule__Conditional__ThenAssignment_4_in_rule__Conditional__Group__4__Impl9180);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4557:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4561:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4562:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59210);
            rule__Conditional__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59213);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4569:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Group_5__0 )? ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4573:1: ( ( ( rule__Conditional__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4574:1: ( ( rule__Conditional__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4574:1: ( ( rule__Conditional__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4575:1: ( rule__Conditional__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4576:1: ( rule__Conditional__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4576:2: rule__Conditional__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Conditional__Group_5__0_in_rule__Conditional__Group__5__Impl9240);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4586:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4590:1: ( rule__Conditional__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4591:2: rule__Conditional__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69271);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4597:1: rule__Conditional__Group__6__Impl : ( ';' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4601:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4602:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4602:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4603:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getSemicolonKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__Conditional__Group__6__Impl9299); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4630:1: rule__Conditional__Group_5__0 : rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 ;
    public final void rule__Conditional__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4634:1: ( rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4635:2: rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1
            {
            pushFollow(FOLLOW_rule__Conditional__Group_5__0__Impl_in_rule__Conditional__Group_5__09344);
            rule__Conditional__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conditional__Group_5__1_in_rule__Conditional__Group_5__09347);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4642:1: rule__Conditional__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Conditional__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4646:1: ( ( ( 'else' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4647:1: ( ( 'else' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4647:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4648:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseKeyword_5_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4649:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4650:2: 'else'
            {
            match(input,54,FOLLOW_54_in_rule__Conditional__Group_5__0__Impl9376); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4661:1: rule__Conditional__Group_5__1 : rule__Conditional__Group_5__1__Impl ;
    public final void rule__Conditional__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4665:1: ( rule__Conditional__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4666:2: rule__Conditional__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Conditional__Group_5__1__Impl_in_rule__Conditional__Group_5__19408);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4672:1: rule__Conditional__Group_5__1__Impl : ( ( rule__Conditional__ElseAssignment_5_1 ) ) ;
    public final void rule__Conditional__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4676:1: ( ( ( rule__Conditional__ElseAssignment_5_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4677:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4677:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4678:1: ( rule__Conditional__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4679:1: ( rule__Conditional__ElseAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4679:2: rule__Conditional__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Conditional__ElseAssignment_5_1_in_rule__Conditional__Group_5__1__Impl9435);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4693:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4697:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4698:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
            {
            pushFollow(FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__09469);
            rule__Switch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__09472);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4705:1: rule__Switch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4709:1: ( ( 'switch' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4710:1: ( 'switch' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4710:1: ( 'switch' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4711:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Switch__Group__0__Impl9500); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4724:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4728:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4729:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__19531);
            rule__Switch__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__19534);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4736:1: rule__Switch__Group__1__Impl : ( '{' ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4740:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4741:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4741:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4742:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Switch__Group__1__Impl9562); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4755:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4759:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4760:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__29593);
            rule__Switch__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__29596);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4767:1: rule__Switch__Group__2__Impl : ( ( rule__Switch__CasesAssignment_2 )* ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4771:1: ( ( ( rule__Switch__CasesAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4772:1: ( ( rule__Switch__CasesAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4772:1: ( ( rule__Switch__CasesAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4773:1: ( rule__Switch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4774:1: ( rule__Switch__CasesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==24||(LA29_0>=27 && LA29_0<=28)||LA29_0==40||LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4774:2: rule__Switch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Switch__CasesAssignment_2_in_rule__Switch__Group__2__Impl9623);
            	    rule__Switch__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4784:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4788:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4789:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__39654);
            rule__Switch__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__39657);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4796:1: rule__Switch__Group__3__Impl : ( 'else' ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4800:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4801:1: ( 'else' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4801:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4802:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseKeyword_3()); 
            }
            match(input,54,FOLLOW_54_in_rule__Switch__Group__3__Impl9685); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4815:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl rule__Switch__Group__5 ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4819:1: ( rule__Switch__Group__4__Impl rule__Switch__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4820:2: rule__Switch__Group__4__Impl rule__Switch__Group__5
            {
            pushFollow(FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__49716);
            rule__Switch__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__49719);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4827:1: rule__Switch__Group__4__Impl : ( ':' ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4831:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4832:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4832:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4833:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getColonKeyword_4()); 
            }
            match(input,46,FOLLOW_46_in_rule__Switch__Group__4__Impl9747); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4846:1: rule__Switch__Group__5 : rule__Switch__Group__5__Impl rule__Switch__Group__6 ;
    public final void rule__Switch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4850:1: ( rule__Switch__Group__5__Impl rule__Switch__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4851:2: rule__Switch__Group__5__Impl rule__Switch__Group__6
            {
            pushFollow(FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__59778);
            rule__Switch__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__59781);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4858:1: rule__Switch__Group__5__Impl : ( ( rule__Switch__ElseAssignment_5 ) ) ;
    public final void rule__Switch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4862:1: ( ( ( rule__Switch__ElseAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4863:1: ( ( rule__Switch__ElseAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4863:1: ( ( rule__Switch__ElseAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4864:1: ( rule__Switch__ElseAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4865:1: ( rule__Switch__ElseAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4865:2: rule__Switch__ElseAssignment_5
            {
            pushFollow(FOLLOW_rule__Switch__ElseAssignment_5_in_rule__Switch__Group__5__Impl9808);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4875:1: rule__Switch__Group__6 : rule__Switch__Group__6__Impl ;
    public final void rule__Switch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4879:1: ( rule__Switch__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4880:2: rule__Switch__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__69838);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4886:1: rule__Switch__Group__6__Impl : ( '}' ) ;
    public final void rule__Switch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4890:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4891:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4891:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4892:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,33,FOLLOW_33_in_rule__Switch__Group__6__Impl9866); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4919:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4923:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4924:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__09911);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__09914);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4931:1: rule__CaseExpression__Group__0__Impl : ( ( rule__CaseExpression__ConditionAssignment_0 ) ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4935:1: ( ( ( rule__CaseExpression__ConditionAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4936:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4936:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4937:1: ( rule__CaseExpression__ConditionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4938:1: ( rule__CaseExpression__ConditionAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4938:2: rule__CaseExpression__ConditionAssignment_0
            {
            pushFollow(FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl9941);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4948:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4952:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4953:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__19971);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__19974);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4960:1: rule__CaseExpression__Group__1__Impl : ( ':' ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4964:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4965:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4965:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4966:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getColonKeyword_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__CaseExpression__Group__1__Impl10002); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4979:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4983:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4984:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__210033);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__210036);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4991:1: rule__CaseExpression__Group__2__Impl : ( ( rule__CaseExpression__ThenAssignment_2 ) ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4995:1: ( ( ( rule__CaseExpression__ThenAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4996:1: ( ( rule__CaseExpression__ThenAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4996:1: ( ( rule__CaseExpression__ThenAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4997:1: ( rule__CaseExpression__ThenAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getThenAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4998:1: ( rule__CaseExpression__ThenAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4998:2: rule__CaseExpression__ThenAssignment_2
            {
            pushFollow(FOLLOW_rule__CaseExpression__ThenAssignment_2_in_rule__CaseExpression__Group__2__Impl10063);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5008:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5012:1: ( rule__CaseExpression__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5013:2: rule__CaseExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__310093);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5019:1: rule__CaseExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5023:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5024:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5024:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5025:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCommaKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__CaseExpression__Group__3__Impl10121); if (state.failed) return ;
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


    // $ANTLR start "rule__Logical__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5046:1: rule__Logical__Group__0 : rule__Logical__Group__0__Impl rule__Logical__Group__1 ;
    public final void rule__Logical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5050:1: ( rule__Logical__Group__0__Impl rule__Logical__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5051:2: rule__Logical__Group__0__Impl rule__Logical__Group__1
            {
            pushFollow(FOLLOW_rule__Logical__Group__0__Impl_in_rule__Logical__Group__010160);
            rule__Logical__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Logical__Group__1_in_rule__Logical__Group__010163);
            rule__Logical__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__0"


    // $ANTLR start "rule__Logical__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5058:1: rule__Logical__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__Logical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5062:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5063:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5063:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5064:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__Logical__Group__0__Impl10190);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__0__Impl"


    // $ANTLR start "rule__Logical__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5075:1: rule__Logical__Group__1 : rule__Logical__Group__1__Impl ;
    public final void rule__Logical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5079:1: ( rule__Logical__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5080:2: rule__Logical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group__1__Impl_in_rule__Logical__Group__110219);
            rule__Logical__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__1"


    // $ANTLR start "rule__Logical__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5086:1: rule__Logical__Group__1__Impl : ( ( rule__Logical__Group_1__0 )* ) ;
    public final void rule__Logical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5090:1: ( ( ( rule__Logical__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5091:1: ( ( rule__Logical__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5091:1: ( ( rule__Logical__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5092:1: ( rule__Logical__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5093:1: ( rule__Logical__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=15 && LA30_0<=16)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5093:2: rule__Logical__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Logical__Group_1__0_in_rule__Logical__Group__1__Impl10246);
            	    rule__Logical__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group__1__Impl"


    // $ANTLR start "rule__Logical__Group_1__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5107:1: rule__Logical__Group_1__0 : rule__Logical__Group_1__0__Impl ;
    public final void rule__Logical__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5111:1: ( rule__Logical__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5112:2: rule__Logical__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1__0__Impl_in_rule__Logical__Group_1__010281);
            rule__Logical__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1__0"


    // $ANTLR start "rule__Logical__Group_1__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5118:1: rule__Logical__Group_1__0__Impl : ( ( rule__Logical__Group_1_0__0 ) ) ;
    public final void rule__Logical__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5122:1: ( ( ( rule__Logical__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5123:1: ( ( rule__Logical__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5123:1: ( ( rule__Logical__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5124:1: ( rule__Logical__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5125:1: ( rule__Logical__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5125:2: rule__Logical__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__0_in_rule__Logical__Group_1__0__Impl10308);
            rule__Logical__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1__0__Impl"


    // $ANTLR start "rule__Logical__Group_1_0__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5137:1: rule__Logical__Group_1_0__0 : rule__Logical__Group_1_0__0__Impl rule__Logical__Group_1_0__1 ;
    public final void rule__Logical__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5141:1: ( rule__Logical__Group_1_0__0__Impl rule__Logical__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5142:2: rule__Logical__Group_1_0__0__Impl rule__Logical__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__0__Impl_in_rule__Logical__Group_1_0__010340);
            rule__Logical__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Logical__Group_1_0__1_in_rule__Logical__Group_1_0__010343);
            rule__Logical__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0__0"


    // $ANTLR start "rule__Logical__Group_1_0__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5149:1: rule__Logical__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Logical__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5153:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5154:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5154:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5155:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getLogicalLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5156:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5158:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getLogicalLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0__0__Impl"


    // $ANTLR start "rule__Logical__Group_1_0__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5168:1: rule__Logical__Group_1_0__1 : rule__Logical__Group_1_0__1__Impl rule__Logical__Group_1_0__2 ;
    public final void rule__Logical__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5172:1: ( rule__Logical__Group_1_0__1__Impl rule__Logical__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5173:2: rule__Logical__Group_1_0__1__Impl rule__Logical__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__1__Impl_in_rule__Logical__Group_1_0__110401);
            rule__Logical__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Logical__Group_1_0__2_in_rule__Logical__Group_1_0__110404);
            rule__Logical__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0__1"


    // $ANTLR start "rule__Logical__Group_1_0__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5180:1: rule__Logical__Group_1_0__1__Impl : ( ( rule__Logical__OpAssignment_1_0_1 ) ) ;
    public final void rule__Logical__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5184:1: ( ( ( rule__Logical__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5185:1: ( ( rule__Logical__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5185:1: ( ( rule__Logical__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5186:1: ( rule__Logical__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5187:1: ( rule__Logical__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5187:2: rule__Logical__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Logical__OpAssignment_1_0_1_in_rule__Logical__Group_1_0__1__Impl10431);
            rule__Logical__OpAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getOpAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0__1__Impl"


    // $ANTLR start "rule__Logical__Group_1_0__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5197:1: rule__Logical__Group_1_0__2 : rule__Logical__Group_1_0__2__Impl ;
    public final void rule__Logical__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5201:1: ( rule__Logical__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5202:2: rule__Logical__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__2__Impl_in_rule__Logical__Group_1_0__210461);
            rule__Logical__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0__2"


    // $ANTLR start "rule__Logical__Group_1_0__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5208:1: rule__Logical__Group_1_0__2__Impl : ( ( rule__Logical__RightAssignment_1_0_2 ) ) ;
    public final void rule__Logical__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5212:1: ( ( ( rule__Logical__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5213:1: ( ( rule__Logical__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5213:1: ( ( rule__Logical__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5214:1: ( rule__Logical__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5215:1: ( rule__Logical__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5215:2: rule__Logical__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Logical__RightAssignment_1_0_2_in_rule__Logical__Group_1_0__2__Impl10488);
            rule__Logical__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__Group_1_0__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5231:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5235:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5236:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010524);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010527);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5243:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5247:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5248:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5248:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5249:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10554);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5260:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5264:1: ( rule__Relation__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5265:2: rule__Relation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110583);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5271:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )* ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5275:1: ( ( ( rule__Relation__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5276:1: ( ( rule__Relation__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5276:1: ( ( rule__Relation__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5277:1: ( rule__Relation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5278:1: ( rule__Relation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=17 && LA31_0<=22)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5278:2: rule__Relation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10610);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5292:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5296:1: ( rule__Relation__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5297:2: rule__Relation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__010645);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5303:1: rule__Relation__Group_1__0__Impl : ( ( rule__Relation__Group_1_0__0 ) ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5307:1: ( ( ( rule__Relation__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5308:1: ( ( rule__Relation__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5308:1: ( ( rule__Relation__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5309:1: ( rule__Relation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5310:1: ( rule__Relation__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5310:2: rule__Relation__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl10672);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5322:1: rule__Relation__Group_1_0__0 : rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 ;
    public final void rule__Relation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5326:1: ( rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5327:2: rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__010704);
            rule__Relation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__010707);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5334:1: rule__Relation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5338:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5339:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5339:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5340:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5341:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5343:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5353:1: rule__Relation__Group_1_0__1 : rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 ;
    public final void rule__Relation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5357:1: ( rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5358:2: rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__110765);
            rule__Relation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__110768);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5365:1: rule__Relation__Group_1_0__1__Impl : ( ( rule__Relation__OpAssignment_1_0_1 ) ) ;
    public final void rule__Relation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5369:1: ( ( ( rule__Relation__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5370:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5370:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5371:1: ( rule__Relation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5372:1: ( rule__Relation__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5372:2: rule__Relation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl10795);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5382:1: rule__Relation__Group_1_0__2 : rule__Relation__Group_1_0__2__Impl ;
    public final void rule__Relation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5386:1: ( rule__Relation__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5387:2: rule__Relation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__210825);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5393:1: rule__Relation__Group_1_0__2__Impl : ( ( rule__Relation__RightAssignment_1_0_2 ) ) ;
    public final void rule__Relation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5397:1: ( ( ( rule__Relation__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5398:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5398:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5399:1: ( rule__Relation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5400:1: ( rule__Relation__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5400:2: rule__Relation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl10852);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5416:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5420:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5421:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__010888);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__010891);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5428:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5432:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5433:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5433:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5434:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl10918);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5445:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5449:1: ( rule__Addition__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5450:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__110947);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5456:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5460:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5461:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5461:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5462:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5463:1: ( rule__Addition__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=23 && LA32_0<=24)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5463:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl10974);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5477:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5481:1: ( rule__Addition__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5482:2: rule__Addition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011009);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5488:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5492:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5493:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5493:1: ( ( rule__Addition__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5494:1: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5495:1: ( rule__Addition__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5495:2: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11036);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5507:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5511:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5512:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011068);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011071);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5519:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5523:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5524:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5524:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5525:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5526:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5528:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5538:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5542:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5543:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111129);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111132);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5550:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OpAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5554:1: ( ( ( rule__Addition__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5555:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5555:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5556:1: ( rule__Addition__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:1: ( rule__Addition__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5557:2: rule__Addition__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11159);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5567:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5571:1: ( rule__Addition__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5572:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211189);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5578:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5582:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5583:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5583:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5584:1: ( rule__Addition__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5585:1: ( rule__Addition__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5585:2: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11216);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5601:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5605:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5606:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011252);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011255);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5613:1: rule__Multiplication__Group__0__Impl : ( ruleNeg ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5617:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5618:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5618:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5619:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11282);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5630:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5634:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5635:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111311);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5641:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5645:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5646:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5646:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5647:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5648:1: ( rule__Multiplication__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=25 && LA33_0<=26)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5648:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11338);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5662:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5666:1: ( rule__Multiplication__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5667:2: rule__Multiplication__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011373);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5673:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5677:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5678:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5678:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5679:1: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5680:1: ( rule__Multiplication__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5680:2: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11400);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5692:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5696:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5697:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011432);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011435);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5704:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5708:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5709:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5709:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5710:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5711:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5713:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5723:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5727:1: ( rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5728:2: rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111493);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111496);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5735:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5739:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5740:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5740:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5741:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5742:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5742:2: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11523);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5752:1: rule__Multiplication__Group_1_0__2 : rule__Multiplication__Group_1_0__2__Impl ;
    public final void rule__Multiplication__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5756:1: ( rule__Multiplication__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5757:2: rule__Multiplication__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211553);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5763:1: rule__Multiplication__Group_1_0__2__Impl : ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) ;
    public final void rule__Multiplication__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5767:1: ( ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5768:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5768:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5769:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5770:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5770:2: rule__Multiplication__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11580);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5786:1: rule__Neg__Group_0__0 : rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 ;
    public final void rule__Neg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5790:1: ( rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5791:2: rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011616);
            rule__Neg__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011619);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5798:1: rule__Neg__Group_0__0__Impl : ( () ) ;
    public final void rule__Neg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5802:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5803:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5803:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5804:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5805:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5807:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5817:1: rule__Neg__Group_0__1 : rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 ;
    public final void rule__Neg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5821:1: ( rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5822:2: rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__111677);
            rule__Neg__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__111680);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5829:1: rule__Neg__Group_0__1__Impl : ( ( 'not' ) ) ;
    public final void rule__Neg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5833:1: ( ( ( 'not' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5834:1: ( ( 'not' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5834:1: ( ( 'not' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5835:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5836:1: ( 'not' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5837:2: 'not'
            {
            match(input,56,FOLLOW_56_in_rule__Neg__Group_0__1__Impl11709); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5848:1: rule__Neg__Group_0__2 : rule__Neg__Group_0__2__Impl ;
    public final void rule__Neg__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5852:1: ( rule__Neg__Group_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5853:2: rule__Neg__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__211741);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5859:1: rule__Neg__Group_0__2__Impl : ( ( rule__Neg__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Neg__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5863:1: ( ( ( rule__Neg__ExpressionAssignment_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5864:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5864:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5865:1: ( rule__Neg__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5866:1: ( rule__Neg__ExpressionAssignment_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5866:2: rule__Neg__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl11768);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5882:1: rule__Neg__Group_1__0 : rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 ;
    public final void rule__Neg__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5886:1: ( rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5887:2: rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__011804);
            rule__Neg__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__011807);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5894:1: rule__Neg__Group_1__0__Impl : ( () ) ;
    public final void rule__Neg__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5898:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5899:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5899:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5900:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5901:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5903:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5913:1: rule__Neg__Group_1__1 : rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 ;
    public final void rule__Neg__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5917:1: ( rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5918:2: rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__111865);
            rule__Neg__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__111868);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5925:1: rule__Neg__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Neg__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5929:1: ( ( ( '-' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5930:1: ( ( '-' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5930:1: ( ( '-' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5931:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5932:1: ( '-' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5933:2: '-'
            {
            match(input,24,FOLLOW_24_in_rule__Neg__Group_1__1__Impl11897); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5944:1: rule__Neg__Group_1__2 : rule__Neg__Group_1__2__Impl ;
    public final void rule__Neg__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5948:1: ( rule__Neg__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5949:2: rule__Neg__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__211929);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5955:1: rule__Neg__Group_1__2__Impl : ( ( rule__Neg__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Neg__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5959:1: ( ( ( rule__Neg__ExpressionAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5960:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5960:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5961:1: ( rule__Neg__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5962:1: ( rule__Neg__ExpressionAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5962:2: rule__Neg__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl11956);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5978:1: rule__Atom__Group_4__0 : rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 ;
    public final void rule__Atom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5982:1: ( rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5983:2: rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__011992);
            rule__Atom__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__011995);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5990:1: rule__Atom__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5994:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5995:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5995:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5996:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Atom__Group_4__0__Impl12023); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6009:1: rule__Atom__Group_4__1 : rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2 ;
    public final void rule__Atom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6013:1: ( rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6014:2: rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__112054);
            rule__Atom__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__2_in_rule__Atom__Group_4__112057);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6021:1: rule__Atom__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__Atom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6025:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6026:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6026:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6027:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Atom__Group_4__1__Impl12084);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6038:1: rule__Atom__Group_4__2 : rule__Atom__Group_4__2__Impl ;
    public final void rule__Atom__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6042:1: ( rule__Atom__Group_4__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6043:2: rule__Atom__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__2__Impl_in_rule__Atom__Group_4__212113);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6049:1: rule__Atom__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6053:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6054:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6054:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6055:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__Atom__Group_4__2__Impl12141); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6074:1: rule__NameRef__Group__0 : rule__NameRef__Group__0__Impl rule__NameRef__Group__1 ;
    public final void rule__NameRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6078:1: ( rule__NameRef__Group__0__Impl rule__NameRef__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6079:2: rule__NameRef__Group__0__Impl rule__NameRef__Group__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012178);
            rule__NameRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012181);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6086:1: rule__NameRef__Group__0__Impl : ( ( rule__NameRef__VariableAssignment_0 ) ) ;
    public final void rule__NameRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6090:1: ( ( ( rule__NameRef__VariableAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6091:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6091:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6092:1: ( rule__NameRef__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6093:1: ( rule__NameRef__VariableAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6093:2: rule__NameRef__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12208);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6103:1: rule__NameRef__Group__1 : rule__NameRef__Group__1__Impl ;
    public final void rule__NameRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6107:1: ( rule__NameRef__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6108:2: rule__NameRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112238);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6114:1: rule__NameRef__Group__1__Impl : ( ( rule__NameRef__Group_1__0 )* ) ;
    public final void rule__NameRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6118:1: ( ( ( rule__NameRef__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6119:1: ( ( rule__NameRef__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6119:1: ( ( rule__NameRef__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6120:1: ( rule__NameRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6121:1: ( rule__NameRef__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==57) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6121:2: rule__NameRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12265);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6135:1: rule__NameRef__Group_1__0 : rule__NameRef__Group_1__0__Impl ;
    public final void rule__NameRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6139:1: ( rule__NameRef__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6140:2: rule__NameRef__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012300);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6146:1: rule__NameRef__Group_1__0__Impl : ( ( rule__NameRef__Group_1_0__0 ) ) ;
    public final void rule__NameRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6150:1: ( ( ( rule__NameRef__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6151:1: ( ( rule__NameRef__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6151:1: ( ( rule__NameRef__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6152:1: ( rule__NameRef__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6153:1: ( rule__NameRef__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6153:2: rule__NameRef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12327);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6165:1: rule__NameRef__Group_1_0__0 : rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 ;
    public final void rule__NameRef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6169:1: ( rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6170:2: rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012359);
            rule__NameRef__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012362);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6177:1: rule__NameRef__Group_1_0__0__Impl : ( () ) ;
    public final void rule__NameRef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6181:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6182:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6182:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6183:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6184:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6186:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6196:1: rule__NameRef__Group_1_0__1 : rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 ;
    public final void rule__NameRef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6200:1: ( rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6201:2: rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112420);
            rule__NameRef__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112423);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6208:1: rule__NameRef__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__NameRef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6212:1: ( ( '.' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6213:1: ( '.' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6213:1: ( '.' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6214:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,57,FOLLOW_57_in_rule__NameRef__Group_1_0__1__Impl12451); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6227:1: rule__NameRef__Group_1_0__2 : rule__NameRef__Group_1_0__2__Impl ;
    public final void rule__NameRef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6231:1: ( rule__NameRef__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6232:2: rule__NameRef__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212482);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6238:1: rule__NameRef__Group_1_0__2__Impl : ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) ;
    public final void rule__NameRef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6242:1: ( ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6243:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6243:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6244:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6245:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6245:2: rule__NameRef__VariableAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12509);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6262:1: rule__Model__DeclarationsAssignment : ( ruleAbstractDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6266:1: ( ( ruleAbstractDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6267:1: ( ruleAbstractDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6267:1: ( ruleAbstractDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6268:1: ruleAbstractDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment12550);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6277:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6281:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6282:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6282:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6283:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_212581); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6292:1: rule__Domain__ConstantsAssignment_4_0 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6296:1: ( ( ruleSymbolicConstant ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6297:1: ( ruleSymbolicConstant )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6297:1: ( ruleSymbolicConstant )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6298:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_012612);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6307:1: rule__Domain__ConstantsAssignment_4_1_1 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6311:1: ( ( ruleSymbolicConstant ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6312:1: ( ruleSymbolicConstant )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6312:1: ( ruleSymbolicConstant )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6313:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_1_112643);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6322:1: rule__SymbolicConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolicConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6326:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6327:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6327:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6328:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolicConstant__NameAssignment_112674); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6337:1: rule__BaseType__NameAssignment : ( ruleBaseTypeEnum ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6341:1: ( ( ruleBaseTypeEnum ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6342:1: ( ruleBaseTypeEnum )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6342:1: ( ruleBaseTypeEnum )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6343:1: ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment12705);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6352:1: rule__NamedType__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NamedType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6356:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6357:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6357:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6358:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6359:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6360:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedType__RefAssignment12740); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6371:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6375:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6376:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6376:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6377:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_212775); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6386:1: rule__Class__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Class__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6390:1: ( ( ruleDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6391:1: ( ruleDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6391:1: ( ruleDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6392:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_312806);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6401:1: rule__Class__TransitionsAssignment_4_1 : ( ruleLabeledTransition ) ;
    public final void rule__Class__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6405:1: ( ( ruleLabeledTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6406:1: ( ruleLabeledTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6406:1: ( ruleLabeledTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6407:1: ruleLabeledTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_112837);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6416:1: rule__Class__AssertionsAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Class__AssertionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6420:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6421:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6421:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6422:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_112868);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6431:1: rule__VariableDeclaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6435:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6436:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6436:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6437:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_112899);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6446:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6450:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6451:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6451:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6452:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_212930); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6461:1: rule__VariableDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6465:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6466:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6466:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6467:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_112961);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6476:1: rule__VariableDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6480:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6481:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6481:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6482:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_112992);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6491:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6495:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6496:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6496:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6497:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113023); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6506:1: rule__Attribute__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6510:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6511:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6511:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6512:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313054);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6521:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6525:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6526:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6526:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6527:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213085); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6536:1: rule__EventDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6540:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6541:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6541:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6542:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113116);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6551:1: rule__EventDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6555:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6556:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6556:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6557:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113147);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6566:1: rule__ParameterDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6570:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6571:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6571:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6572:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_213178);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6581:1: rule__ParameterDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6585:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6586:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6586:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6587:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_313209); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6596:1: rule__ParameterDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ParameterDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6600:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6601:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6601:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6602:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_513240);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6611:1: rule__ObserverDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ObserverDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6615:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6616:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6616:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6617:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_213271);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6626:1: rule__ObserverDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObserverDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6630:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6631:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6631:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6632:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_313302); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6641:1: rule__ObserverDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ObserverDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6645:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6646:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6646:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6647:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_513333);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6656:1: rule__LabeledTransition__EventAssignment_0 : ( ruleNameRef ) ;
    public final void rule__LabeledTransition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6660:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6661:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6661:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6662:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_013364);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6671:1: rule__LabeledTransition__ExpressionAssignment_2 : ( ruleTransitionAnd ) ;
    public final void rule__LabeledTransition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6675:1: ( ( ruleTransitionAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6676:1: ( ruleTransitionAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6676:1: ( ruleTransitionAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6677:1: ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_213395);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6686:1: rule__TransitionAnd__RightAssignment_1_2 : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6690:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6691:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6691:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6692:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_213426);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6701:1: rule__TransitionOr__RightAssignment_1_2 : ( ruleTransition ) ;
    public final void rule__TransitionOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6705:1: ( ( ruleTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6706:1: ( ruleTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6706:1: ( ruleTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6707:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionOr__RightAssignment_1_213457);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6716:1: rule__Transition__GuardAssignment_1 : ( ruleExpression ) ;
    public final void rule__Transition__GuardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6720:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6721:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6721:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6722:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_113488);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6731:1: rule__Transition__ActionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6735:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6736:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6736:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6737:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Transition__ActionAssignment_313519);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6746:1: rule__Assignment__VariableAssignment_1 : ( ruleNameRef ) ;
    public final void rule__Assignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6750:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6751:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6751:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6752:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_113550);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6761:1: rule__Assignment__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6765:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6766:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6766:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6767:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_313581);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6776:1: rule__Block__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6780:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6781:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6781:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6782:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_213612);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6791:1: rule__Conditional__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6795:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6796:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6796:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6797:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Conditional__ConditionAssignment_213643);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6806:1: rule__Conditional__ThenAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Conditional__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6810:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6811:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6811:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6812:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Conditional__ThenAssignment_413674);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6821:1: rule__Conditional__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Conditional__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6825:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6826:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6826:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6827:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Conditional__ElseAssignment_5_113705);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6836:1: rule__Switch__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__Switch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6840:1: ( ( ruleCaseExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6841:1: ( ruleCaseExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6841:1: ( ruleCaseExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6842:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_rule__Switch__CasesAssignment_213736);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6851:1: rule__Switch__ElseAssignment_5 : ( ruleExpression ) ;
    public final void rule__Switch__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6855:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6856:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6856:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6857:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Switch__ElseAssignment_513767);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6866:1: rule__CaseExpression__ConditionAssignment_0 : ( ruleExpression ) ;
    public final void rule__CaseExpression__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6870:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6871:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6871:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6872:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__ConditionAssignment_013798);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6881:1: rule__CaseExpression__ThenAssignment_2 : ( ruleInstruction ) ;
    public final void rule__CaseExpression__ThenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6885:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6886:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6886:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6887:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getThenInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__CaseExpression__ThenAssignment_213829);
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


    // $ANTLR start "rule__Logical__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6896:1: rule__Logical__OpAssignment_1_0_1 : ( ( rule__Logical__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Logical__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6900:1: ( ( ( rule__Logical__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6901:1: ( ( rule__Logical__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6901:1: ( ( rule__Logical__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6902:1: ( rule__Logical__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6903:1: ( rule__Logical__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6903:2: rule__Logical__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Logical__OpAlternatives_1_0_1_0_in_rule__Logical__OpAssignment_1_0_113860);
            rule__Logical__OpAlternatives_1_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getOpAlternatives_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__OpAssignment_1_0_1"


    // $ANTLR start "rule__Logical__RightAssignment_1_0_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6912:1: rule__Logical__RightAssignment_1_0_2 : ( ruleRelation ) ;
    public final void rule__Logical__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6916:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6917:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6917:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6918:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__Logical__RightAssignment_1_0_213893);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Logical__RightAssignment_1_0_2"


    // $ANTLR start "rule__Relation__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6927:1: rule__Relation__OpAssignment_1_0_1 : ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Relation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6931:1: ( ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6932:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6932:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6933:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6934:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6934:2: rule__Relation__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_113924);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6943:1: rule__Relation__RightAssignment_1_0_2 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6947:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6948:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6948:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6949:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_213957);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6958:1: rule__Addition__OpAssignment_1_0_1 : ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Addition__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6962:1: ( ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6963:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6963:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6964:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6965:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6965:2: rule__Addition__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_113988);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6974:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6978:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6979:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6979:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6980:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214021);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6989:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6993:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6994:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6994:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6995:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6996:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6996:2: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114052);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7005:1: rule__Multiplication__RightAssignment_1_0_2 : ( ruleNeg ) ;
    public final void rule__Multiplication__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7009:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7010:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7010:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7011:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214085);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7020:1: rule__Neg__ExpressionAssignment_0_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7024:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7025:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7025:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7026:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214116);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7035:1: rule__Neg__ExpressionAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7039:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7040:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7040:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7041:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214147);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7050:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7054:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7055:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7055:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7056:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7057:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7057:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment14178);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7066:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7070:1: ( ( RULE_STRING ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7071:1: ( RULE_STRING )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7071:1: ( RULE_STRING )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7072:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14211); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7081:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7085:1: ( ( RULE_INT ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7086:1: ( RULE_INT )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7086:1: ( RULE_INT )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7087:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment14242); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7096:1: rule__NameRef__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7100:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7101:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7101:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7102:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7103:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7104:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_014277); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7115:1: rule__NameRef__VariableAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7119:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7120:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7120:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7121:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7122:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7123:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_214316); if (state.failed) return ;
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
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000880000002L});
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
    public static final BitSet FOLLOW_ruleLogical_in_ruleExpression1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__0_in_ruleLogical1660 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__AbstractDeclaration__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__AbstractDeclaration__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_rule__Type__Alternatives2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_rule__Type__Alternatives2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_rule__Instruction__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_rule__Instruction__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Logical__OpAlternatives_1_0_1_02556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Logical__OpAlternatives_1_0_1_02576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_02611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_02631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Relation__OpAlternatives_1_0_1_02651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Relation__OpAlternatives_1_0_1_02671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Relation__OpAlternatives_1_0_1_02691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Relation__OpAlternatives_1_0_1_02711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Addition__OpAlternatives_1_0_1_02746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Addition__OpAlternatives_1_0_1_02766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Multiplication__OpAlternatives_1_0_1_02801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Multiplication__OpAlternatives_1_0_1_02821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__Alternatives2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Atom__Alternatives2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BooleanLiteral__ValueAlternatives_03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BooleanLiteral__ValueAlternatives_03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BaseTypeEnum__Alternatives3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BaseTypeEnum__Alternatives3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03134 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13195 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Domain__Group__1__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23257 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33317 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Domain__Group__3__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43379 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__43382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__0_in_rule__Domain__Group__4__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__53440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Domain__Group__5__Impl3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__0__Impl_in_rule__Domain__Group_4__03511 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__1_in_rule__Domain__Group_4__03514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ConstantsAssignment_4_0_in_rule__Domain__Group_4__0__Impl3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4__1__Impl_in_rule__Domain__Group_4__13571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__0_in_rule__Domain__Group_4__1__Impl3598 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__0__Impl_in_rule__Domain__Group_4_1__03633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__1_in_rule__Domain__Group_4_1__03636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Domain__Group_4_1__0__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_4_1__1__Impl_in_rule__Domain__Group_4_1__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ConstantsAssignment_4_1_1_in_rule__Domain__Group_4_1__1__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__0__Impl_in_rule__SymbolicConstant__Group__03756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__1_in_rule__SymbolicConstant__Group__03759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__Group__1__Impl_in_rule__SymbolicConstant__Group__13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolicConstant__NameAssignment_1_in_rule__SymbolicConstant__Group__1__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__03878 = new BitSet(new long[]{0x0000000880000000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__03881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__13939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Class__Group__1__Impl3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24001 = new BitSet(new long[]{0x0000387060000010L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34061 = new BitSet(new long[]{0x0000387060000010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl4091 = new BitSet(new long[]{0x0000380060000012L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__44122 = new BitSet(new long[]{0x0000387060000010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__44125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__54183 = new BitSet(new long[]{0x0000387060000010L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__54186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__64244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Class__Group__6__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__04317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__04320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Class__Group_4__0__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4408 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl4420 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__04457 = new BitSet(new long[]{0x0094000100000010L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__04460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Class__Group_5__0__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4548 = new BitSet(new long[]{0x0094000100000012L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl4560 = new BitSet(new long[]{0x0094000100000012L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__04597 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__04600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__14658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__14661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__24718 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__24721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__34778 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__34781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__44839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VariableDeclaration__Group__4__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__04908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__04911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__VariableDeclaration__Group_3__0__Impl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__14970 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__14973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25030 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5060 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__35091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__VariableDeclaration__Group_3__3__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__05158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__05161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VariableDeclaration__Group_3_2__0__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__15220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15342 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25402 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Attribute__Group__2__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__05529 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__05532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__15590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__15593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__EventDeclaration__Group__1__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__25652 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__25655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl5682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__35712 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__4_in_rule__EventDeclaration__Group__35715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__4__Impl_in_rule__EventDeclaration__Group__45773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventDeclaration__Group__4__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__05842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__05845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EventDeclaration__Group_3__0__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__15904 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__15907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__25964 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__25967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl5994 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EventDeclaration__Group_3__3__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__06092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__06095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__EventDeclaration__Group_3_2__0__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__16154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__06215 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__06218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__16276 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__16279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ParameterDeclaration__Group__1__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__26338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__26341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl6368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__36398 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__36401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__46458 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__46461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ParameterDeclaration__Group__4__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__56520 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__56523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__66580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParameterDeclaration__Group__6__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__06653 = new BitSet(new long[]{0x0000380060000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__06656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__16714 = new BitSet(new long[]{0x0000000060000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__16717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ObserverDeclaration__Group__1__Impl6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__26776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__26779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__36836 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__36839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__46896 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__46899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ObserverDeclaration__Group__4__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__56958 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__56961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ObserverDeclaration__Group__6__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__07091 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__07094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__17151 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__17154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__LabeledTransition__Group__1__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__27213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl7240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__07276 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__07279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__17335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl7362 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__07397 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__07400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__17458 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__17461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TransitionAnd__Group_1__1__Impl7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__27520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__07583 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__07586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionOr__Group__0__Impl7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__17642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl7669 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__07704 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__07707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__17765 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__17768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TransitionOr__Group_1__1__Impl7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__27827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__07890 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__07893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__17951 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__17954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__28011 = new BitSet(new long[]{0x0094000100000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__28014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Transition__Group__2__Impl8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__38073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_3_in_rule__Transition__Group__3__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08138 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18199 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Skip__Group__1__Impl8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__28261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Skip__Group__2__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__08326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__08329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__18387 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__18390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl8417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__28447 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__28450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Assignment__Group__2__Impl8478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__38509 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__38512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__48569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Assignment__Group__4__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__08638 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__08641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__18699 = new BitSet(new long[]{0x0094000100000010L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__18702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Block__Group__1__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__28761 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__28764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8793 = new BitSet(new long[]{0x0094000100000012L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl8805 = new BitSet(new long[]{0x0094000100000012L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__38838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Block__Group__3__Impl8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__0__Impl_in_rule__Conditional__Group__08905 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1_in_rule__Conditional__Group__08908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__1__Impl_in_rule__Conditional__Group__18966 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2_in_rule__Conditional__Group__18969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Conditional__Group__1__Impl8997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__2__Impl_in_rule__Conditional__Group__29028 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3_in_rule__Conditional__Group__29031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ConditionAssignment_2_in_rule__Conditional__Group__2__Impl9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__3__Impl_in_rule__Conditional__Group__39088 = new BitSet(new long[]{0x0094000100000010L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4_in_rule__Conditional__Group__39091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Conditional__Group__3__Impl9119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__4__Impl_in_rule__Conditional__Group__49150 = new BitSet(new long[]{0x0040008000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5_in_rule__Conditional__Group__49153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ThenAssignment_4_in_rule__Conditional__Group__4__Impl9180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__5__Impl_in_rule__Conditional__Group__59210 = new BitSet(new long[]{0x0040008000000000L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6_in_rule__Conditional__Group__59213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__0_in_rule__Conditional__Group__5__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group__6__Impl_in_rule__Conditional__Group__69271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Conditional__Group__6__Impl9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__0__Impl_in_rule__Conditional__Group_5__09344 = new BitSet(new long[]{0x0094000100000010L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__1_in_rule__Conditional__Group_5__09347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Conditional__Group_5__0__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__Group_5__1__Impl_in_rule__Conditional__Group_5__19408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conditional__ElseAssignment_5_1_in_rule__Conditional__Group_5__1__Impl9435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__09469 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__09472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Switch__Group__0__Impl9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__19531 = new BitSet(new long[]{0x0140010019000070L});
    public static final BitSet FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__19534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Switch__Group__1__Impl9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__29593 = new BitSet(new long[]{0x0140010019000070L});
    public static final BitSet FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__29596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__CasesAssignment_2_in_rule__Switch__Group__2__Impl9623 = new BitSet(new long[]{0x0100010019000072L});
    public static final BitSet FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__39654 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__39657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Switch__Group__3__Impl9685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__49716 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Switch__Group__5_in_rule__Switch__Group__49719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Switch__Group__4__Impl9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__5__Impl_in_rule__Switch__Group__59778 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__6_in_rule__Switch__Group__59781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__ElseAssignment_5_in_rule__Switch__Group__5__Impl9808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__6__Impl_in_rule__Switch__Group__69838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Switch__Group__6__Impl9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__09911 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__09914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__19971 = new BitSet(new long[]{0x0094000100000010L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__19974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__CaseExpression__Group__1__Impl10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__210033 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__210036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ThenAssignment_2_in_rule__CaseExpression__Group__2__Impl10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__310093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CaseExpression__Group__3__Impl10121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__0__Impl_in_rule__Logical__Group__010160 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Logical__Group__1_in_rule__Logical__Group__010163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Logical__Group__0__Impl10190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__1__Impl_in_rule__Logical__Group__110219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__0_in_rule__Logical__Group__1__Impl10246 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__0__Impl_in_rule__Logical__Group_1__010281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__0_in_rule__Logical__Group_1__0__Impl10308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__0__Impl_in_rule__Logical__Group_1_0__010340 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__1_in_rule__Logical__Group_1_0__010343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__1__Impl_in_rule__Logical__Group_1_0__110401 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__2_in_rule__Logical__Group_1_0__110404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__OpAssignment_1_0_1_in_rule__Logical__Group_1_0__1__Impl10431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__2__Impl_in_rule__Logical__Group_1_0__210461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__RightAssignment_1_0_2_in_rule__Logical__Group_1_0__2__Impl10488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010524 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10610 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__010645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__010704 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__010707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__110765 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__110768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl10795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__210825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl10852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__010888 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__010891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__110947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl10974 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011068 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111129 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011252 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11338 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011432 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111493 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011616 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__111677 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__111680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Neg__Group_0__1__Impl11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__211741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl11768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__011804 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__011807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__111865 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__111868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Neg__Group_1__1__Impl11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__211929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl11956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__011992 = new BitSet(new long[]{0x0100010019000070L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__011995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Atom__Group_4__0__Impl12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__112054 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__2_in_rule__Atom__Group_4__112057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atom__Group_4__1__Impl12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__2__Impl_in_rule__Atom__Group_4__212113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Atom__Group_4__2__Impl12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012178 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12265 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012359 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__NameRef__Group_1_0__1__Impl12451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_212581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_012612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_rule__Domain__ConstantsAssignment_4_1_112643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolicConstant__NameAssignment_112674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment12705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedType__RefAssignment12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_212775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_312806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_112837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_112868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_112899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_212930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_112961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_112992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_213178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_313209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_513240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_213271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_313302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_513333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_013364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_213395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_213426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionOr__RightAssignment_1_213457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Transition__GuardAssignment_113488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Transition__ActionAssignment_313519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_113550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_313581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_213612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Conditional__ConditionAssignment_213643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Conditional__ThenAssignment_413674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Conditional__ElseAssignment_5_113705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rule__Switch__CasesAssignment_213736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Switch__ElseAssignment_513767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__ConditionAssignment_013798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__CaseExpression__ThenAssignment_213829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__OpAlternatives_1_0_1_0_in_rule__Logical__OpAssignment_1_0_113860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Logical__RightAssignment_1_0_213893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_113924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_213957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_113988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment14178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment14242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_014277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_214316 = new BitSet(new long[]{0x0000000000000002L});

}