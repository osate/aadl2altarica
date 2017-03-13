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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'exponential'", "'Dirac'", "'constant'", "'Integer'", "'Boolean'", "'error'", "'warning'", "'transformation'", "'issues'", "'{'", "'}'", "'domain'", "','", "'class'", "'end'", "'transition'", "'assertion'", "';'", "'('", "')'", "'='", "'event'", "'parameter'", "'observer'", "':'", "'&'", "'|'", "'->'", "'skip'", "':='", "'if'", "'then'", "'else'", "'switch'", "'not'", "'.'", "'default'", "'case'", "'or'", "'and'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_REGULAR_ID=9;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_ALPHA=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
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
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=6;
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
    public String getGrammarFileName() { return "InternalAltarica.g"; }


     
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
    // InternalAltarica.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAltarica.g:62:1: ( ruleModel EOF )
            // InternalAltarica.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAltarica.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // InternalAltarica.g:75:1: ( ( rule__Model__Group__0 ) )
            // InternalAltarica.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalAltarica.g:77:1: ( rule__Model__Group__0 )
            // InternalAltarica.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
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
    // InternalAltarica.g:89:1: entryRuleAbstractDeclaration : ruleAbstractDeclaration EOF ;
    public final void entryRuleAbstractDeclaration() throws RecognitionException {
        try {
            // InternalAltarica.g:90:1: ( ruleAbstractDeclaration EOF )
            // InternalAltarica.g:91:1: ruleAbstractDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:98:1: ruleAbstractDeclaration : ( ( rule__AbstractDeclaration__Alternatives ) ) ;
    public final void ruleAbstractDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:102:2: ( ( ( rule__AbstractDeclaration__Alternatives ) ) )
            // InternalAltarica.g:103:1: ( ( rule__AbstractDeclaration__Alternatives ) )
            {
            // InternalAltarica.g:103:1: ( ( rule__AbstractDeclaration__Alternatives ) )
            // InternalAltarica.g:104:1: ( rule__AbstractDeclaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractDeclarationAccess().getAlternatives()); 
            }
            // InternalAltarica.g:105:1: ( rule__AbstractDeclaration__Alternatives )
            // InternalAltarica.g:105:2: rule__AbstractDeclaration__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:117:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalAltarica.g:118:1: ( ruleDomain EOF )
            // InternalAltarica.g:119:1: ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:126:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:130:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalAltarica.g:131:1: ( ( rule__Domain__Group__0 ) )
            {
            // InternalAltarica.g:131:1: ( ( rule__Domain__Group__0 ) )
            // InternalAltarica.g:132:1: ( rule__Domain__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup()); 
            }
            // InternalAltarica.g:133:1: ( rule__Domain__Group__0 )
            // InternalAltarica.g:133:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:145:1: entryRuleSymbolicConstant : ruleSymbolicConstant EOF ;
    public final void entryRuleSymbolicConstant() throws RecognitionException {
        try {
            // InternalAltarica.g:146:1: ( ruleSymbolicConstant EOF )
            // InternalAltarica.g:147:1: ruleSymbolicConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolicConstantRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:154:1: ruleSymbolicConstant : ( ( rule__SymbolicConstant__Group__0 ) ) ;
    public final void ruleSymbolicConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:158:2: ( ( ( rule__SymbolicConstant__Group__0 ) ) )
            // InternalAltarica.g:159:1: ( ( rule__SymbolicConstant__Group__0 ) )
            {
            // InternalAltarica.g:159:1: ( ( rule__SymbolicConstant__Group__0 ) )
            // InternalAltarica.g:160:1: ( rule__SymbolicConstant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getGroup()); 
            }
            // InternalAltarica.g:161:1: ( rule__SymbolicConstant__Group__0 )
            // InternalAltarica.g:161:2: rule__SymbolicConstant__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:173:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalAltarica.g:174:1: ( ruleType EOF )
            // InternalAltarica.g:175:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:182:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:186:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalAltarica.g:187:1: ( ( rule__Type__Alternatives ) )
            {
            // InternalAltarica.g:187:1: ( ( rule__Type__Alternatives ) )
            // InternalAltarica.g:188:1: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalAltarica.g:189:1: ( rule__Type__Alternatives )
            // InternalAltarica.g:189:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:201:1: entryRuleBaseType : ruleBaseType EOF ;
    public final void entryRuleBaseType() throws RecognitionException {
        try {
            // InternalAltarica.g:202:1: ( ruleBaseType EOF )
            // InternalAltarica.g:203:1: ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:210:1: ruleBaseType : ( ( rule__BaseType__NameAssignment ) ) ;
    public final void ruleBaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:214:2: ( ( ( rule__BaseType__NameAssignment ) ) )
            // InternalAltarica.g:215:1: ( ( rule__BaseType__NameAssignment ) )
            {
            // InternalAltarica.g:215:1: ( ( rule__BaseType__NameAssignment ) )
            // InternalAltarica.g:216:1: ( rule__BaseType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameAssignment()); 
            }
            // InternalAltarica.g:217:1: ( rule__BaseType__NameAssignment )
            // InternalAltarica.g:217:2: rule__BaseType__NameAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:229:1: entryRuleNamedType : ruleNamedType EOF ;
    public final void entryRuleNamedType() throws RecognitionException {
        try {
            // InternalAltarica.g:230:1: ( ruleNamedType EOF )
            // InternalAltarica.g:231:1: ruleNamedType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNamedType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNamedTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:238:1: ruleNamedType : ( ( rule__NamedType__RefAssignment ) ) ;
    public final void ruleNamedType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:242:2: ( ( ( rule__NamedType__RefAssignment ) ) )
            // InternalAltarica.g:243:1: ( ( rule__NamedType__RefAssignment ) )
            {
            // InternalAltarica.g:243:1: ( ( rule__NamedType__RefAssignment ) )
            // InternalAltarica.g:244:1: ( rule__NamedType__RefAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefAssignment()); 
            }
            // InternalAltarica.g:245:1: ( rule__NamedType__RefAssignment )
            // InternalAltarica.g:245:2: rule__NamedType__RefAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:257:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalAltarica.g:258:1: ( ruleClass EOF )
            // InternalAltarica.g:259:1: ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:266:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:270:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalAltarica.g:271:1: ( ( rule__Class__Group__0 ) )
            {
            // InternalAltarica.g:271:1: ( ( rule__Class__Group__0 ) )
            // InternalAltarica.g:272:1: ( rule__Class__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup()); 
            }
            // InternalAltarica.g:273:1: ( rule__Class__Group__0 )
            // InternalAltarica.g:273:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:285:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalAltarica.g:286:1: ( ruleDeclaration EOF )
            // InternalAltarica.g:287:1: ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:294:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:298:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalAltarica.g:299:1: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalAltarica.g:299:1: ( ( rule__Declaration__Alternatives ) )
            // InternalAltarica.g:300:1: ( rule__Declaration__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            }
            // InternalAltarica.g:301:1: ( rule__Declaration__Alternatives )
            // InternalAltarica.g:301:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:313:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalAltarica.g:314:1: ( ruleVariableDeclaration EOF )
            // InternalAltarica.g:315:1: ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:322:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:326:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalAltarica.g:327:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalAltarica.g:327:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalAltarica.g:328:1: ( rule__VariableDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            }
            // InternalAltarica.g:329:1: ( rule__VariableDeclaration__Group__0 )
            // InternalAltarica.g:329:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:341:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalAltarica.g:342:1: ( ruleAttribute EOF )
            // InternalAltarica.g:343:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:350:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:354:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalAltarica.g:355:1: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalAltarica.g:355:1: ( ( rule__Attribute__Group__0 ) )
            // InternalAltarica.g:356:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // InternalAltarica.g:357:1: ( rule__Attribute__Group__0 )
            // InternalAltarica.g:357:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:369:1: entryRuleEventDeclaration : ruleEventDeclaration EOF ;
    public final void entryRuleEventDeclaration() throws RecognitionException {
        try {
            // InternalAltarica.g:370:1: ( ruleEventDeclaration EOF )
            // InternalAltarica.g:371:1: ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:378:1: ruleEventDeclaration : ( ( rule__EventDeclaration__Group__0 ) ) ;
    public final void ruleEventDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:382:2: ( ( ( rule__EventDeclaration__Group__0 ) ) )
            // InternalAltarica.g:383:1: ( ( rule__EventDeclaration__Group__0 ) )
            {
            // InternalAltarica.g:383:1: ( ( rule__EventDeclaration__Group__0 ) )
            // InternalAltarica.g:384:1: ( rule__EventDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup()); 
            }
            // InternalAltarica.g:385:1: ( rule__EventDeclaration__Group__0 )
            // InternalAltarica.g:385:2: rule__EventDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:397:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // InternalAltarica.g:398:1: ( ruleParameterDeclaration EOF )
            // InternalAltarica.g:399:1: ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:406:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:410:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // InternalAltarica.g:411:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // InternalAltarica.g:411:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // InternalAltarica.g:412:1: ( rule__ParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }
            // InternalAltarica.g:413:1: ( rule__ParameterDeclaration__Group__0 )
            // InternalAltarica.g:413:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:425:1: entryRuleObserverDeclaration : ruleObserverDeclaration EOF ;
    public final void entryRuleObserverDeclaration() throws RecognitionException {
        try {
            // InternalAltarica.g:426:1: ( ruleObserverDeclaration EOF )
            // InternalAltarica.g:427:1: ruleObserverDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObserverDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:434:1: ruleObserverDeclaration : ( ( rule__ObserverDeclaration__Group__0 ) ) ;
    public final void ruleObserverDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:438:2: ( ( ( rule__ObserverDeclaration__Group__0 ) ) )
            // InternalAltarica.g:439:1: ( ( rule__ObserverDeclaration__Group__0 ) )
            {
            // InternalAltarica.g:439:1: ( ( rule__ObserverDeclaration__Group__0 ) )
            // InternalAltarica.g:440:1: ( rule__ObserverDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getGroup()); 
            }
            // InternalAltarica.g:441:1: ( rule__ObserverDeclaration__Group__0 )
            // InternalAltarica.g:441:2: rule__ObserverDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:453:1: entryRuleLabeledTransition : ruleLabeledTransition EOF ;
    public final void entryRuleLabeledTransition() throws RecognitionException {
        try {
            // InternalAltarica.g:454:1: ( ruleLabeledTransition EOF )
            // InternalAltarica.g:455:1: ruleLabeledTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLabeledTransitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:462:1: ruleLabeledTransition : ( ( rule__LabeledTransition__Group__0 ) ) ;
    public final void ruleLabeledTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:466:2: ( ( ( rule__LabeledTransition__Group__0 ) ) )
            // InternalAltarica.g:467:1: ( ( rule__LabeledTransition__Group__0 ) )
            {
            // InternalAltarica.g:467:1: ( ( rule__LabeledTransition__Group__0 ) )
            // InternalAltarica.g:468:1: ( rule__LabeledTransition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getGroup()); 
            }
            // InternalAltarica.g:469:1: ( rule__LabeledTransition__Group__0 )
            // InternalAltarica.g:469:2: rule__LabeledTransition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:481:1: entryRuleTransitionAnd : ruleTransitionAnd EOF ;
    public final void entryRuleTransitionAnd() throws RecognitionException {
        try {
            // InternalAltarica.g:482:1: ( ruleTransitionAnd EOF )
            // InternalAltarica.g:483:1: ruleTransitionAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:490:1: ruleTransitionAnd : ( ( rule__TransitionAnd__Group__0 ) ) ;
    public final void ruleTransitionAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:494:2: ( ( ( rule__TransitionAnd__Group__0 ) ) )
            // InternalAltarica.g:495:1: ( ( rule__TransitionAnd__Group__0 ) )
            {
            // InternalAltarica.g:495:1: ( ( rule__TransitionAnd__Group__0 ) )
            // InternalAltarica.g:496:1: ( rule__TransitionAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup()); 
            }
            // InternalAltarica.g:497:1: ( rule__TransitionAnd__Group__0 )
            // InternalAltarica.g:497:2: rule__TransitionAnd__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:509:1: entryRuleTransitionOr : ruleTransitionOr EOF ;
    public final void entryRuleTransitionOr() throws RecognitionException {
        try {
            // InternalAltarica.g:510:1: ( ruleTransitionOr EOF )
            // InternalAltarica.g:511:1: ruleTransitionOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTransitionOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:518:1: ruleTransitionOr : ( ( rule__TransitionOr__Group__0 ) ) ;
    public final void ruleTransitionOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:522:2: ( ( ( rule__TransitionOr__Group__0 ) ) )
            // InternalAltarica.g:523:1: ( ( rule__TransitionOr__Group__0 ) )
            {
            // InternalAltarica.g:523:1: ( ( rule__TransitionOr__Group__0 ) )
            // InternalAltarica.g:524:1: ( rule__TransitionOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup()); 
            }
            // InternalAltarica.g:525:1: ( rule__TransitionOr__Group__0 )
            // InternalAltarica.g:525:2: rule__TransitionOr__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:537:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalAltarica.g:538:1: ( ruleTransition EOF )
            // InternalAltarica.g:539:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:546:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:550:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalAltarica.g:551:1: ( ( rule__Transition__Group__0 ) )
            {
            // InternalAltarica.g:551:1: ( ( rule__Transition__Group__0 ) )
            // InternalAltarica.g:552:1: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // InternalAltarica.g:553:1: ( rule__Transition__Group__0 )
            // InternalAltarica.g:553:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:565:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalAltarica.g:566:1: ( ruleInstruction EOF )
            // InternalAltarica.g:567:1: ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstructionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:574:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:578:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalAltarica.g:579:1: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalAltarica.g:579:1: ( ( rule__Instruction__Alternatives ) )
            // InternalAltarica.g:580:1: ( rule__Instruction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstructionAccess().getAlternatives()); 
            }
            // InternalAltarica.g:581:1: ( rule__Instruction__Alternatives )
            // InternalAltarica.g:581:2: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:593:1: entryRuleSkip : ruleSkip EOF ;
    public final void entryRuleSkip() throws RecognitionException {
        try {
            // InternalAltarica.g:594:1: ( ruleSkip EOF )
            // InternalAltarica.g:595:1: ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSkip();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSkipRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:602:1: ruleSkip : ( ( rule__Skip__Group__0 ) ) ;
    public final void ruleSkip() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:606:2: ( ( ( rule__Skip__Group__0 ) ) )
            // InternalAltarica.g:607:1: ( ( rule__Skip__Group__0 ) )
            {
            // InternalAltarica.g:607:1: ( ( rule__Skip__Group__0 ) )
            // InternalAltarica.g:608:1: ( rule__Skip__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getGroup()); 
            }
            // InternalAltarica.g:609:1: ( rule__Skip__Group__0 )
            // InternalAltarica.g:609:2: rule__Skip__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:621:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalAltarica.g:622:1: ( ruleAssignment EOF )
            // InternalAltarica.g:623:1: ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:630:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:634:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalAltarica.g:635:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalAltarica.g:635:1: ( ( rule__Assignment__Group__0 ) )
            // InternalAltarica.g:636:1: ( rule__Assignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // InternalAltarica.g:637:1: ( rule__Assignment__Group__0 )
            // InternalAltarica.g:637:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:649:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalAltarica.g:650:1: ( ruleBlock EOF )
            // InternalAltarica.g:651:1: ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:658:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:662:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalAltarica.g:663:1: ( ( rule__Block__Group__0 ) )
            {
            // InternalAltarica.g:663:1: ( ( rule__Block__Group__0 ) )
            // InternalAltarica.g:664:1: ( rule__Block__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // InternalAltarica.g:665:1: ( rule__Block__Group__0 )
            // InternalAltarica.g:665:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:677:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalAltarica.g:678:1: ( ruleConditional EOF )
            // InternalAltarica.g:679:1: ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:686:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:690:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalAltarica.g:691:1: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalAltarica.g:691:1: ( ( rule__Conditional__Group__0 ) )
            // InternalAltarica.g:692:1: ( rule__Conditional__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup()); 
            }
            // InternalAltarica.g:693:1: ( rule__Conditional__Group__0 )
            // InternalAltarica.g:693:2: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:705:1: entryRuleSwitch : ruleSwitch EOF ;
    public final void entryRuleSwitch() throws RecognitionException {
        try {
            // InternalAltarica.g:706:1: ( ruleSwitch EOF )
            // InternalAltarica.g:707:1: ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitch();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:714:1: ruleSwitch : ( ( rule__Switch__Group__0 ) ) ;
    public final void ruleSwitch() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:718:2: ( ( ( rule__Switch__Group__0 ) ) )
            // InternalAltarica.g:719:1: ( ( rule__Switch__Group__0 ) )
            {
            // InternalAltarica.g:719:1: ( ( rule__Switch__Group__0 ) )
            // InternalAltarica.g:720:1: ( rule__Switch__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getGroup()); 
            }
            // InternalAltarica.g:721:1: ( rule__Switch__Group__0 )
            // InternalAltarica.g:721:2: rule__Switch__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:733:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAltarica.g:734:1: ( ruleExpression EOF )
            // InternalAltarica.g:735:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:742:1: ruleExpression : ( ruleLogicalOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:746:2: ( ( ruleLogicalOr ) )
            // InternalAltarica.g:747:1: ( ruleLogicalOr )
            {
            // InternalAltarica.g:747:1: ( ruleLogicalOr )
            // InternalAltarica.g:748:1: ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:761:1: entryRuleLogicalOr : ruleLogicalOr EOF ;
    public final void entryRuleLogicalOr() throws RecognitionException {
        try {
            // InternalAltarica.g:762:1: ( ruleLogicalOr EOF )
            // InternalAltarica.g:763:1: ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicalOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:770:1: ruleLogicalOr : ( ( rule__LogicalOr__Group__0 ) ) ;
    public final void ruleLogicalOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:774:2: ( ( ( rule__LogicalOr__Group__0 ) ) )
            // InternalAltarica.g:775:1: ( ( rule__LogicalOr__Group__0 ) )
            {
            // InternalAltarica.g:775:1: ( ( rule__LogicalOr__Group__0 ) )
            // InternalAltarica.g:776:1: ( rule__LogicalOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup()); 
            }
            // InternalAltarica.g:777:1: ( rule__LogicalOr__Group__0 )
            // InternalAltarica.g:777:2: rule__LogicalOr__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:789:1: entryRuleLogicalAnd : ruleLogicalAnd EOF ;
    public final void entryRuleLogicalAnd() throws RecognitionException {
        try {
            // InternalAltarica.g:790:1: ( ruleLogicalAnd EOF )
            // InternalAltarica.g:791:1: ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:798:1: ruleLogicalAnd : ( ( rule__LogicalAnd__Group__0 ) ) ;
    public final void ruleLogicalAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:802:2: ( ( ( rule__LogicalAnd__Group__0 ) ) )
            // InternalAltarica.g:803:1: ( ( rule__LogicalAnd__Group__0 ) )
            {
            // InternalAltarica.g:803:1: ( ( rule__LogicalAnd__Group__0 ) )
            // InternalAltarica.g:804:1: ( rule__LogicalAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup()); 
            }
            // InternalAltarica.g:805:1: ( rule__LogicalAnd__Group__0 )
            // InternalAltarica.g:805:2: rule__LogicalAnd__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:817:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalAltarica.g:818:1: ( ruleRelation EOF )
            // InternalAltarica.g:819:1: ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:826:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:830:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalAltarica.g:831:1: ( ( rule__Relation__Group__0 ) )
            {
            // InternalAltarica.g:831:1: ( ( rule__Relation__Group__0 ) )
            // InternalAltarica.g:832:1: ( rule__Relation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup()); 
            }
            // InternalAltarica.g:833:1: ( rule__Relation__Group__0 )
            // InternalAltarica.g:833:2: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:845:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalAltarica.g:846:1: ( ruleAddition EOF )
            // InternalAltarica.g:847:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:854:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:858:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalAltarica.g:859:1: ( ( rule__Addition__Group__0 ) )
            {
            // InternalAltarica.g:859:1: ( ( rule__Addition__Group__0 ) )
            // InternalAltarica.g:860:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalAltarica.g:861:1: ( rule__Addition__Group__0 )
            // InternalAltarica.g:861:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:873:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalAltarica.g:874:1: ( ruleMultiplication EOF )
            // InternalAltarica.g:875:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:882:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:886:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalAltarica.g:887:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalAltarica.g:887:1: ( ( rule__Multiplication__Group__0 ) )
            // InternalAltarica.g:888:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalAltarica.g:889:1: ( rule__Multiplication__Group__0 )
            // InternalAltarica.g:889:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:901:1: entryRuleNeg : ruleNeg EOF ;
    public final void entryRuleNeg() throws RecognitionException {
        try {
            // InternalAltarica.g:902:1: ( ruleNeg EOF )
            // InternalAltarica.g:903:1: ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:910:1: ruleNeg : ( ( rule__Neg__Alternatives ) ) ;
    public final void ruleNeg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:914:2: ( ( ( rule__Neg__Alternatives ) ) )
            // InternalAltarica.g:915:1: ( ( rule__Neg__Alternatives ) )
            {
            // InternalAltarica.g:915:1: ( ( rule__Neg__Alternatives ) )
            // InternalAltarica.g:916:1: ( rule__Neg__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getAlternatives()); 
            }
            // InternalAltarica.g:917:1: ( rule__Neg__Alternatives )
            // InternalAltarica.g:917:2: rule__Neg__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:929:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalAltarica.g:930:1: ( ruleAtom EOF )
            // InternalAltarica.g:931:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:938:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:942:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalAltarica.g:943:1: ( ( rule__Atom__Alternatives ) )
            {
            // InternalAltarica.g:943:1: ( ( rule__Atom__Alternatives ) )
            // InternalAltarica.g:944:1: ( rule__Atom__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // InternalAltarica.g:945:1: ( rule__Atom__Alternatives )
            // InternalAltarica.g:945:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:957:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalAltarica.g:958:1: ( ruleBooleanLiteral EOF )
            // InternalAltarica.g:959:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:966:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:970:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalAltarica.g:971:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalAltarica.g:971:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalAltarica.g:972:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // InternalAltarica.g:973:1: ( rule__BooleanLiteral__ValueAssignment )
            // InternalAltarica.g:973:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:985:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAltarica.g:986:1: ( ruleStringLiteral EOF )
            // InternalAltarica.g:987:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:994:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:998:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalAltarica.g:999:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalAltarica.g:999:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalAltarica.g:1000:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalAltarica.g:1001:1: ( rule__StringLiteral__ValueAssignment )
            // InternalAltarica.g:1001:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAltarica.g:1013:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalAltarica.g:1014:1: ( ruleNumberLiteral EOF )
            // InternalAltarica.g:1015:1: ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalAltarica.g:1022:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1026:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalAltarica.g:1027:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalAltarica.g:1027:1: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalAltarica.g:1028:1: ( rule__NumberLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }
            // InternalAltarica.g:1029:1: ( rule__NumberLiteral__ValueAssignment )
            // InternalAltarica.g:1029:2: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNameRef"
    // InternalAltarica.g:1041:1: entryRuleNameRef : ruleNameRef EOF ;
    public final void entryRuleNameRef() throws RecognitionException {
        try {
            // InternalAltarica.g:1042:1: ( ruleNameRef EOF )
            // InternalAltarica.g:1043:1: ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNameRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNameRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:1050:1: ruleNameRef : ( ( rule__NameRef__Group__0 ) ) ;
    public final void ruleNameRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1054:2: ( ( ( rule__NameRef__Group__0 ) ) )
            // InternalAltarica.g:1055:1: ( ( rule__NameRef__Group__0 ) )
            {
            // InternalAltarica.g:1055:1: ( ( rule__NameRef__Group__0 ) )
            // InternalAltarica.g:1056:1: ( rule__NameRef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup()); 
            }
            // InternalAltarica.g:1057:1: ( rule__NameRef__Group__0 )
            // InternalAltarica.g:1057:2: rule__NameRef__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1069:1: entryRuleSwitchExpression : ruleSwitchExpression EOF ;
    public final void entryRuleSwitchExpression() throws RecognitionException {
        try {
            // InternalAltarica.g:1070:1: ( ruleSwitchExpression EOF )
            // InternalAltarica.g:1071:1: ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:1078:1: ruleSwitchExpression : ( ( rule__SwitchExpression__Group__0 ) ) ;
    public final void ruleSwitchExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1082:2: ( ( ( rule__SwitchExpression__Group__0 ) ) )
            // InternalAltarica.g:1083:1: ( ( rule__SwitchExpression__Group__0 ) )
            {
            // InternalAltarica.g:1083:1: ( ( rule__SwitchExpression__Group__0 ) )
            // InternalAltarica.g:1084:1: ( rule__SwitchExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getGroup()); 
            }
            // InternalAltarica.g:1085:1: ( rule__SwitchExpression__Group__0 )
            // InternalAltarica.g:1085:2: rule__SwitchExpression__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1097:1: entryRuleCaseExpression : ruleCaseExpression EOF ;
    public final void entryRuleCaseExpression() throws RecognitionException {
        try {
            // InternalAltarica.g:1098:1: ( ruleCaseExpression EOF )
            // InternalAltarica.g:1099:1: ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCaseExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:1106:1: ruleCaseExpression : ( ( rule__CaseExpression__Group__0 ) ) ;
    public final void ruleCaseExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1110:2: ( ( ( rule__CaseExpression__Group__0 ) ) )
            // InternalAltarica.g:1111:1: ( ( rule__CaseExpression__Group__0 ) )
            {
            // InternalAltarica.g:1111:1: ( ( rule__CaseExpression__Group__0 ) )
            // InternalAltarica.g:1112:1: ( rule__CaseExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getGroup()); 
            }
            // InternalAltarica.g:1113:1: ( rule__CaseExpression__Group__0 )
            // InternalAltarica.g:1113:2: rule__CaseExpression__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalAltarica.g:1125:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // InternalAltarica.g:1126:1: ( ruleFunctionCall EOF )
            // InternalAltarica.g:1127:1: ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFunctionCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalAltarica.g:1134:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1138:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // InternalAltarica.g:1139:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // InternalAltarica.g:1139:1: ( ( rule__FunctionCall__Group__0 ) )
            // InternalAltarica.g:1140:1: ( rule__FunctionCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // InternalAltarica.g:1141:1: ( rule__FunctionCall__Group__0 )
            // InternalAltarica.g:1141:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleError"
    // InternalAltarica.g:1153:1: entryRuleError : ruleError EOF ;
    public final void entryRuleError() throws RecognitionException {
        try {
            // InternalAltarica.g:1154:1: ( ruleError EOF )
            // InternalAltarica.g:1155:1: ruleError EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleError();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleError"


    // $ANTLR start "ruleError"
    // InternalAltarica.g:1162:1: ruleError : ( ( rule__Error__Group__0 ) ) ;
    public final void ruleError() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1166:2: ( ( ( rule__Error__Group__0 ) ) )
            // InternalAltarica.g:1167:1: ( ( rule__Error__Group__0 ) )
            {
            // InternalAltarica.g:1167:1: ( ( rule__Error__Group__0 ) )
            // InternalAltarica.g:1168:1: ( rule__Error__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getGroup()); 
            }
            // InternalAltarica.g:1169:1: ( rule__Error__Group__0 )
            // InternalAltarica.g:1169:2: rule__Error__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Error__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleError"


    // $ANTLR start "ruleBaseTypeEnum"
    // InternalAltarica.g:1182:1: ruleBaseTypeEnum : ( ( rule__BaseTypeEnum__Alternatives ) ) ;
    public final void ruleBaseTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1186:1: ( ( ( rule__BaseTypeEnum__Alternatives ) ) )
            // InternalAltarica.g:1187:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            {
            // InternalAltarica.g:1187:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            // InternalAltarica.g:1188:1: ( rule__BaseTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }
            // InternalAltarica.g:1189:1: ( rule__BaseTypeEnum__Alternatives )
            // InternalAltarica.g:1189:2: rule__BaseTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "ruleSeverity"
    // InternalAltarica.g:1201:1: ruleSeverity : ( ( rule__Severity__Alternatives ) ) ;
    public final void ruleSeverity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1205:1: ( ( ( rule__Severity__Alternatives ) ) )
            // InternalAltarica.g:1206:1: ( ( rule__Severity__Alternatives ) )
            {
            // InternalAltarica.g:1206:1: ( ( rule__Severity__Alternatives ) )
            // InternalAltarica.g:1207:1: ( rule__Severity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeverityAccess().getAlternatives()); 
            }
            // InternalAltarica.g:1208:1: ( rule__Severity__Alternatives )
            // InternalAltarica.g:1208:2: rule__Severity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Severity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeverityAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeverity"


    // $ANTLR start "rule__AbstractDeclaration__Alternatives"
    // InternalAltarica.g:1219:1: rule__AbstractDeclaration__Alternatives : ( ( ruleDomain ) | ( ruleClass ) );
    public final void rule__AbstractDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1223:1: ( ( ruleDomain ) | ( ruleClass ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==39) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAltarica.g:1224:1: ( ruleDomain )
                    {
                    // InternalAltarica.g:1224:1: ( ruleDomain )
                    // InternalAltarica.g:1225:1: ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1230:6: ( ruleClass )
                    {
                    // InternalAltarica.g:1230:6: ( ruleClass )
                    // InternalAltarica.g:1231:1: ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1241:1: rule__Type__Alternatives : ( ( ( ruleBaseType ) ) | ( ruleNamedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1245:1: ( ( ( ruleBaseType ) ) | ( ruleNamedType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=31 && LA2_0<=32)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
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
                    // InternalAltarica.g:1246:1: ( ( ruleBaseType ) )
                    {
                    // InternalAltarica.g:1246:1: ( ( ruleBaseType ) )
                    // InternalAltarica.g:1247:1: ( ruleBaseType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    // InternalAltarica.g:1248:1: ( ruleBaseType )
                    // InternalAltarica.g:1248:3: ruleBaseType
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1252:6: ( ruleNamedType )
                    {
                    // InternalAltarica.g:1252:6: ( ruleNamedType )
                    // InternalAltarica.g:1253:1: ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1263:1: rule__Declaration__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1267:1: ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 31:
            case 32:
                {
                alt3=1;
                }
                break;
            case 49:
                {
                alt3=2;
                }
                break;
            case 50:
                {
                alt3=3;
                }
                break;
            case 51:
                {
                alt3=4;
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
                    // InternalAltarica.g:1268:1: ( ruleVariableDeclaration )
                    {
                    // InternalAltarica.g:1268:1: ( ruleVariableDeclaration )
                    // InternalAltarica.g:1269:1: ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1274:6: ( ruleEventDeclaration )
                    {
                    // InternalAltarica.g:1274:6: ( ruleEventDeclaration )
                    // InternalAltarica.g:1275:1: ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1280:6: ( ruleParameterDeclaration )
                    {
                    // InternalAltarica.g:1280:6: ( ruleParameterDeclaration )
                    // InternalAltarica.g:1281:1: ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1286:6: ( ruleObserverDeclaration )
                    {
                    // InternalAltarica.g:1286:6: ( ruleObserverDeclaration )
                    // InternalAltarica.g:1287:1: ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1297:1: rule__Instruction__Alternatives : ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1301:1: ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 58:
                {
                alt4=4;
                }
                break;
            case 61:
                {
                alt4=5;
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
                    // InternalAltarica.g:1302:1: ( ruleSkip )
                    {
                    // InternalAltarica.g:1302:1: ( ruleSkip )
                    // InternalAltarica.g:1303:1: ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1308:6: ( ruleAssignment )
                    {
                    // InternalAltarica.g:1308:6: ( ruleAssignment )
                    // InternalAltarica.g:1309:1: ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1314:6: ( ruleBlock )
                    {
                    // InternalAltarica.g:1314:6: ( ruleBlock )
                    // InternalAltarica.g:1315:1: ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1320:6: ( ruleConditional )
                    {
                    // InternalAltarica.g:1320:6: ( ruleConditional )
                    // InternalAltarica.g:1321:1: ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1326:6: ( ruleSwitch )
                    {
                    // InternalAltarica.g:1326:6: ( ruleSwitch )
                    // InternalAltarica.g:1327:1: ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Relation__OpAlternatives_1_1_0"
    // InternalAltarica.g:1337:1: rule__Relation__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Relation__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1341:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
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
                    // InternalAltarica.g:1342:1: ( '==' )
                    {
                    // InternalAltarica.g:1342:1: ( '==' )
                    // InternalAltarica.g:1343:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1350:6: ( '!=' )
                    {
                    // InternalAltarica.g:1350:6: ( '!=' )
                    // InternalAltarica.g:1351:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAltarica.g:1358:6: ( '<' )
                    {
                    // InternalAltarica.g:1358:6: ( '<' )
                    // InternalAltarica.g:1359:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_1_0_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAltarica.g:1366:6: ( '<=' )
                    {
                    // InternalAltarica.g:1366:6: ( '<=' )
                    // InternalAltarica.g:1367:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAltarica.g:1374:6: ( '>=' )
                    {
                    // InternalAltarica.g:1374:6: ( '>=' )
                    // InternalAltarica.g:1375:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAltarica.g:1382:6: ( '>' )
                    {
                    // InternalAltarica.g:1382:6: ( '>' )
                    // InternalAltarica.g:1383:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_1_0_5()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_1_0_5()); 
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
    // $ANTLR end "rule__Relation__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Addition__OpAlternatives_1_1_0"
    // InternalAltarica.g:1395:1: rule__Addition__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1399:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
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
                    // InternalAltarica.g:1400:1: ( '+' )
                    {
                    // InternalAltarica.g:1400:1: ( '+' )
                    // InternalAltarica.g:1401:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1408:6: ( '-' )
                    {
                    // InternalAltarica.g:1408:6: ( '-' )
                    // InternalAltarica.g:1409:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
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
    // $ANTLR end "rule__Addition__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Multiplication__OpAlternatives_1_1_0"
    // InternalAltarica.g:1421:1: rule__Multiplication__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1425:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
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
                    // InternalAltarica.g:1426:1: ( '*' )
                    {
                    // InternalAltarica.g:1426:1: ( '*' )
                    // InternalAltarica.g:1427:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1434:6: ( '/' )
                    {
                    // InternalAltarica.g:1434:6: ( '/' )
                    // InternalAltarica.g:1435:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_1_0_1()); 
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
    // $ANTLR end "rule__Multiplication__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Neg__Alternatives"
    // InternalAltarica.g:1447:1: rule__Neg__Alternatives : ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) );
    public final void rule__Neg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1451:1: ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_NUMBER:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 46:
            case 61:
                {
                alt8=3;
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
                    // InternalAltarica.g:1452:1: ( ( rule__Neg__Group_0__0 ) )
                    {
                    // InternalAltarica.g:1452:1: ( ( rule__Neg__Group_0__0 ) )
                    // InternalAltarica.g:1453:1: ( rule__Neg__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_0()); 
                    }
                    // InternalAltarica.g:1454:1: ( rule__Neg__Group_0__0 )
                    // InternalAltarica.g:1454:2: rule__Neg__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1458:6: ( ( rule__Neg__Group_1__0 ) )
                    {
                    // InternalAltarica.g:1458:6: ( ( rule__Neg__Group_1__0 ) )
                    // InternalAltarica.g:1459:1: ( rule__Neg__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_1()); 
                    }
                    // InternalAltarica.g:1460:1: ( rule__Neg__Group_1__0 )
                    // InternalAltarica.g:1460:2: rule__Neg__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1464:6: ( ruleAtom )
                    {
                    // InternalAltarica.g:1464:6: ( ruleAtom )
                    // InternalAltarica.g:1465:1: ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1475:1: rule__Atom__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) | ( ruleFunctionCall ) | ( ruleNameRef ) | ( ruleSwitchExpression ) | ( ( rule__Atom__Group_6__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1479:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) | ( ruleFunctionCall ) | ( ruleNameRef ) | ( ruleSwitchExpression ) | ( ( rule__Atom__Group_6__0 ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt9=3;
                }
                break;
            case 28:
            case 29:
            case 30:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            case 61:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
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
                    // InternalAltarica.g:1480:1: ( ruleBooleanLiteral )
                    {
                    // InternalAltarica.g:1480:1: ( ruleBooleanLiteral )
                    // InternalAltarica.g:1481:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1486:6: ( ruleStringLiteral )
                    {
                    // InternalAltarica.g:1486:6: ( ruleStringLiteral )
                    // InternalAltarica.g:1487:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1492:6: ( ruleNumberLiteral )
                    {
                    // InternalAltarica.g:1492:6: ( ruleNumberLiteral )
                    // InternalAltarica.g:1493:1: ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getNumberLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getNumberLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAltarica.g:1498:6: ( ruleFunctionCall )
                    {
                    // InternalAltarica.g:1498:6: ( ruleFunctionCall )
                    // InternalAltarica.g:1499:1: ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getFunctionCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getFunctionCallParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAltarica.g:1504:6: ( ruleNameRef )
                    {
                    // InternalAltarica.g:1504:6: ( ruleNameRef )
                    // InternalAltarica.g:1505:1: ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getNameRefParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNameRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getNameRefParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAltarica.g:1510:6: ( ruleSwitchExpression )
                    {
                    // InternalAltarica.g:1510:6: ( ruleSwitchExpression )
                    // InternalAltarica.g:1511:1: ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getSwitchExpressionParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getSwitchExpressionParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAltarica.g:1516:6: ( ( rule__Atom__Group_6__0 ) )
                    {
                    // InternalAltarica.g:1516:6: ( ( rule__Atom__Group_6__0 ) )
                    // InternalAltarica.g:1517:1: ( rule__Atom__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_6()); 
                    }
                    // InternalAltarica.g:1518:1: ( rule__Atom__Group_6__0 )
                    // InternalAltarica.g:1518:2: rule__Atom__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_6()); 
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
    // InternalAltarica.g:1527:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1531:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
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
                    // InternalAltarica.g:1532:1: ( 'true' )
                    {
                    // InternalAltarica.g:1532:1: ( 'true' )
                    // InternalAltarica.g:1533:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1540:6: ( 'false' )
                    {
                    // InternalAltarica.g:1540:6: ( 'false' )
                    // InternalAltarica.g:1541:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__FunctionCall__NameAlternatives_1_0"
    // InternalAltarica.g:1553:1: rule__FunctionCall__NameAlternatives_1_0 : ( ( 'exponential' ) | ( 'Dirac' ) | ( 'constant' ) );
    public final void rule__FunctionCall__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1557:1: ( ( 'exponential' ) | ( 'Dirac' ) | ( 'constant' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
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
                    // InternalAltarica.g:1558:1: ( 'exponential' )
                    {
                    // InternalAltarica.g:1558:1: ( 'exponential' )
                    // InternalAltarica.g:1559:1: 'exponential'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getNameExponentialKeyword_1_0_0()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getNameExponentialKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1566:6: ( 'Dirac' )
                    {
                    // InternalAltarica.g:1566:6: ( 'Dirac' )
                    // InternalAltarica.g:1567:1: 'Dirac'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getNameDiracKeyword_1_0_1()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getNameDiracKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAltarica.g:1574:6: ( 'constant' )
                    {
                    // InternalAltarica.g:1574:6: ( 'constant' )
                    // InternalAltarica.g:1575:1: 'constant'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionCallAccess().getNameConstantKeyword_1_0_2()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionCallAccess().getNameConstantKeyword_1_0_2()); 
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
    // $ANTLR end "rule__FunctionCall__NameAlternatives_1_0"


    // $ANTLR start "rule__BaseTypeEnum__Alternatives"
    // InternalAltarica.g:1587:1: rule__BaseTypeEnum__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__BaseTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1591:1: ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
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
                    // InternalAltarica.g:1592:1: ( ( 'Integer' ) )
                    {
                    // InternalAltarica.g:1592:1: ( ( 'Integer' ) )
                    // InternalAltarica.g:1593:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }
                    // InternalAltarica.g:1594:1: ( 'Integer' )
                    // InternalAltarica.g:1594:3: 'Integer'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1599:6: ( ( 'Boolean' ) )
                    {
                    // InternalAltarica.g:1599:6: ( ( 'Boolean' ) )
                    // InternalAltarica.g:1600:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }
                    // InternalAltarica.g:1601:1: ( 'Boolean' )
                    // InternalAltarica.g:1601:3: 'Boolean'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__Severity__Alternatives"
    // InternalAltarica.g:1611:1: rule__Severity__Alternatives : ( ( ( 'error' ) ) | ( ( 'warning' ) ) );
    public final void rule__Severity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1615:1: ( ( ( 'error' ) ) | ( ( 'warning' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
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
                    // InternalAltarica.g:1616:1: ( ( 'error' ) )
                    {
                    // InternalAltarica.g:1616:1: ( ( 'error' ) )
                    // InternalAltarica.g:1617:1: ( 'error' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSeverityAccess().getERROREnumLiteralDeclaration_0()); 
                    }
                    // InternalAltarica.g:1618:1: ( 'error' )
                    // InternalAltarica.g:1618:3: 'error'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSeverityAccess().getERROREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1623:6: ( ( 'warning' ) )
                    {
                    // InternalAltarica.g:1623:6: ( ( 'warning' ) )
                    // InternalAltarica.g:1624:1: ( 'warning' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSeverityAccess().getWARNINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalAltarica.g:1625:1: ( 'warning' )
                    // InternalAltarica.g:1625:3: 'warning'
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSeverityAccess().getWARNINGEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__Severity__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAltarica.g:1637:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1641:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAltarica.g:1642:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAltarica.g:1649:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1653:1: ( ( () ) )
            // InternalAltarica.g:1654:1: ( () )
            {
            // InternalAltarica.g:1654:1: ( () )
            // InternalAltarica.g:1655:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_0()); 
            }
            // InternalAltarica.g:1656:1: ()
            // InternalAltarica.g:1658:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAltarica.g:1668:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1672:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAltarica.g:1673:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAltarica.g:1680:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1684:1: ( ( ( rule__Model__Group_1__0 )? ) )
            // InternalAltarica.g:1685:1: ( ( rule__Model__Group_1__0 )? )
            {
            // InternalAltarica.g:1685:1: ( ( rule__Model__Group_1__0 )? )
            // InternalAltarica.g:1686:1: ( rule__Model__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // InternalAltarica.g:1687:1: ( rule__Model__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAltarica.g:1687:2: rule__Model__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAltarica.g:1697:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1701:1: ( rule__Model__Group__2__Impl )
            // InternalAltarica.g:1702:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAltarica.g:1708:1: rule__Model__Group__2__Impl : ( ( rule__Model__DeclarationsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1712:1: ( ( ( rule__Model__DeclarationsAssignment_2 )* ) )
            // InternalAltarica.g:1713:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            {
            // InternalAltarica.g:1713:1: ( ( rule__Model__DeclarationsAssignment_2 )* )
            // InternalAltarica.g:1714:1: ( rule__Model__DeclarationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            }
            // InternalAltarica.g:1715:1: ( rule__Model__DeclarationsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39||LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAltarica.g:1715:2: rule__Model__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DeclarationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDeclarationsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // InternalAltarica.g:1731:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1735:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // InternalAltarica.g:1736:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // InternalAltarica.g:1743:1: rule__Model__Group_1__0__Impl : ( 'transformation' ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1747:1: ( ( 'transformation' ) )
            // InternalAltarica.g:1748:1: ( 'transformation' )
            {
            // InternalAltarica.g:1748:1: ( 'transformation' )
            // InternalAltarica.g:1749:1: 'transformation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTransformationKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTransformationKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // InternalAltarica.g:1762:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl rule__Model__Group_1__2 ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1766:1: ( rule__Model__Group_1__1__Impl rule__Model__Group_1__2 )
            // InternalAltarica.g:1767:2: rule__Model__Group_1__1__Impl rule__Model__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // InternalAltarica.g:1774:1: rule__Model__Group_1__1__Impl : ( 'issues' ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1778:1: ( ( 'issues' ) )
            // InternalAltarica.g:1779:1: ( 'issues' )
            {
            // InternalAltarica.g:1779:1: ( 'issues' )
            // InternalAltarica.g:1780:1: 'issues'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getIssuesKeyword_1_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getIssuesKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__Model__Group_1__2"
    // InternalAltarica.g:1793:1: rule__Model__Group_1__2 : rule__Model__Group_1__2__Impl rule__Model__Group_1__3 ;
    public final void rule__Model__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1797:1: ( rule__Model__Group_1__2__Impl rule__Model__Group_1__3 )
            // InternalAltarica.g:1798:2: rule__Model__Group_1__2__Impl rule__Model__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__2"


    // $ANTLR start "rule__Model__Group_1__2__Impl"
    // InternalAltarica.g:1805:1: rule__Model__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Model__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1809:1: ( ( '{' ) )
            // InternalAltarica.g:1810:1: ( '{' )
            {
            // InternalAltarica.g:1810:1: ( '{' )
            // InternalAltarica.g:1811:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__2__Impl"


    // $ANTLR start "rule__Model__Group_1__3"
    // InternalAltarica.g:1824:1: rule__Model__Group_1__3 : rule__Model__Group_1__3__Impl rule__Model__Group_1__4 ;
    public final void rule__Model__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1828:1: ( rule__Model__Group_1__3__Impl rule__Model__Group_1__4 )
            // InternalAltarica.g:1829:2: rule__Model__Group_1__3__Impl rule__Model__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__3"


    // $ANTLR start "rule__Model__Group_1__3__Impl"
    // InternalAltarica.g:1836:1: rule__Model__Group_1__3__Impl : ( ( rule__Model__ErrorsAssignment_1_3 )* ) ;
    public final void rule__Model__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1840:1: ( ( ( rule__Model__ErrorsAssignment_1_3 )* ) )
            // InternalAltarica.g:1841:1: ( ( rule__Model__ErrorsAssignment_1_3 )* )
            {
            // InternalAltarica.g:1841:1: ( ( rule__Model__ErrorsAssignment_1_3 )* )
            // InternalAltarica.g:1842:1: ( rule__Model__ErrorsAssignment_1_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getErrorsAssignment_1_3()); 
            }
            // InternalAltarica.g:1843:1: ( rule__Model__ErrorsAssignment_1_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=33 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAltarica.g:1843:2: rule__Model__ErrorsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__ErrorsAssignment_1_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getErrorsAssignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__3__Impl"


    // $ANTLR start "rule__Model__Group_1__4"
    // InternalAltarica.g:1853:1: rule__Model__Group_1__4 : rule__Model__Group_1__4__Impl ;
    public final void rule__Model__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1857:1: ( rule__Model__Group_1__4__Impl )
            // InternalAltarica.g:1858:2: rule__Model__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__4"


    // $ANTLR start "rule__Model__Group_1__4__Impl"
    // InternalAltarica.g:1864:1: rule__Model__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1868:1: ( ( '}' ) )
            // InternalAltarica.g:1869:1: ( '}' )
            {
            // InternalAltarica.g:1869:1: ( '}' )
            // InternalAltarica.g:1870:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_1__4__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalAltarica.g:1893:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1897:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalAltarica.g:1898:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Domain__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1905:1: rule__Domain__Group__0__Impl : ( () ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1909:1: ( ( () ) )
            // InternalAltarica.g:1910:1: ( () )
            {
            // InternalAltarica.g:1910:1: ( () )
            // InternalAltarica.g:1911:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainAction_0()); 
            }
            // InternalAltarica.g:1912:1: ()
            // InternalAltarica.g:1914:1: 
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
    // InternalAltarica.g:1924:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1928:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalAltarica.g:1929:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Domain__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1936:1: rule__Domain__Group__1__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1940:1: ( ( 'domain' ) )
            // InternalAltarica.g:1941:1: ( 'domain' )
            {
            // InternalAltarica.g:1941:1: ( 'domain' )
            // InternalAltarica.g:1942:1: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1955:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1959:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalAltarica.g:1960:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Domain__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1967:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1971:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // InternalAltarica.g:1972:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // InternalAltarica.g:1972:1: ( ( rule__Domain__NameAssignment_2 ) )
            // InternalAltarica.g:1973:1: ( rule__Domain__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:1974:1: ( rule__Domain__NameAssignment_2 )
            // InternalAltarica.g:1974:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1984:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1988:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalAltarica.g:1989:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:1996:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2000:1: ( ( '{' ) )
            // InternalAltarica.g:2001:1: ( '{' )
            {
            // InternalAltarica.g:2001:1: ( '{' )
            // InternalAltarica.g:2002:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2015:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2019:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalAltarica.g:2020:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2027:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__Group_4__0 )? ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2031:1: ( ( ( rule__Domain__Group_4__0 )? ) )
            // InternalAltarica.g:2032:1: ( ( rule__Domain__Group_4__0 )? )
            {
            // InternalAltarica.g:2032:1: ( ( rule__Domain__Group_4__0 )? )
            // InternalAltarica.g:2033:1: ( rule__Domain__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4()); 
            }
            // InternalAltarica.g:2034:1: ( rule__Domain__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAltarica.g:2034:2: rule__Domain__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2044:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2048:1: ( rule__Domain__Group__5__Impl )
            // InternalAltarica.g:2049:2: rule__Domain__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2055:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2059:1: ( ( '}' ) )
            // InternalAltarica.g:2060:1: ( '}' )
            {
            // InternalAltarica.g:2060:1: ( '}' )
            // InternalAltarica.g:2061:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2086:1: rule__Domain__Group_4__0 : rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 ;
    public final void rule__Domain__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2090:1: ( rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 )
            // InternalAltarica.g:2091:2: rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Domain__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2098:1: rule__Domain__Group_4__0__Impl : ( ( rule__Domain__ConstantsAssignment_4_0 ) ) ;
    public final void rule__Domain__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2102:1: ( ( ( rule__Domain__ConstantsAssignment_4_0 ) ) )
            // InternalAltarica.g:2103:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            {
            // InternalAltarica.g:2103:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            // InternalAltarica.g:2104:1: ( rule__Domain__ConstantsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_0()); 
            }
            // InternalAltarica.g:2105:1: ( rule__Domain__ConstantsAssignment_4_0 )
            // InternalAltarica.g:2105:2: rule__Domain__ConstantsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2115:1: rule__Domain__Group_4__1 : rule__Domain__Group_4__1__Impl ;
    public final void rule__Domain__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2119:1: ( rule__Domain__Group_4__1__Impl )
            // InternalAltarica.g:2120:2: rule__Domain__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2126:1: rule__Domain__Group_4__1__Impl : ( ( rule__Domain__Group_4_1__0 )* ) ;
    public final void rule__Domain__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2130:1: ( ( ( rule__Domain__Group_4_1__0 )* ) )
            // InternalAltarica.g:2131:1: ( ( rule__Domain__Group_4_1__0 )* )
            {
            // InternalAltarica.g:2131:1: ( ( rule__Domain__Group_4_1__0 )* )
            // InternalAltarica.g:2132:1: ( rule__Domain__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4_1()); 
            }
            // InternalAltarica.g:2133:1: ( rule__Domain__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAltarica.g:2133:2: rule__Domain__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Domain__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAltarica.g:2147:1: rule__Domain__Group_4_1__0 : rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 ;
    public final void rule__Domain__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2151:1: ( rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 )
            // InternalAltarica.g:2152:2: rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Domain__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2159:1: rule__Domain__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2163:1: ( ( ',' ) )
            // InternalAltarica.g:2164:1: ( ',' )
            {
            // InternalAltarica.g:2164:1: ( ',' )
            // InternalAltarica.g:2165:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2178:1: rule__Domain__Group_4_1__1 : rule__Domain__Group_4_1__1__Impl ;
    public final void rule__Domain__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2182:1: ( rule__Domain__Group_4_1__1__Impl )
            // InternalAltarica.g:2183:2: rule__Domain__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2189:1: rule__Domain__Group_4_1__1__Impl : ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) ;
    public final void rule__Domain__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2193:1: ( ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) )
            // InternalAltarica.g:2194:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            {
            // InternalAltarica.g:2194:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            // InternalAltarica.g:2195:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_1_1()); 
            }
            // InternalAltarica.g:2196:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            // InternalAltarica.g:2196:2: rule__Domain__ConstantsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2210:1: rule__SymbolicConstant__Group__0 : rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 ;
    public final void rule__SymbolicConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2214:1: ( rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 )
            // InternalAltarica.g:2215:2: rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__SymbolicConstant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2222:1: rule__SymbolicConstant__Group__0__Impl : ( () ) ;
    public final void rule__SymbolicConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2226:1: ( ( () ) )
            // InternalAltarica.g:2227:1: ( () )
            {
            // InternalAltarica.g:2227:1: ( () )
            // InternalAltarica.g:2228:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0()); 
            }
            // InternalAltarica.g:2229:1: ()
            // InternalAltarica.g:2231:1: 
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
    // InternalAltarica.g:2241:1: rule__SymbolicConstant__Group__1 : rule__SymbolicConstant__Group__1__Impl ;
    public final void rule__SymbolicConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2245:1: ( rule__SymbolicConstant__Group__1__Impl )
            // InternalAltarica.g:2246:2: rule__SymbolicConstant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2252:1: rule__SymbolicConstant__Group__1__Impl : ( ( rule__SymbolicConstant__NameAssignment_1 ) ) ;
    public final void rule__SymbolicConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2256:1: ( ( ( rule__SymbolicConstant__NameAssignment_1 ) ) )
            // InternalAltarica.g:2257:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            {
            // InternalAltarica.g:2257:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            // InternalAltarica.g:2258:1: ( rule__SymbolicConstant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1()); 
            }
            // InternalAltarica.g:2259:1: ( rule__SymbolicConstant__NameAssignment_1 )
            // InternalAltarica.g:2259:2: rule__SymbolicConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2273:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2277:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalAltarica.g:2278:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2285:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2289:1: ( ( () ) )
            // InternalAltarica.g:2290:1: ( () )
            {
            // InternalAltarica.g:2290:1: ( () )
            // InternalAltarica.g:2291:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNodeAction_0()); 
            }
            // InternalAltarica.g:2292:1: ()
            // InternalAltarica.g:2294:1: 
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
    // InternalAltarica.g:2304:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2308:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalAltarica.g:2309:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2316:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2320:1: ( ( 'class' ) )
            // InternalAltarica.g:2321:1: ( 'class' )
            {
            // InternalAltarica.g:2321:1: ( 'class' )
            // InternalAltarica.g:2322:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2335:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2339:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalAltarica.g:2340:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2347:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2351:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalAltarica.g:2352:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalAltarica.g:2352:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalAltarica.g:2353:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:2354:1: ( rule__Class__NameAssignment_2 )
            // InternalAltarica.g:2354:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2364:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2368:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalAltarica.g:2369:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2376:1: rule__Class__Group__3__Impl : ( ( rule__Class__DeclarationsAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2380:1: ( ( ( rule__Class__DeclarationsAssignment_3 )* ) )
            // InternalAltarica.g:2381:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            {
            // InternalAltarica.g:2381:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            // InternalAltarica.g:2382:1: ( rule__Class__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }
            // InternalAltarica.g:2383:1: ( rule__Class__DeclarationsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=31 && LA19_0<=32)||(LA19_0>=49 && LA19_0<=51)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAltarica.g:2383:2: rule__Class__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__DeclarationsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAltarica.g:2393:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2397:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalAltarica.g:2398:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2405:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2409:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalAltarica.g:2410:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalAltarica.g:2410:1: ( ( rule__Class__Group_4__0 )? )
            // InternalAltarica.g:2411:1: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // InternalAltarica.g:2412:1: ( rule__Class__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAltarica.g:2412:2: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2422:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2426:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalAltarica.g:2427:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2434:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2438:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalAltarica.g:2439:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalAltarica.g:2439:1: ( ( rule__Class__Group_5__0 )? )
            // InternalAltarica.g:2440:1: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // InternalAltarica.g:2441:1: ( rule__Class__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAltarica.g:2441:2: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2451:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2455:1: ( rule__Class__Group__6__Impl )
            // InternalAltarica.g:2456:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2462:1: rule__Class__Group__6__Impl : ( 'end' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2466:1: ( ( 'end' ) )
            // InternalAltarica.g:2467:1: ( 'end' )
            {
            // InternalAltarica.g:2467:1: ( 'end' )
            // InternalAltarica.g:2468:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2495:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2499:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalAltarica.g:2500:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2507:1: rule__Class__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2511:1: ( ( 'transition' ) )
            // InternalAltarica.g:2512:1: ( 'transition' )
            {
            // InternalAltarica.g:2512:1: ( 'transition' )
            // InternalAltarica.g:2513:1: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2526:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2530:1: ( rule__Class__Group_4__1__Impl )
            // InternalAltarica.g:2531:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2537:1: rule__Class__Group_4__1__Impl : ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2541:1: ( ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) )
            // InternalAltarica.g:2542:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            {
            // InternalAltarica.g:2542:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            // InternalAltarica.g:2543:1: ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* )
            {
            // InternalAltarica.g:2543:1: ( ( rule__Class__TransitionsAssignment_4_1 ) )
            // InternalAltarica.g:2544:1: ( rule__Class__TransitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // InternalAltarica.g:2545:1: ( rule__Class__TransitionsAssignment_4_1 )
            // InternalAltarica.g:2545:2: rule__Class__TransitionsAssignment_4_1
            {
            pushFollow(FOLLOW_17);
            rule__Class__TransitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }

            // InternalAltarica.g:2548:1: ( ( rule__Class__TransitionsAssignment_4_1 )* )
            // InternalAltarica.g:2549:1: ( rule__Class__TransitionsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // InternalAltarica.g:2550:1: ( rule__Class__TransitionsAssignment_4_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAltarica.g:2550:2: rule__Class__TransitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__TransitionsAssignment_4_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalAltarica.g:2565:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2569:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalAltarica.g:2570:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Class__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2577:1: rule__Class__Group_5__0__Impl : ( 'assertion' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2581:1: ( ( 'assertion' ) )
            // InternalAltarica.g:2582:1: ( 'assertion' )
            {
            // InternalAltarica.g:2582:1: ( 'assertion' )
            // InternalAltarica.g:2583:1: 'assertion'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2596:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2600:1: ( rule__Class__Group_5__1__Impl )
            // InternalAltarica.g:2601:2: rule__Class__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2607:1: rule__Class__Group_5__1__Impl : ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2611:1: ( ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) )
            // InternalAltarica.g:2612:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            {
            // InternalAltarica.g:2612:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            // InternalAltarica.g:2613:1: ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* )
            {
            // InternalAltarica.g:2613:1: ( ( rule__Class__AssertionsAssignment_5_1 ) )
            // InternalAltarica.g:2614:1: ( rule__Class__AssertionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // InternalAltarica.g:2615:1: ( rule__Class__AssertionsAssignment_5_1 )
            // InternalAltarica.g:2615:2: rule__Class__AssertionsAssignment_5_1
            {
            pushFollow(FOLLOW_19);
            rule__Class__AssertionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }

            // InternalAltarica.g:2618:1: ( ( rule__Class__AssertionsAssignment_5_1 )* )
            // InternalAltarica.g:2619:1: ( rule__Class__AssertionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // InternalAltarica.g:2620:1: ( rule__Class__AssertionsAssignment_5_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==37||LA23_0==56||LA23_0==58||LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAltarica.g:2620:2: rule__Class__AssertionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Class__AssertionsAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAltarica.g:2635:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2639:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalAltarica.g:2640:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2647:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2651:1: ( ( () ) )
            // InternalAltarica.g:2652:1: ( () )
            {
            // InternalAltarica.g:2652:1: ( () )
            // InternalAltarica.g:2653:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }
            // InternalAltarica.g:2654:1: ()
            // InternalAltarica.g:2656:1: 
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
    // InternalAltarica.g:2666:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2670:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalAltarica.g:2671:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2678:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2682:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) )
            // InternalAltarica.g:2683:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            {
            // InternalAltarica.g:2683:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            // InternalAltarica.g:2684:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }
            // InternalAltarica.g:2685:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            // InternalAltarica.g:2685:2: rule__VariableDeclaration__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2695:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2699:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalAltarica.g:2700:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2707:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2711:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // InternalAltarica.g:2712:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // InternalAltarica.g:2712:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // InternalAltarica.g:2713:1: ( rule__VariableDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:2714:1: ( rule__VariableDeclaration__NameAssignment_2 )
            // InternalAltarica.g:2714:2: rule__VariableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2724:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2728:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // InternalAltarica.g:2729:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2736:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2740:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // InternalAltarica.g:2741:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // InternalAltarica.g:2741:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // InternalAltarica.g:2742:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }
            // InternalAltarica.g:2743:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAltarica.g:2743:2: rule__VariableDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2753:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2757:1: ( rule__VariableDeclaration__Group__4__Impl )
            // InternalAltarica.g:2758:2: rule__VariableDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2764:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2768:1: ( ( ';' ) )
            // InternalAltarica.g:2769:1: ( ';' )
            {
            // InternalAltarica.g:2769:1: ( ';' )
            // InternalAltarica.g:2770:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2793:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2797:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // InternalAltarica.g:2798:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__VariableDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2805:1: rule__VariableDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2809:1: ( ( '(' ) )
            // InternalAltarica.g:2810:1: ( '(' )
            {
            // InternalAltarica.g:2810:1: ( '(' )
            // InternalAltarica.g:2811:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2824:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2828:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // InternalAltarica.g:2829:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__VariableDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2836:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2840:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) )
            // InternalAltarica.g:2841:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            {
            // InternalAltarica.g:2841:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            // InternalAltarica.g:2842:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // InternalAltarica.g:2843:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            // InternalAltarica.g:2843:2: rule__VariableDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2853:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2857:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // InternalAltarica.g:2858:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__VariableDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2865:1: rule__VariableDeclaration__Group_3__2__Impl : ( ( rule__VariableDeclaration__Group_3_2__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2869:1: ( ( ( rule__VariableDeclaration__Group_3_2__0 )* ) )
            // InternalAltarica.g:2870:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            {
            // InternalAltarica.g:2870:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            // InternalAltarica.g:2871:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }
            // InternalAltarica.g:2872:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAltarica.g:2872:2: rule__VariableDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__VariableDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAltarica.g:2882:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2886:1: ( rule__VariableDeclaration__Group_3__3__Impl )
            // InternalAltarica.g:2887:2: rule__VariableDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2893:1: rule__VariableDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2897:1: ( ( ')' ) )
            // InternalAltarica.g:2898:1: ( ')' )
            {
            // InternalAltarica.g:2898:1: ( ')' )
            // InternalAltarica.g:2899:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2920:1: rule__VariableDeclaration__Group_3_2__0 : rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 ;
    public final void rule__VariableDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2924:1: ( rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 )
            // InternalAltarica.g:2925:2: rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
            rule__VariableDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2932:1: rule__VariableDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2936:1: ( ( ',' ) )
            // InternalAltarica.g:2937:1: ( ',' )
            {
            // InternalAltarica.g:2937:1: ( ',' )
            // InternalAltarica.g:2938:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2951:1: rule__VariableDeclaration__Group_3_2__1 : rule__VariableDeclaration__Group_3_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2955:1: ( rule__VariableDeclaration__Group_3_2__1__Impl )
            // InternalAltarica.g:2956:2: rule__VariableDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2962:1: rule__VariableDeclaration__Group_3_2__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2966:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) )
            // InternalAltarica.g:2967:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // InternalAltarica.g:2967:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            // InternalAltarica.g:2968:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // InternalAltarica.g:2969:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            // InternalAltarica.g:2969:2: rule__VariableDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2983:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2987:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalAltarica.g:2988:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2995:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2999:1: ( ( () ) )
            // InternalAltarica.g:3000:1: ( () )
            {
            // InternalAltarica.g:3000:1: ( () )
            // InternalAltarica.g:3001:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // InternalAltarica.g:3002:1: ()
            // InternalAltarica.g:3004:1: 
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
    // InternalAltarica.g:3014:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3018:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalAltarica.g:3019:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3026:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3030:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalAltarica.g:3031:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalAltarica.g:3031:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalAltarica.g:3032:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // InternalAltarica.g:3033:1: ( rule__Attribute__NameAssignment_1 )
            // InternalAltarica.g:3033:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3043:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3047:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalAltarica.g:3048:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3055:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3059:1: ( ( '=' ) )
            // InternalAltarica.g:3060:1: ( '=' )
            {
            // InternalAltarica.g:3060:1: ( '=' )
            // InternalAltarica.g:3061:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3074:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3078:1: ( rule__Attribute__Group__3__Impl )
            // InternalAltarica.g:3079:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3085:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3089:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // InternalAltarica.g:3090:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // InternalAltarica.g:3090:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // InternalAltarica.g:3091:1: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // InternalAltarica.g:3092:1: ( rule__Attribute__ValueAssignment_3 )
            // InternalAltarica.g:3092:2: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3110:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3114:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // InternalAltarica.g:3115:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EventDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3122:1: rule__EventDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3126:1: ( ( () ) )
            // InternalAltarica.g:3127:1: ( () )
            {
            // InternalAltarica.g:3127:1: ( () )
            // InternalAltarica.g:3128:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }
            // InternalAltarica.g:3129:1: ()
            // InternalAltarica.g:3131:1: 
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
    // InternalAltarica.g:3141:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3145:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // InternalAltarica.g:3146:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EventDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3153:1: rule__EventDeclaration__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3157:1: ( ( 'event' ) )
            // InternalAltarica.g:3158:1: ( 'event' )
            {
            // InternalAltarica.g:3158:1: ( 'event' )
            // InternalAltarica.g:3159:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3172:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3176:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // InternalAltarica.g:3177:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__EventDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3184:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3188:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // InternalAltarica.g:3189:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // InternalAltarica.g:3189:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // InternalAltarica.g:3190:1: ( rule__EventDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:3191:1: ( rule__EventDeclaration__NameAssignment_2 )
            // InternalAltarica.g:3191:2: rule__EventDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3201:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3205:1: ( rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 )
            // InternalAltarica.g:3206:2: rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__EventDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3213:1: rule__EventDeclaration__Group__3__Impl : ( ( rule__EventDeclaration__Group_3__0 )? ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3217:1: ( ( ( rule__EventDeclaration__Group_3__0 )? ) )
            // InternalAltarica.g:3218:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            {
            // InternalAltarica.g:3218:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            // InternalAltarica.g:3219:1: ( rule__EventDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }
            // InternalAltarica.g:3220:1: ( rule__EventDeclaration__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAltarica.g:3220:2: rule__EventDeclaration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3230:1: rule__EventDeclaration__Group__4 : rule__EventDeclaration__Group__4__Impl ;
    public final void rule__EventDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3234:1: ( rule__EventDeclaration__Group__4__Impl )
            // InternalAltarica.g:3235:2: rule__EventDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3241:1: rule__EventDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__EventDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3245:1: ( ( ';' ) )
            // InternalAltarica.g:3246:1: ( ';' )
            {
            // InternalAltarica.g:3246:1: ( ';' )
            // InternalAltarica.g:3247:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3270:1: rule__EventDeclaration__Group_3__0 : rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 ;
    public final void rule__EventDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3274:1: ( rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 )
            // InternalAltarica.g:3275:2: rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__EventDeclaration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3282:1: rule__EventDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3286:1: ( ( '(' ) )
            // InternalAltarica.g:3287:1: ( '(' )
            {
            // InternalAltarica.g:3287:1: ( '(' )
            // InternalAltarica.g:3288:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3301:1: rule__EventDeclaration__Group_3__1 : rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 ;
    public final void rule__EventDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3305:1: ( rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 )
            // InternalAltarica.g:3306:2: rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__EventDeclaration__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3313:1: rule__EventDeclaration__Group_3__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__EventDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3317:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) )
            // InternalAltarica.g:3318:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            {
            // InternalAltarica.g:3318:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            // InternalAltarica.g:3319:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // InternalAltarica.g:3320:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            // InternalAltarica.g:3320:2: rule__EventDeclaration__AttributesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3330:1: rule__EventDeclaration__Group_3__2 : rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 ;
    public final void rule__EventDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3334:1: ( rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 )
            // InternalAltarica.g:3335:2: rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__EventDeclaration__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3342:1: rule__EventDeclaration__Group_3__2__Impl : ( ( rule__EventDeclaration__Group_3_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3346:1: ( ( ( rule__EventDeclaration__Group_3_2__0 )* ) )
            // InternalAltarica.g:3347:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            {
            // InternalAltarica.g:3347:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            // InternalAltarica.g:3348:1: ( rule__EventDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }
            // InternalAltarica.g:3349:1: ( rule__EventDeclaration__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAltarica.g:3349:2: rule__EventDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EventDeclaration__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAltarica.g:3359:1: rule__EventDeclaration__Group_3__3 : rule__EventDeclaration__Group_3__3__Impl ;
    public final void rule__EventDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3363:1: ( rule__EventDeclaration__Group_3__3__Impl )
            // InternalAltarica.g:3364:2: rule__EventDeclaration__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3370:1: rule__EventDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3374:1: ( ( ')' ) )
            // InternalAltarica.g:3375:1: ( ')' )
            {
            // InternalAltarica.g:3375:1: ( ')' )
            // InternalAltarica.g:3376:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3397:1: rule__EventDeclaration__Group_3_2__0 : rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 ;
    public final void rule__EventDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3401:1: ( rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 )
            // InternalAltarica.g:3402:2: rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
            rule__EventDeclaration__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3409:1: rule__EventDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3413:1: ( ( ',' ) )
            // InternalAltarica.g:3414:1: ( ',' )
            {
            // InternalAltarica.g:3414:1: ( ',' )
            // InternalAltarica.g:3415:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3428:1: rule__EventDeclaration__Group_3_2__1 : rule__EventDeclaration__Group_3_2__1__Impl ;
    public final void rule__EventDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3432:1: ( rule__EventDeclaration__Group_3_2__1__Impl )
            // InternalAltarica.g:3433:2: rule__EventDeclaration__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3439:1: rule__EventDeclaration__Group_3_2__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3443:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) )
            // InternalAltarica.g:3444:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // InternalAltarica.g:3444:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            // InternalAltarica.g:3445:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // InternalAltarica.g:3446:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            // InternalAltarica.g:3446:2: rule__EventDeclaration__AttributesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3460:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3464:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // InternalAltarica.g:3465:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3472:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3476:1: ( ( () ) )
            // InternalAltarica.g:3477:1: ( () )
            {
            // InternalAltarica.g:3477:1: ( () )
            // InternalAltarica.g:3478:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }
            // InternalAltarica.g:3479:1: ()
            // InternalAltarica.g:3481:1: 
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
    // InternalAltarica.g:3491:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3495:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // InternalAltarica.g:3496:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3503:1: rule__ParameterDeclaration__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3507:1: ( ( 'parameter' ) )
            // InternalAltarica.g:3508:1: ( 'parameter' )
            {
            // InternalAltarica.g:3508:1: ( 'parameter' )
            // InternalAltarica.g:3509:1: 'parameter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3522:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3526:1: ( rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 )
            // InternalAltarica.g:3527:2: rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ParameterDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3534:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3538:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) )
            // InternalAltarica.g:3539:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            {
            // InternalAltarica.g:3539:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            // InternalAltarica.g:3540:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }
            // InternalAltarica.g:3541:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            // InternalAltarica.g:3541:2: rule__ParameterDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3551:1: rule__ParameterDeclaration__Group__3 : rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 ;
    public final void rule__ParameterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3555:1: ( rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 )
            // InternalAltarica.g:3556:2: rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ParameterDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3563:1: rule__ParameterDeclaration__Group__3__Impl : ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ParameterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3567:1: ( ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) )
            // InternalAltarica.g:3568:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            {
            // InternalAltarica.g:3568:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            // InternalAltarica.g:3569:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }
            // InternalAltarica.g:3570:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            // InternalAltarica.g:3570:2: rule__ParameterDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3580:1: rule__ParameterDeclaration__Group__4 : rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 ;
    public final void rule__ParameterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3584:1: ( rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 )
            // InternalAltarica.g:3585:2: rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ParameterDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3592:1: rule__ParameterDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ParameterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3596:1: ( ( '=' ) )
            // InternalAltarica.g:3597:1: ( '=' )
            {
            // InternalAltarica.g:3597:1: ( '=' )
            // InternalAltarica.g:3598:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3611:1: rule__ParameterDeclaration__Group__5 : rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 ;
    public final void rule__ParameterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3615:1: ( rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 )
            // InternalAltarica.g:3616:2: rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__ParameterDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3623:1: rule__ParameterDeclaration__Group__5__Impl : ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ParameterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3627:1: ( ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) )
            // InternalAltarica.g:3628:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            {
            // InternalAltarica.g:3628:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            // InternalAltarica.g:3629:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }
            // InternalAltarica.g:3630:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            // InternalAltarica.g:3630:2: rule__ParameterDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3640:1: rule__ParameterDeclaration__Group__6 : rule__ParameterDeclaration__Group__6__Impl ;
    public final void rule__ParameterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3644:1: ( rule__ParameterDeclaration__Group__6__Impl )
            // InternalAltarica.g:3645:2: rule__ParameterDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3651:1: rule__ParameterDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ParameterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3655:1: ( ( ';' ) )
            // InternalAltarica.g:3656:1: ( ';' )
            {
            // InternalAltarica.g:3656:1: ( ';' )
            // InternalAltarica.g:3657:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3684:1: rule__ObserverDeclaration__Group__0 : rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 ;
    public final void rule__ObserverDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3688:1: ( rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 )
            // InternalAltarica.g:3689:2: rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ObserverDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3696:1: rule__ObserverDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ObserverDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3700:1: ( ( () ) )
            // InternalAltarica.g:3701:1: ( () )
            {
            // InternalAltarica.g:3701:1: ( () )
            // InternalAltarica.g:3702:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }
            // InternalAltarica.g:3703:1: ()
            // InternalAltarica.g:3705:1: 
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
    // InternalAltarica.g:3715:1: rule__ObserverDeclaration__Group__1 : rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 ;
    public final void rule__ObserverDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3719:1: ( rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 )
            // InternalAltarica.g:3720:2: rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ObserverDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3727:1: rule__ObserverDeclaration__Group__1__Impl : ( 'observer' ) ;
    public final void rule__ObserverDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3731:1: ( ( 'observer' ) )
            // InternalAltarica.g:3732:1: ( 'observer' )
            {
            // InternalAltarica.g:3732:1: ( 'observer' )
            // InternalAltarica.g:3733:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3746:1: rule__ObserverDeclaration__Group__2 : rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 ;
    public final void rule__ObserverDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3750:1: ( rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 )
            // InternalAltarica.g:3751:2: rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ObserverDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3758:1: rule__ObserverDeclaration__Group__2__Impl : ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ObserverDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3762:1: ( ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) )
            // InternalAltarica.g:3763:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            {
            // InternalAltarica.g:3763:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            // InternalAltarica.g:3764:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }
            // InternalAltarica.g:3765:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            // InternalAltarica.g:3765:2: rule__ObserverDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3775:1: rule__ObserverDeclaration__Group__3 : rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 ;
    public final void rule__ObserverDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3779:1: ( rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 )
            // InternalAltarica.g:3780:2: rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ObserverDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3787:1: rule__ObserverDeclaration__Group__3__Impl : ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObserverDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3791:1: ( ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) )
            // InternalAltarica.g:3792:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            {
            // InternalAltarica.g:3792:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            // InternalAltarica.g:3793:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }
            // InternalAltarica.g:3794:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            // InternalAltarica.g:3794:2: rule__ObserverDeclaration__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3804:1: rule__ObserverDeclaration__Group__4 : rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 ;
    public final void rule__ObserverDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3808:1: ( rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 )
            // InternalAltarica.g:3809:2: rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ObserverDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3816:1: rule__ObserverDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ObserverDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3820:1: ( ( '=' ) )
            // InternalAltarica.g:3821:1: ( '=' )
            {
            // InternalAltarica.g:3821:1: ( '=' )
            // InternalAltarica.g:3822:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3835:1: rule__ObserverDeclaration__Group__5 : rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 ;
    public final void rule__ObserverDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3839:1: ( rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 )
            // InternalAltarica.g:3840:2: rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__ObserverDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3847:1: rule__ObserverDeclaration__Group__5__Impl : ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ObserverDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3851:1: ( ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) )
            // InternalAltarica.g:3852:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            {
            // InternalAltarica.g:3852:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            // InternalAltarica.g:3853:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }
            // InternalAltarica.g:3854:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            // InternalAltarica.g:3854:2: rule__ObserverDeclaration__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3864:1: rule__ObserverDeclaration__Group__6 : rule__ObserverDeclaration__Group__6__Impl ;
    public final void rule__ObserverDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3868:1: ( rule__ObserverDeclaration__Group__6__Impl )
            // InternalAltarica.g:3869:2: rule__ObserverDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3875:1: rule__ObserverDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ObserverDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3879:1: ( ( ';' ) )
            // InternalAltarica.g:3880:1: ( ';' )
            {
            // InternalAltarica.g:3880:1: ( ';' )
            // InternalAltarica.g:3881:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3908:1: rule__LabeledTransition__Group__0 : rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 ;
    public final void rule__LabeledTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3912:1: ( rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 )
            // InternalAltarica.g:3913:2: rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LabeledTransition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3920:1: rule__LabeledTransition__Group__0__Impl : ( ( rule__LabeledTransition__EventAssignment_0 ) ) ;
    public final void rule__LabeledTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3924:1: ( ( ( rule__LabeledTransition__EventAssignment_0 ) ) )
            // InternalAltarica.g:3925:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            {
            // InternalAltarica.g:3925:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            // InternalAltarica.g:3926:1: ( rule__LabeledTransition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }
            // InternalAltarica.g:3927:1: ( rule__LabeledTransition__EventAssignment_0 )
            // InternalAltarica.g:3927:2: rule__LabeledTransition__EventAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3937:1: rule__LabeledTransition__Group__1 : rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 ;
    public final void rule__LabeledTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3941:1: ( rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 )
            // InternalAltarica.g:3942:2: rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__LabeledTransition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3949:1: rule__LabeledTransition__Group__1__Impl : ( ':' ) ;
    public final void rule__LabeledTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3953:1: ( ( ':' ) )
            // InternalAltarica.g:3954:1: ( ':' )
            {
            // InternalAltarica.g:3954:1: ( ':' )
            // InternalAltarica.g:3955:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3968:1: rule__LabeledTransition__Group__2 : rule__LabeledTransition__Group__2__Impl ;
    public final void rule__LabeledTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3972:1: ( rule__LabeledTransition__Group__2__Impl )
            // InternalAltarica.g:3973:2: rule__LabeledTransition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:3979:1: rule__LabeledTransition__Group__2__Impl : ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) ;
    public final void rule__LabeledTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3983:1: ( ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) )
            // InternalAltarica.g:3984:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            {
            // InternalAltarica.g:3984:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            // InternalAltarica.g:3985:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }
            // InternalAltarica.g:3986:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            // InternalAltarica.g:3986:2: rule__LabeledTransition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4002:1: rule__TransitionAnd__Group__0 : rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 ;
    public final void rule__TransitionAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4006:1: ( rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 )
            // InternalAltarica.g:4007:2: rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__TransitionAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4014:1: rule__TransitionAnd__Group__0__Impl : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4018:1: ( ( ruleTransitionOr ) )
            // InternalAltarica.g:4019:1: ( ruleTransitionOr )
            {
            // InternalAltarica.g:4019:1: ( ruleTransitionOr )
            // InternalAltarica.g:4020:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4031:1: rule__TransitionAnd__Group__1 : rule__TransitionAnd__Group__1__Impl ;
    public final void rule__TransitionAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4035:1: ( rule__TransitionAnd__Group__1__Impl )
            // InternalAltarica.g:4036:2: rule__TransitionAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4042:1: rule__TransitionAnd__Group__1__Impl : ( ( rule__TransitionAnd__Group_1__0 )* ) ;
    public final void rule__TransitionAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4046:1: ( ( ( rule__TransitionAnd__Group_1__0 )* ) )
            // InternalAltarica.g:4047:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            {
            // InternalAltarica.g:4047:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            // InternalAltarica.g:4048:1: ( rule__TransitionAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }
            // InternalAltarica.g:4049:1: ( rule__TransitionAnd__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAltarica.g:4049:2: rule__TransitionAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__TransitionAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAltarica.g:4063:1: rule__TransitionAnd__Group_1__0 : rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 ;
    public final void rule__TransitionAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4067:1: ( rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 )
            // InternalAltarica.g:4068:2: rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__TransitionAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4075:1: rule__TransitionAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4079:1: ( ( () ) )
            // InternalAltarica.g:4080:1: ( () )
            {
            // InternalAltarica.g:4080:1: ( () )
            // InternalAltarica.g:4081:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }
            // InternalAltarica.g:4082:1: ()
            // InternalAltarica.g:4084:1: 
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
    // InternalAltarica.g:4094:1: rule__TransitionAnd__Group_1__1 : rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 ;
    public final void rule__TransitionAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4098:1: ( rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 )
            // InternalAltarica.g:4099:2: rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__TransitionAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4106:1: rule__TransitionAnd__Group_1__1__Impl : ( '&' ) ;
    public final void rule__TransitionAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4110:1: ( ( '&' ) )
            // InternalAltarica.g:4111:1: ( '&' )
            {
            // InternalAltarica.g:4111:1: ( '&' )
            // InternalAltarica.g:4112:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4125:1: rule__TransitionAnd__Group_1__2 : rule__TransitionAnd__Group_1__2__Impl ;
    public final void rule__TransitionAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4129:1: ( rule__TransitionAnd__Group_1__2__Impl )
            // InternalAltarica.g:4130:2: rule__TransitionAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4136:1: rule__TransitionAnd__Group_1__2__Impl : ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4140:1: ( ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:4141:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:4141:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            // InternalAltarica.g:4142:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:4143:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            // InternalAltarica.g:4143:2: rule__TransitionAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4159:1: rule__TransitionOr__Group__0 : rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 ;
    public final void rule__TransitionOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4163:1: ( rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 )
            // InternalAltarica.g:4164:2: rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4171:1: rule__TransitionOr__Group__0__Impl : ( ruleTransition ) ;
    public final void rule__TransitionOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4175:1: ( ( ruleTransition ) )
            // InternalAltarica.g:4176:1: ( ruleTransition )
            {
            // InternalAltarica.g:4176:1: ( ruleTransition )
            // InternalAltarica.g:4177:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4188:1: rule__TransitionOr__Group__1 : rule__TransitionOr__Group__1__Impl ;
    public final void rule__TransitionOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4192:1: ( rule__TransitionOr__Group__1__Impl )
            // InternalAltarica.g:4193:2: rule__TransitionOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4199:1: rule__TransitionOr__Group__1__Impl : ( ( rule__TransitionOr__Group_1__0 )* ) ;
    public final void rule__TransitionOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4203:1: ( ( ( rule__TransitionOr__Group_1__0 )* ) )
            // InternalAltarica.g:4204:1: ( ( rule__TransitionOr__Group_1__0 )* )
            {
            // InternalAltarica.g:4204:1: ( ( rule__TransitionOr__Group_1__0 )* )
            // InternalAltarica.g:4205:1: ( rule__TransitionOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }
            // InternalAltarica.g:4206:1: ( rule__TransitionOr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAltarica.g:4206:2: rule__TransitionOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__TransitionOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalAltarica.g:4220:1: rule__TransitionOr__Group_1__0 : rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 ;
    public final void rule__TransitionOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4224:1: ( rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 )
            // InternalAltarica.g:4225:2: rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__TransitionOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4232:1: rule__TransitionOr__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4236:1: ( ( () ) )
            // InternalAltarica.g:4237:1: ( () )
            {
            // InternalAltarica.g:4237:1: ( () )
            // InternalAltarica.g:4238:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }
            // InternalAltarica.g:4239:1: ()
            // InternalAltarica.g:4241:1: 
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
    // InternalAltarica.g:4251:1: rule__TransitionOr__Group_1__1 : rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 ;
    public final void rule__TransitionOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4255:1: ( rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 )
            // InternalAltarica.g:4256:2: rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__TransitionOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4263:1: rule__TransitionOr__Group_1__1__Impl : ( '|' ) ;
    public final void rule__TransitionOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4267:1: ( ( '|' ) )
            // InternalAltarica.g:4268:1: ( '|' )
            {
            // InternalAltarica.g:4268:1: ( '|' )
            // InternalAltarica.g:4269:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4282:1: rule__TransitionOr__Group_1__2 : rule__TransitionOr__Group_1__2__Impl ;
    public final void rule__TransitionOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4286:1: ( rule__TransitionOr__Group_1__2__Impl )
            // InternalAltarica.g:4287:2: rule__TransitionOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4293:1: rule__TransitionOr__Group_1__2__Impl : ( ( rule__TransitionOr__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4297:1: ( ( ( rule__TransitionOr__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:4298:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:4298:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            // InternalAltarica.g:4299:1: ( rule__TransitionOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:4300:1: ( rule__TransitionOr__RightAssignment_1_2 )
            // InternalAltarica.g:4300:2: rule__TransitionOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4316:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4320:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalAltarica.g:4321:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4328:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4332:1: ( ( () ) )
            // InternalAltarica.g:4333:1: ( () )
            {
            // InternalAltarica.g:4333:1: ( () )
            // InternalAltarica.g:4334:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // InternalAltarica.g:4335:1: ()
            // InternalAltarica.g:4337:1: 
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
    // InternalAltarica.g:4347:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4351:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalAltarica.g:4352:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4359:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__GuardAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4363:1: ( ( ( rule__Transition__GuardAssignment_1 ) ) )
            // InternalAltarica.g:4364:1: ( ( rule__Transition__GuardAssignment_1 ) )
            {
            // InternalAltarica.g:4364:1: ( ( rule__Transition__GuardAssignment_1 ) )
            // InternalAltarica.g:4365:1: ( rule__Transition__GuardAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }
            // InternalAltarica.g:4366:1: ( rule__Transition__GuardAssignment_1 )
            // InternalAltarica.g:4366:2: rule__Transition__GuardAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4376:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4380:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalAltarica.g:4381:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4388:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4392:1: ( ( '->' ) )
            // InternalAltarica.g:4393:1: ( '->' )
            {
            // InternalAltarica.g:4393:1: ( '->' )
            // InternalAltarica.g:4394:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4407:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4411:1: ( rule__Transition__Group__3__Impl )
            // InternalAltarica.g:4412:2: rule__Transition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4418:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__ActionAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4422:1: ( ( ( rule__Transition__ActionAssignment_3 ) ) )
            // InternalAltarica.g:4423:1: ( ( rule__Transition__ActionAssignment_3 ) )
            {
            // InternalAltarica.g:4423:1: ( ( rule__Transition__ActionAssignment_3 ) )
            // InternalAltarica.g:4424:1: ( rule__Transition__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_3()); 
            }
            // InternalAltarica.g:4425:1: ( rule__Transition__ActionAssignment_3 )
            // InternalAltarica.g:4425:2: rule__Transition__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4443:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4447:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // InternalAltarica.g:4448:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Skip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4455:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4459:1: ( ( () ) )
            // InternalAltarica.g:4460:1: ( () )
            {
            // InternalAltarica.g:4460:1: ( () )
            // InternalAltarica.g:4461:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }
            // InternalAltarica.g:4462:1: ()
            // InternalAltarica.g:4464:1: 
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
    // InternalAltarica.g:4474:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl rule__Skip__Group__2 ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4478:1: ( rule__Skip__Group__1__Impl rule__Skip__Group__2 )
            // InternalAltarica.g:4479:2: rule__Skip__Group__1__Impl rule__Skip__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Skip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4486:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4490:1: ( ( 'skip' ) )
            // InternalAltarica.g:4491:1: ( 'skip' )
            {
            // InternalAltarica.g:4491:1: ( 'skip' )
            // InternalAltarica.g:4492:1: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4505:1: rule__Skip__Group__2 : rule__Skip__Group__2__Impl ;
    public final void rule__Skip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4509:1: ( rule__Skip__Group__2__Impl )
            // InternalAltarica.g:4510:2: rule__Skip__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4516:1: rule__Skip__Group__2__Impl : ( ';' ) ;
    public final void rule__Skip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4520:1: ( ( ';' ) )
            // InternalAltarica.g:4521:1: ( ';' )
            {
            // InternalAltarica.g:4521:1: ( ';' )
            // InternalAltarica.g:4522:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4541:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4545:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalAltarica.g:4546:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4553:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4557:1: ( ( () ) )
            // InternalAltarica.g:4558:1: ( () )
            {
            // InternalAltarica.g:4558:1: ( () )
            // InternalAltarica.g:4559:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }
            // InternalAltarica.g:4560:1: ()
            // InternalAltarica.g:4562:1: 
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
    // InternalAltarica.g:4572:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4576:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalAltarica.g:4577:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Assignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4584:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__VariableAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4588:1: ( ( ( rule__Assignment__VariableAssignment_1 ) ) )
            // InternalAltarica.g:4589:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            {
            // InternalAltarica.g:4589:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            // InternalAltarica.g:4590:1: ( rule__Assignment__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }
            // InternalAltarica.g:4591:1: ( rule__Assignment__VariableAssignment_1 )
            // InternalAltarica.g:4591:2: rule__Assignment__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4601:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4605:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalAltarica.g:4606:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Assignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4613:1: rule__Assignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4617:1: ( ( ':=' ) )
            // InternalAltarica.g:4618:1: ( ':=' )
            {
            // InternalAltarica.g:4618:1: ( ':=' )
            // InternalAltarica.g:4619:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4632:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4636:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalAltarica.g:4637:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Assignment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4644:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4648:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // InternalAltarica.g:4649:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // InternalAltarica.g:4649:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // InternalAltarica.g:4650:1: ( rule__Assignment__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }
            // InternalAltarica.g:4651:1: ( rule__Assignment__ValueAssignment_3 )
            // InternalAltarica.g:4651:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4661:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4665:1: ( rule__Assignment__Group__4__Impl )
            // InternalAltarica.g:4666:2: rule__Assignment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4672:1: rule__Assignment__Group__4__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4676:1: ( ( ';' ) )
            // InternalAltarica.g:4677:1: ( ';' )
            {
            // InternalAltarica.g:4677:1: ( ';' )
            // InternalAltarica.g:4678:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4701:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4705:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAltarica.g:4706:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Block__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4713:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4717:1: ( ( () ) )
            // InternalAltarica.g:4718:1: ( () )
            {
            // InternalAltarica.g:4718:1: ( () )
            // InternalAltarica.g:4719:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalAltarica.g:4720:1: ()
            // InternalAltarica.g:4722:1: 
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
    // InternalAltarica.g:4732:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4736:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAltarica.g:4737:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Block__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4744:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4748:1: ( ( '{' ) )
            // InternalAltarica.g:4749:1: ( '{' )
            {
            // InternalAltarica.g:4749:1: ( '{' )
            // InternalAltarica.g:4750:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4763:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4767:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAltarica.g:4768:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Block__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4775:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4779:1: ( ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) )
            // InternalAltarica.g:4780:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            {
            // InternalAltarica.g:4780:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // InternalAltarica.g:4781:1: ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // InternalAltarica.g:4781:1: ( ( rule__Block__InstructionsAssignment_2 ) )
            // InternalAltarica.g:4782:1: ( rule__Block__InstructionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // InternalAltarica.g:4783:1: ( rule__Block__InstructionsAssignment_2 )
            // InternalAltarica.g:4783:2: rule__Block__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_19);
            rule__Block__InstructionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }

            // InternalAltarica.g:4786:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // InternalAltarica.g:4787:1: ( rule__Block__InstructionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // InternalAltarica.g:4788:1: ( rule__Block__InstructionsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==37||LA30_0==56||LA30_0==58||LA30_0==61) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAltarica.g:4788:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Block__InstructionsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAltarica.g:4799:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4803:1: ( rule__Block__Group__3__Impl )
            // InternalAltarica.g:4804:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4810:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4814:1: ( ( '}' ) )
            // InternalAltarica.g:4815:1: ( '}' )
            {
            // InternalAltarica.g:4815:1: ( '}' )
            // InternalAltarica.g:4816:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4837:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4841:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalAltarica.g:4842:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Conditional__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4849:1: rule__Conditional__Group__0__Impl : ( () ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4853:1: ( ( () ) )
            // InternalAltarica.g:4854:1: ( () )
            {
            // InternalAltarica.g:4854:1: ( () )
            // InternalAltarica.g:4855:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionalAction_0()); 
            }
            // InternalAltarica.g:4856:1: ()
            // InternalAltarica.g:4858:1: 
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
    // InternalAltarica.g:4868:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4872:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalAltarica.g:4873:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Conditional__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4880:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4884:1: ( ( 'if' ) )
            // InternalAltarica.g:4885:1: ( 'if' )
            {
            // InternalAltarica.g:4885:1: ( 'if' )
            // InternalAltarica.g:4886:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4899:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4903:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalAltarica.g:4904:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Conditional__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4911:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4915:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // InternalAltarica.g:4916:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // InternalAltarica.g:4916:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // InternalAltarica.g:4917:1: ( rule__Conditional__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            }
            // InternalAltarica.g:4918:1: ( rule__Conditional__ConditionAssignment_2 )
            // InternalAltarica.g:4918:2: rule__Conditional__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4928:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4932:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalAltarica.g:4933:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Conditional__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4940:1: rule__Conditional__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4944:1: ( ( 'then' ) )
            // InternalAltarica.g:4945:1: ( 'then' )
            {
            // InternalAltarica.g:4945:1: ( 'then' )
            // InternalAltarica.g:4946:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenKeyword_3()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4959:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4963:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalAltarica.g:4964:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Conditional__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4971:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ThenAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4975:1: ( ( ( rule__Conditional__ThenAssignment_4 ) ) )
            // InternalAltarica.g:4976:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            {
            // InternalAltarica.g:4976:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            // InternalAltarica.g:4977:1: ( rule__Conditional__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenAssignment_4()); 
            }
            // InternalAltarica.g:4978:1: ( rule__Conditional__ThenAssignment_4 )
            // InternalAltarica.g:4978:2: rule__Conditional__ThenAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:4988:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4992:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // InternalAltarica.g:4993:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__Conditional__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5000:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Group_5__0 )? ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5004:1: ( ( ( rule__Conditional__Group_5__0 )? ) )
            // InternalAltarica.g:5005:1: ( ( rule__Conditional__Group_5__0 )? )
            {
            // InternalAltarica.g:5005:1: ( ( rule__Conditional__Group_5__0 )? )
            // InternalAltarica.g:5006:1: ( rule__Conditional__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup_5()); 
            }
            // InternalAltarica.g:5007:1: ( rule__Conditional__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==60) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAltarica.g:5007:2: rule__Conditional__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5017:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5021:1: ( rule__Conditional__Group__6__Impl )
            // InternalAltarica.g:5022:2: rule__Conditional__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5028:1: rule__Conditional__Group__6__Impl : ( ';' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5032:1: ( ( ';' ) )
            // InternalAltarica.g:5033:1: ( ';' )
            {
            // InternalAltarica.g:5033:1: ( ';' )
            // InternalAltarica.g:5034:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getSemicolonKeyword_6()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5061:1: rule__Conditional__Group_5__0 : rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 ;
    public final void rule__Conditional__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5065:1: ( rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 )
            // InternalAltarica.g:5066:2: rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Conditional__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5073:1: rule__Conditional__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Conditional__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5077:1: ( ( ( 'else' ) ) )
            // InternalAltarica.g:5078:1: ( ( 'else' ) )
            {
            // InternalAltarica.g:5078:1: ( ( 'else' ) )
            // InternalAltarica.g:5079:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseKeyword_5_0()); 
            }
            // InternalAltarica.g:5080:1: ( 'else' )
            // InternalAltarica.g:5081:2: 'else'
            {
            match(input,60,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:5092:1: rule__Conditional__Group_5__1 : rule__Conditional__Group_5__1__Impl ;
    public final void rule__Conditional__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5096:1: ( rule__Conditional__Group_5__1__Impl )
            // InternalAltarica.g:5097:2: rule__Conditional__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5103:1: rule__Conditional__Group_5__1__Impl : ( ( rule__Conditional__ElseAssignment_5_1 ) ) ;
    public final void rule__Conditional__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5107:1: ( ( ( rule__Conditional__ElseAssignment_5_1 ) ) )
            // InternalAltarica.g:5108:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            {
            // InternalAltarica.g:5108:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            // InternalAltarica.g:5109:1: ( rule__Conditional__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseAssignment_5_1()); 
            }
            // InternalAltarica.g:5110:1: ( rule__Conditional__ElseAssignment_5_1 )
            // InternalAltarica.g:5110:2: rule__Conditional__ElseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5124:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5128:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // InternalAltarica.g:5129:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Switch__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5136:1: rule__Switch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5140:1: ( ( 'switch' ) )
            // InternalAltarica.g:5141:1: ( 'switch' )
            {
            // InternalAltarica.g:5141:1: ( 'switch' )
            // InternalAltarica.g:5142:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5155:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5159:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // InternalAltarica.g:5160:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Switch__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5167:1: rule__Switch__Group__1__Impl : ( '{' ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5171:1: ( ( '{' ) )
            // InternalAltarica.g:5172:1: ( '{' )
            {
            // InternalAltarica.g:5172:1: ( '{' )
            // InternalAltarica.g:5173:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5186:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5190:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // InternalAltarica.g:5191:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Switch__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5198:1: rule__Switch__Group__2__Impl : ( ( rule__Switch__CasesAssignment_2 )* ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5202:1: ( ( ( rule__Switch__CasesAssignment_2 )* ) )
            // InternalAltarica.g:5203:1: ( ( rule__Switch__CasesAssignment_2 )* )
            {
            // InternalAltarica.g:5203:1: ( ( rule__Switch__CasesAssignment_2 )* )
            // InternalAltarica.g:5204:1: ( rule__Switch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesAssignment_2()); 
            }
            // InternalAltarica.g:5205:1: ( rule__Switch__CasesAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==65) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAltarica.g:5205:2: rule__Switch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__Switch__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalAltarica.g:5215:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5219:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // InternalAltarica.g:5220:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Switch__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5227:1: rule__Switch__Group__3__Impl : ( 'else' ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5231:1: ( ( 'else' ) )
            // InternalAltarica.g:5232:1: ( 'else' )
            {
            // InternalAltarica.g:5232:1: ( 'else' )
            // InternalAltarica.g:5233:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseKeyword_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5246:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl rule__Switch__Group__5 ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5250:1: ( rule__Switch__Group__4__Impl rule__Switch__Group__5 )
            // InternalAltarica.g:5251:2: rule__Switch__Group__4__Impl rule__Switch__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Switch__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5258:1: rule__Switch__Group__4__Impl : ( ':' ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5262:1: ( ( ':' ) )
            // InternalAltarica.g:5263:1: ( ':' )
            {
            // InternalAltarica.g:5263:1: ( ':' )
            // InternalAltarica.g:5264:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getColonKeyword_4()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5277:1: rule__Switch__Group__5 : rule__Switch__Group__5__Impl rule__Switch__Group__6 ;
    public final void rule__Switch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5281:1: ( rule__Switch__Group__5__Impl rule__Switch__Group__6 )
            // InternalAltarica.g:5282:2: rule__Switch__Group__5__Impl rule__Switch__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Switch__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5289:1: rule__Switch__Group__5__Impl : ( ( rule__Switch__ElseAssignment_5 ) ) ;
    public final void rule__Switch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5293:1: ( ( ( rule__Switch__ElseAssignment_5 ) ) )
            // InternalAltarica.g:5294:1: ( ( rule__Switch__ElseAssignment_5 ) )
            {
            // InternalAltarica.g:5294:1: ( ( rule__Switch__ElseAssignment_5 ) )
            // InternalAltarica.g:5295:1: ( rule__Switch__ElseAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseAssignment_5()); 
            }
            // InternalAltarica.g:5296:1: ( rule__Switch__ElseAssignment_5 )
            // InternalAltarica.g:5296:2: rule__Switch__ElseAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5306:1: rule__Switch__Group__6 : rule__Switch__Group__6__Impl ;
    public final void rule__Switch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5310:1: ( rule__Switch__Group__6__Impl )
            // InternalAltarica.g:5311:2: rule__Switch__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5317:1: rule__Switch__Group__6__Impl : ( '}' ) ;
    public final void rule__Switch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5321:1: ( ( '}' ) )
            // InternalAltarica.g:5322:1: ( '}' )
            {
            // InternalAltarica.g:5322:1: ( '}' )
            // InternalAltarica.g:5323:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5350:1: rule__LogicalOr__Group__0 : rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 ;
    public final void rule__LogicalOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5354:1: ( rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 )
            // InternalAltarica.g:5355:2: rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__LogicalOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5362:1: rule__LogicalOr__Group__0__Impl : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5366:1: ( ( ruleLogicalAnd ) )
            // InternalAltarica.g:5367:1: ( ruleLogicalAnd )
            {
            // InternalAltarica.g:5367:1: ( ruleLogicalAnd )
            // InternalAltarica.g:5368:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5379:1: rule__LogicalOr__Group__1 : rule__LogicalOr__Group__1__Impl ;
    public final void rule__LogicalOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5383:1: ( rule__LogicalOr__Group__1__Impl )
            // InternalAltarica.g:5384:2: rule__LogicalOr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5390:1: rule__LogicalOr__Group__1__Impl : ( ( rule__LogicalOr__Group_1__0 )* ) ;
    public final void rule__LogicalOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5394:1: ( ( ( rule__LogicalOr__Group_1__0 )* ) )
            // InternalAltarica.g:5395:1: ( ( rule__LogicalOr__Group_1__0 )* )
            {
            // InternalAltarica.g:5395:1: ( ( rule__LogicalOr__Group_1__0 )* )
            // InternalAltarica.g:5396:1: ( rule__LogicalOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5397:1: ( rule__LogicalOr__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==66) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAltarica.g:5397:2: rule__LogicalOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__LogicalOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAltarica.g:5411:1: rule__LogicalOr__Group_1__0 : rule__LogicalOr__Group_1__0__Impl rule__LogicalOr__Group_1__1 ;
    public final void rule__LogicalOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5415:1: ( rule__LogicalOr__Group_1__0__Impl rule__LogicalOr__Group_1__1 )
            // InternalAltarica.g:5416:2: rule__LogicalOr__Group_1__0__Impl rule__LogicalOr__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__LogicalOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAltarica.g:5423:1: rule__LogicalOr__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5427:1: ( ( () ) )
            // InternalAltarica.g:5428:1: ( () )
            {
            // InternalAltarica.g:5428:1: ( () )
            // InternalAltarica.g:5429:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0()); 
            }
            // InternalAltarica.g:5430:1: ()
            // InternalAltarica.g:5432:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1__1"
    // InternalAltarica.g:5442:1: rule__LogicalOr__Group_1__1 : rule__LogicalOr__Group_1__1__Impl rule__LogicalOr__Group_1__2 ;
    public final void rule__LogicalOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5446:1: ( rule__LogicalOr__Group_1__1__Impl rule__LogicalOr__Group_1__2 )
            // InternalAltarica.g:5447:2: rule__LogicalOr__Group_1__1__Impl rule__LogicalOr__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__LogicalOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalOr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__1"


    // $ANTLR start "rule__LogicalOr__Group_1__1__Impl"
    // InternalAltarica.g:5454:1: rule__LogicalOr__Group_1__1__Impl : ( ( rule__LogicalOr__OpAssignment_1_1 ) ) ;
    public final void rule__LogicalOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5458:1: ( ( ( rule__LogicalOr__OpAssignment_1_1 ) ) )
            // InternalAltarica.g:5459:1: ( ( rule__LogicalOr__OpAssignment_1_1 ) )
            {
            // InternalAltarica.g:5459:1: ( ( rule__LogicalOr__OpAssignment_1_1 ) )
            // InternalAltarica.g:5460:1: ( rule__LogicalOr__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpAssignment_1_1()); 
            }
            // InternalAltarica.g:5461:1: ( rule__LogicalOr__OpAssignment_1_1 )
            // InternalAltarica.g:5461:2: rule__LogicalOr__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOr__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOr__Group_1__2"
    // InternalAltarica.g:5471:1: rule__LogicalOr__Group_1__2 : rule__LogicalOr__Group_1__2__Impl ;
    public final void rule__LogicalOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5475:1: ( rule__LogicalOr__Group_1__2__Impl )
            // InternalAltarica.g:5476:2: rule__LogicalOr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__2"


    // $ANTLR start "rule__LogicalOr__Group_1__2__Impl"
    // InternalAltarica.g:5482:1: rule__LogicalOr__Group_1__2__Impl : ( ( rule__LogicalOr__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5486:1: ( ( ( rule__LogicalOr__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:5487:1: ( ( rule__LogicalOr__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:5487:1: ( ( rule__LogicalOr__RightAssignment_1_2 ) )
            // InternalAltarica.g:5488:1: ( rule__LogicalOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:5489:1: ( rule__LogicalOr__RightAssignment_1_2 )
            // InternalAltarica.g:5489:2: rule__LogicalOr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAnd__Group__0"
    // InternalAltarica.g:5505:1: rule__LogicalAnd__Group__0 : rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 ;
    public final void rule__LogicalAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5509:1: ( rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 )
            // InternalAltarica.g:5510:2: rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__LogicalAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5517:1: rule__LogicalAnd__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__LogicalAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5521:1: ( ( ruleRelation ) )
            // InternalAltarica.g:5522:1: ( ruleRelation )
            {
            // InternalAltarica.g:5522:1: ( ruleRelation )
            // InternalAltarica.g:5523:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRelationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5534:1: rule__LogicalAnd__Group__1 : rule__LogicalAnd__Group__1__Impl ;
    public final void rule__LogicalAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5538:1: ( rule__LogicalAnd__Group__1__Impl )
            // InternalAltarica.g:5539:2: rule__LogicalAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5545:1: rule__LogicalAnd__Group__1__Impl : ( ( rule__LogicalAnd__Group_1__0 )* ) ;
    public final void rule__LogicalAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5549:1: ( ( ( rule__LogicalAnd__Group_1__0 )* ) )
            // InternalAltarica.g:5550:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            {
            // InternalAltarica.g:5550:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            // InternalAltarica.g:5551:1: ( rule__LogicalAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5552:1: ( rule__LogicalAnd__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==67) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAltarica.g:5552:2: rule__LogicalAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__LogicalAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAltarica.g:5566:1: rule__LogicalAnd__Group_1__0 : rule__LogicalAnd__Group_1__0__Impl rule__LogicalAnd__Group_1__1 ;
    public final void rule__LogicalAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5570:1: ( rule__LogicalAnd__Group_1__0__Impl rule__LogicalAnd__Group_1__1 )
            // InternalAltarica.g:5571:2: rule__LogicalAnd__Group_1__0__Impl rule__LogicalAnd__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__LogicalAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalAnd__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAltarica.g:5578:1: rule__LogicalAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5582:1: ( ( () ) )
            // InternalAltarica.g:5583:1: ( () )
            {
            // InternalAltarica.g:5583:1: ( () )
            // InternalAltarica.g:5584:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0()); 
            }
            // InternalAltarica.g:5585:1: ()
            // InternalAltarica.g:5587:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1__1"
    // InternalAltarica.g:5597:1: rule__LogicalAnd__Group_1__1 : rule__LogicalAnd__Group_1__1__Impl rule__LogicalAnd__Group_1__2 ;
    public final void rule__LogicalAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5601:1: ( rule__LogicalAnd__Group_1__1__Impl rule__LogicalAnd__Group_1__2 )
            // InternalAltarica.g:5602:2: rule__LogicalAnd__Group_1__1__Impl rule__LogicalAnd__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__LogicalAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LogicalAnd__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__1"


    // $ANTLR start "rule__LogicalAnd__Group_1__1__Impl"
    // InternalAltarica.g:5609:1: rule__LogicalAnd__Group_1__1__Impl : ( ( rule__LogicalAnd__OpAssignment_1_1 ) ) ;
    public final void rule__LogicalAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5613:1: ( ( ( rule__LogicalAnd__OpAssignment_1_1 ) ) )
            // InternalAltarica.g:5614:1: ( ( rule__LogicalAnd__OpAssignment_1_1 ) )
            {
            // InternalAltarica.g:5614:1: ( ( rule__LogicalAnd__OpAssignment_1_1 ) )
            // InternalAltarica.g:5615:1: ( rule__LogicalAnd__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAssignment_1_1()); 
            }
            // InternalAltarica.g:5616:1: ( rule__LogicalAnd__OpAssignment_1_1 )
            // InternalAltarica.g:5616:2: rule__LogicalAnd__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAnd__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAnd__Group_1__2"
    // InternalAltarica.g:5626:1: rule__LogicalAnd__Group_1__2 : rule__LogicalAnd__Group_1__2__Impl ;
    public final void rule__LogicalAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5630:1: ( rule__LogicalAnd__Group_1__2__Impl )
            // InternalAltarica.g:5631:2: rule__LogicalAnd__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAnd__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__2"


    // $ANTLR start "rule__LogicalAnd__Group_1__2__Impl"
    // InternalAltarica.g:5637:1: rule__LogicalAnd__Group_1__2__Impl : ( ( rule__LogicalAnd__RightAssignment_1_2 ) ) ;
    public final void rule__LogicalAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5641:1: ( ( ( rule__LogicalAnd__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:5642:1: ( ( rule__LogicalAnd__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:5642:1: ( ( rule__LogicalAnd__RightAssignment_1_2 ) )
            // InternalAltarica.g:5643:1: ( rule__LogicalAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:5644:1: ( rule__LogicalAnd__RightAssignment_1_2 )
            // InternalAltarica.g:5644:2: rule__LogicalAnd__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicalAnd__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__Group_1__2__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalAltarica.g:5660:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5664:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalAltarica.g:5665:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Relation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5672:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5676:1: ( ( ruleAddition ) )
            // InternalAltarica.g:5677:1: ( ruleAddition )
            {
            // InternalAltarica.g:5677:1: ( ruleAddition )
            // InternalAltarica.g:5678:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5689:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5693:1: ( rule__Relation__Group__1__Impl )
            // InternalAltarica.g:5694:2: rule__Relation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5700:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )* ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5704:1: ( ( ( rule__Relation__Group_1__0 )* ) )
            // InternalAltarica.g:5705:1: ( ( rule__Relation__Group_1__0 )* )
            {
            // InternalAltarica.g:5705:1: ( ( rule__Relation__Group_1__0 )* )
            // InternalAltarica.g:5706:1: ( rule__Relation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5707:1: ( rule__Relation__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=16 && LA35_0<=21)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAltarica.g:5707:2: rule__Relation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Relation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAltarica.g:5721:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5725:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalAltarica.g:5726:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_47);
            rule__Relation__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAltarica.g:5733:1: rule__Relation__Group_1__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5737:1: ( ( () ) )
            // InternalAltarica.g:5738:1: ( () )
            {
            // InternalAltarica.g:5738:1: ( () )
            // InternalAltarica.g:5739:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getEqualLeftAction_1_0()); 
            }
            // InternalAltarica.g:5740:1: ()
            // InternalAltarica.g:5742:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getEqualLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1__1"
    // InternalAltarica.g:5752:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5756:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalAltarica.g:5757:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Relation__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1"


    // $ANTLR start "rule__Relation__Group_1__1__Impl"
    // InternalAltarica.g:5764:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__OpAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5768:1: ( ( ( rule__Relation__OpAssignment_1_1 ) ) )
            // InternalAltarica.g:5769:1: ( ( rule__Relation__OpAssignment_1_1 ) )
            {
            // InternalAltarica.g:5769:1: ( ( rule__Relation__OpAssignment_1_1 ) )
            // InternalAltarica.g:5770:1: ( rule__Relation__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAssignment_1_1()); 
            }
            // InternalAltarica.g:5771:1: ( rule__Relation__OpAssignment_1_1 )
            // InternalAltarica.g:5771:2: rule__Relation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1__Impl"


    // $ANTLR start "rule__Relation__Group_1__2"
    // InternalAltarica.g:5781:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5785:1: ( rule__Relation__Group_1__2__Impl )
            // InternalAltarica.g:5786:2: rule__Relation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__2"


    // $ANTLR start "rule__Relation__Group_1__2__Impl"
    // InternalAltarica.g:5792:1: rule__Relation__Group_1__2__Impl : ( ( rule__Relation__RightAssignment_1_2 ) ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5796:1: ( ( ( rule__Relation__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:5797:1: ( ( rule__Relation__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:5797:1: ( ( rule__Relation__RightAssignment_1_2 ) )
            // InternalAltarica.g:5798:1: ( rule__Relation__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:5799:1: ( rule__Relation__RightAssignment_1_2 )
            // InternalAltarica.g:5799:2: rule__Relation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__2__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalAltarica.g:5815:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5819:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalAltarica.g:5820:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5827:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5831:1: ( ( ruleMultiplication ) )
            // InternalAltarica.g:5832:1: ( ruleMultiplication )
            {
            // InternalAltarica.g:5832:1: ( ruleMultiplication )
            // InternalAltarica.g:5833:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5844:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5848:1: ( rule__Addition__Group__1__Impl )
            // InternalAltarica.g:5849:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5855:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5859:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalAltarica.g:5860:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalAltarica.g:5860:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalAltarica.g:5861:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5862:1: ( rule__Addition__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=22 && LA36_0<=23)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAltarica.g:5862:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAltarica.g:5876:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5880:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalAltarica.g:5881:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAltarica.g:5888:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5892:1: ( ( () ) )
            // InternalAltarica.g:5893:1: ( () )
            {
            // InternalAltarica.g:5893:1: ( () )
            // InternalAltarica.g:5894:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            }
            // InternalAltarica.g:5895:1: ()
            // InternalAltarica.g:5897:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalAltarica.g:5907:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5911:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalAltarica.g:5912:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalAltarica.g:5919:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__OpAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5923:1: ( ( ( rule__Addition__OpAssignment_1_1 ) ) )
            // InternalAltarica.g:5924:1: ( ( rule__Addition__OpAssignment_1_1 ) )
            {
            // InternalAltarica.g:5924:1: ( ( rule__Addition__OpAssignment_1_1 ) )
            // InternalAltarica.g:5925:1: ( rule__Addition__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAssignment_1_1()); 
            }
            // InternalAltarica.g:5926:1: ( rule__Addition__OpAssignment_1_1 )
            // InternalAltarica.g:5926:2: rule__Addition__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalAltarica.g:5936:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5940:1: ( rule__Addition__Group_1__2__Impl )
            // InternalAltarica.g:5941:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalAltarica.g:5947:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5951:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:5952:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:5952:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalAltarica.g:5953:1: ( rule__Addition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:5954:1: ( rule__Addition__RightAssignment_1_2 )
            // InternalAltarica.g:5954:2: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalAltarica.g:5970:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5974:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalAltarica.g:5975:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5982:1: rule__Multiplication__Group__0__Impl : ( ruleNeg ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5986:1: ( ( ruleNeg ) )
            // InternalAltarica.g:5987:1: ( ruleNeg )
            {
            // InternalAltarica.g:5987:1: ( ruleNeg )
            // InternalAltarica.g:5988:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5999:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6003:1: ( rule__Multiplication__Group__1__Impl )
            // InternalAltarica.g:6004:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6010:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6014:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalAltarica.g:6015:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalAltarica.g:6015:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalAltarica.g:6016:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalAltarica.g:6017:1: ( rule__Multiplication__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=24 && LA37_0<=25)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAltarica.g:6017:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAltarica.g:6031:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6035:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalAltarica.g:6036:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_51);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAltarica.g:6043:1: rule__Multiplication__Group_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6047:1: ( ( () ) )
            // InternalAltarica.g:6048:1: ( () )
            {
            // InternalAltarica.g:6048:1: ( () )
            // InternalAltarica.g:6049:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            }
            // InternalAltarica.g:6050:1: ()
            // InternalAltarica.g:6052:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalAltarica.g:6062:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6066:1: ( rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2 )
            // InternalAltarica.g:6067:2: rule__Multiplication__Group_1__1__Impl rule__Multiplication__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalAltarica.g:6074:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__OpAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6078:1: ( ( ( rule__Multiplication__OpAssignment_1_1 ) ) )
            // InternalAltarica.g:6079:1: ( ( rule__Multiplication__OpAssignment_1_1 ) )
            {
            // InternalAltarica.g:6079:1: ( ( rule__Multiplication__OpAssignment_1_1 ) )
            // InternalAltarica.g:6080:1: ( rule__Multiplication__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_1()); 
            }
            // InternalAltarica.g:6081:1: ( rule__Multiplication__OpAssignment_1_1 )
            // InternalAltarica.g:6081:2: rule__Multiplication__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__2"
    // InternalAltarica.g:6091:1: rule__Multiplication__Group_1__2 : rule__Multiplication__Group_1__2__Impl ;
    public final void rule__Multiplication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6095:1: ( rule__Multiplication__Group_1__2__Impl )
            // InternalAltarica.g:6096:2: rule__Multiplication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2"


    // $ANTLR start "rule__Multiplication__Group_1__2__Impl"
    // InternalAltarica.g:6102:1: rule__Multiplication__Group_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_2 ) ) ;
    public final void rule__Multiplication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6106:1: ( ( ( rule__Multiplication__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:6107:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:6107:1: ( ( rule__Multiplication__RightAssignment_1_2 ) )
            // InternalAltarica.g:6108:1: ( rule__Multiplication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:6109:1: ( rule__Multiplication__RightAssignment_1_2 )
            // InternalAltarica.g:6109:2: rule__Multiplication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__2__Impl"


    // $ANTLR start "rule__Neg__Group_0__0"
    // InternalAltarica.g:6125:1: rule__Neg__Group_0__0 : rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 ;
    public final void rule__Neg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6129:1: ( rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 )
            // InternalAltarica.g:6130:2: rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1
            {
            pushFollow(FOLLOW_53);
            rule__Neg__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6137:1: rule__Neg__Group_0__0__Impl : ( () ) ;
    public final void rule__Neg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6141:1: ( ( () ) )
            // InternalAltarica.g:6142:1: ( () )
            {
            // InternalAltarica.g:6142:1: ( () )
            // InternalAltarica.g:6143:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }
            // InternalAltarica.g:6144:1: ()
            // InternalAltarica.g:6146:1: 
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
    // InternalAltarica.g:6156:1: rule__Neg__Group_0__1 : rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 ;
    public final void rule__Neg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6160:1: ( rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 )
            // InternalAltarica.g:6161:2: rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Neg__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6168:1: rule__Neg__Group_0__1__Impl : ( ( 'not' ) ) ;
    public final void rule__Neg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6172:1: ( ( ( 'not' ) ) )
            // InternalAltarica.g:6173:1: ( ( 'not' ) )
            {
            // InternalAltarica.g:6173:1: ( ( 'not' ) )
            // InternalAltarica.g:6174:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }
            // InternalAltarica.g:6175:1: ( 'not' )
            // InternalAltarica.g:6176:2: 'not'
            {
            match(input,62,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:6187:1: rule__Neg__Group_0__2 : rule__Neg__Group_0__2__Impl ;
    public final void rule__Neg__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6191:1: ( rule__Neg__Group_0__2__Impl )
            // InternalAltarica.g:6192:2: rule__Neg__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6198:1: rule__Neg__Group_0__2__Impl : ( ( rule__Neg__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Neg__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6202:1: ( ( ( rule__Neg__ExpressionAssignment_0_2 ) ) )
            // InternalAltarica.g:6203:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            {
            // InternalAltarica.g:6203:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            // InternalAltarica.g:6204:1: ( rule__Neg__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }
            // InternalAltarica.g:6205:1: ( rule__Neg__ExpressionAssignment_0_2 )
            // InternalAltarica.g:6205:2: rule__Neg__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6221:1: rule__Neg__Group_1__0 : rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 ;
    public final void rule__Neg__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6225:1: ( rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 )
            // InternalAltarica.g:6226:2: rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1
            {
            pushFollow(FOLLOW_54);
            rule__Neg__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6233:1: rule__Neg__Group_1__0__Impl : ( () ) ;
    public final void rule__Neg__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6237:1: ( ( () ) )
            // InternalAltarica.g:6238:1: ( () )
            {
            // InternalAltarica.g:6238:1: ( () )
            // InternalAltarica.g:6239:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }
            // InternalAltarica.g:6240:1: ()
            // InternalAltarica.g:6242:1: 
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
    // InternalAltarica.g:6252:1: rule__Neg__Group_1__1 : rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 ;
    public final void rule__Neg__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6256:1: ( rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 )
            // InternalAltarica.g:6257:2: rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Neg__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6264:1: rule__Neg__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Neg__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6268:1: ( ( ( '-' ) ) )
            // InternalAltarica.g:6269:1: ( ( '-' ) )
            {
            // InternalAltarica.g:6269:1: ( ( '-' ) )
            // InternalAltarica.g:6270:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }
            // InternalAltarica.g:6271:1: ( '-' )
            // InternalAltarica.g:6272:2: '-'
            {
            match(input,23,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:6283:1: rule__Neg__Group_1__2 : rule__Neg__Group_1__2__Impl ;
    public final void rule__Neg__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6287:1: ( rule__Neg__Group_1__2__Impl )
            // InternalAltarica.g:6288:2: rule__Neg__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6294:1: rule__Neg__Group_1__2__Impl : ( ( rule__Neg__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Neg__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6298:1: ( ( ( rule__Neg__ExpressionAssignment_1_2 ) ) )
            // InternalAltarica.g:6299:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            {
            // InternalAltarica.g:6299:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            // InternalAltarica.g:6300:1: ( rule__Neg__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }
            // InternalAltarica.g:6301:1: ( rule__Neg__ExpressionAssignment_1_2 )
            // InternalAltarica.g:6301:2: rule__Neg__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Atom__Group_6__0"
    // InternalAltarica.g:6317:1: rule__Atom__Group_6__0 : rule__Atom__Group_6__0__Impl rule__Atom__Group_6__1 ;
    public final void rule__Atom__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6321:1: ( rule__Atom__Group_6__0__Impl rule__Atom__Group_6__1 )
            // InternalAltarica.g:6322:2: rule__Atom__Group_6__0__Impl rule__Atom__Group_6__1
            {
            pushFollow(FOLLOW_24);
            rule__Atom__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_6__0"


    // $ANTLR start "rule__Atom__Group_6__0__Impl"
    // InternalAltarica.g:6329:1: rule__Atom__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6333:1: ( ( '(' ) )
            // InternalAltarica.g:6334:1: ( '(' )
            {
            // InternalAltarica.g:6334:1: ( '(' )
            // InternalAltarica.g:6335:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_6__0__Impl"


    // $ANTLR start "rule__Atom__Group_6__1"
    // InternalAltarica.g:6348:1: rule__Atom__Group_6__1 : rule__Atom__Group_6__1__Impl rule__Atom__Group_6__2 ;
    public final void rule__Atom__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6352:1: ( rule__Atom__Group_6__1__Impl rule__Atom__Group_6__2 )
            // InternalAltarica.g:6353:2: rule__Atom__Group_6__1__Impl rule__Atom__Group_6__2
            {
            pushFollow(FOLLOW_55);
            rule__Atom__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_6__1"


    // $ANTLR start "rule__Atom__Group_6__1__Impl"
    // InternalAltarica.g:6360:1: rule__Atom__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__Atom__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6364:1: ( ( ruleExpression ) )
            // InternalAltarica.g:6365:1: ( ruleExpression )
            {
            // InternalAltarica.g:6365:1: ( ruleExpression )
            // InternalAltarica.g:6366:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExpressionParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getExpressionParserRuleCall_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_6__1__Impl"


    // $ANTLR start "rule__Atom__Group_6__2"
    // InternalAltarica.g:6377:1: rule__Atom__Group_6__2 : rule__Atom__Group_6__2__Impl ;
    public final void rule__Atom__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6381:1: ( rule__Atom__Group_6__2__Impl )
            // InternalAltarica.g:6382:2: rule__Atom__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_6__2"


    // $ANTLR start "rule__Atom__Group_6__2__Impl"
    // InternalAltarica.g:6388:1: rule__Atom__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6392:1: ( ( ')' ) )
            // InternalAltarica.g:6393:1: ( ')' )
            {
            // InternalAltarica.g:6393:1: ( ')' )
            // InternalAltarica.g:6394:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_6__2__Impl"


    // $ANTLR start "rule__NameRef__Group__0"
    // InternalAltarica.g:6413:1: rule__NameRef__Group__0 : rule__NameRef__Group__0__Impl rule__NameRef__Group__1 ;
    public final void rule__NameRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6417:1: ( rule__NameRef__Group__0__Impl rule__NameRef__Group__1 )
            // InternalAltarica.g:6418:2: rule__NameRef__Group__0__Impl rule__NameRef__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__NameRef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6425:1: rule__NameRef__Group__0__Impl : ( ( rule__NameRef__VariableAssignment_0 ) ) ;
    public final void rule__NameRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6429:1: ( ( ( rule__NameRef__VariableAssignment_0 ) ) )
            // InternalAltarica.g:6430:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            {
            // InternalAltarica.g:6430:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            // InternalAltarica.g:6431:1: ( rule__NameRef__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }
            // InternalAltarica.g:6432:1: ( rule__NameRef__VariableAssignment_0 )
            // InternalAltarica.g:6432:2: rule__NameRef__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6442:1: rule__NameRef__Group__1 : rule__NameRef__Group__1__Impl ;
    public final void rule__NameRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6446:1: ( rule__NameRef__Group__1__Impl )
            // InternalAltarica.g:6447:2: rule__NameRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6453:1: rule__NameRef__Group__1__Impl : ( ( rule__NameRef__Group_1__0 )* ) ;
    public final void rule__NameRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6457:1: ( ( ( rule__NameRef__Group_1__0 )* ) )
            // InternalAltarica.g:6458:1: ( ( rule__NameRef__Group_1__0 )* )
            {
            // InternalAltarica.g:6458:1: ( ( rule__NameRef__Group_1__0 )* )
            // InternalAltarica.g:6459:1: ( rule__NameRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1()); 
            }
            // InternalAltarica.g:6460:1: ( rule__NameRef__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==63) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAltarica.g:6460:2: rule__NameRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__NameRef__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalAltarica.g:6474:1: rule__NameRef__Group_1__0 : rule__NameRef__Group_1__0__Impl ;
    public final void rule__NameRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6478:1: ( rule__NameRef__Group_1__0__Impl )
            // InternalAltarica.g:6479:2: rule__NameRef__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6485:1: rule__NameRef__Group_1__0__Impl : ( ( rule__NameRef__Group_1_0__0 ) ) ;
    public final void rule__NameRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6489:1: ( ( ( rule__NameRef__Group_1_0__0 ) ) )
            // InternalAltarica.g:6490:1: ( ( rule__NameRef__Group_1_0__0 ) )
            {
            // InternalAltarica.g:6490:1: ( ( rule__NameRef__Group_1_0__0 ) )
            // InternalAltarica.g:6491:1: ( rule__NameRef__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:6492:1: ( rule__NameRef__Group_1_0__0 )
            // InternalAltarica.g:6492:2: rule__NameRef__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6504:1: rule__NameRef__Group_1_0__0 : rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 ;
    public final void rule__NameRef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6508:1: ( rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 )
            // InternalAltarica.g:6509:2: rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1
            {
            pushFollow(FOLLOW_56);
            rule__NameRef__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6516:1: rule__NameRef__Group_1_0__0__Impl : ( () ) ;
    public final void rule__NameRef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6520:1: ( ( () ) )
            // InternalAltarica.g:6521:1: ( () )
            {
            // InternalAltarica.g:6521:1: ( () )
            // InternalAltarica.g:6522:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }
            // InternalAltarica.g:6523:1: ()
            // InternalAltarica.g:6525:1: 
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
    // InternalAltarica.g:6535:1: rule__NameRef__Group_1_0__1 : rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 ;
    public final void rule__NameRef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6539:1: ( rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 )
            // InternalAltarica.g:6540:2: rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
            rule__NameRef__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6547:1: rule__NameRef__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__NameRef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6551:1: ( ( '.' ) )
            // InternalAltarica.g:6552:1: ( '.' )
            {
            // InternalAltarica.g:6552:1: ( '.' )
            // InternalAltarica.g:6553:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6566:1: rule__NameRef__Group_1_0__2 : rule__NameRef__Group_1_0__2__Impl ;
    public final void rule__NameRef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6570:1: ( rule__NameRef__Group_1_0__2__Impl )
            // InternalAltarica.g:6571:2: rule__NameRef__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6577:1: rule__NameRef__Group_1_0__2__Impl : ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) ;
    public final void rule__NameRef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6581:1: ( ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) )
            // InternalAltarica.g:6582:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:6582:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            // InternalAltarica.g:6583:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }
            // InternalAltarica.g:6584:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            // InternalAltarica.g:6584:2: rule__NameRef__VariableAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6600:1: rule__SwitchExpression__Group__0 : rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 ;
    public final void rule__SwitchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6604:1: ( rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 )
            // InternalAltarica.g:6605:2: rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SwitchExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6612:1: rule__SwitchExpression__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6616:1: ( ( 'switch' ) )
            // InternalAltarica.g:6617:1: ( 'switch' )
            {
            // InternalAltarica.g:6617:1: ( 'switch' )
            // InternalAltarica.g:6618:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6631:1: rule__SwitchExpression__Group__1 : rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 ;
    public final void rule__SwitchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6635:1: ( rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 )
            // InternalAltarica.g:6636:2: rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__SwitchExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6643:1: rule__SwitchExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SwitchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6647:1: ( ( '{' ) )
            // InternalAltarica.g:6648:1: ( '{' )
            {
            // InternalAltarica.g:6648:1: ( '{' )
            // InternalAltarica.g:6649:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6662:1: rule__SwitchExpression__Group__2 : rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 ;
    public final void rule__SwitchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6666:1: ( rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 )
            // InternalAltarica.g:6667:2: rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3
            {
            pushFollow(FOLLOW_58);
            rule__SwitchExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6674:1: rule__SwitchExpression__Group__2__Impl : ( ( rule__SwitchExpression__CasesAssignment_2 )* ) ;
    public final void rule__SwitchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6678:1: ( ( ( rule__SwitchExpression__CasesAssignment_2 )* ) )
            // InternalAltarica.g:6679:1: ( ( rule__SwitchExpression__CasesAssignment_2 )* )
            {
            // InternalAltarica.g:6679:1: ( ( rule__SwitchExpression__CasesAssignment_2 )* )
            // InternalAltarica.g:6680:1: ( rule__SwitchExpression__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getCasesAssignment_2()); 
            }
            // InternalAltarica.g:6681:1: ( rule__SwitchExpression__CasesAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==65) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAltarica.g:6681:2: rule__SwitchExpression__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__SwitchExpression__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalAltarica.g:6691:1: rule__SwitchExpression__Group__3 : rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4 ;
    public final void rule__SwitchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6695:1: ( rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4 )
            // InternalAltarica.g:6696:2: rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__SwitchExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6703:1: rule__SwitchExpression__Group__3__Impl : ( 'default' ) ;
    public final void rule__SwitchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6707:1: ( ( 'default' ) )
            // InternalAltarica.g:6708:1: ( 'default' )
            {
            // InternalAltarica.g:6708:1: ( 'default' )
            // InternalAltarica.g:6709:1: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_3()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_3()); 
            }

            }


            }

        }
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
    // InternalAltarica.g:6722:1: rule__SwitchExpression__Group__4 : rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5 ;
    public final void rule__SwitchExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6726:1: ( rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5 )
            // InternalAltarica.g:6727:2: rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__SwitchExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6734:1: rule__SwitchExpression__Group__4__Impl : ( ':' ) ;
    public final void rule__SwitchExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6738:1: ( ( ':' ) )
            // InternalAltarica.g:6739:1: ( ':' )
            {
            // InternalAltarica.g:6739:1: ( ':' )
            // InternalAltarica.g:6740:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getColonKeyword_4()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6753:1: rule__SwitchExpression__Group__5 : rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6 ;
    public final void rule__SwitchExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6757:1: ( rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6 )
            // InternalAltarica.g:6758:2: rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__SwitchExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6765:1: rule__SwitchExpression__Group__5__Impl : ( ( rule__SwitchExpression__DefaultAssignment_5 ) ) ;
    public final void rule__SwitchExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6769:1: ( ( ( rule__SwitchExpression__DefaultAssignment_5 ) ) )
            // InternalAltarica.g:6770:1: ( ( rule__SwitchExpression__DefaultAssignment_5 ) )
            {
            // InternalAltarica.g:6770:1: ( ( rule__SwitchExpression__DefaultAssignment_5 ) )
            // InternalAltarica.g:6771:1: ( rule__SwitchExpression__DefaultAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultAssignment_5()); 
            }
            // InternalAltarica.g:6772:1: ( rule__SwitchExpression__DefaultAssignment_5 )
            // InternalAltarica.g:6772:2: rule__SwitchExpression__DefaultAssignment_5
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6782:1: rule__SwitchExpression__Group__6 : rule__SwitchExpression__Group__6__Impl ;
    public final void rule__SwitchExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6786:1: ( rule__SwitchExpression__Group__6__Impl )
            // InternalAltarica.g:6787:2: rule__SwitchExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6793:1: rule__SwitchExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__SwitchExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6797:1: ( ( '}' ) )
            // InternalAltarica.g:6798:1: ( '}' )
            {
            // InternalAltarica.g:6798:1: ( '}' )
            // InternalAltarica.g:6799:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6826:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6830:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // InternalAltarica.g:6831:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__CaseExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6838:1: rule__CaseExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6842:1: ( ( 'case' ) )
            // InternalAltarica.g:6843:1: ( 'case' )
            {
            // InternalAltarica.g:6843:1: ( 'case' )
            // InternalAltarica.g:6844:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
            }

            }


            }

        }
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
    // InternalAltarica.g:6857:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6861:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // InternalAltarica.g:6862:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__CaseExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6869:1: rule__CaseExpression__Group__1__Impl : ( ( rule__CaseExpression__ConditionAssignment_1 ) ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6873:1: ( ( ( rule__CaseExpression__ConditionAssignment_1 ) ) )
            // InternalAltarica.g:6874:1: ( ( rule__CaseExpression__ConditionAssignment_1 ) )
            {
            // InternalAltarica.g:6874:1: ( ( rule__CaseExpression__ConditionAssignment_1 ) )
            // InternalAltarica.g:6875:1: ( rule__CaseExpression__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionAssignment_1()); 
            }
            // InternalAltarica.g:6876:1: ( rule__CaseExpression__ConditionAssignment_1 )
            // InternalAltarica.g:6876:2: rule__CaseExpression__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CaseExpression__ConditionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getConditionAssignment_1()); 
            }

            }


            }

        }
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
    // InternalAltarica.g:6886:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6890:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // InternalAltarica.g:6891:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__CaseExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6898:1: rule__CaseExpression__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6902:1: ( ( ':' ) )
            // InternalAltarica.g:6903:1: ( ':' )
            {
            // InternalAltarica.g:6903:1: ( ':' )
            // InternalAltarica.g:6904:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getColonKeyword_2()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
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
    // InternalAltarica.g:6917:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6921:1: ( rule__CaseExpression__Group__3__Impl )
            // InternalAltarica.g:6922:2: rule__CaseExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:6928:1: rule__CaseExpression__Group__3__Impl : ( ( rule__CaseExpression__CaseAssignment_3 ) ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6932:1: ( ( ( rule__CaseExpression__CaseAssignment_3 ) ) )
            // InternalAltarica.g:6933:1: ( ( rule__CaseExpression__CaseAssignment_3 ) )
            {
            // InternalAltarica.g:6933:1: ( ( rule__CaseExpression__CaseAssignment_3 ) )
            // InternalAltarica.g:6934:1: ( rule__CaseExpression__CaseAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
            }
            // InternalAltarica.g:6935:1: ( rule__CaseExpression__CaseAssignment_3 )
            // InternalAltarica.g:6935:2: rule__CaseExpression__CaseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CaseExpression__CaseAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__FunctionCall__Group__0"
    // InternalAltarica.g:6953:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6957:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalAltarica.g:6958:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // InternalAltarica.g:6965:1: rule__FunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6969:1: ( ( () ) )
            // InternalAltarica.g:6970:1: ( () )
            {
            // InternalAltarica.g:6970:1: ( () )
            // InternalAltarica.g:6971:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }
            // InternalAltarica.g:6972:1: ()
            // InternalAltarica.g:6974:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // InternalAltarica.g:6984:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6988:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalAltarica.g:6989:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_60);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // InternalAltarica.g:6996:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__NameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7000:1: ( ( ( rule__FunctionCall__NameAssignment_1 ) ) )
            // InternalAltarica.g:7001:1: ( ( rule__FunctionCall__NameAssignment_1 ) )
            {
            // InternalAltarica.g:7001:1: ( ( rule__FunctionCall__NameAssignment_1 ) )
            // InternalAltarica.g:7002:1: ( rule__FunctionCall__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getNameAssignment_1()); 
            }
            // InternalAltarica.g:7003:1: ( rule__FunctionCall__NameAssignment_1 )
            // InternalAltarica.g:7003:2: rule__FunctionCall__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // InternalAltarica.g:7013:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7017:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalAltarica.g:7018:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_61);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // InternalAltarica.g:7025:1: rule__FunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7029:1: ( ( '(' ) )
            // InternalAltarica.g:7030:1: ( '(' )
            {
            // InternalAltarica.g:7030:1: ( '(' )
            // InternalAltarica.g:7031:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // InternalAltarica.g:7044:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7048:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalAltarica.g:7049:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_61);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // InternalAltarica.g:7056:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__Group_3__0 )? ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7060:1: ( ( ( rule__FunctionCall__Group_3__0 )? ) )
            // InternalAltarica.g:7061:1: ( ( rule__FunctionCall__Group_3__0 )? )
            {
            // InternalAltarica.g:7061:1: ( ( rule__FunctionCall__Group_3__0 )? )
            // InternalAltarica.g:7062:1: ( rule__FunctionCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            }
            // InternalAltarica.g:7063:1: ( rule__FunctionCall__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_NUMBER)||LA40_0==23||(LA40_0>=26 && LA40_0<=30)||LA40_0==46||(LA40_0>=61 && LA40_0<=62)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAltarica.g:7063:2: rule__FunctionCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionCall__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__4"
    // InternalAltarica.g:7073:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7077:1: ( rule__FunctionCall__Group__4__Impl )
            // InternalAltarica.g:7078:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // InternalAltarica.g:7084:1: rule__FunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7088:1: ( ( ')' ) )
            // InternalAltarica.g:7089:1: ( ')' )
            {
            // InternalAltarica.g:7089:1: ( ')' )
            // InternalAltarica.g:7090:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__0"
    // InternalAltarica.g:7113:1: rule__FunctionCall__Group_3__0 : rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 ;
    public final void rule__FunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7117:1: ( rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 )
            // InternalAltarica.g:7118:2: rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__FunctionCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0"


    // $ANTLR start "rule__FunctionCall__Group_3__0__Impl"
    // InternalAltarica.g:7125:1: rule__FunctionCall__Group_3__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_3_0 ) ) ;
    public final void rule__FunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7129:1: ( ( ( rule__FunctionCall__ParametersAssignment_3_0 ) ) )
            // InternalAltarica.g:7130:1: ( ( rule__FunctionCall__ParametersAssignment_3_0 ) )
            {
            // InternalAltarica.g:7130:1: ( ( rule__FunctionCall__ParametersAssignment_3_0 ) )
            // InternalAltarica.g:7131:1: ( rule__FunctionCall__ParametersAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_0()); 
            }
            // InternalAltarica.g:7132:1: ( rule__FunctionCall__ParametersAssignment_3_0 )
            // InternalAltarica.g:7132:2: rule__FunctionCall__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__1"
    // InternalAltarica.g:7142:1: rule__FunctionCall__Group_3__1 : rule__FunctionCall__Group_3__1__Impl ;
    public final void rule__FunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7146:1: ( rule__FunctionCall__Group_3__1__Impl )
            // InternalAltarica.g:7147:2: rule__FunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1"


    // $ANTLR start "rule__FunctionCall__Group_3__1__Impl"
    // InternalAltarica.g:7153:1: rule__FunctionCall__Group_3__1__Impl : ( ( rule__FunctionCall__Group_3_1__0 )* ) ;
    public final void rule__FunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7157:1: ( ( ( rule__FunctionCall__Group_3_1__0 )* ) )
            // InternalAltarica.g:7158:1: ( ( rule__FunctionCall__Group_3_1__0 )* )
            {
            // InternalAltarica.g:7158:1: ( ( rule__FunctionCall__Group_3_1__0 )* )
            // InternalAltarica.g:7159:1: ( rule__FunctionCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_3_1()); 
            }
            // InternalAltarica.g:7160:1: ( rule__FunctionCall__Group_3_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==40) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAltarica.g:7160:2: rule__FunctionCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FunctionCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3_1__0"
    // InternalAltarica.g:7174:1: rule__FunctionCall__Group_3_1__0 : rule__FunctionCall__Group_3_1__0__Impl rule__FunctionCall__Group_3_1__1 ;
    public final void rule__FunctionCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7178:1: ( rule__FunctionCall__Group_3_1__0__Impl rule__FunctionCall__Group_3_1__1 )
            // InternalAltarica.g:7179:2: rule__FunctionCall__Group_3_1__0__Impl rule__FunctionCall__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
            rule__FunctionCall__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3_1__0"


    // $ANTLR start "rule__FunctionCall__Group_3_1__0__Impl"
    // InternalAltarica.g:7186:1: rule__FunctionCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7190:1: ( ( ',' ) )
            // InternalAltarica.g:7191:1: ( ',' )
            {
            // InternalAltarica.g:7191:1: ( ',' )
            // InternalAltarica.g:7192:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3_1__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3_1__1"
    // InternalAltarica.g:7205:1: rule__FunctionCall__Group_3_1__1 : rule__FunctionCall__Group_3_1__1__Impl ;
    public final void rule__FunctionCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7209:1: ( rule__FunctionCall__Group_3_1__1__Impl )
            // InternalAltarica.g:7210:2: rule__FunctionCall__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3_1__1"


    // $ANTLR start "rule__FunctionCall__Group_3_1__1__Impl"
    // InternalAltarica.g:7216:1: rule__FunctionCall__Group_3_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__FunctionCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7220:1: ( ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) ) )
            // InternalAltarica.g:7221:1: ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) )
            {
            // InternalAltarica.g:7221:1: ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) )
            // InternalAltarica.g:7222:1: ( rule__FunctionCall__ParametersAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1_1()); 
            }
            // InternalAltarica.g:7223:1: ( rule__FunctionCall__ParametersAssignment_3_1_1 )
            // InternalAltarica.g:7223:2: rule__FunctionCall__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__ParametersAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3_1__1__Impl"


    // $ANTLR start "rule__Error__Group__0"
    // InternalAltarica.g:7237:1: rule__Error__Group__0 : rule__Error__Group__0__Impl rule__Error__Group__1 ;
    public final void rule__Error__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7241:1: ( rule__Error__Group__0__Impl rule__Error__Group__1 )
            // InternalAltarica.g:7242:2: rule__Error__Group__0__Impl rule__Error__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__Error__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Error__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__0"


    // $ANTLR start "rule__Error__Group__0__Impl"
    // InternalAltarica.g:7249:1: rule__Error__Group__0__Impl : ( ( rule__Error__SeverityAssignment_0 ) ) ;
    public final void rule__Error__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7253:1: ( ( ( rule__Error__SeverityAssignment_0 ) ) )
            // InternalAltarica.g:7254:1: ( ( rule__Error__SeverityAssignment_0 ) )
            {
            // InternalAltarica.g:7254:1: ( ( rule__Error__SeverityAssignment_0 ) )
            // InternalAltarica.g:7255:1: ( rule__Error__SeverityAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getSeverityAssignment_0()); 
            }
            // InternalAltarica.g:7256:1: ( rule__Error__SeverityAssignment_0 )
            // InternalAltarica.g:7256:2: rule__Error__SeverityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Error__SeverityAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getSeverityAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__0__Impl"


    // $ANTLR start "rule__Error__Group__1"
    // InternalAltarica.g:7266:1: rule__Error__Group__1 : rule__Error__Group__1__Impl rule__Error__Group__2 ;
    public final void rule__Error__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7270:1: ( rule__Error__Group__1__Impl rule__Error__Group__2 )
            // InternalAltarica.g:7271:2: rule__Error__Group__1__Impl rule__Error__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Error__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Error__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__1"


    // $ANTLR start "rule__Error__Group__1__Impl"
    // InternalAltarica.g:7278:1: rule__Error__Group__1__Impl : ( ( rule__Error__MessageAssignment_1 ) ) ;
    public final void rule__Error__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7282:1: ( ( ( rule__Error__MessageAssignment_1 ) ) )
            // InternalAltarica.g:7283:1: ( ( rule__Error__MessageAssignment_1 ) )
            {
            // InternalAltarica.g:7283:1: ( ( rule__Error__MessageAssignment_1 ) )
            // InternalAltarica.g:7284:1: ( rule__Error__MessageAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getMessageAssignment_1()); 
            }
            // InternalAltarica.g:7285:1: ( rule__Error__MessageAssignment_1 )
            // InternalAltarica.g:7285:2: rule__Error__MessageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Error__MessageAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getMessageAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__1__Impl"


    // $ANTLR start "rule__Error__Group__2"
    // InternalAltarica.g:7295:1: rule__Error__Group__2 : rule__Error__Group__2__Impl ;
    public final void rule__Error__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7299:1: ( rule__Error__Group__2__Impl )
            // InternalAltarica.g:7300:2: rule__Error__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Error__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__2"


    // $ANTLR start "rule__Error__Group__2__Impl"
    // InternalAltarica.g:7306:1: rule__Error__Group__2__Impl : ( ';' ) ;
    public final void rule__Error__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7310:1: ( ( ';' ) )
            // InternalAltarica.g:7311:1: ( ';' )
            {
            // InternalAltarica.g:7311:1: ( ';' )
            // InternalAltarica.g:7312:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getSemicolonKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__Group__2__Impl"


    // $ANTLR start "rule__Model__ErrorsAssignment_1_3"
    // InternalAltarica.g:7332:1: rule__Model__ErrorsAssignment_1_3 : ( ruleError ) ;
    public final void rule__Model__ErrorsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7336:1: ( ( ruleError ) )
            // InternalAltarica.g:7337:1: ( ruleError )
            {
            // InternalAltarica.g:7337:1: ( ruleError )
            // InternalAltarica.g:7338:1: ruleError
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getErrorsErrorParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleError();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getErrorsErrorParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ErrorsAssignment_1_3"


    // $ANTLR start "rule__Model__DeclarationsAssignment_2"
    // InternalAltarica.g:7347:1: rule__Model__DeclarationsAssignment_2 : ( ruleAbstractDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7351:1: ( ( ruleAbstractDeclaration ) )
            // InternalAltarica.g:7352:1: ( ruleAbstractDeclaration )
            {
            // InternalAltarica.g:7352:1: ( ruleAbstractDeclaration )
            // InternalAltarica.g:7353:1: ruleAbstractDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment_2"


    // $ANTLR start "rule__Domain__NameAssignment_2"
    // InternalAltarica.g:7362:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7366:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7367:1: ( RULE_ID )
            {
            // InternalAltarica.g:7367:1: ( RULE_ID )
            // InternalAltarica.g:7368:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7377:1: rule__Domain__ConstantsAssignment_4_0 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7381:1: ( ( ruleSymbolicConstant ) )
            // InternalAltarica.g:7382:1: ( ruleSymbolicConstant )
            {
            // InternalAltarica.g:7382:1: ( ruleSymbolicConstant )
            // InternalAltarica.g:7383:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7392:1: rule__Domain__ConstantsAssignment_4_1_1 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7396:1: ( ( ruleSymbolicConstant ) )
            // InternalAltarica.g:7397:1: ( ruleSymbolicConstant )
            {
            // InternalAltarica.g:7397:1: ( ruleSymbolicConstant )
            // InternalAltarica.g:7398:1: ruleSymbolicConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7407:1: rule__SymbolicConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolicConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7411:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7412:1: ( RULE_ID )
            {
            // InternalAltarica.g:7412:1: ( RULE_ID )
            // InternalAltarica.g:7413:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7422:1: rule__BaseType__NameAssignment : ( ruleBaseTypeEnum ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7426:1: ( ( ruleBaseTypeEnum ) )
            // InternalAltarica.g:7427:1: ( ruleBaseTypeEnum )
            {
            // InternalAltarica.g:7427:1: ( ruleBaseTypeEnum )
            // InternalAltarica.g:7428:1: ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7437:1: rule__NamedType__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NamedType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7441:1: ( ( ( RULE_ID ) ) )
            // InternalAltarica.g:7442:1: ( ( RULE_ID ) )
            {
            // InternalAltarica.g:7442:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7443:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
            }
            // InternalAltarica.g:7444:1: ( RULE_ID )
            // InternalAltarica.g:7445:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7456:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7460:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7461:1: ( RULE_ID )
            {
            // InternalAltarica.g:7461:1: ( RULE_ID )
            // InternalAltarica.g:7462:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7471:1: rule__Class__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Class__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7475:1: ( ( ruleDeclaration ) )
            // InternalAltarica.g:7476:1: ( ruleDeclaration )
            {
            // InternalAltarica.g:7476:1: ( ruleDeclaration )
            // InternalAltarica.g:7477:1: ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7486:1: rule__Class__TransitionsAssignment_4_1 : ( ruleLabeledTransition ) ;
    public final void rule__Class__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7490:1: ( ( ruleLabeledTransition ) )
            // InternalAltarica.g:7491:1: ( ruleLabeledTransition )
            {
            // InternalAltarica.g:7491:1: ( ruleLabeledTransition )
            // InternalAltarica.g:7492:1: ruleLabeledTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7501:1: rule__Class__AssertionsAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Class__AssertionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7505:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7506:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7506:1: ( ruleInstruction )
            // InternalAltarica.g:7507:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7516:1: rule__VariableDeclaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7520:1: ( ( ruleType ) )
            // InternalAltarica.g:7521:1: ( ruleType )
            {
            // InternalAltarica.g:7521:1: ( ruleType )
            // InternalAltarica.g:7522:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7531:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7535:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7536:1: ( RULE_ID )
            {
            // InternalAltarica.g:7536:1: ( RULE_ID )
            // InternalAltarica.g:7537:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7546:1: rule__VariableDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7550:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7551:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7551:1: ( ruleAttribute )
            // InternalAltarica.g:7552:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7561:1: rule__VariableDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7565:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7566:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7566:1: ( ruleAttribute )
            // InternalAltarica.g:7567:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7576:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7580:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7581:1: ( RULE_ID )
            {
            // InternalAltarica.g:7581:1: ( RULE_ID )
            // InternalAltarica.g:7582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7591:1: rule__Attribute__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7595:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7596:1: ( ruleExpression )
            {
            // InternalAltarica.g:7596:1: ( ruleExpression )
            // InternalAltarica.g:7597:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7606:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7610:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7611:1: ( RULE_ID )
            {
            // InternalAltarica.g:7611:1: ( RULE_ID )
            // InternalAltarica.g:7612:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7621:1: rule__EventDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7625:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7626:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7626:1: ( ruleAttribute )
            // InternalAltarica.g:7627:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7636:1: rule__EventDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7640:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7641:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7641:1: ( ruleAttribute )
            // InternalAltarica.g:7642:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7651:1: rule__ParameterDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7655:1: ( ( ruleType ) )
            // InternalAltarica.g:7656:1: ( ruleType )
            {
            // InternalAltarica.g:7656:1: ( ruleType )
            // InternalAltarica.g:7657:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7666:1: rule__ParameterDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7670:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7671:1: ( RULE_ID )
            {
            // InternalAltarica.g:7671:1: ( RULE_ID )
            // InternalAltarica.g:7672:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7681:1: rule__ParameterDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ParameterDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7685:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7686:1: ( ruleExpression )
            {
            // InternalAltarica.g:7686:1: ( ruleExpression )
            // InternalAltarica.g:7687:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7696:1: rule__ObserverDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ObserverDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7700:1: ( ( ruleType ) )
            // InternalAltarica.g:7701:1: ( ruleType )
            {
            // InternalAltarica.g:7701:1: ( ruleType )
            // InternalAltarica.g:7702:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7711:1: rule__ObserverDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObserverDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7715:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7716:1: ( RULE_ID )
            {
            // InternalAltarica.g:7716:1: ( RULE_ID )
            // InternalAltarica.g:7717:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7726:1: rule__ObserverDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ObserverDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7730:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7731:1: ( ruleExpression )
            {
            // InternalAltarica.g:7731:1: ( ruleExpression )
            // InternalAltarica.g:7732:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7741:1: rule__LabeledTransition__EventAssignment_0 : ( ruleNameRef ) ;
    public final void rule__LabeledTransition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7745:1: ( ( ruleNameRef ) )
            // InternalAltarica.g:7746:1: ( ruleNameRef )
            {
            // InternalAltarica.g:7746:1: ( ruleNameRef )
            // InternalAltarica.g:7747:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7756:1: rule__LabeledTransition__ExpressionAssignment_2 : ( ruleTransitionAnd ) ;
    public final void rule__LabeledTransition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7760:1: ( ( ruleTransitionAnd ) )
            // InternalAltarica.g:7761:1: ( ruleTransitionAnd )
            {
            // InternalAltarica.g:7761:1: ( ruleTransitionAnd )
            // InternalAltarica.g:7762:1: ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7771:1: rule__TransitionAnd__RightAssignment_1_2 : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7775:1: ( ( ruleTransitionOr ) )
            // InternalAltarica.g:7776:1: ( ruleTransitionOr )
            {
            // InternalAltarica.g:7776:1: ( ruleTransitionOr )
            // InternalAltarica.g:7777:1: ruleTransitionOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7786:1: rule__TransitionOr__RightAssignment_1_2 : ( ruleTransition ) ;
    public final void rule__TransitionOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7790:1: ( ( ruleTransition ) )
            // InternalAltarica.g:7791:1: ( ruleTransition )
            {
            // InternalAltarica.g:7791:1: ( ruleTransition )
            // InternalAltarica.g:7792:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7801:1: rule__Transition__GuardAssignment_1 : ( ruleExpression ) ;
    public final void rule__Transition__GuardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7805:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7806:1: ( ruleExpression )
            {
            // InternalAltarica.g:7806:1: ( ruleExpression )
            // InternalAltarica.g:7807:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7816:1: rule__Transition__ActionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7820:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7821:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7821:1: ( ruleInstruction )
            // InternalAltarica.g:7822:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7831:1: rule__Assignment__VariableAssignment_1 : ( ruleNameRef ) ;
    public final void rule__Assignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7835:1: ( ( ruleNameRef ) )
            // InternalAltarica.g:7836:1: ( ruleNameRef )
            {
            // InternalAltarica.g:7836:1: ( ruleNameRef )
            // InternalAltarica.g:7837:1: ruleNameRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7846:1: rule__Assignment__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7850:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7851:1: ( ruleExpression )
            {
            // InternalAltarica.g:7851:1: ( ruleExpression )
            // InternalAltarica.g:7852:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7861:1: rule__Block__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7865:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7866:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7866:1: ( ruleInstruction )
            // InternalAltarica.g:7867:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7876:1: rule__Conditional__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7880:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7881:1: ( ruleExpression )
            {
            // InternalAltarica.g:7881:1: ( ruleExpression )
            // InternalAltarica.g:7882:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7891:1: rule__Conditional__ThenAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Conditional__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7895:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7896:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7896:1: ( ruleInstruction )
            // InternalAltarica.g:7897:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7906:1: rule__Conditional__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Conditional__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7910:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7911:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7911:1: ( ruleInstruction )
            // InternalAltarica.g:7912:1: ruleInstruction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7921:1: rule__Switch__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__Switch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7925:1: ( ( ruleCaseExpression ) )
            // InternalAltarica.g:7926:1: ( ruleCaseExpression )
            {
            // InternalAltarica.g:7926:1: ( ruleCaseExpression )
            // InternalAltarica.g:7927:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7936:1: rule__Switch__ElseAssignment_5 : ( ruleExpression ) ;
    public final void rule__Switch__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7940:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7941:1: ( ruleExpression )
            {
            // InternalAltarica.g:7941:1: ( ruleExpression )
            // InternalAltarica.g:7942:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__LogicalOr__OpAssignment_1_1"
    // InternalAltarica.g:7951:1: rule__LogicalOr__OpAssignment_1_1 : ( ( 'or' ) ) ;
    public final void rule__LogicalOr__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7955:1: ( ( ( 'or' ) ) )
            // InternalAltarica.g:7956:1: ( ( 'or' ) )
            {
            // InternalAltarica.g:7956:1: ( ( 'or' ) )
            // InternalAltarica.g:7957:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_1_0()); 
            }
            // InternalAltarica.g:7958:1: ( 'or' )
            // InternalAltarica.g:7959:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_1_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__OpAssignment_1_1"


    // $ANTLR start "rule__LogicalOr__RightAssignment_1_2"
    // InternalAltarica.g:7974:1: rule__LogicalOr__RightAssignment_1_2 : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7978:1: ( ( ruleLogicalAnd ) )
            // InternalAltarica.g:7979:1: ( ruleLogicalAnd )
            {
            // InternalAltarica.g:7979:1: ( ruleLogicalAnd )
            // InternalAltarica.g:7980:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOr__RightAssignment_1_2"


    // $ANTLR start "rule__LogicalAnd__OpAssignment_1_1"
    // InternalAltarica.g:7989:1: rule__LogicalAnd__OpAssignment_1_1 : ( ( 'and' ) ) ;
    public final void rule__LogicalAnd__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7993:1: ( ( ( 'and' ) ) )
            // InternalAltarica.g:7994:1: ( ( 'and' ) )
            {
            // InternalAltarica.g:7994:1: ( ( 'and' ) )
            // InternalAltarica.g:7995:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_1_0()); 
            }
            // InternalAltarica.g:7996:1: ( 'and' )
            // InternalAltarica.g:7997:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_1_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__OpAssignment_1_1"


    // $ANTLR start "rule__LogicalAnd__RightAssignment_1_2"
    // InternalAltarica.g:8012:1: rule__LogicalAnd__RightAssignment_1_2 : ( ruleRelation ) ;
    public final void rule__LogicalAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8016:1: ( ( ruleRelation ) )
            // InternalAltarica.g:8017:1: ( ruleRelation )
            {
            // InternalAltarica.g:8017:1: ( ruleRelation )
            // InternalAltarica.g:8018:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAnd__RightAssignment_1_2"


    // $ANTLR start "rule__Relation__OpAssignment_1_1"
    // InternalAltarica.g:8027:1: rule__Relation__OpAssignment_1_1 : ( ( rule__Relation__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Relation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8031:1: ( ( ( rule__Relation__OpAlternatives_1_1_0 ) ) )
            // InternalAltarica.g:8032:1: ( ( rule__Relation__OpAlternatives_1_1_0 ) )
            {
            // InternalAltarica.g:8032:1: ( ( rule__Relation__OpAlternatives_1_1_0 ) )
            // InternalAltarica.g:8033:1: ( rule__Relation__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalAltarica.g:8034:1: ( rule__Relation__OpAlternatives_1_1_0 )
            // InternalAltarica.g:8034:2: rule__Relation__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OpAssignment_1_1"


    // $ANTLR start "rule__Relation__RightAssignment_1_2"
    // InternalAltarica.g:8043:1: rule__Relation__RightAssignment_1_2 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8047:1: ( ( ruleAddition ) )
            // InternalAltarica.g:8048:1: ( ruleAddition )
            {
            // InternalAltarica.g:8048:1: ( ruleAddition )
            // InternalAltarica.g:8049:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__RightAssignment_1_2"


    // $ANTLR start "rule__Addition__OpAssignment_1_1"
    // InternalAltarica.g:8058:1: rule__Addition__OpAssignment_1_1 : ( ( rule__Addition__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Addition__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8062:1: ( ( ( rule__Addition__OpAlternatives_1_1_0 ) ) )
            // InternalAltarica.g:8063:1: ( ( rule__Addition__OpAlternatives_1_1_0 ) )
            {
            // InternalAltarica.g:8063:1: ( ( rule__Addition__OpAlternatives_1_1_0 ) )
            // InternalAltarica.g:8064:1: ( rule__Addition__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalAltarica.g:8065:1: ( rule__Addition__OpAlternatives_1_1_0 )
            // InternalAltarica.g:8065:2: rule__Addition__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__OpAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalAltarica.g:8074:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8078:1: ( ( ruleMultiplication ) )
            // InternalAltarica.g:8079:1: ( ruleMultiplication )
            {
            // InternalAltarica.g:8079:1: ( ruleMultiplication )
            // InternalAltarica.g:8080:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__Multiplication__OpAssignment_1_1"
    // InternalAltarica.g:8089:1: rule__Multiplication__OpAssignment_1_1 : ( ( rule__Multiplication__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8093:1: ( ( ( rule__Multiplication__OpAlternatives_1_1_0 ) ) )
            // InternalAltarica.g:8094:1: ( ( rule__Multiplication__OpAlternatives_1_1_0 ) )
            {
            // InternalAltarica.g:8094:1: ( ( rule__Multiplication__OpAlternatives_1_1_0 ) )
            // InternalAltarica.g:8095:1: ( rule__Multiplication__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalAltarica.g:8096:1: ( rule__Multiplication__OpAlternatives_1_1_0 )
            // InternalAltarica.g:8096:2: rule__Multiplication__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__OpAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_2"
    // InternalAltarica.g:8105:1: rule__Multiplication__RightAssignment_1_2 : ( ruleNeg ) ;
    public final void rule__Multiplication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8109:1: ( ( ruleNeg ) )
            // InternalAltarica.g:8110:1: ( ruleNeg )
            {
            // InternalAltarica.g:8110:1: ( ruleNeg )
            // InternalAltarica.g:8111:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_2"


    // $ANTLR start "rule__Neg__ExpressionAssignment_0_2"
    // InternalAltarica.g:8120:1: rule__Neg__ExpressionAssignment_0_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8124:1: ( ( ruleAtom ) )
            // InternalAltarica.g:8125:1: ( ruleAtom )
            {
            // InternalAltarica.g:8125:1: ( ruleAtom )
            // InternalAltarica.g:8126:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:8135:1: rule__Neg__ExpressionAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8139:1: ( ( ruleAtom ) )
            // InternalAltarica.g:8140:1: ( ruleAtom )
            {
            // InternalAltarica.g:8140:1: ( ruleAtom )
            // InternalAltarica.g:8141:1: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:8150:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8154:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // InternalAltarica.g:8155:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // InternalAltarica.g:8155:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // InternalAltarica.g:8156:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // InternalAltarica.g:8157:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // InternalAltarica.g:8157:2: rule__BooleanLiteral__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:8166:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8170:1: ( ( RULE_STRING ) )
            // InternalAltarica.g:8171:1: ( RULE_STRING )
            {
            // InternalAltarica.g:8171:1: ( RULE_STRING )
            // InternalAltarica.g:8172:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalAltarica.g:8181:1: rule__NumberLiteral__ValueAssignment : ( RULE_NUMBER ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8185:1: ( ( RULE_NUMBER ) )
            // InternalAltarica.g:8186:1: ( RULE_NUMBER )
            {
            // InternalAltarica.g:8186:1: ( RULE_NUMBER )
            // InternalAltarica.g:8187:1: RULE_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberLiteralAccess().getValueNUMBERTerminalRuleCall_0()); 
            }
            match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberLiteralAccess().getValueNUMBERTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"


    // $ANTLR start "rule__NameRef__VariableAssignment_0"
    // InternalAltarica.g:8196:1: rule__NameRef__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8200:1: ( ( ( RULE_ID ) ) )
            // InternalAltarica.g:8201:1: ( ( RULE_ID ) )
            {
            // InternalAltarica.g:8201:1: ( ( RULE_ID ) )
            // InternalAltarica.g:8202:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }
            // InternalAltarica.g:8203:1: ( RULE_ID )
            // InternalAltarica.g:8204:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:8215:1: rule__NameRef__VariableAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8219:1: ( ( ( RULE_ID ) ) )
            // InternalAltarica.g:8220:1: ( ( RULE_ID ) )
            {
            // InternalAltarica.g:8220:1: ( ( RULE_ID ) )
            // InternalAltarica.g:8221:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }
            // InternalAltarica.g:8222:1: ( RULE_ID )
            // InternalAltarica.g:8223:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementIDTerminalRuleCall_1_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:8234:1: rule__SwitchExpression__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__SwitchExpression__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8238:1: ( ( ruleCaseExpression ) )
            // InternalAltarica.g:8239:1: ( ruleCaseExpression )
            {
            // InternalAltarica.g:8239:1: ( ruleCaseExpression )
            // InternalAltarica.g:8240:1: ruleCaseExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:8249:1: rule__SwitchExpression__DefaultAssignment_5 : ( ruleExpression ) ;
    public final void rule__SwitchExpression__DefaultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8253:1: ( ( ruleExpression ) )
            // InternalAltarica.g:8254:1: ( ruleExpression )
            {
            // InternalAltarica.g:8254:1: ( ruleExpression )
            // InternalAltarica.g:8255:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__CaseExpression__ConditionAssignment_1"
    // InternalAltarica.g:8264:1: rule__CaseExpression__ConditionAssignment_1 : ( ruleLogicalOr ) ;
    public final void rule__CaseExpression__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8268:1: ( ( ruleLogicalOr ) )
            // InternalAltarica.g:8269:1: ( ruleLogicalOr )
            {
            // InternalAltarica.g:8269:1: ( ruleLogicalOr )
            // InternalAltarica.g:8270:1: ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicalOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__ConditionAssignment_1"


    // $ANTLR start "rule__CaseExpression__CaseAssignment_3"
    // InternalAltarica.g:8279:1: rule__CaseExpression__CaseAssignment_3 : ( ruleExpression ) ;
    public final void rule__CaseExpression__CaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8283:1: ( ( ruleExpression ) )
            // InternalAltarica.g:8284:1: ( ruleExpression )
            {
            // InternalAltarica.g:8284:1: ( ruleExpression )
            // InternalAltarica.g:8285:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CaseExpression__CaseAssignment_3"


    // $ANTLR start "rule__FunctionCall__NameAssignment_1"
    // InternalAltarica.g:8294:1: rule__FunctionCall__NameAssignment_1 : ( ( rule__FunctionCall__NameAlternatives_1_0 ) ) ;
    public final void rule__FunctionCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8298:1: ( ( ( rule__FunctionCall__NameAlternatives_1_0 ) ) )
            // InternalAltarica.g:8299:1: ( ( rule__FunctionCall__NameAlternatives_1_0 ) )
            {
            // InternalAltarica.g:8299:1: ( ( rule__FunctionCall__NameAlternatives_1_0 ) )
            // InternalAltarica.g:8300:1: ( rule__FunctionCall__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getNameAlternatives_1_0()); 
            }
            // InternalAltarica.g:8301:1: ( rule__FunctionCall__NameAlternatives_1_0 )
            // InternalAltarica.g:8301:2: rule__FunctionCall__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionCall__NameAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getNameAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__NameAssignment_1"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_3_0"
    // InternalAltarica.g:8310:1: rule__FunctionCall__ParametersAssignment_3_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8314:1: ( ( ruleExpression ) )
            // InternalAltarica.g:8315:1: ( ruleExpression )
            {
            // InternalAltarica.g:8315:1: ( ruleExpression )
            // InternalAltarica.g:8316:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_3_0"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_3_1_1"
    // InternalAltarica.g:8325:1: rule__FunctionCall__ParametersAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8329:1: ( ( ruleExpression ) )
            // InternalAltarica.g:8330:1: ( ruleExpression )
            {
            // InternalAltarica.g:8330:1: ( ruleExpression )
            // InternalAltarica.g:8331:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Error__SeverityAssignment_0"
    // InternalAltarica.g:8340:1: rule__Error__SeverityAssignment_0 : ( ruleSeverity ) ;
    public final void rule__Error__SeverityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8344:1: ( ( ruleSeverity ) )
            // InternalAltarica.g:8345:1: ( ruleSeverity )
            {
            // InternalAltarica.g:8345:1: ( ruleSeverity )
            // InternalAltarica.g:8346:1: ruleSeverity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getSeveritySeverityEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSeverity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getSeveritySeverityEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__SeverityAssignment_0"


    // $ANTLR start "rule__Error__MessageAssignment_1"
    // InternalAltarica.g:8355:1: rule__Error__MessageAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Error__MessageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8359:1: ( ( RULE_STRING ) )
            // InternalAltarica.g:8360:1: ( RULE_STRING )
            {
            // InternalAltarica.g:8360:1: ( RULE_STRING )
            // InternalAltarica.g:8361:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getErrorAccess().getMessageSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getErrorAccess().getMessageSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Error__MessageAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000028800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004600000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000E1C0180000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000E000180000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x2500002000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2500002000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000810000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x600040007C800070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000E000180000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x6000C0007C800070L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000020L});

}