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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'Integer'", "'Boolean'", "':'", "'['", "','", "']'", "'{'", "'}'", "'class'", "'end'", "'transition'", "'assertion'", "';'", "'('", "')'", "'event'", "'parameter'", "'observer'", "'&'", "'|'", "'$transition'", "'skip'", "':='", "'if'", "'then'", "'else'", "'not'", "'.'", "'case {'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
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

                if ( (LA1_0==33) ) {
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:98:1: ruleAbstractDeclaration : ( ruleClass ) ;
    public final void ruleAbstractDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:102:2: ( ( ruleClass ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:103:1: ( ruleClass )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:103:1: ( ruleClass )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:104:1: ruleClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleClass_in_ruleAbstractDeclaration161);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleAbstractDefinitionConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:119:1: entryRuleAbstractDefinitionConstant : ruleAbstractDefinitionConstant EOF ;
    public final void entryRuleAbstractDefinitionConstant() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:120:1: ( ruleAbstractDefinitionConstant EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:121:1: ruleAbstractDefinitionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDefinitionConstantRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant189);
            ruleAbstractDefinitionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDefinitionConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant196); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractDefinitionConstant"


    // $ANTLR start "ruleAbstractDefinitionConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:128:1: ruleAbstractDefinitionConstant : ( ( rule__AbstractDefinitionConstant__Alternatives ) ) ;
    public final void ruleAbstractDefinitionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:132:2: ( ( ( rule__AbstractDefinitionConstant__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:133:1: ( ( rule__AbstractDefinitionConstant__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:133:1: ( ( rule__AbstractDefinitionConstant__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:134:1: ( rule__AbstractDefinitionConstant__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDefinitionConstantAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:135:1: ( rule__AbstractDefinitionConstant__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:135:2: rule__AbstractDefinitionConstant__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDefinitionConstant__Alternatives_in_ruleAbstractDefinitionConstant222);
            rule__AbstractDefinitionConstant__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDefinitionConstantAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractDefinitionConstant"


    // $ANTLR start "entryRuleExpressionConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:147:1: entryRuleExpressionConstant : ruleExpressionConstant EOF ;
    public final void entryRuleExpressionConstant() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:148:1: ( ruleExpressionConstant EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:149:1: ruleExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant249);
            ruleExpressionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionConstant256); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpressionConstant"


    // $ANTLR start "ruleExpressionConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:156:1: ruleExpressionConstant : ( ( rule__ExpressionConstant__Group__0 ) ) ;
    public final void ruleExpressionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:160:2: ( ( ( rule__ExpressionConstant__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:161:1: ( ( rule__ExpressionConstant__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:161:1: ( ( rule__ExpressionConstant__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:162:1: ( rule__ExpressionConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:163:1: ( rule__ExpressionConstant__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:163:2: rule__ExpressionConstant__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionConstant__Group__0_in_ruleExpressionConstant282);
            rule__ExpressionConstant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstant"


    // $ANTLR start "entryRuleDomainConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:175:1: entryRuleDomainConstant : ruleDomainConstant EOF ;
    public final void entryRuleDomainConstant() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:176:1: ( ruleDomainConstant EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:177:1: ruleDomainConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantRule()); 
            }
            pushFollow(FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant309);
            ruleDomainConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainConstant316); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDomainConstant"


    // $ANTLR start "ruleDomainConstant"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:184:1: ruleDomainConstant : ( ( rule__DomainConstant__Group__0 ) ) ;
    public final void ruleDomainConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:188:2: ( ( ( rule__DomainConstant__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:189:1: ( ( rule__DomainConstant__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:189:1: ( ( rule__DomainConstant__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:190:1: ( rule__DomainConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:191:1: ( rule__DomainConstant__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:191:2: rule__DomainConstant__Group__0
            {
            pushFollow(FOLLOW_rule__DomainConstant__Group__0_in_ruleDomainConstant342);
            rule__DomainConstant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainConstant"


    // $ANTLR start "entryRuleAbstractDomain"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:205:1: entryRuleAbstractDomain : ruleAbstractDomain EOF ;
    public final void entryRuleAbstractDomain() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:206:1: ( ruleAbstractDomain EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:207:1: ruleAbstractDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDomainRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain371);
            ruleAbstractDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDomainRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDomain378); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractDomain"


    // $ANTLR start "ruleAbstractDomain"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:214:1: ruleAbstractDomain : ( ( rule__AbstractDomain__Alternatives ) ) ;
    public final void ruleAbstractDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:218:2: ( ( ( rule__AbstractDomain__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:219:1: ( ( rule__AbstractDomain__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:219:1: ( ( rule__AbstractDomain__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:220:1: ( rule__AbstractDomain__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDomainAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:221:1: ( rule__AbstractDomain__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:221:2: rule__AbstractDomain__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDomain__Alternatives_in_ruleAbstractDomain404);
            rule__AbstractDomain__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDomainAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractDomain"


    // $ANTLR start "entryRuleRange"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:233:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:234:1: ( ruleRange EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:235:1: ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange431);
            ruleRange();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange438); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:242:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:246:2: ( ( ( rule__Range__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:247:1: ( ( rule__Range__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:247:1: ( ( rule__Range__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:248:1: ( rule__Range__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:249:1: ( rule__Range__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:249:2: rule__Range__Group__0
            {
            pushFollow(FOLLOW_rule__Range__Group__0_in_ruleRange464);
            rule__Range__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleEnumeration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:261:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:262:1: ( ruleEnumeration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:263:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration491);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration498); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:270:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:274:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:275:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:275:1: ( ( rule__Enumeration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:276:1: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:277:1: ( rule__Enumeration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:277:2: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration524);
            rule__Enumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:289:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:290:1: ( ruleLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:291:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral551);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral558); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:298:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:302:2: ( ( ( rule__Literal__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:303:1: ( ( rule__Literal__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:303:1: ( ( rule__Literal__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:304:1: ( rule__Literal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:305:1: ( rule__Literal__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:305:2: rule__Literal__Group__0
            {
            pushFollow(FOLLOW_rule__Literal__Group__0_in_ruleLiteral584);
            rule__Literal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:317:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:318:1: ( ruleType EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:319:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType611);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType618); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:326:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:330:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:331:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:331:1: ( ( rule__Type__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:332:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:333:1: ( rule__Type__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:333:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType644);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:345:1: entryRuleBaseType : ruleBaseType EOF ;
    public final void entryRuleBaseType() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:346:1: ( ruleBaseType EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:347:1: ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType671);
            ruleBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType678); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:354:1: ruleBaseType : ( ( rule__BaseType__NameAssignment ) ) ;
    public final void ruleBaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:358:2: ( ( ( rule__BaseType__NameAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:359:1: ( ( rule__BaseType__NameAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:359:1: ( ( rule__BaseType__NameAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:360:1: ( rule__BaseType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:361:1: ( rule__BaseType__NameAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:361:2: rule__BaseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BaseType__NameAssignment_in_ruleBaseType704);
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


    // $ANTLR start "entryRuleClassType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:373:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:374:1: ( ruleClassType EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:375:1: ruleClassType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeRule()); 
            }
            pushFollow(FOLLOW_ruleClassType_in_entryRuleClassType731);
            ruleClassType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassType738); if (state.failed) return ;

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:382:1: ruleClassType : ( ( rule__ClassType__ClassAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:386:2: ( ( ( rule__ClassType__ClassAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:387:1: ( ( rule__ClassType__ClassAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:387:1: ( ( rule__ClassType__ClassAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:388:1: ( rule__ClassType__ClassAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:389:1: ( rule__ClassType__ClassAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:389:2: rule__ClassType__ClassAssignment
            {
            pushFollow(FOLLOW_rule__ClassType__ClassAssignment_in_ruleClassType764);
            rule__ClassType__ClassAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeAccess().getClassAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleClass"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:401:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:402:1: ( ruleClass EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:403:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass791);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass798); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:410:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:414:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:415:1: ( ( rule__Class__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:415:1: ( ( rule__Class__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:416:1: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:417:1: ( rule__Class__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:417:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass824);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:429:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:430:1: ( ruleDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:431:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration851);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration858); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:438:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:442:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:443:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:443:1: ( ( rule__Declaration__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:444:1: ( rule__Declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:445:1: ( rule__Declaration__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:445:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration884);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:457:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:458:1: ( ruleVariableDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:459:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration911);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration918); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:466:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:470:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:471:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:471:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:472:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:473:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:473:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration944);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:485:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:486:1: ( ruleAttribute EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:487:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute971);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute978); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:494:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:498:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:499:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:499:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:500:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:501:1: ( rule__Attribute__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:501:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1004);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:513:1: entryRuleEventDeclaration : ruleEventDeclaration EOF ;
    public final void entryRuleEventDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:514:1: ( ruleEventDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:515:1: ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration1031);
            ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclaration1038); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:522:1: ruleEventDeclaration : ( ( rule__EventDeclaration__Group__0 ) ) ;
    public final void ruleEventDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:526:2: ( ( ( rule__EventDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:527:1: ( ( rule__EventDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:527:1: ( ( rule__EventDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:528:1: ( rule__EventDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:529:1: ( rule__EventDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:529:2: rule__EventDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__0_in_ruleEventDeclaration1064);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:541:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:542:1: ( ruleParameterDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:543:1: ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1091);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1098); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:550:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:554:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:555:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:555:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:556:1: ( rule__ParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:557:1: ( rule__ParameterDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:557:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration1124);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:569:1: entryRuleObserverDeclaration : ruleObserverDeclaration EOF ;
    public final void entryRuleObserverDeclaration() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:570:1: ( ruleObserverDeclaration EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:571:1: ruleObserverDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration1151);
            ruleObserverDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObserverDeclaration1158); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:578:1: ruleObserverDeclaration : ( ( rule__ObserverDeclaration__Group__0 ) ) ;
    public final void ruleObserverDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:582:2: ( ( ( rule__ObserverDeclaration__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:583:1: ( ( rule__ObserverDeclaration__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:583:1: ( ( rule__ObserverDeclaration__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:584:1: ( rule__ObserverDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:585:1: ( rule__ObserverDeclaration__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:585:2: rule__ObserverDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__0_in_ruleObserverDeclaration1184);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:597:1: entryRuleLabeledTransition : ruleLabeledTransition EOF ;
    public final void entryRuleLabeledTransition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:598:1: ( ruleLabeledTransition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:599:1: ruleLabeledTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition1211);
            ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledTransition1218); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:606:1: ruleLabeledTransition : ( ( rule__LabeledTransition__Group__0 ) ) ;
    public final void ruleLabeledTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:610:2: ( ( ( rule__LabeledTransition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:611:1: ( ( rule__LabeledTransition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:611:1: ( ( rule__LabeledTransition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:612:1: ( rule__LabeledTransition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:613:1: ( rule__LabeledTransition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:613:2: rule__LabeledTransition__Group__0
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__0_in_ruleLabeledTransition1244);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:625:1: entryRuleTransitionAnd : ruleTransitionAnd EOF ;
    public final void entryRuleTransitionAnd() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:626:1: ( ruleTransitionAnd EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:627:1: ruleTransitionAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd1271);
            ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionAnd1278); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:634:1: ruleTransitionAnd : ( ( rule__TransitionAnd__Group__0 ) ) ;
    public final void ruleTransitionAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:638:2: ( ( ( rule__TransitionAnd__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:639:1: ( ( rule__TransitionAnd__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:639:1: ( ( rule__TransitionAnd__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:640:1: ( rule__TransitionAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:641:1: ( rule__TransitionAnd__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:641:2: rule__TransitionAnd__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__0_in_ruleTransitionAnd1304);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:653:1: entryRuleTransitionOr : ruleTransitionOr EOF ;
    public final void entryRuleTransitionOr() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:654:1: ( ruleTransitionOr EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:655:1: ruleTransitionOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr1331);
            ruleTransitionOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionOr1338); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:662:1: ruleTransitionOr : ( ( rule__TransitionOr__Group__0 ) ) ;
    public final void ruleTransitionOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:666:2: ( ( ( rule__TransitionOr__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:667:1: ( ( rule__TransitionOr__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:667:1: ( ( rule__TransitionOr__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:668:1: ( rule__TransitionOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:669:1: ( rule__TransitionOr__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:669:2: rule__TransitionOr__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__0_in_ruleTransitionOr1364);
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


    // $ANTLR start "entryRuleITransition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:681:1: entryRuleITransition : ruleITransition EOF ;
    public final void entryRuleITransition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:682:1: ( ruleITransition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:683:1: ruleITransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getITransitionRule()); 
            }
            pushFollow(FOLLOW_ruleITransition_in_entryRuleITransition1391);
            ruleITransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getITransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleITransition1398); if (state.failed) return ;

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
    // $ANTLR end "entryRuleITransition"


    // $ANTLR start "ruleITransition"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:690:1: ruleITransition : ( ( rule__ITransition__Group__0 ) ) ;
    public final void ruleITransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:694:2: ( ( ( rule__ITransition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:695:1: ( ( rule__ITransition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:695:1: ( ( rule__ITransition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:696:1: ( rule__ITransition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getITransitionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:697:1: ( rule__ITransition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:697:2: rule__ITransition__Group__0
            {
            pushFollow(FOLLOW_rule__ITransition__Group__0_in_ruleITransition1424);
            rule__ITransition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getITransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleITransition"


    // $ANTLR start "entryRuleInstruction"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:709:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:710:1: ( ruleInstruction EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:711:1: ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction1451);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction1458); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:718:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:722:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:723:1: ( ( rule__Instruction__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:723:1: ( ( rule__Instruction__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:724:1: ( rule__Instruction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:725:1: ( rule__Instruction__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:725:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction1484);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:737:1: entryRuleSkip : ruleSkip EOF ;
    public final void entryRuleSkip() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:738:1: ( ruleSkip EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:739:1: ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip1511);
            ruleSkip();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip1518); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:746:1: ruleSkip : ( ( rule__Skip__Group__0 ) ) ;
    public final void ruleSkip() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:750:2: ( ( ( rule__Skip__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:751:1: ( ( rule__Skip__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:751:1: ( ( rule__Skip__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:752:1: ( rule__Skip__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:753:1: ( rule__Skip__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:753:2: rule__Skip__Group__0
            {
            pushFollow(FOLLOW_rule__Skip__Group__0_in_ruleSkip1544);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:765:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:766:1: ( ruleAssignment EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:767:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1571);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1578); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:774:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:778:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:779:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:779:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:780:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:781:1: ( rule__Assignment__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:781:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1604);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:793:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:794:1: ( ruleBlock EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:795:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1631);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1638); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:802:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:806:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:807:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:807:1: ( ( rule__Block__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:808:1: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:809:1: ( rule__Block__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:809:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock1664);
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


    // $ANTLR start "entryRuleIfThenElse"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:821:1: entryRuleIfThenElse : ruleIfThenElse EOF ;
    public final void entryRuleIfThenElse() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:822:1: ( ruleIfThenElse EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:823:1: ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1691);
            ruleIfThenElse();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse1698); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:830:1: ruleIfThenElse : ( ( rule__IfThenElse__Group__0 ) ) ;
    public final void ruleIfThenElse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:834:2: ( ( ( rule__IfThenElse__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:835:1: ( ( rule__IfThenElse__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:835:1: ( ( rule__IfThenElse__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:836:1: ( rule__IfThenElse__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:837:1: ( rule__IfThenElse__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:837:2: rule__IfThenElse__Group__0
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__0_in_ruleIfThenElse1724);
            rule__IfThenElse__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleExpression"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:849:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:850:1: ( ruleExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:851:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1751);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1758); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:858:1: ruleExpression : ( ruleLogical ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:862:2: ( ( ruleLogical ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:863:1: ( ruleLogical )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:863:1: ( ruleLogical )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:864:1: ruleLogical
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleLogical_in_ruleExpression1784);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:877:1: entryRuleLogical : ruleLogical EOF ;
    public final void entryRuleLogical() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:878:1: ( ruleLogical EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:879:1: ruleLogical EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical1810);
            ruleLogical();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical1817); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:886:1: ruleLogical : ( ( rule__Logical__Group__0 ) ) ;
    public final void ruleLogical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:890:2: ( ( ( rule__Logical__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:891:1: ( ( rule__Logical__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:891:1: ( ( rule__Logical__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:892:1: ( rule__Logical__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:893:1: ( rule__Logical__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:893:2: rule__Logical__Group__0
            {
            pushFollow(FOLLOW_rule__Logical__Group__0_in_ruleLogical1843);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:905:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:906:1: ( ruleRelation EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:907:1: ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1870);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1877); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:914:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:918:2: ( ( ( rule__Relation__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:919:1: ( ( rule__Relation__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:919:1: ( ( rule__Relation__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:920:1: ( rule__Relation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:921:1: ( rule__Relation__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:921:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_rule__Relation__Group__0_in_ruleRelation1903);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:933:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:934:1: ( ruleAddition EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:935:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1930);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1937); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:942:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:946:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:947:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:947:1: ( ( rule__Addition__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:948:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:949:1: ( rule__Addition__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:949:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1963);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:961:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:962:1: ( ruleMultiplication EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:963:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1990);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1997); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:970:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:974:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:975:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:975:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:976:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:977:1: ( rule__Multiplication__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:977:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication2023);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:989:1: entryRuleNeg : ruleNeg EOF ;
    public final void entryRuleNeg() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:990:1: ( ruleNeg EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:991:1: ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_entryRuleNeg2050);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg2057); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:998:1: ruleNeg : ( ( rule__Neg__Alternatives ) ) ;
    public final void ruleNeg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1002:2: ( ( ( rule__Neg__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1003:1: ( ( rule__Neg__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1003:1: ( ( rule__Neg__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1004:1: ( rule__Neg__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1005:1: ( rule__Neg__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1005:2: rule__Neg__Alternatives
            {
            pushFollow(FOLLOW_rule__Neg__Alternatives_in_ruleNeg2083);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1017:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1018:1: ( ruleAtom EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1019:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom2110);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom2117); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1026:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1030:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1031:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1031:1: ( ( rule__Atom__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1032:1: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1033:1: ( rule__Atom__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1033:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom2143);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1045:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1046:1: ( ruleBooleanLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1047:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2170);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral2177); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1054:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1058:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1059:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1059:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1060:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1061:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1061:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2203);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1073:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1074:1: ( ruleStringLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1075:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2230);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral2237); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1082:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1086:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1087:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1087:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1088:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1089:1: ( rule__StringLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1089:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2263);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1101:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1102:1: ( ruleIntegerLiteral EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1103:1: ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2290);
            ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral2297); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1110:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1114:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1115:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1115:1: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1116:1: ( rule__IntegerLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1117:1: ( rule__IntegerLiteral__ValueAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1117:2: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral2323);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1129:1: entryRuleNameRef : ruleNameRef EOF ;
    public final void entryRuleNameRef() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1130:1: ( ruleNameRef EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1131:1: ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_entryRuleNameRef2350);
            ruleNameRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameRef2357); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1138:1: ruleNameRef : ( ( rule__NameRef__Group__0 ) ) ;
    public final void ruleNameRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1142:2: ( ( ( rule__NameRef__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1143:1: ( ( rule__NameRef__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1143:1: ( ( rule__NameRef__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1144:1: ( rule__NameRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1145:1: ( rule__NameRef__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1145:2: rule__NameRef__Group__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0_in_ruleNameRef2383);
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


    // $ANTLR start "entryRuleDomainRef"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1161:1: entryRuleDomainRef : ruleDomainRef EOF ;
    public final void entryRuleDomainRef() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1162:1: ( ruleDomainRef EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1163:1: ruleDomainRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRefRule()); 
            }
            pushFollow(FOLLOW_ruleDomainRef_in_entryRuleDomainRef2414);
            ruleDomainRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainRef2421); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDomainRef"


    // $ANTLR start "ruleDomainRef"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1170:1: ruleDomainRef : ( ( rule__DomainRef__ReferenceAssignment ) ) ;
    public final void ruleDomainRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1174:2: ( ( ( rule__DomainRef__ReferenceAssignment ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1175:1: ( ( rule__DomainRef__ReferenceAssignment ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1175:1: ( ( rule__DomainRef__ReferenceAssignment ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1176:1: ( rule__DomainRef__ReferenceAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRefAccess().getReferenceAssignment()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:1: ( rule__DomainRef__ReferenceAssignment )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1177:2: rule__DomainRef__ReferenceAssignment
            {
            pushFollow(FOLLOW_rule__DomainRef__ReferenceAssignment_in_ruleDomainRef2447);
            rule__DomainRef__ReferenceAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRefAccess().getReferenceAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainRef"


    // $ANTLR start "entryRuleSwitch"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1191:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1192:1: ( ruleSwitch EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1193:1: ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch2476);
            ruleSwitch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch2483); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1200:1: ruleSwitch : ( ( rule__Switch__Group__0 ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1204:2: ( ( ( rule__Switch__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1205:1: ( ( rule__Switch__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1205:1: ( ( rule__Switch__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1206:1: ( rule__Switch__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1207:1: ( rule__Switch__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1207:2: rule__Switch__Group__0
            {
            pushFollow(FOLLOW_rule__Switch__Group__0_in_ruleSwitch2509);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1219:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1220:1: ( ruleCaseExpression EOF )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1221:1: ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression2536);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression2543); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1228:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1232:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1233:1: ( ( rule__CaseExpression__Group__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1233:1: ( ( rule__CaseExpression__Group__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1234:1: ( rule__CaseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1235:1: ( rule__CaseExpression__Group__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1235:2: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression2569);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1248:1: ruleBaseTypeEnum : ( ( rule__BaseTypeEnum__Alternatives ) ) ;
    public final void ruleBaseTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1252:1: ( ( ( rule__BaseTypeEnum__Alternatives ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1253:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1253:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1254:1: ( rule__BaseTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1255:1: ( rule__BaseTypeEnum__Alternatives )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1255:2: rule__BaseTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2606);
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


    // $ANTLR start "rule__AbstractDefinitionConstant__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1266:1: rule__AbstractDefinitionConstant__Alternatives : ( ( ruleExpressionConstant ) | ( ruleDomainConstant ) );
    public final void rule__AbstractDefinitionConstant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1270:1: ( ( ruleExpressionConstant ) | ( ruleDomainConstant ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1271:1: ( ruleExpressionConstant )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1271:1: ( ruleExpressionConstant )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1272:1: ruleExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDefinitionConstantAccess().getExpressionConstantParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleExpressionConstant_in_rule__AbstractDefinitionConstant__Alternatives2641);
                    ruleExpressionConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDefinitionConstantAccess().getExpressionConstantParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1277:6: ( ruleDomainConstant )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1277:6: ( ruleDomainConstant )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1278:1: ruleDomainConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDefinitionConstantAccess().getDomainConstantParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDomainConstant_in_rule__AbstractDefinitionConstant__Alternatives2658);
                    ruleDomainConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDefinitionConstantAccess().getDomainConstantParserRuleCall_1()); 
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
    // $ANTLR end "rule__AbstractDefinitionConstant__Alternatives"


    // $ANTLR start "rule__AbstractDomain__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1288:1: rule__AbstractDomain__Alternatives : ( ( ruleBaseType ) | ( ruleRange ) | ( ruleEnumeration ) );
    public final void rule__AbstractDomain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1292:1: ( ( ruleBaseType ) | ( ruleRange ) | ( ruleEnumeration ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
            case 26:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1293:1: ( ruleBaseType )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1293:1: ( ruleBaseType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1294:1: ruleBaseType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDomainAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBaseType_in_rule__AbstractDomain__Alternatives2690);
                    ruleBaseType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDomainAccess().getBaseTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1299:6: ( ruleRange )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1299:6: ( ruleRange )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1300:1: ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDomainAccess().getRangeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleRange_in_rule__AbstractDomain__Alternatives2707);
                    ruleRange();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDomainAccess().getRangeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1305:6: ( ruleEnumeration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1305:6: ( ruleEnumeration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1306:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDomainAccess().getEnumerationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleEnumeration_in_rule__AbstractDomain__Alternatives2724);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractDomainAccess().getEnumerationParserRuleCall_2()); 
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
    // $ANTLR end "rule__AbstractDomain__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1316:1: rule__Type__Alternatives : ( ( ( ruleBaseType ) ) | ( ruleClassType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1320:1: ( ( ( ruleBaseType ) ) | ( ruleClassType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=25 && LA4_0<=26)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1321:1: ( ( ruleBaseType ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1321:1: ( ( ruleBaseType ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1322:1: ( ruleBaseType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1323:1: ( ruleBaseType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1323:3: ruleBaseType
                    {
                    pushFollow(FOLLOW_ruleBaseType_in_rule__Type__Alternatives2757);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1327:6: ( ruleClassType )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1327:6: ( ruleClassType )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1328:1: ruleClassType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleClassType_in_rule__Type__Alternatives2775);
                    ruleClassType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getClassTypeParserRuleCall_1()); 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1338:1: rule__Declaration__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1342:1: ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 25:
            case 26:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1343:1: ( ruleVariableDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1343:1: ( ruleVariableDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1344:1: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2807);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1349:6: ( ruleEventDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1349:6: ( ruleEventDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1350:1: ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2824);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1355:6: ( ruleParameterDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1355:6: ( ruleParameterDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1356:1: ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2841);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1361:6: ( ruleObserverDeclaration )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1361:6: ( ruleObserverDeclaration )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1362:1: ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2858);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1372:1: rule__Instruction__Alternatives : ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleIfThenElse ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1376:1: ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleIfThenElse ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 48:
                {
                alt6=4;
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1377:1: ( ruleSkip )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1377:1: ( ruleSkip )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1378:1: ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2890);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1383:6: ( ruleAssignment )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1383:6: ( ruleAssignment )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1384:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2907);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1389:6: ( ruleBlock )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1389:6: ( ruleBlock )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1390:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2924);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1395:6: ( ruleIfThenElse )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1395:6: ( ruleIfThenElse )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1396:1: ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getIfThenElseParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleIfThenElse_in_rule__Instruction__Alternatives2941);
                    ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInstructionAccess().getIfThenElseParserRuleCall_3()); 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1406:1: rule__Logical__OpAlternatives_1_0_1_0 : ( ( 'and' ) | ( 'or' ) );
    public final void rule__Logical__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1410:1: ( ( 'and' ) | ( 'or' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1411:1: ( 'and' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1411:1: ( 'and' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1412:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalAccess().getOpAndKeyword_1_0_1_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Logical__OpAlternatives_1_0_1_02974); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalAccess().getOpAndKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1419:6: ( 'or' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1419:6: ( 'or' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1420:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalAccess().getOpOrKeyword_1_0_1_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Logical__OpAlternatives_1_0_1_02994); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1432:1: rule__Relation__OpAlternatives_1_0_1_0 : ( ( '=' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Relation__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1436:1: ( ( '=' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1437:1: ( '=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1437:1: ( '=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1438:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpEqualsSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Relation__OpAlternatives_1_0_1_03029); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpEqualsSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1445:6: ( '!=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1445:6: ( '!=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1446:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Relation__OpAlternatives_1_0_1_03049); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1453:6: ( '<' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1453:6: ( '<' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1454:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Relation__OpAlternatives_1_0_1_03069); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1461:6: ( '<=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1461:6: ( '<=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1462:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Relation__OpAlternatives_1_0_1_03089); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1469:6: ( '>=' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1469:6: ( '>=' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1470:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_03109); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1477:6: ( '>' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1477:6: ( '>' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1478:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_03129); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1490:1: rule__Addition__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1494:1: ( ( '+' ) | ( '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1495:1: ( '+' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1495:1: ( '+' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1496:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Addition__OpAlternatives_1_0_1_03164); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1503:6: ( '-' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1503:6: ( '-' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1504:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Addition__OpAlternatives_1_0_1_03184); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1516:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1520:1: ( ( '*' ) | ( '/' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1521:1: ( '*' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1521:1: ( '*' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1522:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Multiplication__OpAlternatives_1_0_1_03219); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1529:6: ( '/' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1529:6: ( '/' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1530:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Multiplication__OpAlternatives_1_0_1_03239); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1542:1: rule__Neg__Alternatives : ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) );
    public final void rule__Neg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1546:1: ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 23:
            case 24:
            case 38:
                {
                alt11=3;
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1547:1: ( ( rule__Neg__Group_0__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1547:1: ( ( rule__Neg__Group_0__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1548:1: ( rule__Neg__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1549:1: ( rule__Neg__Group_0__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1549:2: rule__Neg__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives3273);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1553:6: ( ( rule__Neg__Group_1__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1553:6: ( ( rule__Neg__Group_1__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1554:1: ( rule__Neg__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1555:1: ( rule__Neg__Group_1__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1555:2: rule__Neg__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives3291);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1559:6: ( ruleAtom )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1559:6: ( ruleAtom )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1560:1: ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAtom_in_rule__Neg__Alternatives3309);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1570:1: rule__Atom__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ( rule__Atom__Group_4__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1574:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleNameRef ) | ( ( rule__Atom__Group_4__0 ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            case 38:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1575:1: ( ruleBooleanLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1575:1: ( ruleBooleanLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1576:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives3341);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1581:6: ( ruleStringLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1581:6: ( ruleStringLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1582:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives3358);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1587:6: ( ruleIntegerLiteral )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1587:6: ( ruleIntegerLiteral )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1588:1: ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives3375);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1593:6: ( ruleNameRef )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1593:6: ( ruleNameRef )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1594:1: ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleNameRef_in_rule__Atom__Alternatives3392);
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1599:6: ( ( rule__Atom__Group_4__0 ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1599:6: ( ( rule__Atom__Group_4__0 ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1600:1: ( rule__Atom__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_4()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1601:1: ( rule__Atom__Group_4__0 )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1601:2: rule__Atom__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives3409);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1610:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1614:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
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
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1615:1: ( 'true' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1615:1: ( 'true' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1616:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__BooleanLiteral__ValueAlternatives_03443); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1623:6: ( 'false' )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1623:6: ( 'false' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1624:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__BooleanLiteral__ValueAlternatives_03463); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1638:1: rule__BaseTypeEnum__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__BaseTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1642:1: ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1643:1: ( ( 'Integer' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1643:1: ( ( 'Integer' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1644:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1645:1: ( 'Integer' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1645:3: 'Integer'
                    {
                    match(input,25,FOLLOW_25_in_rule__BaseTypeEnum__Alternatives3500); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1650:6: ( ( 'Boolean' ) )
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1650:6: ( ( 'Boolean' ) )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1651:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1652:1: ( 'Boolean' )
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1652:3: 'Boolean'
                    {
                    match(input,26,FOLLOW_26_in_rule__BaseTypeEnum__Alternatives3521); if (state.failed) return ;

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


    // $ANTLR start "rule__ExpressionConstant__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1665:1: rule__ExpressionConstant__Group__0 : rule__ExpressionConstant__Group__0__Impl rule__ExpressionConstant__Group__1 ;
    public final void rule__ExpressionConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1669:1: ( rule__ExpressionConstant__Group__0__Impl rule__ExpressionConstant__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1670:2: rule__ExpressionConstant__Group__0__Impl rule__ExpressionConstant__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionConstant__Group__0__Impl_in_rule__ExpressionConstant__Group__03555);
            rule__ExpressionConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExpressionConstant__Group__1_in_rule__ExpressionConstant__Group__03558);
            rule__ExpressionConstant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstant__Group__0"


    // $ANTLR start "rule__ExpressionConstant__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1677:1: rule__ExpressionConstant__Group__0__Impl : ( '=' ) ;
    public final void rule__ExpressionConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1681:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1682:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1682:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1683:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantAccess().getEqualsSignKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__ExpressionConstant__Group__0__Impl3586); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantAccess().getEqualsSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstant__Group__0__Impl"


    // $ANTLR start "rule__ExpressionConstant__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1696:1: rule__ExpressionConstant__Group__1 : rule__ExpressionConstant__Group__1__Impl ;
    public final void rule__ExpressionConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1700:1: ( rule__ExpressionConstant__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1701:2: rule__ExpressionConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionConstant__Group__1__Impl_in_rule__ExpressionConstant__Group__13617);
            rule__ExpressionConstant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstant__Group__1"


    // $ANTLR start "rule__ExpressionConstant__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1707:1: rule__ExpressionConstant__Group__1__Impl : ( ( rule__ExpressionConstant__OwnedExpressionAssignment_1 ) ) ;
    public final void rule__ExpressionConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1711:1: ( ( ( rule__ExpressionConstant__OwnedExpressionAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1712:1: ( ( rule__ExpressionConstant__OwnedExpressionAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1712:1: ( ( rule__ExpressionConstant__OwnedExpressionAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1713:1: ( rule__ExpressionConstant__OwnedExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantAccess().getOwnedExpressionAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1714:1: ( rule__ExpressionConstant__OwnedExpressionAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1714:2: rule__ExpressionConstant__OwnedExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ExpressionConstant__OwnedExpressionAssignment_1_in_rule__ExpressionConstant__Group__1__Impl3644);
            rule__ExpressionConstant__OwnedExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantAccess().getOwnedExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstant__Group__1__Impl"


    // $ANTLR start "rule__DomainConstant__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1728:1: rule__DomainConstant__Group__0 : rule__DomainConstant__Group__0__Impl rule__DomainConstant__Group__1 ;
    public final void rule__DomainConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1732:1: ( rule__DomainConstant__Group__0__Impl rule__DomainConstant__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1733:2: rule__DomainConstant__Group__0__Impl rule__DomainConstant__Group__1
            {
            pushFollow(FOLLOW_rule__DomainConstant__Group__0__Impl_in_rule__DomainConstant__Group__03678);
            rule__DomainConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainConstant__Group__1_in_rule__DomainConstant__Group__03681);
            rule__DomainConstant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group__0"


    // $ANTLR start "rule__DomainConstant__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1740:1: rule__DomainConstant__Group__0__Impl : ( ':' ) ;
    public final void rule__DomainConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1744:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1745:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1745:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1746:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getColonKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__DomainConstant__Group__0__Impl3709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getColonKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group__0__Impl"


    // $ANTLR start "rule__DomainConstant__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1759:1: rule__DomainConstant__Group__1 : rule__DomainConstant__Group__1__Impl rule__DomainConstant__Group__2 ;
    public final void rule__DomainConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1763:1: ( rule__DomainConstant__Group__1__Impl rule__DomainConstant__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1764:2: rule__DomainConstant__Group__1__Impl rule__DomainConstant__Group__2
            {
            pushFollow(FOLLOW_rule__DomainConstant__Group__1__Impl_in_rule__DomainConstant__Group__13740);
            rule__DomainConstant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainConstant__Group__2_in_rule__DomainConstant__Group__13743);
            rule__DomainConstant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group__1"


    // $ANTLR start "rule__DomainConstant__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1771:1: rule__DomainConstant__Group__1__Impl : ( ( rule__DomainConstant__DomainAssignment_1 ) ) ;
    public final void rule__DomainConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1775:1: ( ( ( rule__DomainConstant__DomainAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1776:1: ( ( rule__DomainConstant__DomainAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1776:1: ( ( rule__DomainConstant__DomainAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1777:1: ( rule__DomainConstant__DomainAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getDomainAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1778:1: ( rule__DomainConstant__DomainAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1778:2: rule__DomainConstant__DomainAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainConstant__DomainAssignment_1_in_rule__DomainConstant__Group__1__Impl3770);
            rule__DomainConstant__DomainAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getDomainAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group__1__Impl"


    // $ANTLR start "rule__DomainConstant__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1788:1: rule__DomainConstant__Group__2 : rule__DomainConstant__Group__2__Impl ;
    public final void rule__DomainConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1792:1: ( rule__DomainConstant__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1793:2: rule__DomainConstant__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DomainConstant__Group__2__Impl_in_rule__DomainConstant__Group__23800);
            rule__DomainConstant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group__2"


    // $ANTLR start "rule__DomainConstant__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1799:1: rule__DomainConstant__Group__2__Impl : ( ( rule__DomainConstant__Group_2__0 )? ) ;
    public final void rule__DomainConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1803:1: ( ( ( rule__DomainConstant__Group_2__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1804:1: ( ( rule__DomainConstant__Group_2__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1804:1: ( ( rule__DomainConstant__Group_2__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1805:1: ( rule__DomainConstant__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getGroup_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1806:1: ( rule__DomainConstant__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1806:2: rule__DomainConstant__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DomainConstant__Group_2__0_in_rule__DomainConstant__Group__2__Impl3827);
                    rule__DomainConstant__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group__2__Impl"


    // $ANTLR start "rule__DomainConstant__Group_2__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1822:1: rule__DomainConstant__Group_2__0 : rule__DomainConstant__Group_2__0__Impl rule__DomainConstant__Group_2__1 ;
    public final void rule__DomainConstant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1826:1: ( rule__DomainConstant__Group_2__0__Impl rule__DomainConstant__Group_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1827:2: rule__DomainConstant__Group_2__0__Impl rule__DomainConstant__Group_2__1
            {
            pushFollow(FOLLOW_rule__DomainConstant__Group_2__0__Impl_in_rule__DomainConstant__Group_2__03864);
            rule__DomainConstant__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DomainConstant__Group_2__1_in_rule__DomainConstant__Group_2__03867);
            rule__DomainConstant__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group_2__0"


    // $ANTLR start "rule__DomainConstant__Group_2__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1834:1: rule__DomainConstant__Group_2__0__Impl : ( '=' ) ;
    public final void rule__DomainConstant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1838:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1839:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1839:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1840:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__DomainConstant__Group_2__0__Impl3895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getEqualsSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group_2__0__Impl"


    // $ANTLR start "rule__DomainConstant__Group_2__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1853:1: rule__DomainConstant__Group_2__1 : rule__DomainConstant__Group_2__1__Impl ;
    public final void rule__DomainConstant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1857:1: ( rule__DomainConstant__Group_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1858:2: rule__DomainConstant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainConstant__Group_2__1__Impl_in_rule__DomainConstant__Group_2__13926);
            rule__DomainConstant__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group_2__1"


    // $ANTLR start "rule__DomainConstant__Group_2__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1864:1: rule__DomainConstant__Group_2__1__Impl : ( ( rule__DomainConstant__OwnedExpressionAssignment_2_1 ) ) ;
    public final void rule__DomainConstant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1868:1: ( ( ( rule__DomainConstant__OwnedExpressionAssignment_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1869:1: ( ( rule__DomainConstant__OwnedExpressionAssignment_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1869:1: ( ( rule__DomainConstant__OwnedExpressionAssignment_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1870:1: ( rule__DomainConstant__OwnedExpressionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getOwnedExpressionAssignment_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1871:1: ( rule__DomainConstant__OwnedExpressionAssignment_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1871:2: rule__DomainConstant__OwnedExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DomainConstant__OwnedExpressionAssignment_2_1_in_rule__DomainConstant__Group_2__1__Impl3953);
            rule__DomainConstant__OwnedExpressionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getOwnedExpressionAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__Group_2__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1886:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1890:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1891:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__03988);
            rule__Range__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__1_in_rule__Range__Group__03991);
            rule__Range__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1898:1: rule__Range__Group__0__Impl : ( '[' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1902:1: ( ( '[' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1903:1: ( '[' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1903:1: ( '[' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1904:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Range__Group__0__Impl4019); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1917:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1921:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1922:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__14050);
            rule__Range__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__2_in_rule__Range__Group__14053);
            rule__Range__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1929:1: rule__Range__Group__1__Impl : ( ( rule__Range__LowerAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1933:1: ( ( ( rule__Range__LowerAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1934:1: ( ( rule__Range__LowerAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1934:1: ( ( rule__Range__LowerAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1935:1: ( rule__Range__LowerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLowerAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1936:1: ( rule__Range__LowerAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1936:2: rule__Range__LowerAssignment_1
            {
            pushFollow(FOLLOW_rule__Range__LowerAssignment_1_in_rule__Range__Group__1__Impl4080);
            rule__Range__LowerAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLowerAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1946:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1950:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1951:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__24110);
            rule__Range__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__3_in_rule__Range__Group__24113);
            rule__Range__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1958:1: rule__Range__Group__2__Impl : ( ',' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1962:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1963:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1963:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1964:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getCommaKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Range__Group__2__Impl4141); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getCommaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1977:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1981:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1982:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FOLLOW_rule__Range__Group__3__Impl_in_rule__Range__Group__34172);
            rule__Range__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Range__Group__4_in_rule__Range__Group__34175);
            rule__Range__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1989:1: rule__Range__Group__3__Impl : ( ( rule__Range__UpperAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1993:1: ( ( ( rule__Range__UpperAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1994:1: ( ( rule__Range__UpperAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1994:1: ( ( rule__Range__UpperAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1995:1: ( rule__Range__UpperAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getUpperAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1996:1: ( rule__Range__UpperAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1996:2: rule__Range__UpperAssignment_3
            {
            pushFollow(FOLLOW_rule__Range__UpperAssignment_3_in_rule__Range__Group__3__Impl4202);
            rule__Range__UpperAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getUpperAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2006:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2010:1: ( rule__Range__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2011:2: rule__Range__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Range__Group__4__Impl_in_rule__Range__Group__44232);
            rule__Range__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2017:1: rule__Range__Group__4__Impl : ( ']' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2021:1: ( ( ']' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2022:1: ( ']' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2022:1: ( ']' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2023:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Range__Group__4__Impl4260); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2046:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2050:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2051:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04301);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04304);
            rule__Enumeration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2058:1: rule__Enumeration__Group__0__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2062:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2063:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2063:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2064:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Enumeration__Group__0__Impl4332); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2077:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2081:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2082:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__14363);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__14366);
            rule__Enumeration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2089:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__OwnedLiteralsAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2093:1: ( ( ( rule__Enumeration__OwnedLiteralsAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2094:1: ( ( rule__Enumeration__OwnedLiteralsAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2094:1: ( ( rule__Enumeration__OwnedLiteralsAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2095:1: ( rule__Enumeration__OwnedLiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getOwnedLiteralsAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2096:1: ( rule__Enumeration__OwnedLiteralsAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2096:2: rule__Enumeration__OwnedLiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__Enumeration__OwnedLiteralsAssignment_1_in_rule__Enumeration__Group__1__Impl4393);
            rule__Enumeration__OwnedLiteralsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getOwnedLiteralsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2106:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2110:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2111:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__24423);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__24426);
            rule__Enumeration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2118:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__Group_2__0 )* ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2122:1: ( ( ( rule__Enumeration__Group_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2123:1: ( ( rule__Enumeration__Group_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2123:1: ( ( rule__Enumeration__Group_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2124:1: ( rule__Enumeration__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2125:1: ( rule__Enumeration__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2125:2: rule__Enumeration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Enumeration__Group_2__0_in_rule__Enumeration__Group__2__Impl4453);
            	    rule__Enumeration__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2135:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2139:1: ( rule__Enumeration__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2140:2: rule__Enumeration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__34484);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2146:1: rule__Enumeration__Group__3__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2150:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2151:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2151:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2152:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Enumeration__Group__3__Impl4512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group_2__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2173:1: rule__Enumeration__Group_2__0 : rule__Enumeration__Group_2__0__Impl rule__Enumeration__Group_2__1 ;
    public final void rule__Enumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2177:1: ( rule__Enumeration__Group_2__0__Impl rule__Enumeration__Group_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2178:2: rule__Enumeration__Group_2__0__Impl rule__Enumeration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Enumeration__Group_2__0__Impl_in_rule__Enumeration__Group_2__04551);
            rule__Enumeration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enumeration__Group_2__1_in_rule__Enumeration__Group_2__04554);
            rule__Enumeration__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2__0"


    // $ANTLR start "rule__Enumeration__Group_2__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2185:1: rule__Enumeration__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2189:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2190:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2190:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2191:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getCommaKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Enumeration__Group_2__0__Impl4582); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_2__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2204:1: rule__Enumeration__Group_2__1 : rule__Enumeration__Group_2__1__Impl ;
    public final void rule__Enumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2208:1: ( rule__Enumeration__Group_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2209:2: rule__Enumeration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Enumeration__Group_2__1__Impl_in_rule__Enumeration__Group_2__14613);
            rule__Enumeration__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2__1"


    // $ANTLR start "rule__Enumeration__Group_2__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2215:1: rule__Enumeration__Group_2__1__Impl : ( ( rule__Enumeration__OwnedLiteralsAssignment_2_1 ) ) ;
    public final void rule__Enumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2219:1: ( ( ( rule__Enumeration__OwnedLiteralsAssignment_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2220:1: ( ( rule__Enumeration__OwnedLiteralsAssignment_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2220:1: ( ( rule__Enumeration__OwnedLiteralsAssignment_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2221:1: ( rule__Enumeration__OwnedLiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getOwnedLiteralsAssignment_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2222:1: ( rule__Enumeration__OwnedLiteralsAssignment_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2222:2: rule__Enumeration__OwnedLiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Enumeration__OwnedLiteralsAssignment_2_1_in_rule__Enumeration__Group_2__1__Impl4640);
            rule__Enumeration__OwnedLiteralsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getOwnedLiteralsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2236:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2240:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2241:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__04674);
            rule__Literal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__04677);
            rule__Literal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0"


    // $ANTLR start "rule__Literal__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2248:1: rule__Literal__Group__0__Impl : ( () ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2252:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2253:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2253:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2254:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getEnumerationLiteralAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2255:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2257:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getEnumerationLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0__Impl"


    // $ANTLR start "rule__Literal__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2267:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2271:1: ( rule__Literal__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2272:2: rule__Literal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__14735);
            rule__Literal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1"


    // $ANTLR start "rule__Literal__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2278:1: rule__Literal__Group__1__Impl : ( ( rule__Literal__NameAssignment_1 ) ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2282:1: ( ( ( rule__Literal__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:1: ( ( rule__Literal__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2283:1: ( ( rule__Literal__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2284:1: ( rule__Literal__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2285:1: ( rule__Literal__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2285:2: rule__Literal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_in_rule__Literal__Group__1__Impl4762);
            rule__Literal__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2299:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2303:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2304:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__04796);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__04799);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2311:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2315:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2316:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2316:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2317:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNodeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2318:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2320:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2330:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2334:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2335:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__14857);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__14860);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2342:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2346:1: ( ( 'class' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2347:1: ( 'class' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2347:1: ( 'class' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2348:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Class__Group__1__Impl4888); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2361:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2365:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2366:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24919);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24922);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2373:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2377:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2378:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2378:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2379:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2380:1: ( rule__Class__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2380:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4949);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2390:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2394:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2395:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34979);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34982);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2402:1: rule__Class__Group__3__Impl : ( ( rule__Class__DeclarationsAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2406:1: ( ( ( rule__Class__DeclarationsAssignment_3 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2407:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2407:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2408:1: ( rule__Class__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2409:1: ( rule__Class__DeclarationsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=25 && LA17_0<=26)||(LA17_0>=40 && LA17_0<=42)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2409:2: rule__Class__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl5009);
            	    rule__Class__DeclarationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2419:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2423:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2424:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__45040);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__45043);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2431:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2435:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2436:1: ( ( rule__Class__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2436:1: ( ( rule__Class__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2437:1: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2438:1: ( rule__Class__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2438:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl5070);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2448:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2452:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2453:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__55101);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__55104);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2460:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2464:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2465:1: ( ( rule__Class__Group_5__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2465:1: ( ( rule__Class__Group_5__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2466:1: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2467:1: ( rule__Class__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2467:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl5131);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2477:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2481:1: ( rule__Class__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2482:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__65162);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2488:1: rule__Class__Group__6__Impl : ( 'end' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2492:1: ( ( 'end' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2493:1: ( 'end' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2493:1: ( 'end' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2494:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }
            match(input,34,FOLLOW_34_in_rule__Class__Group__6__Impl5190); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2521:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2525:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2526:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__05235);
            rule__Class__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__05238);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2533:1: rule__Class__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2537:1: ( ( 'transition' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2538:1: ( 'transition' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2538:1: ( 'transition' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2539:1: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Class__Group_4__0__Impl5266); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2552:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2556:1: ( rule__Class__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2557:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__15297);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2563:1: rule__Class__Group_4__1__Impl : ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2567:1: ( ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2568:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2568:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2569:1: ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2569:1: ( ( rule__Class__TransitionsAssignment_4_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2570:1: ( rule__Class__TransitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2571:1: ( rule__Class__TransitionsAssignment_4_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2571:2: rule__Class__TransitionsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl5326);
            rule__Class__TransitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2574:1: ( ( rule__Class__TransitionsAssignment_4_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2575:1: ( rule__Class__TransitionsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2576:1: ( rule__Class__TransitionsAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2576:2: rule__Class__TransitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl5338);
            	    rule__Class__TransitionsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2591:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2595:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2596:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__05375);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__05378);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2603:1: rule__Class__Group_5__0__Impl : ( 'assertion' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2607:1: ( ( 'assertion' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2608:1: ( 'assertion' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2608:1: ( 'assertion' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2609:1: 'assertion'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Class__Group_5__0__Impl5406); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2622:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2626:1: ( rule__Class__Group_5__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2627:2: rule__Class__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__15437);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2633:1: rule__Class__Group_5__1__Impl : ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2637:1: ( ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2638:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2638:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2639:1: ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2639:1: ( ( rule__Class__AssertionsAssignment_5_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2640:1: ( rule__Class__AssertionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2641:1: ( rule__Class__AssertionsAssignment_5_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2641:2: rule__Class__AssertionsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl5466);
            rule__Class__AssertionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2644:1: ( ( rule__Class__AssertionsAssignment_5_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2645:1: ( rule__Class__AssertionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2646:1: ( rule__Class__AssertionsAssignment_5_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==31||LA21_0==46||LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2646:2: rule__Class__AssertionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl5478);
            	    rule__Class__AssertionsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2661:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2665:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2666:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__05515);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__05518);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2673:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2677:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2678:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2678:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2679:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2680:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2682:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2692:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2696:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2697:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__15576);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__15579);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2704:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2708:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2709:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2709:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2710:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2711:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2711:2: rule__VariableDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl5606);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2721:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2725:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2726:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__25636);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__25639);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2733:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2737:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2738:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2738:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2739:1: ( rule__VariableDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2740:1: ( rule__VariableDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2740:2: rule__VariableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl5666);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2750:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2754:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2755:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__35696);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__35699);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2762:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2766:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2767:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2767:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2768:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2769:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2769:2: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl5726);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2779:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2783:1: ( rule__VariableDeclaration__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2784:2: rule__VariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__45757);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2790:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2794:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2795:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2795:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2796:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__VariableDeclaration__Group__4__Impl5785); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2819:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2823:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2824:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__05826);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__05829);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2831:1: rule__VariableDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2835:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2836:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2836:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2837:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl5857); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2850:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2854:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2855:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__15888);
            rule__VariableDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__15891);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2862:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2866:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2867:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2867:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2868:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2869:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2869:2: rule__VariableDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5918);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2879:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2883:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2884:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25948);
            rule__VariableDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25951);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2891:1: rule__VariableDeclaration__Group_3__2__Impl : ( ( rule__VariableDeclaration__Group_3_2__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2895:1: ( ( ( rule__VariableDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2896:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2896:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2897:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2898:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2898:2: rule__VariableDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5978);
            	    rule__VariableDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2908:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2912:1: ( rule__VariableDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2913:2: rule__VariableDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__36009);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2919:1: rule__VariableDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2923:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2924:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2924:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2925:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__VariableDeclaration__Group_3__3__Impl6037); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2946:1: rule__VariableDeclaration__Group_3_2__0 : rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 ;
    public final void rule__VariableDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2950:1: ( rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2951:2: rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__06076);
            rule__VariableDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__06079);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2958:1: rule__VariableDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2962:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2963:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2963:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2964:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__VariableDeclaration__Group_3_2__0__Impl6107); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2977:1: rule__VariableDeclaration__Group_3_2__1 : rule__VariableDeclaration__Group_3_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2981:1: ( rule__VariableDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2982:2: rule__VariableDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__16138);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2988:1: rule__VariableDeclaration__Group_3_2__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2992:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2993:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2993:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2994:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2995:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:2995:2: rule__VariableDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl6165);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3009:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3013:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3014:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06199);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06202);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3021:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3025:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3026:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3026:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3027:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3028:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3030:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3040:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3044:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3045:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16260);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16263);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3052:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3056:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3057:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3057:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3058:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3059:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3059:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl6290);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3069:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3073:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3074:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26320);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26323);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3081:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3085:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3086:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3086:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3087:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,13,FOLLOW_13_in_rule__Attribute__Group__2__Impl6351); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3100:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3104:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3105:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36382);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36385);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3112:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3116:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3117:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3117:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3118:1: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3119:1: ( rule__Attribute__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3119:2: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl6412);
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


    // $ANTLR start "rule__Attribute__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3129:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3133:1: ( rule__Attribute__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3134:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46442);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3140:1: rule__Attribute__Group__4__Impl : ( ';' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3144:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3145:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3145:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3146:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Attribute__Group__4__Impl6470); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getSemicolonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__EventDeclaration__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3169:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3173:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3174:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__06511);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__06514);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3181:1: rule__EventDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3185:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3186:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3186:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3187:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3188:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3190:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3200:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3204:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3205:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__16572);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__16575);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3212:1: rule__EventDeclaration__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3216:1: ( ( 'event' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3217:1: ( 'event' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3217:1: ( 'event' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3218:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__EventDeclaration__Group__1__Impl6603); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3231:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3235:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3236:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__26634);
            rule__EventDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__26637);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3243:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3247:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3248:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3248:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3249:1: ( rule__EventDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3250:1: ( rule__EventDeclaration__NameAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3250:2: rule__EventDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl6664);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3260:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3264:1: ( rule__EventDeclaration__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3265:2: rule__EventDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__36694);
            rule__EventDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3271:1: rule__EventDeclaration__Group__3__Impl : ( ( rule__EventDeclaration__Group_3__0 )? ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3275:1: ( ( ( rule__EventDeclaration__Group_3__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3276:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3276:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3277:1: ( rule__EventDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3278:1: ( rule__EventDeclaration__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3278:2: rule__EventDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl6721);
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


    // $ANTLR start "rule__EventDeclaration__Group_3__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3296:1: rule__EventDeclaration__Group_3__0 : rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 ;
    public final void rule__EventDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3300:1: ( rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3301:2: rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__06760);
            rule__EventDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__06763);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3308:1: rule__EventDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3312:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3313:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3313:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3314:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__EventDeclaration__Group_3__0__Impl6791); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3327:1: rule__EventDeclaration__Group_3__1 : rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 ;
    public final void rule__EventDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3331:1: ( rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3332:2: rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__16822);
            rule__EventDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__16825);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3339:1: rule__EventDeclaration__Group_3__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__EventDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3343:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3344:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3344:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3345:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3346:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3346:2: rule__EventDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl6852);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3356:1: rule__EventDeclaration__Group_3__2 : rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 ;
    public final void rule__EventDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3360:1: ( rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3361:2: rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__26882);
            rule__EventDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__26885);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3368:1: rule__EventDeclaration__Group_3__2__Impl : ( ( rule__EventDeclaration__Group_3_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3372:1: ( ( ( rule__EventDeclaration__Group_3_2__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3373:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3373:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3374:1: ( rule__EventDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3375:1: ( rule__EventDeclaration__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3375:2: rule__EventDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl6912);
            	    rule__EventDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3385:1: rule__EventDeclaration__Group_3__3 : rule__EventDeclaration__Group_3__3__Impl ;
    public final void rule__EventDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3389:1: ( rule__EventDeclaration__Group_3__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3390:2: rule__EventDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36943);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3396:1: rule__EventDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3400:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3401:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3401:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3402:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__EventDeclaration__Group_3__3__Impl6971); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3423:1: rule__EventDeclaration__Group_3_2__0 : rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 ;
    public final void rule__EventDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3427:1: ( rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3428:2: rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__07010);
            rule__EventDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__07013);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3435:1: rule__EventDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3439:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3440:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3440:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3441:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__EventDeclaration__Group_3_2__0__Impl7041); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3454:1: rule__EventDeclaration__Group_3_2__1 : rule__EventDeclaration__Group_3_2__1__Impl ;
    public final void rule__EventDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3458:1: ( rule__EventDeclaration__Group_3_2__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3459:2: rule__EventDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__17072);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3465:1: rule__EventDeclaration__Group_3_2__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3469:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3470:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3470:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3471:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3472:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3472:2: rule__EventDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl7099);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3486:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3490:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3491:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__07133);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__07136);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3498:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3502:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3503:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3503:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3504:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3505:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3507:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3517:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3521:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3522:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__17194);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__17197);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3529:1: rule__ParameterDeclaration__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3533:1: ( ( 'parameter' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3534:1: ( 'parameter' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3534:1: ( 'parameter' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3535:1: 'parameter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__ParameterDeclaration__Group__1__Impl7225); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3548:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3552:1: ( rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3553:2: rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__27256);
            rule__ParameterDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__27259);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3560:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3564:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3565:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3565:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3566:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3567:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3567:2: rule__ParameterDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl7286);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3577:1: rule__ParameterDeclaration__Group__3 : rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 ;
    public final void rule__ParameterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3581:1: ( rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3582:2: rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__37316);
            rule__ParameterDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__37319);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3589:1: rule__ParameterDeclaration__Group__3__Impl : ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ParameterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3593:1: ( ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3594:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3594:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3595:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3596:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3596:2: rule__ParameterDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl7346);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3606:1: rule__ParameterDeclaration__Group__4 : rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 ;
    public final void rule__ParameterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3610:1: ( rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3611:2: rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__47376);
            rule__ParameterDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__47379);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3618:1: rule__ParameterDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ParameterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3622:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3623:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3623:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3624:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,13,FOLLOW_13_in_rule__ParameterDeclaration__Group__4__Impl7407); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3637:1: rule__ParameterDeclaration__Group__5 : rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 ;
    public final void rule__ParameterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3641:1: ( rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3642:2: rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__57438);
            rule__ParameterDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__57441);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3649:1: rule__ParameterDeclaration__Group__5__Impl : ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ParameterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3653:1: ( ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3654:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3654:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3655:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3656:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3656:2: rule__ParameterDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl7468);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3666:1: rule__ParameterDeclaration__Group__6 : rule__ParameterDeclaration__Group__6__Impl ;
    public final void rule__ParameterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3670:1: ( rule__ParameterDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3671:2: rule__ParameterDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__67498);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3677:1: rule__ParameterDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ParameterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3681:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3682:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3682:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3683:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParameterDeclaration__Group__6__Impl7526); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3710:1: rule__ObserverDeclaration__Group__0 : rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 ;
    public final void rule__ObserverDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3714:1: ( rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3715:2: rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__07571);
            rule__ObserverDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__07574);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3722:1: rule__ObserverDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ObserverDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3726:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3727:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3727:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3728:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3729:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3731:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3741:1: rule__ObserverDeclaration__Group__1 : rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 ;
    public final void rule__ObserverDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3745:1: ( rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3746:2: rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__17632);
            rule__ObserverDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__17635);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3753:1: rule__ObserverDeclaration__Group__1__Impl : ( 'observer' ) ;
    public final void rule__ObserverDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3757:1: ( ( 'observer' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3758:1: ( 'observer' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3758:1: ( 'observer' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3759:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ObserverDeclaration__Group__1__Impl7663); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3772:1: rule__ObserverDeclaration__Group__2 : rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 ;
    public final void rule__ObserverDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3776:1: ( rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3777:2: rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__27694);
            rule__ObserverDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__27697);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3784:1: rule__ObserverDeclaration__Group__2__Impl : ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ObserverDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3788:1: ( ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3789:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3789:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3790:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3791:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3791:2: rule__ObserverDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl7724);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3801:1: rule__ObserverDeclaration__Group__3 : rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 ;
    public final void rule__ObserverDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3805:1: ( rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3806:2: rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__37754);
            rule__ObserverDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__37757);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3813:1: rule__ObserverDeclaration__Group__3__Impl : ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObserverDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3817:1: ( ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3818:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3818:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3819:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3820:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3820:2: rule__ObserverDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl7784);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3830:1: rule__ObserverDeclaration__Group__4 : rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 ;
    public final void rule__ObserverDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3834:1: ( rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3835:2: rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__47814);
            rule__ObserverDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__47817);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3842:1: rule__ObserverDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ObserverDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3846:1: ( ( '=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3847:1: ( '=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3847:1: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3848:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,13,FOLLOW_13_in_rule__ObserverDeclaration__Group__4__Impl7845); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3861:1: rule__ObserverDeclaration__Group__5 : rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 ;
    public final void rule__ObserverDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3865:1: ( rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3866:2: rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__57876);
            rule__ObserverDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__57879);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3873:1: rule__ObserverDeclaration__Group__5__Impl : ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ObserverDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3877:1: ( ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3878:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3878:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3879:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3880:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3880:2: rule__ObserverDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl7906);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3890:1: rule__ObserverDeclaration__Group__6 : rule__ObserverDeclaration__Group__6__Impl ;
    public final void rule__ObserverDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3894:1: ( rule__ObserverDeclaration__Group__6__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3895:2: rule__ObserverDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67936);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3901:1: rule__ObserverDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ObserverDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3905:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3906:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3906:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3907:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__ObserverDeclaration__Group__6__Impl7964); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3934:1: rule__LabeledTransition__Group__0 : rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 ;
    public final void rule__LabeledTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3938:1: ( rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3939:2: rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__08009);
            rule__LabeledTransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__08012);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3946:1: rule__LabeledTransition__Group__0__Impl : ( ( rule__LabeledTransition__EventAssignment_0 ) ) ;
    public final void rule__LabeledTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3950:1: ( ( ( rule__LabeledTransition__EventAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3951:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3951:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3952:1: ( rule__LabeledTransition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3953:1: ( rule__LabeledTransition__EventAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3953:2: rule__LabeledTransition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl8039);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3963:1: rule__LabeledTransition__Group__1 : rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 ;
    public final void rule__LabeledTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3967:1: ( rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3968:2: rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__18069);
            rule__LabeledTransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__18072);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3975:1: rule__LabeledTransition__Group__1__Impl : ( ':' ) ;
    public final void rule__LabeledTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3979:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3980:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3980:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3981:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__LabeledTransition__Group__1__Impl8100); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3994:1: rule__LabeledTransition__Group__2 : rule__LabeledTransition__Group__2__Impl ;
    public final void rule__LabeledTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3998:1: ( rule__LabeledTransition__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:3999:2: rule__LabeledTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__28131);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4005:1: rule__LabeledTransition__Group__2__Impl : ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) ;
    public final void rule__LabeledTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4009:1: ( ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4010:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4010:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4011:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4012:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4012:2: rule__LabeledTransition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl8158);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4028:1: rule__TransitionAnd__Group__0 : rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 ;
    public final void rule__TransitionAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4032:1: ( rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4033:2: rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__08194);
            rule__TransitionAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__08197);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4040:1: rule__TransitionAnd__Group__0__Impl : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4044:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4045:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4045:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4046:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl8224);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4057:1: rule__TransitionAnd__Group__1 : rule__TransitionAnd__Group__1__Impl ;
    public final void rule__TransitionAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4061:1: ( rule__TransitionAnd__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4062:2: rule__TransitionAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__18253);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4068:1: rule__TransitionAnd__Group__1__Impl : ( ( rule__TransitionAnd__Group_1__0 )* ) ;
    public final void rule__TransitionAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4072:1: ( ( ( rule__TransitionAnd__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4073:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4073:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4074:1: ( rule__TransitionAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4075:1: ( rule__TransitionAnd__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4075:2: rule__TransitionAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl8280);
            	    rule__TransitionAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4089:1: rule__TransitionAnd__Group_1__0 : rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 ;
    public final void rule__TransitionAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4093:1: ( rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4094:2: rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__08315);
            rule__TransitionAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__08318);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4101:1: rule__TransitionAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4105:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4106:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4106:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4107:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4108:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4110:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4120:1: rule__TransitionAnd__Group_1__1 : rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 ;
    public final void rule__TransitionAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4124:1: ( rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4125:2: rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__18376);
            rule__TransitionAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__18379);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4132:1: rule__TransitionAnd__Group_1__1__Impl : ( '&' ) ;
    public final void rule__TransitionAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4136:1: ( ( '&' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4137:1: ( '&' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4137:1: ( '&' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4138:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__TransitionAnd__Group_1__1__Impl8407); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4151:1: rule__TransitionAnd__Group_1__2 : rule__TransitionAnd__Group_1__2__Impl ;
    public final void rule__TransitionAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4155:1: ( rule__TransitionAnd__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4156:2: rule__TransitionAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__28438);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4162:1: rule__TransitionAnd__Group_1__2__Impl : ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4166:1: ( ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4167:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4167:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4168:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4169:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4169:2: rule__TransitionAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl8465);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4185:1: rule__TransitionOr__Group__0 : rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 ;
    public final void rule__TransitionOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4189:1: ( rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4190:2: rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__08501);
            rule__TransitionOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__08504);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4197:1: rule__TransitionOr__Group__0__Impl : ( ruleITransition ) ;
    public final void rule__TransitionOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4201:1: ( ( ruleITransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4202:1: ( ruleITransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4202:1: ( ruleITransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4203:1: ruleITransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getITransitionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleITransition_in_rule__TransitionOr__Group__0__Impl8531);
            ruleITransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getITransitionParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4214:1: rule__TransitionOr__Group__1 : rule__TransitionOr__Group__1__Impl ;
    public final void rule__TransitionOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4218:1: ( rule__TransitionOr__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4219:2: rule__TransitionOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__18560);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4225:1: rule__TransitionOr__Group__1__Impl : ( ( rule__TransitionOr__Group_1__0 )* ) ;
    public final void rule__TransitionOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4229:1: ( ( ( rule__TransitionOr__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4230:1: ( ( rule__TransitionOr__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4230:1: ( ( rule__TransitionOr__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4231:1: ( rule__TransitionOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4232:1: ( rule__TransitionOr__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==44) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4232:2: rule__TransitionOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl8587);
            	    rule__TransitionOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4246:1: rule__TransitionOr__Group_1__0 : rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 ;
    public final void rule__TransitionOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4250:1: ( rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4251:2: rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__08622);
            rule__TransitionOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__08625);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4258:1: rule__TransitionOr__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4262:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4263:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4263:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4264:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4265:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4267:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4277:1: rule__TransitionOr__Group_1__1 : rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 ;
    public final void rule__TransitionOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4281:1: ( rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4282:2: rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__18683);
            rule__TransitionOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__18686);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4289:1: rule__TransitionOr__Group_1__1__Impl : ( '|' ) ;
    public final void rule__TransitionOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4293:1: ( ( '|' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4294:1: ( '|' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4294:1: ( '|' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4295:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__TransitionOr__Group_1__1__Impl8714); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4308:1: rule__TransitionOr__Group_1__2 : rule__TransitionOr__Group_1__2__Impl ;
    public final void rule__TransitionOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4312:1: ( rule__TransitionOr__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4313:2: rule__TransitionOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__28745);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4319:1: rule__TransitionOr__Group_1__2__Impl : ( ( rule__TransitionOr__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4323:1: ( ( ( rule__TransitionOr__RightAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4324:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4324:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4325:1: ( rule__TransitionOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4326:1: ( rule__TransitionOr__RightAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4326:2: rule__TransitionOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl8772);
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


    // $ANTLR start "rule__ITransition__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4342:1: rule__ITransition__Group__0 : rule__ITransition__Group__0__Impl rule__ITransition__Group__1 ;
    public final void rule__ITransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4346:1: ( rule__ITransition__Group__0__Impl rule__ITransition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4347:2: rule__ITransition__Group__0__Impl rule__ITransition__Group__1
            {
            pushFollow(FOLLOW_rule__ITransition__Group__0__Impl_in_rule__ITransition__Group__08808);
            rule__ITransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ITransition__Group__1_in_rule__ITransition__Group__08811);
            rule__ITransition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ITransition__Group__0"


    // $ANTLR start "rule__ITransition__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4354:1: rule__ITransition__Group__0__Impl : ( () ) ;
    public final void rule__ITransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4358:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4359:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4359:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4360:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getITransitionAccess().getITransitionAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4361:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4363:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getITransitionAccess().getITransitionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ITransition__Group__0__Impl"


    // $ANTLR start "rule__ITransition__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4373:1: rule__ITransition__Group__1 : rule__ITransition__Group__1__Impl ;
    public final void rule__ITransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4377:1: ( rule__ITransition__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4378:2: rule__ITransition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ITransition__Group__1__Impl_in_rule__ITransition__Group__18869);
            rule__ITransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ITransition__Group__1"


    // $ANTLR start "rule__ITransition__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4384:1: rule__ITransition__Group__1__Impl : ( '$transition' ) ;
    public final void rule__ITransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4388:1: ( ( '$transition' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4389:1: ( '$transition' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4389:1: ( '$transition' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4390:1: '$transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getITransitionAccess().getTransitionKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__ITransition__Group__1__Impl8897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getITransitionAccess().getTransitionKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ITransition__Group__1__Impl"


    // $ANTLR start "rule__Skip__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4407:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4411:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4412:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08932);
            rule__Skip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08935);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4419:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4423:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4424:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4424:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4425:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4426:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4428:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4438:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl rule__Skip__Group__2 ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4442:1: ( rule__Skip__Group__1__Impl rule__Skip__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4443:2: rule__Skip__Group__1__Impl rule__Skip__Group__2
            {
            pushFollow(FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18993);
            rule__Skip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18996);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4450:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4454:1: ( ( 'skip' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4455:1: ( 'skip' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4455:1: ( 'skip' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4456:1: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }
            match(input,46,FOLLOW_46_in_rule__Skip__Group__1__Impl9024); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4469:1: rule__Skip__Group__2 : rule__Skip__Group__2__Impl ;
    public final void rule__Skip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4473:1: ( rule__Skip__Group__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4474:2: rule__Skip__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__29055);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4480:1: rule__Skip__Group__2__Impl : ( ';' ) ;
    public final void rule__Skip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4484:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4485:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4485:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4486:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Skip__Group__2__Impl9083); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4505:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4509:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4510:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__09120);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__09123);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4517:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4521:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4522:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4522:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4523:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4524:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4526:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4536:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4540:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4541:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__19181);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__19184);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4548:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__VariableAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4552:1: ( ( ( rule__Assignment__VariableAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4553:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4553:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4554:1: ( rule__Assignment__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4555:1: ( rule__Assignment__VariableAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4555:2: rule__Assignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl9211);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4565:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4569:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4570:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__29241);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__29244);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4577:1: rule__Assignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4581:1: ( ( ':=' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4582:1: ( ':=' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4582:1: ( ':=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4583:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__Assignment__Group__2__Impl9272); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4596:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4600:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4601:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__39303);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__39306);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4608:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4612:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4613:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4613:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4614:1: ( rule__Assignment__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4615:1: ( rule__Assignment__ValueAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4615:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl9333);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4625:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4629:1: ( rule__Assignment__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4630:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__49363);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4636:1: rule__Assignment__Group__4__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4640:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4641:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4641:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4642:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Assignment__Group__4__Impl9391); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4665:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4669:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4670:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09432);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09435);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4677:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4681:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4682:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4682:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4683:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4684:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4686:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4696:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4700:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4701:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19493);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19496);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4708:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4712:1: ( ( '{' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4713:1: ( '{' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4713:1: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4714:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Block__Group__1__Impl9524); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4727:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4731:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4732:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29555);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29558);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4739:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4743:1: ( ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4744:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4744:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4745:1: ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4745:1: ( ( rule__Block__InstructionsAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4746:1: ( rule__Block__InstructionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4747:1: ( rule__Block__InstructionsAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4747:2: rule__Block__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl9587);
            rule__Block__InstructionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4750:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4751:1: ( rule__Block__InstructionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4752:1: ( rule__Block__InstructionsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==31||LA28_0==46||LA28_0==48) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4752:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl9599);
            	    rule__Block__InstructionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4763:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4767:1: ( rule__Block__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4768:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__39632);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4774:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4778:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4779:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4779:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4780:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Block__Group__3__Impl9660); if (state.failed) return ;
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


    // $ANTLR start "rule__IfThenElse__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4801:1: rule__IfThenElse__Group__0 : rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 ;
    public final void rule__IfThenElse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4805:1: ( rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4806:2: rule__IfThenElse__Group__0__Impl rule__IfThenElse__Group__1
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__09699);
            rule__IfThenElse__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__09702);
            rule__IfThenElse__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0"


    // $ANTLR start "rule__IfThenElse__Group__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4813:1: rule__IfThenElse__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfThenElse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4817:1: ( ( 'if' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4818:1: ( 'if' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4818:1: ( 'if' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4819:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__IfThenElse__Group__0__Impl9730); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4832:1: rule__IfThenElse__Group__1 : rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 ;
    public final void rule__IfThenElse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4836:1: ( rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4837:2: rule__IfThenElse__Group__1__Impl rule__IfThenElse__Group__2
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__19761);
            rule__IfThenElse__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__19764);
            rule__IfThenElse__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1"


    // $ANTLR start "rule__IfThenElse__Group__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4844:1: rule__IfThenElse__Group__1__Impl : ( ( rule__IfThenElse__ConditionAssignment_1 ) ) ;
    public final void rule__IfThenElse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4848:1: ( ( ( rule__IfThenElse__ConditionAssignment_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4849:1: ( ( rule__IfThenElse__ConditionAssignment_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4849:1: ( ( rule__IfThenElse__ConditionAssignment_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4850:1: ( rule__IfThenElse__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getConditionAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4851:1: ( rule__IfThenElse__ConditionAssignment_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4851:2: rule__IfThenElse__ConditionAssignment_1
            {
            pushFollow(FOLLOW_rule__IfThenElse__ConditionAssignment_1_in_rule__IfThenElse__Group__1__Impl9791);
            rule__IfThenElse__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__1__Impl"


    // $ANTLR start "rule__IfThenElse__Group__2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4861:1: rule__IfThenElse__Group__2 : rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 ;
    public final void rule__IfThenElse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4865:1: ( rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4866:2: rule__IfThenElse__Group__2__Impl rule__IfThenElse__Group__3
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__29821);
            rule__IfThenElse__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__29824);
            rule__IfThenElse__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2"


    // $ANTLR start "rule__IfThenElse__Group__2__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4873:1: rule__IfThenElse__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfThenElse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4877:1: ( ( 'then' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4878:1: ( 'then' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4878:1: ( 'then' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4879:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getThenKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__IfThenElse__Group__2__Impl9852); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getThenKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__2__Impl"


    // $ANTLR start "rule__IfThenElse__Group__3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4892:1: rule__IfThenElse__Group__3 : rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 ;
    public final void rule__IfThenElse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4896:1: ( rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4897:2: rule__IfThenElse__Group__3__Impl rule__IfThenElse__Group__4
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__39883);
            rule__IfThenElse__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__39886);
            rule__IfThenElse__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3"


    // $ANTLR start "rule__IfThenElse__Group__3__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4904:1: rule__IfThenElse__Group__3__Impl : ( ( rule__IfThenElse__ThenAssignment_3 ) ) ;
    public final void rule__IfThenElse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4908:1: ( ( ( rule__IfThenElse__ThenAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4909:1: ( ( rule__IfThenElse__ThenAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4909:1: ( ( rule__IfThenElse__ThenAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4910:1: ( rule__IfThenElse__ThenAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getThenAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4911:1: ( rule__IfThenElse__ThenAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4911:2: rule__IfThenElse__ThenAssignment_3
            {
            pushFollow(FOLLOW_rule__IfThenElse__ThenAssignment_3_in_rule__IfThenElse__Group__3__Impl9913);
            rule__IfThenElse__ThenAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getThenAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__3__Impl"


    // $ANTLR start "rule__IfThenElse__Group__4"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4921:1: rule__IfThenElse__Group__4 : rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 ;
    public final void rule__IfThenElse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4925:1: ( rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4926:2: rule__IfThenElse__Group__4__Impl rule__IfThenElse__Group__5
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__49943);
            rule__IfThenElse__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__49946);
            rule__IfThenElse__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4"


    // $ANTLR start "rule__IfThenElse__Group__4__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4933:1: rule__IfThenElse__Group__4__Impl : ( ( rule__IfThenElse__Group_4__0 )? ) ;
    public final void rule__IfThenElse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4937:1: ( ( ( rule__IfThenElse__Group_4__0 )? ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4938:1: ( ( rule__IfThenElse__Group_4__0 )? )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4938:1: ( ( rule__IfThenElse__Group_4__0 )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4939:1: ( rule__IfThenElse__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getGroup_4()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4940:1: ( rule__IfThenElse__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4940:2: rule__IfThenElse__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__IfThenElse__Group_4__0_in_rule__IfThenElse__Group__4__Impl9973);
                    rule__IfThenElse__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__4__Impl"


    // $ANTLR start "rule__IfThenElse__Group__5"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4950:1: rule__IfThenElse__Group__5 : rule__IfThenElse__Group__5__Impl ;
    public final void rule__IfThenElse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4954:1: ( rule__IfThenElse__Group__5__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4955:2: rule__IfThenElse__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__510004);
            rule__IfThenElse__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5"


    // $ANTLR start "rule__IfThenElse__Group__5__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4961:1: rule__IfThenElse__Group__5__Impl : ( ';' ) ;
    public final void rule__IfThenElse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4965:1: ( ( ';' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4966:1: ( ';' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4966:1: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4967:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getSemicolonKeyword_5()); 
            }
            match(input,37,FOLLOW_37_in_rule__IfThenElse__Group__5__Impl10032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group__5__Impl"


    // $ANTLR start "rule__IfThenElse__Group_4__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4992:1: rule__IfThenElse__Group_4__0 : rule__IfThenElse__Group_4__0__Impl rule__IfThenElse__Group_4__1 ;
    public final void rule__IfThenElse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4996:1: ( rule__IfThenElse__Group_4__0__Impl rule__IfThenElse__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:4997:2: rule__IfThenElse__Group_4__0__Impl rule__IfThenElse__Group_4__1
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_4__0__Impl_in_rule__IfThenElse__Group_4__010075);
            rule__IfThenElse__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfThenElse__Group_4__1_in_rule__IfThenElse__Group_4__010078);
            rule__IfThenElse__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_4__0"


    // $ANTLR start "rule__IfThenElse__Group_4__0__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5004:1: rule__IfThenElse__Group_4__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfThenElse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5008:1: ( ( ( 'else' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5009:1: ( ( 'else' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5009:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5010:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getElseKeyword_4_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5011:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5012:2: 'else'
            {
            match(input,50,FOLLOW_50_in_rule__IfThenElse__Group_4__0__Impl10107); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getElseKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_4__0__Impl"


    // $ANTLR start "rule__IfThenElse__Group_4__1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5023:1: rule__IfThenElse__Group_4__1 : rule__IfThenElse__Group_4__1__Impl ;
    public final void rule__IfThenElse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5027:1: ( rule__IfThenElse__Group_4__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5028:2: rule__IfThenElse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__IfThenElse__Group_4__1__Impl_in_rule__IfThenElse__Group_4__110139);
            rule__IfThenElse__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_4__1"


    // $ANTLR start "rule__IfThenElse__Group_4__1__Impl"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5034:1: rule__IfThenElse__Group_4__1__Impl : ( ( rule__IfThenElse__ElseAssignment_4_1 ) ) ;
    public final void rule__IfThenElse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5038:1: ( ( ( rule__IfThenElse__ElseAssignment_4_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5039:1: ( ( rule__IfThenElse__ElseAssignment_4_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5039:1: ( ( rule__IfThenElse__ElseAssignment_4_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5040:1: ( rule__IfThenElse__ElseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getElseAssignment_4_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5041:1: ( rule__IfThenElse__ElseAssignment_4_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5041:2: rule__IfThenElse__ElseAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IfThenElse__ElseAssignment_4_1_in_rule__IfThenElse__Group_4__1__Impl10166);
            rule__IfThenElse__ElseAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getElseAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__Group_4__1__Impl"


    // $ANTLR start "rule__Logical__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5055:1: rule__Logical__Group__0 : rule__Logical__Group__0__Impl rule__Logical__Group__1 ;
    public final void rule__Logical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5059:1: ( rule__Logical__Group__0__Impl rule__Logical__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5060:2: rule__Logical__Group__0__Impl rule__Logical__Group__1
            {
            pushFollow(FOLLOW_rule__Logical__Group__0__Impl_in_rule__Logical__Group__010200);
            rule__Logical__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Logical__Group__1_in_rule__Logical__Group__010203);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5067:1: rule__Logical__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__Logical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5071:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5072:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5072:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5073:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__Logical__Group__0__Impl10230);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5084:1: rule__Logical__Group__1 : rule__Logical__Group__1__Impl ;
    public final void rule__Logical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5088:1: ( rule__Logical__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5089:2: rule__Logical__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group__1__Impl_in_rule__Logical__Group__110259);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5095:1: rule__Logical__Group__1__Impl : ( ( rule__Logical__Group_1__0 )* ) ;
    public final void rule__Logical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5099:1: ( ( ( rule__Logical__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5100:1: ( ( rule__Logical__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5100:1: ( ( rule__Logical__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5101:1: ( rule__Logical__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5102:1: ( rule__Logical__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=11 && LA30_0<=12)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5102:2: rule__Logical__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Logical__Group_1__0_in_rule__Logical__Group__1__Impl10286);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5116:1: rule__Logical__Group_1__0 : rule__Logical__Group_1__0__Impl ;
    public final void rule__Logical__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5120:1: ( rule__Logical__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5121:2: rule__Logical__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1__0__Impl_in_rule__Logical__Group_1__010321);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5127:1: rule__Logical__Group_1__0__Impl : ( ( rule__Logical__Group_1_0__0 ) ) ;
    public final void rule__Logical__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5131:1: ( ( ( rule__Logical__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5132:1: ( ( rule__Logical__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5132:1: ( ( rule__Logical__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5133:1: ( rule__Logical__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5134:1: ( rule__Logical__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5134:2: rule__Logical__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__0_in_rule__Logical__Group_1__0__Impl10348);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5146:1: rule__Logical__Group_1_0__0 : rule__Logical__Group_1_0__0__Impl rule__Logical__Group_1_0__1 ;
    public final void rule__Logical__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5150:1: ( rule__Logical__Group_1_0__0__Impl rule__Logical__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5151:2: rule__Logical__Group_1_0__0__Impl rule__Logical__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__0__Impl_in_rule__Logical__Group_1_0__010380);
            rule__Logical__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Logical__Group_1_0__1_in_rule__Logical__Group_1_0__010383);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5158:1: rule__Logical__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Logical__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5162:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5163:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5163:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5164:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getLogicalLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5165:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5167:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5177:1: rule__Logical__Group_1_0__1 : rule__Logical__Group_1_0__1__Impl rule__Logical__Group_1_0__2 ;
    public final void rule__Logical__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5181:1: ( rule__Logical__Group_1_0__1__Impl rule__Logical__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5182:2: rule__Logical__Group_1_0__1__Impl rule__Logical__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__1__Impl_in_rule__Logical__Group_1_0__110441);
            rule__Logical__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Logical__Group_1_0__2_in_rule__Logical__Group_1_0__110444);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5189:1: rule__Logical__Group_1_0__1__Impl : ( ( rule__Logical__OpAssignment_1_0_1 ) ) ;
    public final void rule__Logical__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5193:1: ( ( ( rule__Logical__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5194:1: ( ( rule__Logical__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5194:1: ( ( rule__Logical__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5195:1: ( rule__Logical__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5196:1: ( rule__Logical__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5196:2: rule__Logical__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Logical__OpAssignment_1_0_1_in_rule__Logical__Group_1_0__1__Impl10471);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5206:1: rule__Logical__Group_1_0__2 : rule__Logical__Group_1_0__2__Impl ;
    public final void rule__Logical__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5210:1: ( rule__Logical__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5211:2: rule__Logical__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Logical__Group_1_0__2__Impl_in_rule__Logical__Group_1_0__210501);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5217:1: rule__Logical__Group_1_0__2__Impl : ( ( rule__Logical__RightAssignment_1_0_2 ) ) ;
    public final void rule__Logical__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5221:1: ( ( ( rule__Logical__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5222:1: ( ( rule__Logical__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5222:1: ( ( rule__Logical__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5223:1: ( rule__Logical__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5224:1: ( rule__Logical__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5224:2: rule__Logical__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Logical__RightAssignment_1_0_2_in_rule__Logical__Group_1_0__2__Impl10528);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5240:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5244:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5245:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010564);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010567);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5252:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5256:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5257:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5257:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5258:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10594);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5269:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5273:1: ( rule__Relation__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5274:2: rule__Relation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110623);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5280:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )* ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5284:1: ( ( ( rule__Relation__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5285:1: ( ( rule__Relation__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5285:1: ( ( rule__Relation__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5286:1: ( rule__Relation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5287:1: ( rule__Relation__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=13 && LA31_0<=18)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5287:2: rule__Relation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10650);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5301:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5305:1: ( rule__Relation__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5306:2: rule__Relation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__010685);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5312:1: rule__Relation__Group_1__0__Impl : ( ( rule__Relation__Group_1_0__0 ) ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5316:1: ( ( ( rule__Relation__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5317:1: ( ( rule__Relation__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5317:1: ( ( rule__Relation__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5318:1: ( rule__Relation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5319:1: ( rule__Relation__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5319:2: rule__Relation__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl10712);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5331:1: rule__Relation__Group_1_0__0 : rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 ;
    public final void rule__Relation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5335:1: ( rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5336:2: rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__010744);
            rule__Relation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__010747);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5343:1: rule__Relation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5347:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5348:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5348:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5349:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5350:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5352:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5362:1: rule__Relation__Group_1_0__1 : rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 ;
    public final void rule__Relation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5366:1: ( rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5367:2: rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__110805);
            rule__Relation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__110808);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5374:1: rule__Relation__Group_1_0__1__Impl : ( ( rule__Relation__OpAssignment_1_0_1 ) ) ;
    public final void rule__Relation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5378:1: ( ( ( rule__Relation__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5379:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5379:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5380:1: ( rule__Relation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5381:1: ( rule__Relation__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5381:2: rule__Relation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl10835);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5391:1: rule__Relation__Group_1_0__2 : rule__Relation__Group_1_0__2__Impl ;
    public final void rule__Relation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5395:1: ( rule__Relation__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5396:2: rule__Relation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__210865);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5402:1: rule__Relation__Group_1_0__2__Impl : ( ( rule__Relation__RightAssignment_1_0_2 ) ) ;
    public final void rule__Relation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5406:1: ( ( ( rule__Relation__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5407:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5407:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5408:1: ( rule__Relation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5409:1: ( rule__Relation__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5409:2: rule__Relation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl10892);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5425:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5429:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5430:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__010928);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__010931);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5437:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5441:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5442:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5442:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5443:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl10958);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5454:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5458:1: ( rule__Addition__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5459:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__110987);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5465:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5469:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5470:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5470:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5471:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5472:1: ( rule__Addition__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=19 && LA32_0<=20)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5472:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl11014);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5486:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5490:1: ( rule__Addition__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5491:2: rule__Addition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011049);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5497:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5501:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5502:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5502:1: ( ( rule__Addition__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5503:1: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5504:1: ( rule__Addition__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5504:2: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11076);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5516:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5520:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5521:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011108);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011111);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5528:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5532:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5533:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5533:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5534:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5535:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5537:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5547:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5551:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5552:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111169);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111172);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5559:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OpAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5563:1: ( ( ( rule__Addition__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5564:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5564:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5565:1: ( rule__Addition__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5566:1: ( rule__Addition__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5566:2: rule__Addition__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11199);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5576:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5580:1: ( rule__Addition__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5581:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211229);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5587:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5591:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5592:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5592:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5593:1: ( rule__Addition__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5594:1: ( rule__Addition__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5594:2: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11256);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5610:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5614:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5615:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011292);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011295);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5622:1: rule__Multiplication__Group__0__Impl : ( ruleNeg ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5626:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5627:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5627:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5628:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11322);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5639:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5643:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5644:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111351);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5650:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5654:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5655:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5655:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5656:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5657:1: ( rule__Multiplication__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=21 && LA33_0<=22)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5657:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11378);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5671:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5675:1: ( rule__Multiplication__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5676:2: rule__Multiplication__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011413);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5682:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5686:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5687:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5687:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5688:1: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5689:1: ( rule__Multiplication__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5689:2: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11440);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5701:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5705:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5706:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011472);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011475);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5713:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5717:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5718:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5718:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5719:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5720:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5722:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5732:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5736:1: ( rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5737:2: rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111533);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111536);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5744:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5748:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5749:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5749:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5750:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5751:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5751:2: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11563);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5761:1: rule__Multiplication__Group_1_0__2 : rule__Multiplication__Group_1_0__2__Impl ;
    public final void rule__Multiplication__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5765:1: ( rule__Multiplication__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5766:2: rule__Multiplication__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211593);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5772:1: rule__Multiplication__Group_1_0__2__Impl : ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) ;
    public final void rule__Multiplication__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5776:1: ( ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5777:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5777:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5778:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5779:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5779:2: rule__Multiplication__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11620);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5795:1: rule__Neg__Group_0__0 : rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 ;
    public final void rule__Neg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5799:1: ( rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5800:2: rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011656);
            rule__Neg__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011659);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5807:1: rule__Neg__Group_0__0__Impl : ( () ) ;
    public final void rule__Neg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5811:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5812:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5812:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5813:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5814:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5816:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5826:1: rule__Neg__Group_0__1 : rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 ;
    public final void rule__Neg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5830:1: ( rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5831:2: rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__111717);
            rule__Neg__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__111720);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5838:1: rule__Neg__Group_0__1__Impl : ( ( 'not' ) ) ;
    public final void rule__Neg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5842:1: ( ( ( 'not' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5843:1: ( ( 'not' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5843:1: ( ( 'not' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5844:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5845:1: ( 'not' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5846:2: 'not'
            {
            match(input,51,FOLLOW_51_in_rule__Neg__Group_0__1__Impl11749); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5857:1: rule__Neg__Group_0__2 : rule__Neg__Group_0__2__Impl ;
    public final void rule__Neg__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5861:1: ( rule__Neg__Group_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5862:2: rule__Neg__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__211781);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5868:1: rule__Neg__Group_0__2__Impl : ( ( rule__Neg__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Neg__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5872:1: ( ( ( rule__Neg__ExpressionAssignment_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5873:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5873:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5874:1: ( rule__Neg__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5875:1: ( rule__Neg__ExpressionAssignment_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5875:2: rule__Neg__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl11808);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5891:1: rule__Neg__Group_1__0 : rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 ;
    public final void rule__Neg__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5895:1: ( rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5896:2: rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__011844);
            rule__Neg__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__011847);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5903:1: rule__Neg__Group_1__0__Impl : ( () ) ;
    public final void rule__Neg__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5907:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5908:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5908:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5909:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5910:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5912:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5922:1: rule__Neg__Group_1__1 : rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 ;
    public final void rule__Neg__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5926:1: ( rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5927:2: rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__111905);
            rule__Neg__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__111908);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5934:1: rule__Neg__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Neg__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5938:1: ( ( ( '-' ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5939:1: ( ( '-' ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5939:1: ( ( '-' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5940:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5941:1: ( '-' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5942:2: '-'
            {
            match(input,20,FOLLOW_20_in_rule__Neg__Group_1__1__Impl11937); if (state.failed) return ;

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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5953:1: rule__Neg__Group_1__2 : rule__Neg__Group_1__2__Impl ;
    public final void rule__Neg__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5957:1: ( rule__Neg__Group_1__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5958:2: rule__Neg__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__211969);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5964:1: rule__Neg__Group_1__2__Impl : ( ( rule__Neg__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Neg__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5968:1: ( ( ( rule__Neg__ExpressionAssignment_1_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5969:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5969:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5970:1: ( rule__Neg__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5971:1: ( rule__Neg__ExpressionAssignment_1_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5971:2: rule__Neg__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl11996);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5987:1: rule__Atom__Group_4__0 : rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 ;
    public final void rule__Atom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5991:1: ( rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5992:2: rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__012032);
            rule__Atom__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__012035);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:5999:1: rule__Atom__Group_4__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6003:1: ( ( '(' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6004:1: ( '(' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6004:1: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6005:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Atom__Group_4__0__Impl12063); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6018:1: rule__Atom__Group_4__1 : rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2 ;
    public final void rule__Atom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6022:1: ( rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6023:2: rule__Atom__Group_4__1__Impl rule__Atom__Group_4__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__112094);
            rule__Atom__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__2_in_rule__Atom__Group_4__112097);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6030:1: rule__Atom__Group_4__1__Impl : ( ruleExpression ) ;
    public final void rule__Atom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6034:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6035:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6035:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6036:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Atom__Group_4__1__Impl12124);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6047:1: rule__Atom__Group_4__2 : rule__Atom__Group_4__2__Impl ;
    public final void rule__Atom__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6051:1: ( rule__Atom__Group_4__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6052:2: rule__Atom__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__2__Impl_in_rule__Atom__Group_4__212153);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6058:1: rule__Atom__Group_4__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6062:1: ( ( ')' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6063:1: ( ')' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6063:1: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6064:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__Atom__Group_4__2__Impl12181); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6083:1: rule__NameRef__Group__0 : rule__NameRef__Group__0__Impl rule__NameRef__Group__1 ;
    public final void rule__NameRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6087:1: ( rule__NameRef__Group__0__Impl rule__NameRef__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6088:2: rule__NameRef__Group__0__Impl rule__NameRef__Group__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012218);
            rule__NameRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012221);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6095:1: rule__NameRef__Group__0__Impl : ( ( rule__NameRef__VariableAssignment_0 ) ) ;
    public final void rule__NameRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6099:1: ( ( ( rule__NameRef__VariableAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6100:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6100:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6101:1: ( rule__NameRef__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6102:1: ( rule__NameRef__VariableAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6102:2: rule__NameRef__VariableAssignment_0
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12248);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6112:1: rule__NameRef__Group__1 : rule__NameRef__Group__1__Impl ;
    public final void rule__NameRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6116:1: ( rule__NameRef__Group__1__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6117:2: rule__NameRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112278);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6123:1: rule__NameRef__Group__1__Impl : ( ( rule__NameRef__Group_1__0 )* ) ;
    public final void rule__NameRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6127:1: ( ( ( rule__NameRef__Group_1__0 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6128:1: ( ( rule__NameRef__Group_1__0 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6128:1: ( ( rule__NameRef__Group_1__0 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6129:1: ( rule__NameRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6130:1: ( rule__NameRef__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==52) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6130:2: rule__NameRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12305);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6144:1: rule__NameRef__Group_1__0 : rule__NameRef__Group_1__0__Impl ;
    public final void rule__NameRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6148:1: ( rule__NameRef__Group_1__0__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6149:2: rule__NameRef__Group_1__0__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012340);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6155:1: rule__NameRef__Group_1__0__Impl : ( ( rule__NameRef__Group_1_0__0 ) ) ;
    public final void rule__NameRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6159:1: ( ( ( rule__NameRef__Group_1_0__0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6160:1: ( ( rule__NameRef__Group_1_0__0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6160:1: ( ( rule__NameRef__Group_1_0__0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6161:1: ( rule__NameRef__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6162:1: ( rule__NameRef__Group_1_0__0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6162:2: rule__NameRef__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12367);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6174:1: rule__NameRef__Group_1_0__0 : rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 ;
    public final void rule__NameRef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6178:1: ( rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6179:2: rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012399);
            rule__NameRef__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012402);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6186:1: rule__NameRef__Group_1_0__0__Impl : ( () ) ;
    public final void rule__NameRef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6190:1: ( ( () ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6191:1: ( () )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6191:1: ( () )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6192:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6193:1: ()
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6195:1: 
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6205:1: rule__NameRef__Group_1_0__1 : rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 ;
    public final void rule__NameRef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6209:1: ( rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6210:2: rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112460);
            rule__NameRef__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112463);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6217:1: rule__NameRef__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__NameRef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6221:1: ( ( '.' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6222:1: ( '.' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6222:1: ( '.' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6223:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__NameRef__Group_1_0__1__Impl12491); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6236:1: rule__NameRef__Group_1_0__2 : rule__NameRef__Group_1_0__2__Impl ;
    public final void rule__NameRef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6240:1: ( rule__NameRef__Group_1_0__2__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6241:2: rule__NameRef__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212522);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6247:1: rule__NameRef__Group_1_0__2__Impl : ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) ;
    public final void rule__NameRef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6251:1: ( ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6252:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6252:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6253:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6254:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6254:2: rule__NameRef__VariableAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12549);
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


    // $ANTLR start "rule__Switch__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6270:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6274:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6275:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
            {
            pushFollow(FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__012585);
            rule__Switch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__012588);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6282:1: rule__Switch__Group__0__Impl : ( 'case {' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6286:1: ( ( 'case {' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6287:1: ( 'case {' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6287:1: ( 'case {' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6288:1: 'case {'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCaseKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Switch__Group__0__Impl12616); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getCaseKeyword_0()); 
            }

            }


            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6301:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6305:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6306:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__112647);
            rule__Switch__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__112650);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6313:1: rule__Switch__Group__1__Impl : ( ( rule__Switch__OwnedCasesAssignment_1 )* ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6317:1: ( ( ( rule__Switch__OwnedCasesAssignment_1 )* ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6318:1: ( ( rule__Switch__OwnedCasesAssignment_1 )* )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6318:1: ( ( rule__Switch__OwnedCasesAssignment_1 )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6319:1: ( rule__Switch__OwnedCasesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getOwnedCasesAssignment_1()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6320:1: ( rule__Switch__OwnedCasesAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_INT)||LA35_0==20||(LA35_0>=23 && LA35_0<=24)||LA35_0==38||LA35_0==51) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6320:2: rule__Switch__OwnedCasesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Switch__OwnedCasesAssignment_1_in_rule__Switch__Group__1__Impl12677);
            	    rule__Switch__OwnedCasesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getOwnedCasesAssignment_1()); 
            }

            }


            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6330:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6334:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6335:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__212708);
            rule__Switch__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__212711);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6342:1: rule__Switch__Group__2__Impl : ( 'else' ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6346:1: ( ( 'else' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6347:1: ( 'else' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6347:1: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6348:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseKeyword_2()); 
            }
            match(input,50,FOLLOW_50_in_rule__Switch__Group__2__Impl12739); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getElseKeyword_2()); 
            }

            }


            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6361:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6365:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6366:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__312770);
            rule__Switch__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__312773);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6373:1: rule__Switch__Group__3__Impl : ( ( rule__Switch__DefaultAssignment_3 ) ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6377:1: ( ( ( rule__Switch__DefaultAssignment_3 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6378:1: ( ( rule__Switch__DefaultAssignment_3 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6378:1: ( ( rule__Switch__DefaultAssignment_3 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6379:1: ( rule__Switch__DefaultAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getDefaultAssignment_3()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6380:1: ( rule__Switch__DefaultAssignment_3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6380:2: rule__Switch__DefaultAssignment_3
            {
            pushFollow(FOLLOW_rule__Switch__DefaultAssignment_3_in_rule__Switch__Group__3__Impl12800);
            rule__Switch__DefaultAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getDefaultAssignment_3()); 
            }

            }


            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6390:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6394:1: ( rule__Switch__Group__4__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6395:2: rule__Switch__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__412830);
            rule__Switch__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6401:1: rule__Switch__Group__4__Impl : ( '}' ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6405:1: ( ( '}' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6406:1: ( '}' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6406:1: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6407:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,32,FOLLOW_32_in_rule__Switch__Group__4__Impl12858); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__CaseExpression__Group__0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6430:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6434:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6435:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__012899);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__012902);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6442:1: rule__CaseExpression__Group__0__Impl : ( ( rule__CaseExpression__ConditionAssignment_0 ) ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6446:1: ( ( ( rule__CaseExpression__ConditionAssignment_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6447:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6447:1: ( ( rule__CaseExpression__ConditionAssignment_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6448:1: ( rule__CaseExpression__ConditionAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionAssignment_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6449:1: ( rule__CaseExpression__ConditionAssignment_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6449:2: rule__CaseExpression__ConditionAssignment_0
            {
            pushFollow(FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl12929);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6459:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6463:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6464:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__112959);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__112962);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6471:1: rule__CaseExpression__Group__1__Impl : ( ':' ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6475:1: ( ( ':' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6476:1: ( ':' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6476:1: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6477:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__CaseExpression__Group__1__Impl12990); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6490:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6494:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6495:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__213021);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__213024);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6502:1: rule__CaseExpression__Group__2__Impl : ( ( rule__CaseExpression__BodyAssignment_2 ) ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6506:1: ( ( ( rule__CaseExpression__BodyAssignment_2 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6507:1: ( ( rule__CaseExpression__BodyAssignment_2 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6507:1: ( ( rule__CaseExpression__BodyAssignment_2 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6508:1: ( rule__CaseExpression__BodyAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getBodyAssignment_2()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6509:1: ( rule__CaseExpression__BodyAssignment_2 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6509:2: rule__CaseExpression__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__CaseExpression__BodyAssignment_2_in_rule__CaseExpression__Group__2__Impl13051);
            rule__CaseExpression__BodyAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getBodyAssignment_2()); 
            }

            }


            }

        }
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6519:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6523:1: ( rule__CaseExpression__Group__3__Impl )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6524:2: rule__CaseExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__313081);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6530:1: rule__CaseExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6534:1: ( ( ',' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6535:1: ( ',' )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6535:1: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6536:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCommaKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__CaseExpression__Group__3__Impl13109); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6558:1: rule__Model__DeclarationsAssignment : ( ruleAbstractDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6562:1: ( ( ruleAbstractDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6563:1: ( ruleAbstractDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6563:1: ( ruleAbstractDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6564:1: ruleAbstractDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment13153);
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


    // $ANTLR start "rule__ExpressionConstant__OwnedExpressionAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6575:1: rule__ExpressionConstant__OwnedExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ExpressionConstant__OwnedExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6579:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6580:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6580:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6581:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantAccess().getOwnedExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionConstant__OwnedExpressionAssignment_113186);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantAccess().getOwnedExpressionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionConstant__OwnedExpressionAssignment_1"


    // $ANTLR start "rule__DomainConstant__DomainAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6590:1: rule__DomainConstant__DomainAssignment_1 : ( ruleAbstractDomain ) ;
    public final void rule__DomainConstant__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6594:1: ( ( ruleAbstractDomain ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6595:1: ( ruleAbstractDomain )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6595:1: ( ruleAbstractDomain )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6596:1: ruleAbstractDomain
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getDomainAbstractDomainParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAbstractDomain_in_rule__DomainConstant__DomainAssignment_113217);
            ruleAbstractDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getDomainAbstractDomainParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__DomainAssignment_1"


    // $ANTLR start "rule__DomainConstant__OwnedExpressionAssignment_2_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6605:1: rule__DomainConstant__OwnedExpressionAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__DomainConstant__OwnedExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6609:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6610:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6610:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6611:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainConstantAccess().getOwnedExpressionExpressionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__DomainConstant__OwnedExpressionAssignment_2_113248);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainConstantAccess().getOwnedExpressionExpressionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainConstant__OwnedExpressionAssignment_2_1"


    // $ANTLR start "rule__Range__LowerAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6622:1: rule__Range__LowerAssignment_1 : ( ruleAtom ) ;
    public final void rule__Range__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6626:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6627:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6627:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6628:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getLowerAtomParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Range__LowerAssignment_113281);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getLowerAtomParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LowerAssignment_1"


    // $ANTLR start "rule__Range__UpperAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6637:1: rule__Range__UpperAssignment_3 : ( ruleAtom ) ;
    public final void rule__Range__UpperAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6641:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6642:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6642:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6643:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRangeAccess().getUpperAtomParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Range__UpperAssignment_313312);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRangeAccess().getUpperAtomParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__UpperAssignment_3"


    // $ANTLR start "rule__Enumeration__OwnedLiteralsAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6652:1: rule__Enumeration__OwnedLiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__Enumeration__OwnedLiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6656:1: ( ( ruleLiteral ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6657:1: ( ruleLiteral )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6657:1: ( ruleLiteral )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6658:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Enumeration__OwnedLiteralsAssignment_113343);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__OwnedLiteralsAssignment_1"


    // $ANTLR start "rule__Enumeration__OwnedLiteralsAssignment_2_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6667:1: rule__Enumeration__OwnedLiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__Enumeration__OwnedLiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6671:1: ( ( ruleLiteral ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6672:1: ( ruleLiteral )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6672:1: ( ruleLiteral )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6673:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Enumeration__OwnedLiteralsAssignment_2_113374);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__OwnedLiteralsAssignment_2_1"


    // $ANTLR start "rule__Literal__NameAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6682:1: rule__Literal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Literal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6686:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6687:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6687:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6688:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_113405); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__NameAssignment_1"


    // $ANTLR start "rule__BaseType__NameAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6697:1: rule__BaseType__NameAssignment : ( ruleBaseTypeEnum ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6701:1: ( ( ruleBaseTypeEnum ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6702:1: ( ruleBaseTypeEnum )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6702:1: ( ruleBaseTypeEnum )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6703:1: ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment13436);
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


    // $ANTLR start "rule__ClassType__ClassAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6712:1: rule__ClassType__ClassAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__ClassAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6716:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6717:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6717:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6718:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassNodeCrossReference_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6719:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6720:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassTypeAccess().getClassNodeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClassType__ClassAssignment13471); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeAccess().getClassNodeIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassTypeAccess().getClassNodeCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__ClassAssignment"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6731:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6735:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6736:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6736:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6737:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_213506); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6746:1: rule__Class__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Class__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6750:1: ( ( ruleDeclaration ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6751:1: ( ruleDeclaration )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6751:1: ( ruleDeclaration )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6752:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_313537);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6761:1: rule__Class__TransitionsAssignment_4_1 : ( ruleLabeledTransition ) ;
    public final void rule__Class__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6765:1: ( ( ruleLabeledTransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6766:1: ( ruleLabeledTransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6766:1: ( ruleLabeledTransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6767:1: ruleLabeledTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_113568);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6776:1: rule__Class__AssertionsAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Class__AssertionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6780:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6781:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6781:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6782:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_113599);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6791:1: rule__VariableDeclaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6795:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6796:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6796:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6797:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_113630);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6806:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6810:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6811:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6811:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6812:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_213661); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6821:1: rule__VariableDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6825:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6826:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6826:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6827:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_113692);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6836:1: rule__VariableDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6840:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6841:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6841:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6842:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_113723);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6851:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6855:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6856:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6856:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6857:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113754); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6866:1: rule__Attribute__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6870:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6871:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6871:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6872:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313785);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6881:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6885:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6886:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6886:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6887:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213816); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6896:1: rule__EventDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6900:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6901:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6901:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6902:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113847);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6911:1: rule__EventDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6915:1: ( ( ruleAttribute ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6916:1: ( ruleAttribute )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6916:1: ( ruleAttribute )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6917:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113878);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6926:1: rule__ParameterDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6930:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6931:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6931:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6932:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_213909);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6941:1: rule__ParameterDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6945:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6946:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6946:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6947:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_313940); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6956:1: rule__ParameterDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ParameterDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6960:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6961:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6961:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6962:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_513971);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6971:1: rule__ObserverDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ObserverDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6975:1: ( ( ruleType ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6976:1: ( ruleType )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6976:1: ( ruleType )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6977:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_214002);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6986:1: rule__ObserverDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObserverDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6990:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6991:1: ( RULE_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6991:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:6992:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_314033); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7001:1: rule__ObserverDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ObserverDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7005:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7006:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7006:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7007:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_514064);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7016:1: rule__LabeledTransition__EventAssignment_0 : ( ruleNameRef ) ;
    public final void rule__LabeledTransition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7020:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7021:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7021:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7022:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_014095);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7031:1: rule__LabeledTransition__ExpressionAssignment_2 : ( ruleTransitionAnd ) ;
    public final void rule__LabeledTransition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7035:1: ( ( ruleTransitionAnd ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7036:1: ( ruleTransitionAnd )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7036:1: ( ruleTransitionAnd )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7037:1: ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_214126);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7046:1: rule__TransitionAnd__RightAssignment_1_2 : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7050:1: ( ( ruleTransitionOr ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7051:1: ( ruleTransitionOr )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7051:1: ( ruleTransitionOr )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7052:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_214157);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7061:1: rule__TransitionOr__RightAssignment_1_2 : ( ruleITransition ) ;
    public final void rule__TransitionOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7065:1: ( ( ruleITransition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7066:1: ( ruleITransition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7066:1: ( ruleITransition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7067:1: ruleITransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightITransitionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleITransition_in_rule__TransitionOr__RightAssignment_1_214188);
            ruleITransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrAccess().getRightITransitionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Assignment__VariableAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7076:1: rule__Assignment__VariableAssignment_1 : ( ruleNameRef ) ;
    public final void rule__Assignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7080:1: ( ( ruleNameRef ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7081:1: ( ruleNameRef )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7081:1: ( ruleNameRef )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7082:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_114219);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7091:1: rule__Assignment__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7095:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7096:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7096:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7097:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_314250);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7106:1: rule__Block__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7110:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7111:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7111:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7112:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_214281);
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


    // $ANTLR start "rule__IfThenElse__ConditionAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7121:1: rule__IfThenElse__ConditionAssignment_1 : ( ruleExpression ) ;
    public final void rule__IfThenElse__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7125:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7126:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7126:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7127:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getConditionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__IfThenElse__ConditionAssignment_114312);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getConditionExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ConditionAssignment_1"


    // $ANTLR start "rule__IfThenElse__ThenAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7136:1: rule__IfThenElse__ThenAssignment_3 : ( ruleInstruction ) ;
    public final void rule__IfThenElse__ThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7140:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7141:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7141:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7142:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__IfThenElse__ThenAssignment_314343);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ThenAssignment_3"


    // $ANTLR start "rule__IfThenElse__ElseAssignment_4_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7151:1: rule__IfThenElse__ElseAssignment_4_1 : ( ruleInstruction ) ;
    public final void rule__IfThenElse__ElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7155:1: ( ( ruleInstruction ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7156:1: ( ruleInstruction )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7156:1: ( ruleInstruction )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7157:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_rule__IfThenElse__ElseAssignment_4_114374);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfThenElse__ElseAssignment_4_1"


    // $ANTLR start "rule__Logical__OpAssignment_1_0_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7166:1: rule__Logical__OpAssignment_1_0_1 : ( ( rule__Logical__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Logical__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7170:1: ( ( ( rule__Logical__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7171:1: ( ( rule__Logical__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7171:1: ( ( rule__Logical__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7172:1: ( rule__Logical__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7173:1: ( rule__Logical__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7173:2: rule__Logical__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Logical__OpAlternatives_1_0_1_0_in_rule__Logical__OpAssignment_1_0_114405);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7182:1: rule__Logical__RightAssignment_1_0_2 : ( ruleRelation ) ;
    public final void rule__Logical__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7186:1: ( ( ruleRelation ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7187:1: ( ruleRelation )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7187:1: ( ruleRelation )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7188:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_rule__Logical__RightAssignment_1_0_214438);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7197:1: rule__Relation__OpAssignment_1_0_1 : ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Relation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7201:1: ( ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7202:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7202:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7203:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7204:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7204:2: rule__Relation__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_114469);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7213:1: rule__Relation__RightAssignment_1_0_2 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7217:1: ( ( ruleAddition ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7218:1: ( ruleAddition )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7218:1: ( ruleAddition )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7219:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_214502);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7228:1: rule__Addition__OpAssignment_1_0_1 : ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Addition__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7232:1: ( ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7233:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7233:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7234:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7235:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7235:2: rule__Addition__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_114533);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7244:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7248:1: ( ( ruleMultiplication ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7249:1: ( ruleMultiplication )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7249:1: ( ruleMultiplication )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7250:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214566);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7259:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7263:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7264:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7264:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7265:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7266:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7266:2: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114597);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7275:1: rule__Multiplication__RightAssignment_1_0_2 : ( ruleNeg ) ;
    public final void rule__Multiplication__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7279:1: ( ( ruleNeg ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7280:1: ( ruleNeg )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7280:1: ( ruleNeg )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7281:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214630);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7290:1: rule__Neg__ExpressionAssignment_0_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7294:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7295:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7295:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7296:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214661);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7305:1: rule__Neg__ExpressionAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7309:1: ( ( ruleAtom ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7310:1: ( ruleAtom )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7310:1: ( ruleAtom )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7311:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214692);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7320:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7324:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7325:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7325:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7326:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7327:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7327:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment14723);
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7336:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7340:1: ( ( RULE_STRING ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7341:1: ( RULE_STRING )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7341:1: ( RULE_STRING )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7342:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14756); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7351:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7355:1: ( ( RULE_INT ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7356:1: ( RULE_INT )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7356:1: ( RULE_INT )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7357:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment14787); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7366:1: rule__NameRef__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7370:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7371:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7371:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7372:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7373:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7374:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_014822); if (state.failed) return ;
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
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7385:1: rule__NameRef__VariableAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7389:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7390:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7390:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7391:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7392:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7393:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_214861); if (state.failed) return ;
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


    // $ANTLR start "rule__DomainRef__ReferenceAssignment"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7405:1: rule__DomainRef__ReferenceAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DomainRef__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7409:1: ( ( ( RULE_ID ) ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7410:1: ( ( RULE_ID ) )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7410:1: ( ( RULE_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7411:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRefAccess().getReferenceDomainCrossReference_0()); 
            }
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7412:1: ( RULE_ID )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7413:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRefAccess().getReferenceDomainIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainRef__ReferenceAssignment14901); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRefAccess().getReferenceDomainIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRefAccess().getReferenceDomainCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainRef__ReferenceAssignment"


    // $ANTLR start "rule__Switch__OwnedCasesAssignment_1"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7424:1: rule__Switch__OwnedCasesAssignment_1 : ( ruleCaseExpression ) ;
    public final void rule__Switch__OwnedCasesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7428:1: ( ( ruleCaseExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7429:1: ( ruleCaseExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7429:1: ( ruleCaseExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7430:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getOwnedCasesCaseExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_rule__Switch__OwnedCasesAssignment_114936);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getOwnedCasesCaseExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__OwnedCasesAssignment_1"


    // $ANTLR start "rule__Switch__DefaultAssignment_3"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7439:1: rule__Switch__DefaultAssignment_3 : ( ruleExpression ) ;
    public final void rule__Switch__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7443:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7444:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7444:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7445:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getDefaultExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Switch__DefaultAssignment_314967);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchAccess().getDefaultExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Switch__DefaultAssignment_3"


    // $ANTLR start "rule__CaseExpression__ConditionAssignment_0"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7454:1: rule__CaseExpression__ConditionAssignment_0 : ( ruleExpression ) ;
    public final void rule__CaseExpression__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7458:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7459:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7459:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7460:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__ConditionAssignment_014998);
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


    // $ANTLR start "rule__CaseExpression__BodyAssignment_2"
    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7469:1: rule__CaseExpression__BodyAssignment_2 : ( ruleExpression ) ;
    public final void rule__CaseExpression__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7473:1: ( ( ruleExpression ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7474:1: ( ruleExpression )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7474:1: ( ruleExpression )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:7475:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getBodyExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__CaseExpression__BodyAssignment_215029);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getBodyExpressionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__BodyAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleAbstractDeclaration161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDefinitionConstant__Alternatives_in_ruleAbstractDefinitionConstant222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionConstant256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionConstant__Group__0_in_ruleExpressionConstant282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainConstant316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group__0_in_ruleDomainConstant342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDomain378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDomain__Alternatives_in_ruleAbstractDomain404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0_in_ruleRange464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__0_in_ruleLiteral584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseType__NameAssignment_in_ruleBaseType704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_entryRuleClassType731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassType738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassType__ClassAssignment_in_ruleClassType764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclaration1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__0_in_ruleEventDeclaration1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObserverDeclaration1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__0_in_ruleObserverDeclaration1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledTransition1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__0_in_ruleLabeledTransition1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionAnd1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__0_in_ruleTransitionAnd1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionOr1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__0_in_ruleTransitionOr1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleITransition_in_entryRuleITransition1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleITransition1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ITransition__Group__0_in_ruleITransition1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction1451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instruction__Alternatives_in_ruleInstruction1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0_in_ruleSkip1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__0_in_ruleIfThenElse1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleExpression1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical1810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__0_in_ruleLogical1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0_in_ruleRelation1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_entryRuleNeg2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Alternatives_in_ruleNeg2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral2170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral2230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerLiteral__ValueAssignment_in_ruleIntegerLiteral2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_entryRuleNameRef2350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameRef2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0_in_ruleNameRef2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRef_in_entryRuleDomainRef2414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainRef2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainRef__ReferenceAssignment_in_ruleDomainRef2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch2476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0_in_ruleSwitch2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression2536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0_in_ruleCaseExpression2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseTypeEnum__Alternatives_in_ruleBaseTypeEnum2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_rule__AbstractDefinitionConstant__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_rule__AbstractDefinitionConstant__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_rule__AbstractDomain__Alternatives2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rule__AbstractDomain__Alternatives2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_rule__AbstractDomain__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_rule__Type__Alternatives2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassType_in_rule__Type__Alternatives2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__Declaration__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_rule__Declaration__Alternatives2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__Declaration__Alternatives2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_rule__Declaration__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_rule__Instruction__Alternatives2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Instruction__Alternatives2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Instruction__Alternatives2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_rule__Instruction__Alternatives2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Logical__OpAlternatives_1_0_1_02974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Logical__OpAlternatives_1_0_1_02994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Relation__OpAlternatives_1_0_1_03029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Relation__OpAlternatives_1_0_1_03049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Relation__OpAlternatives_1_0_1_03069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Relation__OpAlternatives_1_0_1_03089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Relation__OpAlternatives_1_0_1_03109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Relation__OpAlternatives_1_0_1_03129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Addition__OpAlternatives_1_0_1_03164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Addition__OpAlternatives_1_0_1_03184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Multiplication__OpAlternatives_1_0_1_03219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Multiplication__OpAlternatives_1_0_1_03239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0_in_rule__Neg__Alternatives3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0_in_rule__Neg__Alternatives3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__Alternatives3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Atom__Alternatives3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Atom__Alternatives3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_rule__Atom__Alternatives3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Atom__Alternatives3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BooleanLiteral__ValueAlternatives_03443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BooleanLiteral__ValueAlternatives_03463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BaseTypeEnum__Alternatives3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BaseTypeEnum__Alternatives3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionConstant__Group__0__Impl_in_rule__ExpressionConstant__Group__03555 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__ExpressionConstant__Group__1_in_rule__ExpressionConstant__Group__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ExpressionConstant__Group__0__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionConstant__Group__1__Impl_in_rule__ExpressionConstant__Group__13617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionConstant__OwnedExpressionAssignment_1_in_rule__ExpressionConstant__Group__1__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group__0__Impl_in_rule__DomainConstant__Group__03678 = new BitSet(new long[]{0x0000000096000000L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group__1_in_rule__DomainConstant__Group__03681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DomainConstant__Group__0__Impl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group__1__Impl_in_rule__DomainConstant__Group__13740 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group__2_in_rule__DomainConstant__Group__13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__DomainAssignment_1_in_rule__DomainConstant__Group__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group__2__Impl_in_rule__DomainConstant__Group__23800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group_2__0_in_rule__DomainConstant__Group__2__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group_2__0__Impl_in_rule__DomainConstant__Group_2__03864 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group_2__1_in_rule__DomainConstant__Group_2__03867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DomainConstant__Group_2__0__Impl3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__Group_2__1__Impl_in_rule__DomainConstant__Group_2__13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainConstant__OwnedExpressionAssignment_2_1_in_rule__DomainConstant__Group_2__1__Impl3953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__0__Impl_in_rule__Range__Group__03988 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Range__Group__1_in_rule__Range__Group__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Range__Group__0__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__1__Impl_in_rule__Range__Group__14050 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Range__Group__2_in_rule__Range__Group__14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__LowerAssignment_1_in_rule__Range__Group__1__Impl4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__2__Impl_in_rule__Range__Group__24110 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Range__Group__3_in_rule__Range__Group__24113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Range__Group__2__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__3__Impl_in_rule__Range__Group__34172 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Range__Group__4_in_rule__Range__Group__34175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__UpperAssignment_3_in_rule__Range__Group__3__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Range__Group__4__Impl_in_rule__Range__Group__44232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Range__Group__4__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__04301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__04304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Enumeration__Group__0__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__14363 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__14366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__OwnedLiteralsAssignment_1_in_rule__Enumeration__Group__1__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__24423 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__24426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_2__0_in_rule__Enumeration__Group__2__Impl4453 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__34484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Enumeration__Group__3__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_2__0__Impl_in_rule__Enumeration__Group_2__04551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_2__1_in_rule__Enumeration__Group_2__04554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Enumeration__Group_2__0__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__Group_2__1__Impl_in_rule__Enumeration__Group_2__14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enumeration__OwnedLiteralsAssignment_2_1_in_rule__Enumeration__Group_2__1__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__04674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__04677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__14735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_in_rule__Literal__Group__1__Impl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__04796 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__04799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__14857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__14860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Class__Group__1__Impl4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__24919 = new BitSet(new long[]{0x0000071C06000010L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__24922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__34979 = new BitSet(new long[]{0x0000071C06000010L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__34982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__DeclarationsAssignment_3_in_rule__Class__Group__3__Impl5009 = new BitSet(new long[]{0x0000070006000012L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__45040 = new BitSet(new long[]{0x0000071C06000010L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__45043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0_in_rule__Class__Group__4__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__55101 = new BitSet(new long[]{0x0000071C06000010L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__55104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0_in_rule__Class__Group__5__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__65162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Class__Group__6__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__0__Impl_in_rule__Class__Group_4__05235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1_in_rule__Class__Group_4__05238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Class__Group_4__0__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_4__1__Impl_in_rule__Class__Group_4__15297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl5326 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__TransitionsAssignment_4_1_in_rule__Class__Group_4__1__Impl5338 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Class__Group_5__0__Impl_in_rule__Class__Group_5__05375 = new BitSet(new long[]{0x0001400080000010L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1_in_rule__Class__Group_5__05378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Class__Group_5__0__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_5__1__Impl_in_rule__Class__Group_5__15437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl5466 = new BitSet(new long[]{0x0001400080000012L});
    public static final BitSet FOLLOW_rule__Class__AssertionsAssignment_5_1_in_rule__Class__Group_5__1__Impl5478 = new BitSet(new long[]{0x0001400080000012L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__05515 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__15576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__15579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_1_in_rule__VariableDeclaration__Group__1__Impl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__25636 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__25639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__NameAssignment_2_in_rule__VariableDeclaration__Group__2__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__35696 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4_in_rule__VariableDeclaration__Group__35699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0_in_rule__VariableDeclaration__Group__3__Impl5726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__4__Impl_in_rule__VariableDeclaration__Group__45757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__VariableDeclaration__Group__4__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__0__Impl_in_rule__VariableDeclaration__Group_3__05826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1_in_rule__VariableDeclaration__Group_3__05829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__VariableDeclaration__Group_3__0__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__1__Impl_in_rule__VariableDeclaration__Group_3__15888 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2_in_rule__VariableDeclaration__Group_3__15891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_1_in_rule__VariableDeclaration__Group_3__1__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__2__Impl_in_rule__VariableDeclaration__Group_3__25948 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3_in_rule__VariableDeclaration__Group_3__25951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0_in_rule__VariableDeclaration__Group_3__2__Impl5978 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3__3__Impl_in_rule__VariableDeclaration__Group_3__36009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__VariableDeclaration__Group_3__3__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__0__Impl_in_rule__VariableDeclaration__Group_3_2__06076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1_in_rule__VariableDeclaration__Group_3_2__06079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariableDeclaration__Group_3_2__0__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group_3_2__1__Impl_in_rule__VariableDeclaration__Group_3_2__16138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__AttributesAssignment_3_2_1_in_rule__VariableDeclaration__Group_3_2__1__Impl6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26320 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Attribute__Group__2__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36382 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_3_in_rule__Attribute__Group__3__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__Group__4__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__0__Impl_in_rule__EventDeclaration__Group__06511 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1_in_rule__EventDeclaration__Group__06514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__1__Impl_in_rule__EventDeclaration__Group__16572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2_in_rule__EventDeclaration__Group__16575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__EventDeclaration__Group__1__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__2__Impl_in_rule__EventDeclaration__Group__26634 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3_in_rule__EventDeclaration__Group__26637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__NameAssignment_2_in_rule__EventDeclaration__Group__2__Impl6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group__3__Impl_in_rule__EventDeclaration__Group__36694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0_in_rule__EventDeclaration__Group__3__Impl6721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__0__Impl_in_rule__EventDeclaration__Group_3__06760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1_in_rule__EventDeclaration__Group_3__06763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EventDeclaration__Group_3__0__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__1__Impl_in_rule__EventDeclaration__Group_3__16822 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2_in_rule__EventDeclaration__Group_3__16825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_1_in_rule__EventDeclaration__Group_3__1__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__2__Impl_in_rule__EventDeclaration__Group_3__26882 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3_in_rule__EventDeclaration__Group_3__26885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0_in_rule__EventDeclaration__Group_3__2__Impl6912 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3__3__Impl_in_rule__EventDeclaration__Group_3__36943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EventDeclaration__Group_3__3__Impl6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__0__Impl_in_rule__EventDeclaration__Group_3_2__07010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1_in_rule__EventDeclaration__Group_3_2__07013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__EventDeclaration__Group_3_2__0__Impl7041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__Group_3_2__1__Impl_in_rule__EventDeclaration__Group_3_2__17072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventDeclaration__AttributesAssignment_3_2_1_in_rule__EventDeclaration__Group_3_2__1__Impl7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__07133 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__07136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__17194 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__17197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ParameterDeclaration__Group__1__Impl7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__27256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3_in_rule__ParameterDeclaration__Group__27259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__TypeAssignment_2_in_rule__ParameterDeclaration__Group__2__Impl7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__3__Impl_in_rule__ParameterDeclaration__Group__37316 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4_in_rule__ParameterDeclaration__Group__37319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__NameAssignment_3_in_rule__ParameterDeclaration__Group__3__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__4__Impl_in_rule__ParameterDeclaration__Group__47376 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5_in_rule__ParameterDeclaration__Group__47379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ParameterDeclaration__Group__4__Impl7407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__5__Impl_in_rule__ParameterDeclaration__Group__57438 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6_in_rule__ParameterDeclaration__Group__57441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__ValueAssignment_5_in_rule__ParameterDeclaration__Group__5__Impl7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__6__Impl_in_rule__ParameterDeclaration__Group__67498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParameterDeclaration__Group__6__Impl7526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__0__Impl_in_rule__ObserverDeclaration__Group__07571 = new BitSet(new long[]{0x0000070006000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1_in_rule__ObserverDeclaration__Group__07574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__1__Impl_in_rule__ObserverDeclaration__Group__17632 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2_in_rule__ObserverDeclaration__Group__17635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ObserverDeclaration__Group__1__Impl7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__2__Impl_in_rule__ObserverDeclaration__Group__27694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3_in_rule__ObserverDeclaration__Group__27697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__TypeAssignment_2_in_rule__ObserverDeclaration__Group__2__Impl7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__3__Impl_in_rule__ObserverDeclaration__Group__37754 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4_in_rule__ObserverDeclaration__Group__37757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__NameAssignment_3_in_rule__ObserverDeclaration__Group__3__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__4__Impl_in_rule__ObserverDeclaration__Group__47814 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5_in_rule__ObserverDeclaration__Group__47817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObserverDeclaration__Group__4__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__5__Impl_in_rule__ObserverDeclaration__Group__57876 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6_in_rule__ObserverDeclaration__Group__57879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__ValueAssignment_5_in_rule__ObserverDeclaration__Group__5__Impl7906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObserverDeclaration__Group__6__Impl_in_rule__ObserverDeclaration__Group__67936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ObserverDeclaration__Group__6__Impl7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__0__Impl_in_rule__LabeledTransition__Group__08009 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1_in_rule__LabeledTransition__Group__08012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__EventAssignment_0_in_rule__LabeledTransition__Group__0__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__1__Impl_in_rule__LabeledTransition__Group__18069 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2_in_rule__LabeledTransition__Group__18072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LabeledTransition__Group__1__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__Group__2__Impl_in_rule__LabeledTransition__Group__28131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledTransition__ExpressionAssignment_2_in_rule__LabeledTransition__Group__2__Impl8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__0__Impl_in_rule__TransitionAnd__Group__08194 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1_in_rule__TransitionAnd__Group__08197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__Group__0__Impl8224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group__1__Impl_in_rule__TransitionAnd__Group__18253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0_in_rule__TransitionAnd__Group__1__Impl8280 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__0__Impl_in_rule__TransitionAnd__Group_1__08315 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1_in_rule__TransitionAnd__Group_1__08318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__1__Impl_in_rule__TransitionAnd__Group_1__18376 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2_in_rule__TransitionAnd__Group_1__18379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__TransitionAnd__Group_1__1__Impl8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__Group_1__2__Impl_in_rule__TransitionAnd__Group_1__28438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionAnd__RightAssignment_1_2_in_rule__TransitionAnd__Group_1__2__Impl8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__0__Impl_in_rule__TransitionOr__Group__08501 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1_in_rule__TransitionOr__Group__08504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleITransition_in_rule__TransitionOr__Group__0__Impl8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group__1__Impl_in_rule__TransitionOr__Group__18560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0_in_rule__TransitionOr__Group__1__Impl8587 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__0__Impl_in_rule__TransitionOr__Group_1__08622 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1_in_rule__TransitionOr__Group_1__08625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__1__Impl_in_rule__TransitionOr__Group_1__18683 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2_in_rule__TransitionOr__Group_1__18686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TransitionOr__Group_1__1__Impl8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__Group_1__2__Impl_in_rule__TransitionOr__Group_1__28745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionOr__RightAssignment_1_2_in_rule__TransitionOr__Group_1__2__Impl8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ITransition__Group__0__Impl_in_rule__ITransition__Group__08808 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__ITransition__Group__1_in_rule__ITransition__Group__08811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ITransition__Group__1__Impl_in_rule__ITransition__Group__18869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ITransition__Group__1__Impl8897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__0__Impl_in_rule__Skip__Group__08932 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__1_in_rule__Skip__Group__08935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__1__Impl_in_rule__Skip__Group__18993 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Skip__Group__2_in_rule__Skip__Group__18996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Skip__Group__1__Impl9024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Skip__Group__2__Impl_in_rule__Skip__Group__29055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Skip__Group__2__Impl9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__09120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__09123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__19181 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__19184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__VariableAssignment_1_in_rule__Assignment__Group__1__Impl9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__29241 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__29244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Assignment__Group__2__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__39303 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4_in_rule__Assignment__Group__39306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__4__Impl_in_rule__Assignment__Group__49363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Assignment__Group__4__Impl9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__09432 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__09435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__19493 = new BitSet(new long[]{0x0001400080000010L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__19496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Block__Group__1__Impl9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__29555 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__29558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl9587 = new BitSet(new long[]{0x0001400080000012L});
    public static final BitSet FOLLOW_rule__Block__InstructionsAssignment_2_in_rule__Block__Group__2__Impl9599 = new BitSet(new long[]{0x0001400080000012L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__39632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Block__Group__3__Impl9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__0__Impl_in_rule__IfThenElse__Group__09699 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__1_in_rule__IfThenElse__Group__09702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__IfThenElse__Group__0__Impl9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__1__Impl_in_rule__IfThenElse__Group__19761 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__2_in_rule__IfThenElse__Group__19764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ConditionAssignment_1_in_rule__IfThenElse__Group__1__Impl9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__2__Impl_in_rule__IfThenElse__Group__29821 = new BitSet(new long[]{0x0001400080000010L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__3_in_rule__IfThenElse__Group__29824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__IfThenElse__Group__2__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__3__Impl_in_rule__IfThenElse__Group__39883 = new BitSet(new long[]{0x0004002000000000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__4_in_rule__IfThenElse__Group__39886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ThenAssignment_3_in_rule__IfThenElse__Group__3__Impl9913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__4__Impl_in_rule__IfThenElse__Group__49943 = new BitSet(new long[]{0x0004002000000000L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__5_in_rule__IfThenElse__Group__49946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_4__0_in_rule__IfThenElse__Group__4__Impl9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group__5__Impl_in_rule__IfThenElse__Group__510004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__IfThenElse__Group__5__Impl10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_4__0__Impl_in_rule__IfThenElse__Group_4__010075 = new BitSet(new long[]{0x0001400080000010L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_4__1_in_rule__IfThenElse__Group_4__010078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__IfThenElse__Group_4__0__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__Group_4__1__Impl_in_rule__IfThenElse__Group_4__110139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfThenElse__ElseAssignment_4_1_in_rule__IfThenElse__Group_4__1__Impl10166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__0__Impl_in_rule__Logical__Group__010200 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Logical__Group__1_in_rule__Logical__Group__010203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Logical__Group__0__Impl10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group__1__Impl_in_rule__Logical__Group__110259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__0_in_rule__Logical__Group__1__Impl10286 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Logical__Group_1__0__Impl_in_rule__Logical__Group_1__010321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__0_in_rule__Logical__Group_1__0__Impl10348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__0__Impl_in_rule__Logical__Group_1_0__010380 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__1_in_rule__Logical__Group_1_0__010383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__1__Impl_in_rule__Logical__Group_1_0__110441 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__2_in_rule__Logical__Group_1_0__110444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__OpAssignment_1_0_1_in_rule__Logical__Group_1_0__1__Impl10471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__Group_1_0__2__Impl_in_rule__Logical__Group_1_0__210501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__RightAssignment_1_0_2_in_rule__Logical__Group_1_0__2__Impl10528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__0__Impl_in_rule__Relation__Group__010564 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Relation__Group__1_in_rule__Relation__Group__010567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__Group__0__Impl10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group__1__Impl_in_rule__Relation__Group__110623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0_in_rule__Relation__Group__1__Impl10650 = new BitSet(new long[]{0x000000000007E002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1__0__Impl_in_rule__Relation__Group_1__010685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0_in_rule__Relation__Group_1__0__Impl10712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__0__Impl_in_rule__Relation__Group_1_0__010744 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1_in_rule__Relation__Group_1_0__010747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__1__Impl_in_rule__Relation__Group_1_0__110805 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2_in_rule__Relation__Group_1_0__110808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAssignment_1_0_1_in_rule__Relation__Group_1_0__1__Impl10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__Group_1_0__2__Impl_in_rule__Relation__Group_1_0__210865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__RightAssignment_1_0_2_in_rule__Relation__Group_1_0__2__Impl10892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__010928 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__010931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__110987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl11014 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__011049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0_in_rule__Addition__Group_1__0__Impl11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__0__Impl_in_rule__Addition__Group_1_0__011108 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1_in_rule__Addition__Group_1_0__011111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__1__Impl_in_rule__Addition__Group_1_0__111169 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2_in_rule__Addition__Group_1_0__111172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAssignment_1_0_1_in_rule__Addition__Group_1_0__1__Impl11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0__2__Impl_in_rule__Addition__Group_1_0__211229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_0_2_in_rule__Addition__Group_1_0__2__Impl11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011292 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__Group__0__Impl11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11378 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0_in_rule__Multiplication__Group_1__0__Impl11440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__0__Impl_in_rule__Multiplication__Group_1_0__011472 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1_in_rule__Multiplication__Group_1_0__011475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__1__Impl_in_rule__Multiplication__Group_1_0__111533 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2_in_rule__Multiplication__Group_1_0__111536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAssignment_1_0_1_in_rule__Multiplication__Group_1_0__1__Impl11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0__2__Impl_in_rule__Multiplication__Group_1_0__211593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_0_2_in_rule__Multiplication__Group_1_0__2__Impl11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__0__Impl_in_rule__Neg__Group_0__011656 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1_in_rule__Neg__Group_0__011659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__1__Impl_in_rule__Neg__Group_0__111717 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2_in_rule__Neg__Group_0__111720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Neg__Group_0__1__Impl11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_0__2__Impl_in_rule__Neg__Group_0__211781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_0_2_in_rule__Neg__Group_0__2__Impl11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__0__Impl_in_rule__Neg__Group_1__011844 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1_in_rule__Neg__Group_1__011847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__1__Impl_in_rule__Neg__Group_1__111905 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2_in_rule__Neg__Group_1__111908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Neg__Group_1__1__Impl11937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__Group_1__2__Impl_in_rule__Neg__Group_1__211969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg__ExpressionAssignment_1_2_in_rule__Neg__Group_1__2__Impl11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__012032 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__012035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Atom__Group_4__0__Impl12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__112094 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__2_in_rule__Atom__Group_4__112097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Atom__Group_4__1__Impl12124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__2__Impl_in_rule__Atom__Group_4__212153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Atom__Group_4__2__Impl12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__0__Impl_in_rule__NameRef__Group__012218 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1_in_rule__NameRef__Group__012221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_0_in_rule__NameRef__Group__0__Impl12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group__1__Impl_in_rule__NameRef__Group__112278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0_in_rule__NameRef__Group__1__Impl12305 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1__0__Impl_in_rule__NameRef__Group_1__012340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0_in_rule__NameRef__Group_1__0__Impl12367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__0__Impl_in_rule__NameRef__Group_1_0__012399 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1_in_rule__NameRef__Group_1_0__012402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__1__Impl_in_rule__NameRef__Group_1_0__112460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2_in_rule__NameRef__Group_1_0__112463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__NameRef__Group_1_0__1__Impl12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__Group_1_0__2__Impl_in_rule__NameRef__Group_1_0__212522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NameRef__VariableAssignment_1_0_2_in_rule__NameRef__Group_1_0__2__Impl12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__0__Impl_in_rule__Switch__Group__012585 = new BitSet(new long[]{0x000C004001900070L});
    public static final BitSet FOLLOW_rule__Switch__Group__1_in_rule__Switch__Group__012588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Switch__Group__0__Impl12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__1__Impl_in_rule__Switch__Group__112647 = new BitSet(new long[]{0x000C004001900070L});
    public static final BitSet FOLLOW_rule__Switch__Group__2_in_rule__Switch__Group__112650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__OwnedCasesAssignment_1_in_rule__Switch__Group__1__Impl12677 = new BitSet(new long[]{0x0008004001900072L});
    public static final BitSet FOLLOW_rule__Switch__Group__2__Impl_in_rule__Switch__Group__212708 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__Switch__Group__3_in_rule__Switch__Group__212711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Switch__Group__2__Impl12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__3__Impl_in_rule__Switch__Group__312770 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Switch__Group__4_in_rule__Switch__Group__312773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__DefaultAssignment_3_in_rule__Switch__Group__3__Impl12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Switch__Group__4__Impl_in_rule__Switch__Group__412830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Switch__Group__4__Impl12858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__0__Impl_in_rule__CaseExpression__Group__012899 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1_in_rule__CaseExpression__Group__012902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__ConditionAssignment_0_in_rule__CaseExpression__Group__0__Impl12929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__1__Impl_in_rule__CaseExpression__Group__112959 = new BitSet(new long[]{0x0008004001900070L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2_in_rule__CaseExpression__Group__112962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CaseExpression__Group__1__Impl12990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__2__Impl_in_rule__CaseExpression__Group__213021 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3_in_rule__CaseExpression__Group__213024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__BodyAssignment_2_in_rule__CaseExpression__Group__2__Impl13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CaseExpression__Group__3__Impl_in_rule__CaseExpression__Group__313081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CaseExpression__Group__3__Impl13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_rule__Model__DeclarationsAssignment13153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionConstant__OwnedExpressionAssignment_113186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_rule__DomainConstant__DomainAssignment_113217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__DomainConstant__OwnedExpressionAssignment_2_113248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Range__LowerAssignment_113281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Range__UpperAssignment_313312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__OwnedLiteralsAssignment_113343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__OwnedLiteralsAssignment_2_113374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_113405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseTypeEnum_in_rule__BaseType__NameAssignment13436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClassType__ClassAssignment13471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_213506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Class__DeclarationsAssignment_313537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_rule__Class__TransitionsAssignment_4_113568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Class__AssertionsAssignment_5_113599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_113630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableDeclaration__NameAssignment_213661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_113692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__VariableDeclaration__AttributesAssignment_3_2_113723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_113754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Attribute__ValueAssignment_313785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EventDeclaration__NameAssignment_213816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_113847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EventDeclaration__AttributesAssignment_3_2_113878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParameterDeclaration__TypeAssignment_213909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterDeclaration__NameAssignment_313940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParameterDeclaration__ValueAssignment_513971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ObserverDeclaration__TypeAssignment_214002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObserverDeclaration__NameAssignment_314033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ObserverDeclaration__ValueAssignment_514064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__LabeledTransition__EventAssignment_014095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_rule__LabeledTransition__ExpressionAssignment_214126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_rule__TransitionAnd__RightAssignment_1_214157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleITransition_in_rule__TransitionOr__RightAssignment_1_214188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_rule__Assignment__VariableAssignment_114219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_314250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__Block__InstructionsAssignment_214281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__IfThenElse__ConditionAssignment_114312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__IfThenElse__ThenAssignment_314343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_rule__IfThenElse__ElseAssignment_4_114374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical__OpAlternatives_1_0_1_0_in_rule__Logical__OpAssignment_1_0_114405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_rule__Logical__RightAssignment_1_0_214438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relation__OpAlternatives_1_0_1_0_in_rule__Relation__OpAssignment_1_0_114469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relation__RightAssignment_1_0_214502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__OpAlternatives_1_0_1_0_in_rule__Addition__OpAssignment_1_0_114533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_0_214566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__OpAlternatives_1_0_1_0_in_rule__Multiplication__OpAssignment_1_0_114597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_rule__Multiplication__RightAssignment_1_0_214630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_0_214661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Neg__ExpressionAssignment_1_214692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAlternatives_0_in_rule__BooleanLiteral__ValueAssignment14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment14756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntegerLiteral__ValueAssignment14787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_014822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NameRef__VariableAssignment_1_0_214861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainRef__ReferenceAssignment14901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_rule__Switch__OwnedCasesAssignment_114936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Switch__DefaultAssignment_314967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__ConditionAssignment_014998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__CaseExpression__BodyAssignment_215029 = new BitSet(new long[]{0x0000000000000002L});

}