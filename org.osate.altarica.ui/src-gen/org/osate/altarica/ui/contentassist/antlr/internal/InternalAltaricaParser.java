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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'exponential'", "'Dirac'", "'constant'", "'Integer'", "'Boolean'", "'domain'", "'{'", "'}'", "','", "'class'", "'end'", "'transition'", "'assertion'", "';'", "'('", "')'", "'='", "'event'", "'parameter'", "'observer'", "':'", "'&'", "'|'", "'->'", "'skip'", "':='", "'if'", "'then'", "'else'", "'switch'", "'not'", "'.'", "'default'", "'case'", "'or'", "'and'"
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
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_REGULAR_ID=9;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
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
    // InternalAltarica.g:70:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:74:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // InternalAltarica.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // InternalAltarica.g:75:1: ( ( rule__Model__DeclarationsAssignment )* )
            // InternalAltarica.g:76:1: ( rule__Model__DeclarationsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            }
            // InternalAltarica.g:77:1: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAltarica.g:77:2: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
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


    // $ANTLR start "ruleBaseTypeEnum"
    // InternalAltarica.g:1154:1: ruleBaseTypeEnum : ( ( rule__BaseTypeEnum__Alternatives ) ) ;
    public final void ruleBaseTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1158:1: ( ( ( rule__BaseTypeEnum__Alternatives ) ) )
            // InternalAltarica.g:1159:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            {
            // InternalAltarica.g:1159:1: ( ( rule__BaseTypeEnum__Alternatives ) )
            // InternalAltarica.g:1160:1: ( rule__BaseTypeEnum__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeEnumAccess().getAlternatives()); 
            }
            // InternalAltarica.g:1161:1: ( rule__BaseTypeEnum__Alternatives )
            // InternalAltarica.g:1161:2: rule__BaseTypeEnum__Alternatives
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


    // $ANTLR start "rule__AbstractDeclaration__Alternatives"
    // InternalAltarica.g:1172:1: rule__AbstractDeclaration__Alternatives : ( ( ruleDomain ) | ( ruleClass ) );
    public final void rule__AbstractDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1176:1: ( ( ruleDomain ) | ( ruleClass ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
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
                    // InternalAltarica.g:1177:1: ( ruleDomain )
                    {
                    // InternalAltarica.g:1177:1: ( ruleDomain )
                    // InternalAltarica.g:1178:1: ruleDomain
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
                    // InternalAltarica.g:1183:6: ( ruleClass )
                    {
                    // InternalAltarica.g:1183:6: ( ruleClass )
                    // InternalAltarica.g:1184:1: ruleClass
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
    // InternalAltarica.g:1194:1: rule__Type__Alternatives : ( ( ( ruleBaseType ) ) | ( ruleNamedType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1198:1: ( ( ( ruleBaseType ) ) | ( ruleNamedType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=31 && LA3_0<=32)) ) {
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
                    // InternalAltarica.g:1199:1: ( ( ruleBaseType ) )
                    {
                    // InternalAltarica.g:1199:1: ( ( ruleBaseType ) )
                    // InternalAltarica.g:1200:1: ( ruleBaseType )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                    }
                    // InternalAltarica.g:1201:1: ( ruleBaseType )
                    // InternalAltarica.g:1201:3: ruleBaseType
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
                    // InternalAltarica.g:1205:6: ( ruleNamedType )
                    {
                    // InternalAltarica.g:1205:6: ( ruleNamedType )
                    // InternalAltarica.g:1206:1: ruleNamedType
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
    // InternalAltarica.g:1216:1: rule__Declaration__Alternatives : ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1220:1: ( ( ruleVariableDeclaration ) | ( ruleEventDeclaration ) | ( ruleParameterDeclaration ) | ( ruleObserverDeclaration ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 31:
            case 32:
                {
                alt4=1;
                }
                break;
            case 45:
                {
                alt4=2;
                }
                break;
            case 46:
                {
                alt4=3;
                }
                break;
            case 47:
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
                    // InternalAltarica.g:1221:1: ( ruleVariableDeclaration )
                    {
                    // InternalAltarica.g:1221:1: ( ruleVariableDeclaration )
                    // InternalAltarica.g:1222:1: ruleVariableDeclaration
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
                    // InternalAltarica.g:1227:6: ( ruleEventDeclaration )
                    {
                    // InternalAltarica.g:1227:6: ( ruleEventDeclaration )
                    // InternalAltarica.g:1228:1: ruleEventDeclaration
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
                    // InternalAltarica.g:1233:6: ( ruleParameterDeclaration )
                    {
                    // InternalAltarica.g:1233:6: ( ruleParameterDeclaration )
                    // InternalAltarica.g:1234:1: ruleParameterDeclaration
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
                    // InternalAltarica.g:1239:6: ( ruleObserverDeclaration )
                    {
                    // InternalAltarica.g:1239:6: ( ruleObserverDeclaration )
                    // InternalAltarica.g:1240:1: ruleObserverDeclaration
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
    // InternalAltarica.g:1250:1: rule__Instruction__Alternatives : ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1254:1: ( ( ruleSkip ) | ( ruleAssignment ) | ( ruleBlock ) | ( ruleConditional ) | ( ruleSwitch ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 34:
                {
                alt5=3;
                }
                break;
            case 54:
                {
                alt5=4;
                }
                break;
            case 57:
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
                    // InternalAltarica.g:1255:1: ( ruleSkip )
                    {
                    // InternalAltarica.g:1255:1: ( ruleSkip )
                    // InternalAltarica.g:1256:1: ruleSkip
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
                    // InternalAltarica.g:1261:6: ( ruleAssignment )
                    {
                    // InternalAltarica.g:1261:6: ( ruleAssignment )
                    // InternalAltarica.g:1262:1: ruleAssignment
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
                    // InternalAltarica.g:1267:6: ( ruleBlock )
                    {
                    // InternalAltarica.g:1267:6: ( ruleBlock )
                    // InternalAltarica.g:1268:1: ruleBlock
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
                    // InternalAltarica.g:1273:6: ( ruleConditional )
                    {
                    // InternalAltarica.g:1273:6: ( ruleConditional )
                    // InternalAltarica.g:1274:1: ruleConditional
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
                    // InternalAltarica.g:1279:6: ( ruleSwitch )
                    {
                    // InternalAltarica.g:1279:6: ( ruleSwitch )
                    // InternalAltarica.g:1280:1: ruleSwitch
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


    // $ANTLR start "rule__Relation__OpAlternatives_1_0_1_0"
    // InternalAltarica.g:1290:1: rule__Relation__OpAlternatives_1_0_1_0 : ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) );
    public final void rule__Relation__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1294:1: ( ( '==' ) | ( '!=' ) | ( '<' ) | ( '<=' ) | ( '>=' ) | ( '>' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 21:
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
                    // InternalAltarica.g:1295:1: ( '==' )
                    {
                    // InternalAltarica.g:1295:1: ( '==' )
                    // InternalAltarica.g:1296:1: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1303:6: ( '!=' )
                    {
                    // InternalAltarica.g:1303:6: ( '!=' )
                    // InternalAltarica.g:1304:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAltarica.g:1311:6: ( '<' )
                    {
                    // InternalAltarica.g:1311:6: ( '<' )
                    // InternalAltarica.g:1312:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAltarica.g:1319:6: ( '<=' )
                    {
                    // InternalAltarica.g:1319:6: ( '<=' )
                    // InternalAltarica.g:1320:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAltarica.g:1327:6: ( '>=' )
                    {
                    // InternalAltarica.g:1327:6: ( '>=' )
                    // InternalAltarica.g:1328:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAltarica.g:1335:6: ( '>' )
                    {
                    // InternalAltarica.g:1335:6: ( '>' )
                    // InternalAltarica.g:1336:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1348:1: rule__Addition__OpAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Addition__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1352:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
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
                    // InternalAltarica.g:1353:1: ( '+' )
                    {
                    // InternalAltarica.g:1353:1: ( '+' )
                    // InternalAltarica.g:1354:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1361:6: ( '-' )
                    {
                    // InternalAltarica.g:1361:6: ( '-' )
                    // InternalAltarica.g:1362:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1374:1: rule__Multiplication__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Multiplication__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1378:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
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
                    // InternalAltarica.g:1379:1: ( '*' )
                    {
                    // InternalAltarica.g:1379:1: ( '*' )
                    // InternalAltarica.g:1380:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:1387:6: ( '/' )
                    {
                    // InternalAltarica.g:1387:6: ( '/' )
                    // InternalAltarica.g:1388:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1400:1: rule__Neg__Alternatives : ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) );
    public final void rule__Neg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1404:1: ( ( ( rule__Neg__Group_0__0 ) ) | ( ( rule__Neg__Group_1__0 ) ) | ( ruleAtom ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
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
            case 42:
            case 57:
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
                    // InternalAltarica.g:1405:1: ( ( rule__Neg__Group_0__0 ) )
                    {
                    // InternalAltarica.g:1405:1: ( ( rule__Neg__Group_0__0 ) )
                    // InternalAltarica.g:1406:1: ( rule__Neg__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_0()); 
                    }
                    // InternalAltarica.g:1407:1: ( rule__Neg__Group_0__0 )
                    // InternalAltarica.g:1407:2: rule__Neg__Group_0__0
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
                    // InternalAltarica.g:1411:6: ( ( rule__Neg__Group_1__0 ) )
                    {
                    // InternalAltarica.g:1411:6: ( ( rule__Neg__Group_1__0 ) )
                    // InternalAltarica.g:1412:1: ( rule__Neg__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegAccess().getGroup_1()); 
                    }
                    // InternalAltarica.g:1413:1: ( rule__Neg__Group_1__0 )
                    // InternalAltarica.g:1413:2: rule__Neg__Group_1__0
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
                    // InternalAltarica.g:1417:6: ( ruleAtom )
                    {
                    // InternalAltarica.g:1417:6: ( ruleAtom )
                    // InternalAltarica.g:1418:1: ruleAtom
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
    // InternalAltarica.g:1428:1: rule__Atom__Alternatives : ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) | ( ruleFunctionCall ) | ( ruleNameRef ) | ( ruleSwitchExpression ) | ( ( rule__Atom__Group_6__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1432:1: ( ( ruleBooleanLiteral ) | ( ruleStringLiteral ) | ( ruleNumberLiteral ) | ( ruleFunctionCall ) | ( ruleNameRef ) | ( ruleSwitchExpression ) | ( ( rule__Atom__Group_6__0 ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
                {
                alt10=1;
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt10=3;
                }
                break;
            case 28:
            case 29:
            case 30:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            case 57:
                {
                alt10=6;
                }
                break;
            case 42:
                {
                alt10=7;
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
                    // InternalAltarica.g:1433:1: ( ruleBooleanLiteral )
                    {
                    // InternalAltarica.g:1433:1: ( ruleBooleanLiteral )
                    // InternalAltarica.g:1434:1: ruleBooleanLiteral
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
                    // InternalAltarica.g:1439:6: ( ruleStringLiteral )
                    {
                    // InternalAltarica.g:1439:6: ( ruleStringLiteral )
                    // InternalAltarica.g:1440:1: ruleStringLiteral
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
                    // InternalAltarica.g:1445:6: ( ruleNumberLiteral )
                    {
                    // InternalAltarica.g:1445:6: ( ruleNumberLiteral )
                    // InternalAltarica.g:1446:1: ruleNumberLiteral
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
                    // InternalAltarica.g:1451:6: ( ruleFunctionCall )
                    {
                    // InternalAltarica.g:1451:6: ( ruleFunctionCall )
                    // InternalAltarica.g:1452:1: ruleFunctionCall
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
                    // InternalAltarica.g:1457:6: ( ruleNameRef )
                    {
                    // InternalAltarica.g:1457:6: ( ruleNameRef )
                    // InternalAltarica.g:1458:1: ruleNameRef
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
                    // InternalAltarica.g:1463:6: ( ruleSwitchExpression )
                    {
                    // InternalAltarica.g:1463:6: ( ruleSwitchExpression )
                    // InternalAltarica.g:1464:1: ruleSwitchExpression
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
                    // InternalAltarica.g:1469:6: ( ( rule__Atom__Group_6__0 ) )
                    {
                    // InternalAltarica.g:1469:6: ( ( rule__Atom__Group_6__0 ) )
                    // InternalAltarica.g:1470:1: ( rule__Atom__Group_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_6()); 
                    }
                    // InternalAltarica.g:1471:1: ( rule__Atom__Group_6__0 )
                    // InternalAltarica.g:1471:2: rule__Atom__Group_6__0
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
    // InternalAltarica.g:1480:1: rule__BooleanLiteral__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1484:1: ( ( 'true' ) | ( 'false' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
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
                    // InternalAltarica.g:1485:1: ( 'true' )
                    {
                    // InternalAltarica.g:1485:1: ( 'true' )
                    // InternalAltarica.g:1486:1: 'true'
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
                    // InternalAltarica.g:1493:6: ( 'false' )
                    {
                    // InternalAltarica.g:1493:6: ( 'false' )
                    // InternalAltarica.g:1494:1: 'false'
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
    // InternalAltarica.g:1506:1: rule__FunctionCall__NameAlternatives_1_0 : ( ( 'exponential' ) | ( 'Dirac' ) | ( 'constant' ) );
    public final void rule__FunctionCall__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1510:1: ( ( 'exponential' ) | ( 'Dirac' ) | ( 'constant' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
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
                    // InternalAltarica.g:1511:1: ( 'exponential' )
                    {
                    // InternalAltarica.g:1511:1: ( 'exponential' )
                    // InternalAltarica.g:1512:1: 'exponential'
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
                    // InternalAltarica.g:1519:6: ( 'Dirac' )
                    {
                    // InternalAltarica.g:1519:6: ( 'Dirac' )
                    // InternalAltarica.g:1520:1: 'Dirac'
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
                    // InternalAltarica.g:1527:6: ( 'constant' )
                    {
                    // InternalAltarica.g:1527:6: ( 'constant' )
                    // InternalAltarica.g:1528:1: 'constant'
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
    // InternalAltarica.g:1540:1: rule__BaseTypeEnum__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__BaseTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1544:1: ( ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
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
                    // InternalAltarica.g:1545:1: ( ( 'Integer' ) )
                    {
                    // InternalAltarica.g:1545:1: ( ( 'Integer' ) )
                    // InternalAltarica.g:1546:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    }
                    // InternalAltarica.g:1547:1: ( 'Integer' )
                    // InternalAltarica.g:1547:3: 'Integer'
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
                    // InternalAltarica.g:1552:6: ( ( 'Boolean' ) )
                    {
                    // InternalAltarica.g:1552:6: ( ( 'Boolean' ) )
                    // InternalAltarica.g:1553:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                    }
                    // InternalAltarica.g:1554:1: ( 'Boolean' )
                    // InternalAltarica.g:1554:3: 'Boolean'
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


    // $ANTLR start "rule__Domain__Group__0"
    // InternalAltarica.g:1566:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1570:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalAltarica.g:1571:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalAltarica.g:1578:1: rule__Domain__Group__0__Impl : ( () ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1582:1: ( ( () ) )
            // InternalAltarica.g:1583:1: ( () )
            {
            // InternalAltarica.g:1583:1: ( () )
            // InternalAltarica.g:1584:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainAction_0()); 
            }
            // InternalAltarica.g:1585:1: ()
            // InternalAltarica.g:1587:1: 
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
    // InternalAltarica.g:1597:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1601:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // InternalAltarica.g:1602:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:1609:1: rule__Domain__Group__1__Impl : ( 'domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1613:1: ( ( 'domain' ) )
            // InternalAltarica.g:1614:1: ( 'domain' )
            {
            // InternalAltarica.g:1614:1: ( 'domain' )
            // InternalAltarica.g:1615:1: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1628:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1632:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // InternalAltarica.g:1633:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
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
    // InternalAltarica.g:1640:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1644:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // InternalAltarica.g:1645:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // InternalAltarica.g:1645:1: ( ( rule__Domain__NameAssignment_2 ) )
            // InternalAltarica.g:1646:1: ( rule__Domain__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:1647:1: ( rule__Domain__NameAssignment_2 )
            // InternalAltarica.g:1647:2: rule__Domain__NameAssignment_2
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
    // InternalAltarica.g:1657:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1661:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // InternalAltarica.g:1662:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalAltarica.g:1669:1: rule__Domain__Group__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1673:1: ( ( '{' ) )
            // InternalAltarica.g:1674:1: ( '{' )
            {
            // InternalAltarica.g:1674:1: ( '{' )
            // InternalAltarica.g:1675:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1688:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1692:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // InternalAltarica.g:1693:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalAltarica.g:1700:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__Group_4__0 )? ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1704:1: ( ( ( rule__Domain__Group_4__0 )? ) )
            // InternalAltarica.g:1705:1: ( ( rule__Domain__Group_4__0 )? )
            {
            // InternalAltarica.g:1705:1: ( ( rule__Domain__Group_4__0 )? )
            // InternalAltarica.g:1706:1: ( rule__Domain__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4()); 
            }
            // InternalAltarica.g:1707:1: ( rule__Domain__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAltarica.g:1707:2: rule__Domain__Group_4__0
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
    // InternalAltarica.g:1717:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1721:1: ( rule__Domain__Group__5__Impl )
            // InternalAltarica.g:1722:2: rule__Domain__Group__5__Impl
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
    // InternalAltarica.g:1728:1: rule__Domain__Group__5__Impl : ( '}' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1732:1: ( ( '}' ) )
            // InternalAltarica.g:1733:1: ( '}' )
            {
            // InternalAltarica.g:1733:1: ( '}' )
            // InternalAltarica.g:1734:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1759:1: rule__Domain__Group_4__0 : rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 ;
    public final void rule__Domain__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1763:1: ( rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 )
            // InternalAltarica.g:1764:2: rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAltarica.g:1771:1: rule__Domain__Group_4__0__Impl : ( ( rule__Domain__ConstantsAssignment_4_0 ) ) ;
    public final void rule__Domain__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1775:1: ( ( ( rule__Domain__ConstantsAssignment_4_0 ) ) )
            // InternalAltarica.g:1776:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            {
            // InternalAltarica.g:1776:1: ( ( rule__Domain__ConstantsAssignment_4_0 ) )
            // InternalAltarica.g:1777:1: ( rule__Domain__ConstantsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_0()); 
            }
            // InternalAltarica.g:1778:1: ( rule__Domain__ConstantsAssignment_4_0 )
            // InternalAltarica.g:1778:2: rule__Domain__ConstantsAssignment_4_0
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
    // InternalAltarica.g:1788:1: rule__Domain__Group_4__1 : rule__Domain__Group_4__1__Impl ;
    public final void rule__Domain__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1792:1: ( rule__Domain__Group_4__1__Impl )
            // InternalAltarica.g:1793:2: rule__Domain__Group_4__1__Impl
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
    // InternalAltarica.g:1799:1: rule__Domain__Group_4__1__Impl : ( ( rule__Domain__Group_4_1__0 )* ) ;
    public final void rule__Domain__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1803:1: ( ( ( rule__Domain__Group_4_1__0 )* ) )
            // InternalAltarica.g:1804:1: ( ( rule__Domain__Group_4_1__0 )* )
            {
            // InternalAltarica.g:1804:1: ( ( rule__Domain__Group_4_1__0 )* )
            // InternalAltarica.g:1805:1: ( rule__Domain__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup_4_1()); 
            }
            // InternalAltarica.g:1806:1: ( rule__Domain__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAltarica.g:1806:2: rule__Domain__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalAltarica.g:1820:1: rule__Domain__Group_4_1__0 : rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 ;
    public final void rule__Domain__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1824:1: ( rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1 )
            // InternalAltarica.g:1825:2: rule__Domain__Group_4_1__0__Impl rule__Domain__Group_4_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:1832:1: rule__Domain__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1836:1: ( ( ',' ) )
            // InternalAltarica.g:1837:1: ( ',' )
            {
            // InternalAltarica.g:1837:1: ( ',' )
            // InternalAltarica.g:1838:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:1851:1: rule__Domain__Group_4_1__1 : rule__Domain__Group_4_1__1__Impl ;
    public final void rule__Domain__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1855:1: ( rule__Domain__Group_4_1__1__Impl )
            // InternalAltarica.g:1856:2: rule__Domain__Group_4_1__1__Impl
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
    // InternalAltarica.g:1862:1: rule__Domain__Group_4_1__1__Impl : ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) ;
    public final void rule__Domain__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1866:1: ( ( ( rule__Domain__ConstantsAssignment_4_1_1 ) ) )
            // InternalAltarica.g:1867:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            {
            // InternalAltarica.g:1867:1: ( ( rule__Domain__ConstantsAssignment_4_1_1 ) )
            // InternalAltarica.g:1868:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getConstantsAssignment_4_1_1()); 
            }
            // InternalAltarica.g:1869:1: ( rule__Domain__ConstantsAssignment_4_1_1 )
            // InternalAltarica.g:1869:2: rule__Domain__ConstantsAssignment_4_1_1
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
    // InternalAltarica.g:1883:1: rule__SymbolicConstant__Group__0 : rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 ;
    public final void rule__SymbolicConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1887:1: ( rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1 )
            // InternalAltarica.g:1888:2: rule__SymbolicConstant__Group__0__Impl rule__SymbolicConstant__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:1895:1: rule__SymbolicConstant__Group__0__Impl : ( () ) ;
    public final void rule__SymbolicConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1899:1: ( ( () ) )
            // InternalAltarica.g:1900:1: ( () )
            {
            // InternalAltarica.g:1900:1: ( () )
            // InternalAltarica.g:1901:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0()); 
            }
            // InternalAltarica.g:1902:1: ()
            // InternalAltarica.g:1904:1: 
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
    // InternalAltarica.g:1914:1: rule__SymbolicConstant__Group__1 : rule__SymbolicConstant__Group__1__Impl ;
    public final void rule__SymbolicConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1918:1: ( rule__SymbolicConstant__Group__1__Impl )
            // InternalAltarica.g:1919:2: rule__SymbolicConstant__Group__1__Impl
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
    // InternalAltarica.g:1925:1: rule__SymbolicConstant__Group__1__Impl : ( ( rule__SymbolicConstant__NameAssignment_1 ) ) ;
    public final void rule__SymbolicConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1929:1: ( ( ( rule__SymbolicConstant__NameAssignment_1 ) ) )
            // InternalAltarica.g:1930:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            {
            // InternalAltarica.g:1930:1: ( ( rule__SymbolicConstant__NameAssignment_1 ) )
            // InternalAltarica.g:1931:1: ( rule__SymbolicConstant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolicConstantAccess().getNameAssignment_1()); 
            }
            // InternalAltarica.g:1932:1: ( rule__SymbolicConstant__NameAssignment_1 )
            // InternalAltarica.g:1932:2: rule__SymbolicConstant__NameAssignment_1
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
    // InternalAltarica.g:1946:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1950:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalAltarica.g:1951:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAltarica.g:1958:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1962:1: ( ( () ) )
            // InternalAltarica.g:1963:1: ( () )
            {
            // InternalAltarica.g:1963:1: ( () )
            // InternalAltarica.g:1964:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNodeAction_0()); 
            }
            // InternalAltarica.g:1965:1: ()
            // InternalAltarica.g:1967:1: 
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
    // InternalAltarica.g:1977:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1981:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalAltarica.g:1982:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:1989:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:1993:1: ( ( 'class' ) )
            // InternalAltarica.g:1994:1: ( 'class' )
            {
            // InternalAltarica.g:1994:1: ( 'class' )
            // InternalAltarica.g:1995:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2008:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2012:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalAltarica.g:2013:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalAltarica.g:2020:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2024:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalAltarica.g:2025:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalAltarica.g:2025:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalAltarica.g:2026:1: ( rule__Class__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:2027:1: ( rule__Class__NameAssignment_2 )
            // InternalAltarica.g:2027:2: rule__Class__NameAssignment_2
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
    // InternalAltarica.g:2037:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2041:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalAltarica.g:2042:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAltarica.g:2049:1: rule__Class__Group__3__Impl : ( ( rule__Class__DeclarationsAssignment_3 )* ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2053:1: ( ( ( rule__Class__DeclarationsAssignment_3 )* ) )
            // InternalAltarica.g:2054:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            {
            // InternalAltarica.g:2054:1: ( ( rule__Class__DeclarationsAssignment_3 )* )
            // InternalAltarica.g:2055:1: ( rule__Class__DeclarationsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getDeclarationsAssignment_3()); 
            }
            // InternalAltarica.g:2056:1: ( rule__Class__DeclarationsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=31 && LA16_0<=32)||(LA16_0>=45 && LA16_0<=47)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAltarica.g:2056:2: rule__Class__DeclarationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalAltarica.g:2066:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2070:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalAltarica.g:2071:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalAltarica.g:2078:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2082:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalAltarica.g:2083:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalAltarica.g:2083:1: ( ( rule__Class__Group_4__0 )? )
            // InternalAltarica.g:2084:1: ( rule__Class__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_4()); 
            }
            // InternalAltarica.g:2085:1: ( rule__Class__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAltarica.g:2085:2: rule__Class__Group_4__0
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
    // InternalAltarica.g:2095:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2099:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalAltarica.g:2100:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalAltarica.g:2107:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2111:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalAltarica.g:2112:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalAltarica.g:2112:1: ( ( rule__Class__Group_5__0 )? )
            // InternalAltarica.g:2113:1: ( rule__Class__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getGroup_5()); 
            }
            // InternalAltarica.g:2114:1: ( rule__Class__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAltarica.g:2114:2: rule__Class__Group_5__0
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
    // InternalAltarica.g:2124:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2128:1: ( rule__Class__Group__6__Impl )
            // InternalAltarica.g:2129:2: rule__Class__Group__6__Impl
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
    // InternalAltarica.g:2135:1: rule__Class__Group__6__Impl : ( 'end' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2139:1: ( ( 'end' ) )
            // InternalAltarica.g:2140:1: ( 'end' )
            {
            // InternalAltarica.g:2140:1: ( 'end' )
            // InternalAltarica.g:2141:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getEndKeyword_6()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2168:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2172:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalAltarica.g:2173:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2180:1: rule__Class__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2184:1: ( ( 'transition' ) )
            // InternalAltarica.g:2185:1: ( 'transition' )
            {
            // InternalAltarica.g:2185:1: ( 'transition' )
            // InternalAltarica.g:2186:1: 'transition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionKeyword_4_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2199:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2203:1: ( rule__Class__Group_4__1__Impl )
            // InternalAltarica.g:2204:2: rule__Class__Group_4__1__Impl
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
    // InternalAltarica.g:2210:1: rule__Class__Group_4__1__Impl : ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2214:1: ( ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) ) )
            // InternalAltarica.g:2215:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            {
            // InternalAltarica.g:2215:1: ( ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* ) )
            // InternalAltarica.g:2216:1: ( ( rule__Class__TransitionsAssignment_4_1 ) ) ( ( rule__Class__TransitionsAssignment_4_1 )* )
            {
            // InternalAltarica.g:2216:1: ( ( rule__Class__TransitionsAssignment_4_1 ) )
            // InternalAltarica.g:2217:1: ( rule__Class__TransitionsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // InternalAltarica.g:2218:1: ( rule__Class__TransitionsAssignment_4_1 )
            // InternalAltarica.g:2218:2: rule__Class__TransitionsAssignment_4_1
            {
            pushFollow(FOLLOW_13);
            rule__Class__TransitionsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }

            }

            // InternalAltarica.g:2221:1: ( ( rule__Class__TransitionsAssignment_4_1 )* )
            // InternalAltarica.g:2222:1: ( rule__Class__TransitionsAssignment_4_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getTransitionsAssignment_4_1()); 
            }
            // InternalAltarica.g:2223:1: ( rule__Class__TransitionsAssignment_4_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAltarica.g:2223:2: rule__Class__TransitionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalAltarica.g:2238:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2242:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalAltarica.g:2243:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAltarica.g:2250:1: rule__Class__Group_5__0__Impl : ( 'assertion' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2254:1: ( ( 'assertion' ) )
            // InternalAltarica.g:2255:1: ( 'assertion' )
            {
            // InternalAltarica.g:2255:1: ( 'assertion' )
            // InternalAltarica.g:2256:1: 'assertion'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionKeyword_5_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2269:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2273:1: ( rule__Class__Group_5__1__Impl )
            // InternalAltarica.g:2274:2: rule__Class__Group_5__1__Impl
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
    // InternalAltarica.g:2280:1: rule__Class__Group_5__1__Impl : ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2284:1: ( ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) ) )
            // InternalAltarica.g:2285:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            {
            // InternalAltarica.g:2285:1: ( ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* ) )
            // InternalAltarica.g:2286:1: ( ( rule__Class__AssertionsAssignment_5_1 ) ) ( ( rule__Class__AssertionsAssignment_5_1 )* )
            {
            // InternalAltarica.g:2286:1: ( ( rule__Class__AssertionsAssignment_5_1 ) )
            // InternalAltarica.g:2287:1: ( rule__Class__AssertionsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // InternalAltarica.g:2288:1: ( rule__Class__AssertionsAssignment_5_1 )
            // InternalAltarica.g:2288:2: rule__Class__AssertionsAssignment_5_1
            {
            pushFollow(FOLLOW_15);
            rule__Class__AssertionsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }

            }

            // InternalAltarica.g:2291:1: ( ( rule__Class__AssertionsAssignment_5_1 )* )
            // InternalAltarica.g:2292:1: ( rule__Class__AssertionsAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassAccess().getAssertionsAssignment_5_1()); 
            }
            // InternalAltarica.g:2293:1: ( rule__Class__AssertionsAssignment_5_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==34||LA20_0==52||LA20_0==54||LA20_0==57) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAltarica.g:2293:2: rule__Class__AssertionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalAltarica.g:2308:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2312:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalAltarica.g:2313:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAltarica.g:2320:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2324:1: ( ( () ) )
            // InternalAltarica.g:2325:1: ( () )
            {
            // InternalAltarica.g:2325:1: ( () )
            // InternalAltarica.g:2326:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getVariableAction_0()); 
            }
            // InternalAltarica.g:2327:1: ()
            // InternalAltarica.g:2329:1: 
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
    // InternalAltarica.g:2339:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2343:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalAltarica.g:2344:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2351:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2355:1: ( ( ( rule__VariableDeclaration__TypeAssignment_1 ) ) )
            // InternalAltarica.g:2356:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            {
            // InternalAltarica.g:2356:1: ( ( rule__VariableDeclaration__TypeAssignment_1 ) )
            // InternalAltarica.g:2357:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_1()); 
            }
            // InternalAltarica.g:2358:1: ( rule__VariableDeclaration__TypeAssignment_1 )
            // InternalAltarica.g:2358:2: rule__VariableDeclaration__TypeAssignment_1
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
    // InternalAltarica.g:2368:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2372:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalAltarica.g:2373:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAltarica.g:2380:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2384:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // InternalAltarica.g:2385:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // InternalAltarica.g:2385:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // InternalAltarica.g:2386:1: ( rule__VariableDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:2387:1: ( rule__VariableDeclaration__NameAssignment_2 )
            // InternalAltarica.g:2387:2: rule__VariableDeclaration__NameAssignment_2
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
    // InternalAltarica.g:2397:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2401:1: ( rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4 )
            // InternalAltarica.g:2402:2: rule__VariableDeclaration__Group__3__Impl rule__VariableDeclaration__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalAltarica.g:2409:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__Group_3__0 )? ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2413:1: ( ( ( rule__VariableDeclaration__Group_3__0 )? ) )
            // InternalAltarica.g:2414:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            {
            // InternalAltarica.g:2414:1: ( ( rule__VariableDeclaration__Group_3__0 )? )
            // InternalAltarica.g:2415:1: ( rule__VariableDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3()); 
            }
            // InternalAltarica.g:2416:1: ( rule__VariableDeclaration__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAltarica.g:2416:2: rule__VariableDeclaration__Group_3__0
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
    // InternalAltarica.g:2426:1: rule__VariableDeclaration__Group__4 : rule__VariableDeclaration__Group__4__Impl ;
    public final void rule__VariableDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2430:1: ( rule__VariableDeclaration__Group__4__Impl )
            // InternalAltarica.g:2431:2: rule__VariableDeclaration__Group__4__Impl
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
    // InternalAltarica.g:2437:1: rule__VariableDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2441:1: ( ( ';' ) )
            // InternalAltarica.g:2442:1: ( ';' )
            {
            // InternalAltarica.g:2442:1: ( ';' )
            // InternalAltarica.g:2443:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2466:1: rule__VariableDeclaration__Group_3__0 : rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 ;
    public final void rule__VariableDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2470:1: ( rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1 )
            // InternalAltarica.g:2471:2: rule__VariableDeclaration__Group_3__0__Impl rule__VariableDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2478:1: rule__VariableDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2482:1: ( ( '(' ) )
            // InternalAltarica.g:2483:1: ( '(' )
            {
            // InternalAltarica.g:2483:1: ( '(' )
            // InternalAltarica.g:2484:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2497:1: rule__VariableDeclaration__Group_3__1 : rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 ;
    public final void rule__VariableDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2501:1: ( rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2 )
            // InternalAltarica.g:2502:2: rule__VariableDeclaration__Group_3__1__Impl rule__VariableDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAltarica.g:2509:1: rule__VariableDeclaration__Group_3__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2513:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) ) )
            // InternalAltarica.g:2514:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            {
            // InternalAltarica.g:2514:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_1 ) )
            // InternalAltarica.g:2515:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // InternalAltarica.g:2516:1: ( rule__VariableDeclaration__AttributesAssignment_3_1 )
            // InternalAltarica.g:2516:2: rule__VariableDeclaration__AttributesAssignment_3_1
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
    // InternalAltarica.g:2526:1: rule__VariableDeclaration__Group_3__2 : rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 ;
    public final void rule__VariableDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2530:1: ( rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3 )
            // InternalAltarica.g:2531:2: rule__VariableDeclaration__Group_3__2__Impl rule__VariableDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAltarica.g:2538:1: rule__VariableDeclaration__Group_3__2__Impl : ( ( rule__VariableDeclaration__Group_3_2__0 )* ) ;
    public final void rule__VariableDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2542:1: ( ( ( rule__VariableDeclaration__Group_3_2__0 )* ) )
            // InternalAltarica.g:2543:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            {
            // InternalAltarica.g:2543:1: ( ( rule__VariableDeclaration__Group_3_2__0 )* )
            // InternalAltarica.g:2544:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getGroup_3_2()); 
            }
            // InternalAltarica.g:2545:1: ( rule__VariableDeclaration__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAltarica.g:2545:2: rule__VariableDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalAltarica.g:2555:1: rule__VariableDeclaration__Group_3__3 : rule__VariableDeclaration__Group_3__3__Impl ;
    public final void rule__VariableDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2559:1: ( rule__VariableDeclaration__Group_3__3__Impl )
            // InternalAltarica.g:2560:2: rule__VariableDeclaration__Group_3__3__Impl
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
    // InternalAltarica.g:2566:1: rule__VariableDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2570:1: ( ( ')' ) )
            // InternalAltarica.g:2571:1: ( ')' )
            {
            // InternalAltarica.g:2571:1: ( ')' )
            // InternalAltarica.g:2572:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2593:1: rule__VariableDeclaration__Group_3_2__0 : rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 ;
    public final void rule__VariableDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2597:1: ( rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1 )
            // InternalAltarica.g:2598:2: rule__VariableDeclaration__Group_3_2__0__Impl rule__VariableDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2605:1: rule__VariableDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__VariableDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2609:1: ( ( ',' ) )
            // InternalAltarica.g:2610:1: ( ',' )
            {
            // InternalAltarica.g:2610:1: ( ',' )
            // InternalAltarica.g:2611:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2624:1: rule__VariableDeclaration__Group_3_2__1 : rule__VariableDeclaration__Group_3_2__1__Impl ;
    public final void rule__VariableDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2628:1: ( rule__VariableDeclaration__Group_3_2__1__Impl )
            // InternalAltarica.g:2629:2: rule__VariableDeclaration__Group_3_2__1__Impl
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
    // InternalAltarica.g:2635:1: rule__VariableDeclaration__Group_3_2__1__Impl : ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__VariableDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2639:1: ( ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) ) )
            // InternalAltarica.g:2640:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // InternalAltarica.g:2640:1: ( ( rule__VariableDeclaration__AttributesAssignment_3_2_1 ) )
            // InternalAltarica.g:2641:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // InternalAltarica.g:2642:1: ( rule__VariableDeclaration__AttributesAssignment_3_2_1 )
            // InternalAltarica.g:2642:2: rule__VariableDeclaration__AttributesAssignment_3_2_1
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
    // InternalAltarica.g:2656:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2660:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalAltarica.g:2661:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2668:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2672:1: ( ( () ) )
            // InternalAltarica.g:2673:1: ( () )
            {
            // InternalAltarica.g:2673:1: ( () )
            // InternalAltarica.g:2674:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            }
            // InternalAltarica.g:2675:1: ()
            // InternalAltarica.g:2677:1: 
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
    // InternalAltarica.g:2687:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2691:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalAltarica.g:2692:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAltarica.g:2699:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2703:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalAltarica.g:2704:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalAltarica.g:2704:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalAltarica.g:2705:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // InternalAltarica.g:2706:1: ( rule__Attribute__NameAssignment_1 )
            // InternalAltarica.g:2706:2: rule__Attribute__NameAssignment_1
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
    // InternalAltarica.g:2716:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2720:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalAltarica.g:2721:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:2728:1: rule__Attribute__Group__2__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2732:1: ( ( '=' ) )
            // InternalAltarica.g:2733:1: ( '=' )
            {
            // InternalAltarica.g:2733:1: ( '=' )
            // InternalAltarica.g:2734:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2747:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2751:1: ( rule__Attribute__Group__3__Impl )
            // InternalAltarica.g:2752:2: rule__Attribute__Group__3__Impl
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
    // InternalAltarica.g:2758:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2762:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // InternalAltarica.g:2763:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // InternalAltarica.g:2763:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // InternalAltarica.g:2764:1: ( rule__Attribute__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            }
            // InternalAltarica.g:2765:1: ( rule__Attribute__ValueAssignment_3 )
            // InternalAltarica.g:2765:2: rule__Attribute__ValueAssignment_3
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
    // InternalAltarica.g:2783:1: rule__EventDeclaration__Group__0 : rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 ;
    public final void rule__EventDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2787:1: ( rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1 )
            // InternalAltarica.g:2788:2: rule__EventDeclaration__Group__0__Impl rule__EventDeclaration__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAltarica.g:2795:1: rule__EventDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__EventDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2799:1: ( ( () ) )
            // InternalAltarica.g:2800:1: ( () )
            {
            // InternalAltarica.g:2800:1: ( () )
            // InternalAltarica.g:2801:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventAction_0()); 
            }
            // InternalAltarica.g:2802:1: ()
            // InternalAltarica.g:2804:1: 
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
    // InternalAltarica.g:2814:1: rule__EventDeclaration__Group__1 : rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 ;
    public final void rule__EventDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2818:1: ( rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2 )
            // InternalAltarica.g:2819:2: rule__EventDeclaration__Group__1__Impl rule__EventDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2826:1: rule__EventDeclaration__Group__1__Impl : ( 'event' ) ;
    public final void rule__EventDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2830:1: ( ( 'event' ) )
            // InternalAltarica.g:2831:1: ( 'event' )
            {
            // InternalAltarica.g:2831:1: ( 'event' )
            // InternalAltarica.g:2832:1: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getEventKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2845:1: rule__EventDeclaration__Group__2 : rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 ;
    public final void rule__EventDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2849:1: ( rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3 )
            // InternalAltarica.g:2850:2: rule__EventDeclaration__Group__2__Impl rule__EventDeclaration__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAltarica.g:2857:1: rule__EventDeclaration__Group__2__Impl : ( ( rule__EventDeclaration__NameAssignment_2 ) ) ;
    public final void rule__EventDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2861:1: ( ( ( rule__EventDeclaration__NameAssignment_2 ) ) )
            // InternalAltarica.g:2862:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            {
            // InternalAltarica.g:2862:1: ( ( rule__EventDeclaration__NameAssignment_2 ) )
            // InternalAltarica.g:2863:1: ( rule__EventDeclaration__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getNameAssignment_2()); 
            }
            // InternalAltarica.g:2864:1: ( rule__EventDeclaration__NameAssignment_2 )
            // InternalAltarica.g:2864:2: rule__EventDeclaration__NameAssignment_2
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
    // InternalAltarica.g:2874:1: rule__EventDeclaration__Group__3 : rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 ;
    public final void rule__EventDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2878:1: ( rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4 )
            // InternalAltarica.g:2879:2: rule__EventDeclaration__Group__3__Impl rule__EventDeclaration__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalAltarica.g:2886:1: rule__EventDeclaration__Group__3__Impl : ( ( rule__EventDeclaration__Group_3__0 )? ) ;
    public final void rule__EventDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2890:1: ( ( ( rule__EventDeclaration__Group_3__0 )? ) )
            // InternalAltarica.g:2891:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            {
            // InternalAltarica.g:2891:1: ( ( rule__EventDeclaration__Group_3__0 )? )
            // InternalAltarica.g:2892:1: ( rule__EventDeclaration__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3()); 
            }
            // InternalAltarica.g:2893:1: ( rule__EventDeclaration__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAltarica.g:2893:2: rule__EventDeclaration__Group_3__0
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
    // InternalAltarica.g:2903:1: rule__EventDeclaration__Group__4 : rule__EventDeclaration__Group__4__Impl ;
    public final void rule__EventDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2907:1: ( rule__EventDeclaration__Group__4__Impl )
            // InternalAltarica.g:2908:2: rule__EventDeclaration__Group__4__Impl
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
    // InternalAltarica.g:2914:1: rule__EventDeclaration__Group__4__Impl : ( ';' ) ;
    public final void rule__EventDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2918:1: ( ( ';' ) )
            // InternalAltarica.g:2919:1: ( ';' )
            {
            // InternalAltarica.g:2919:1: ( ';' )
            // InternalAltarica.g:2920:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2943:1: rule__EventDeclaration__Group_3__0 : rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 ;
    public final void rule__EventDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2947:1: ( rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1 )
            // InternalAltarica.g:2948:2: rule__EventDeclaration__Group_3__0__Impl rule__EventDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:2955:1: rule__EventDeclaration__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EventDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2959:1: ( ( '(' ) )
            // InternalAltarica.g:2960:1: ( '(' )
            {
            // InternalAltarica.g:2960:1: ( '(' )
            // InternalAltarica.g:2961:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:2974:1: rule__EventDeclaration__Group_3__1 : rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 ;
    public final void rule__EventDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2978:1: ( rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2 )
            // InternalAltarica.g:2979:2: rule__EventDeclaration__Group_3__1__Impl rule__EventDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAltarica.g:2986:1: rule__EventDeclaration__Group_3__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) ;
    public final void rule__EventDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:2990:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) ) )
            // InternalAltarica.g:2991:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            {
            // InternalAltarica.g:2991:1: ( ( rule__EventDeclaration__AttributesAssignment_3_1 ) )
            // InternalAltarica.g:2992:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_1()); 
            }
            // InternalAltarica.g:2993:1: ( rule__EventDeclaration__AttributesAssignment_3_1 )
            // InternalAltarica.g:2993:2: rule__EventDeclaration__AttributesAssignment_3_1
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
    // InternalAltarica.g:3003:1: rule__EventDeclaration__Group_3__2 : rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 ;
    public final void rule__EventDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3007:1: ( rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3 )
            // InternalAltarica.g:3008:2: rule__EventDeclaration__Group_3__2__Impl rule__EventDeclaration__Group_3__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAltarica.g:3015:1: rule__EventDeclaration__Group_3__2__Impl : ( ( rule__EventDeclaration__Group_3_2__0 )* ) ;
    public final void rule__EventDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3019:1: ( ( ( rule__EventDeclaration__Group_3_2__0 )* ) )
            // InternalAltarica.g:3020:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            {
            // InternalAltarica.g:3020:1: ( ( rule__EventDeclaration__Group_3_2__0 )* )
            // InternalAltarica.g:3021:1: ( rule__EventDeclaration__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getGroup_3_2()); 
            }
            // InternalAltarica.g:3022:1: ( rule__EventDeclaration__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAltarica.g:3022:2: rule__EventDeclaration__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalAltarica.g:3032:1: rule__EventDeclaration__Group_3__3 : rule__EventDeclaration__Group_3__3__Impl ;
    public final void rule__EventDeclaration__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3036:1: ( rule__EventDeclaration__Group_3__3__Impl )
            // InternalAltarica.g:3037:2: rule__EventDeclaration__Group_3__3__Impl
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
    // InternalAltarica.g:3043:1: rule__EventDeclaration__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EventDeclaration__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3047:1: ( ( ')' ) )
            // InternalAltarica.g:3048:1: ( ')' )
            {
            // InternalAltarica.g:3048:1: ( ')' )
            // InternalAltarica.g:3049:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3070:1: rule__EventDeclaration__Group_3_2__0 : rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 ;
    public final void rule__EventDeclaration__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3074:1: ( rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1 )
            // InternalAltarica.g:3075:2: rule__EventDeclaration__Group_3_2__0__Impl rule__EventDeclaration__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:3082:1: rule__EventDeclaration__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EventDeclaration__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3086:1: ( ( ',' ) )
            // InternalAltarica.g:3087:1: ( ',' )
            {
            // InternalAltarica.g:3087:1: ( ',' )
            // InternalAltarica.g:3088:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3101:1: rule__EventDeclaration__Group_3_2__1 : rule__EventDeclaration__Group_3_2__1__Impl ;
    public final void rule__EventDeclaration__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3105:1: ( rule__EventDeclaration__Group_3_2__1__Impl )
            // InternalAltarica.g:3106:2: rule__EventDeclaration__Group_3_2__1__Impl
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
    // InternalAltarica.g:3112:1: rule__EventDeclaration__Group_3_2__1__Impl : ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) ;
    public final void rule__EventDeclaration__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3116:1: ( ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) ) )
            // InternalAltarica.g:3117:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            {
            // InternalAltarica.g:3117:1: ( ( rule__EventDeclaration__AttributesAssignment_3_2_1 ) )
            // InternalAltarica.g:3118:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventDeclarationAccess().getAttributesAssignment_3_2_1()); 
            }
            // InternalAltarica.g:3119:1: ( rule__EventDeclaration__AttributesAssignment_3_2_1 )
            // InternalAltarica.g:3119:2: rule__EventDeclaration__AttributesAssignment_3_2_1
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
    // InternalAltarica.g:3133:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3137:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // InternalAltarica.g:3138:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAltarica.g:3145:1: rule__ParameterDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3149:1: ( ( () ) )
            // InternalAltarica.g:3150:1: ( () )
            {
            // InternalAltarica.g:3150:1: ( () )
            // InternalAltarica.g:3151:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterAction_0()); 
            }
            // InternalAltarica.g:3152:1: ()
            // InternalAltarica.g:3154:1: 
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
    // InternalAltarica.g:3164:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3168:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // InternalAltarica.g:3169:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAltarica.g:3176:1: rule__ParameterDeclaration__Group__1__Impl : ( 'parameter' ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3180:1: ( ( 'parameter' ) )
            // InternalAltarica.g:3181:1: ( 'parameter' )
            {
            // InternalAltarica.g:3181:1: ( 'parameter' )
            // InternalAltarica.g:3182:1: 'parameter'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3195:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3199:1: ( rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3 )
            // InternalAltarica.g:3200:2: rule__ParameterDeclaration__Group__2__Impl rule__ParameterDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:3207:1: rule__ParameterDeclaration__Group__2__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3211:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_2 ) ) )
            // InternalAltarica.g:3212:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            {
            // InternalAltarica.g:3212:1: ( ( rule__ParameterDeclaration__TypeAssignment_2 ) )
            // InternalAltarica.g:3213:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_2()); 
            }
            // InternalAltarica.g:3214:1: ( rule__ParameterDeclaration__TypeAssignment_2 )
            // InternalAltarica.g:3214:2: rule__ParameterDeclaration__TypeAssignment_2
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
    // InternalAltarica.g:3224:1: rule__ParameterDeclaration__Group__3 : rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 ;
    public final void rule__ParameterDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3228:1: ( rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4 )
            // InternalAltarica.g:3229:2: rule__ParameterDeclaration__Group__3__Impl rule__ParameterDeclaration__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalAltarica.g:3236:1: rule__ParameterDeclaration__Group__3__Impl : ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ParameterDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3240:1: ( ( ( rule__ParameterDeclaration__NameAssignment_3 ) ) )
            // InternalAltarica.g:3241:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            {
            // InternalAltarica.g:3241:1: ( ( rule__ParameterDeclaration__NameAssignment_3 ) )
            // InternalAltarica.g:3242:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_3()); 
            }
            // InternalAltarica.g:3243:1: ( rule__ParameterDeclaration__NameAssignment_3 )
            // InternalAltarica.g:3243:2: rule__ParameterDeclaration__NameAssignment_3
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
    // InternalAltarica.g:3253:1: rule__ParameterDeclaration__Group__4 : rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 ;
    public final void rule__ParameterDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3257:1: ( rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5 )
            // InternalAltarica.g:3258:2: rule__ParameterDeclaration__Group__4__Impl rule__ParameterDeclaration__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:3265:1: rule__ParameterDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ParameterDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3269:1: ( ( '=' ) )
            // InternalAltarica.g:3270:1: ( '=' )
            {
            // InternalAltarica.g:3270:1: ( '=' )
            // InternalAltarica.g:3271:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3284:1: rule__ParameterDeclaration__Group__5 : rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 ;
    public final void rule__ParameterDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3288:1: ( rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6 )
            // InternalAltarica.g:3289:2: rule__ParameterDeclaration__Group__5__Impl rule__ParameterDeclaration__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalAltarica.g:3296:1: rule__ParameterDeclaration__Group__5__Impl : ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ParameterDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3300:1: ( ( ( rule__ParameterDeclaration__ValueAssignment_5 ) ) )
            // InternalAltarica.g:3301:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            {
            // InternalAltarica.g:3301:1: ( ( rule__ParameterDeclaration__ValueAssignment_5 ) )
            // InternalAltarica.g:3302:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getValueAssignment_5()); 
            }
            // InternalAltarica.g:3303:1: ( rule__ParameterDeclaration__ValueAssignment_5 )
            // InternalAltarica.g:3303:2: rule__ParameterDeclaration__ValueAssignment_5
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
    // InternalAltarica.g:3313:1: rule__ParameterDeclaration__Group__6 : rule__ParameterDeclaration__Group__6__Impl ;
    public final void rule__ParameterDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3317:1: ( rule__ParameterDeclaration__Group__6__Impl )
            // InternalAltarica.g:3318:2: rule__ParameterDeclaration__Group__6__Impl
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
    // InternalAltarica.g:3324:1: rule__ParameterDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ParameterDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3328:1: ( ( ';' ) )
            // InternalAltarica.g:3329:1: ( ';' )
            {
            // InternalAltarica.g:3329:1: ( ';' )
            // InternalAltarica.g:3330:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3357:1: rule__ObserverDeclaration__Group__0 : rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 ;
    public final void rule__ObserverDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3361:1: ( rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1 )
            // InternalAltarica.g:3362:2: rule__ObserverDeclaration__Group__0__Impl rule__ObserverDeclaration__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAltarica.g:3369:1: rule__ObserverDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__ObserverDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3373:1: ( ( () ) )
            // InternalAltarica.g:3374:1: ( () )
            {
            // InternalAltarica.g:3374:1: ( () )
            // InternalAltarica.g:3375:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverAction_0()); 
            }
            // InternalAltarica.g:3376:1: ()
            // InternalAltarica.g:3378:1: 
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
    // InternalAltarica.g:3388:1: rule__ObserverDeclaration__Group__1 : rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 ;
    public final void rule__ObserverDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3392:1: ( rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2 )
            // InternalAltarica.g:3393:2: rule__ObserverDeclaration__Group__1__Impl rule__ObserverDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAltarica.g:3400:1: rule__ObserverDeclaration__Group__1__Impl : ( 'observer' ) ;
    public final void rule__ObserverDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3404:1: ( ( 'observer' ) )
            // InternalAltarica.g:3405:1: ( 'observer' )
            {
            // InternalAltarica.g:3405:1: ( 'observer' )
            // InternalAltarica.g:3406:1: 'observer'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3419:1: rule__ObserverDeclaration__Group__2 : rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 ;
    public final void rule__ObserverDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3423:1: ( rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3 )
            // InternalAltarica.g:3424:2: rule__ObserverDeclaration__Group__2__Impl rule__ObserverDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:3431:1: rule__ObserverDeclaration__Group__2__Impl : ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ObserverDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3435:1: ( ( ( rule__ObserverDeclaration__TypeAssignment_2 ) ) )
            // InternalAltarica.g:3436:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            {
            // InternalAltarica.g:3436:1: ( ( rule__ObserverDeclaration__TypeAssignment_2 ) )
            // InternalAltarica.g:3437:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getTypeAssignment_2()); 
            }
            // InternalAltarica.g:3438:1: ( rule__ObserverDeclaration__TypeAssignment_2 )
            // InternalAltarica.g:3438:2: rule__ObserverDeclaration__TypeAssignment_2
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
    // InternalAltarica.g:3448:1: rule__ObserverDeclaration__Group__3 : rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 ;
    public final void rule__ObserverDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3452:1: ( rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4 )
            // InternalAltarica.g:3453:2: rule__ObserverDeclaration__Group__3__Impl rule__ObserverDeclaration__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalAltarica.g:3460:1: rule__ObserverDeclaration__Group__3__Impl : ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) ;
    public final void rule__ObserverDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3464:1: ( ( ( rule__ObserverDeclaration__NameAssignment_3 ) ) )
            // InternalAltarica.g:3465:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            {
            // InternalAltarica.g:3465:1: ( ( rule__ObserverDeclaration__NameAssignment_3 ) )
            // InternalAltarica.g:3466:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getNameAssignment_3()); 
            }
            // InternalAltarica.g:3467:1: ( rule__ObserverDeclaration__NameAssignment_3 )
            // InternalAltarica.g:3467:2: rule__ObserverDeclaration__NameAssignment_3
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
    // InternalAltarica.g:3477:1: rule__ObserverDeclaration__Group__4 : rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 ;
    public final void rule__ObserverDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3481:1: ( rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5 )
            // InternalAltarica.g:3482:2: rule__ObserverDeclaration__Group__4__Impl rule__ObserverDeclaration__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:3489:1: rule__ObserverDeclaration__Group__4__Impl : ( '=' ) ;
    public final void rule__ObserverDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3493:1: ( ( '=' ) )
            // InternalAltarica.g:3494:1: ( '=' )
            {
            // InternalAltarica.g:3494:1: ( '=' )
            // InternalAltarica.g:3495:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3508:1: rule__ObserverDeclaration__Group__5 : rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 ;
    public final void rule__ObserverDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3512:1: ( rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6 )
            // InternalAltarica.g:3513:2: rule__ObserverDeclaration__Group__5__Impl rule__ObserverDeclaration__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalAltarica.g:3520:1: rule__ObserverDeclaration__Group__5__Impl : ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) ;
    public final void rule__ObserverDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3524:1: ( ( ( rule__ObserverDeclaration__ValueAssignment_5 ) ) )
            // InternalAltarica.g:3525:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            {
            // InternalAltarica.g:3525:1: ( ( rule__ObserverDeclaration__ValueAssignment_5 ) )
            // InternalAltarica.g:3526:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getValueAssignment_5()); 
            }
            // InternalAltarica.g:3527:1: ( rule__ObserverDeclaration__ValueAssignment_5 )
            // InternalAltarica.g:3527:2: rule__ObserverDeclaration__ValueAssignment_5
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
    // InternalAltarica.g:3537:1: rule__ObserverDeclaration__Group__6 : rule__ObserverDeclaration__Group__6__Impl ;
    public final void rule__ObserverDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3541:1: ( rule__ObserverDeclaration__Group__6__Impl )
            // InternalAltarica.g:3542:2: rule__ObserverDeclaration__Group__6__Impl
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
    // InternalAltarica.g:3548:1: rule__ObserverDeclaration__Group__6__Impl : ( ';' ) ;
    public final void rule__ObserverDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3552:1: ( ( ';' ) )
            // InternalAltarica.g:3553:1: ( ';' )
            {
            // InternalAltarica.g:3553:1: ( ';' )
            // InternalAltarica.g:3554:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3581:1: rule__LabeledTransition__Group__0 : rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 ;
    public final void rule__LabeledTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3585:1: ( rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1 )
            // InternalAltarica.g:3586:2: rule__LabeledTransition__Group__0__Impl rule__LabeledTransition__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAltarica.g:3593:1: rule__LabeledTransition__Group__0__Impl : ( ( rule__LabeledTransition__EventAssignment_0 ) ) ;
    public final void rule__LabeledTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3597:1: ( ( ( rule__LabeledTransition__EventAssignment_0 ) ) )
            // InternalAltarica.g:3598:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            {
            // InternalAltarica.g:3598:1: ( ( rule__LabeledTransition__EventAssignment_0 ) )
            // InternalAltarica.g:3599:1: ( rule__LabeledTransition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getEventAssignment_0()); 
            }
            // InternalAltarica.g:3600:1: ( rule__LabeledTransition__EventAssignment_0 )
            // InternalAltarica.g:3600:2: rule__LabeledTransition__EventAssignment_0
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
    // InternalAltarica.g:3610:1: rule__LabeledTransition__Group__1 : rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 ;
    public final void rule__LabeledTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3614:1: ( rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2 )
            // InternalAltarica.g:3615:2: rule__LabeledTransition__Group__1__Impl rule__LabeledTransition__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:3622:1: rule__LabeledTransition__Group__1__Impl : ( ':' ) ;
    public final void rule__LabeledTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3626:1: ( ( ':' ) )
            // InternalAltarica.g:3627:1: ( ':' )
            {
            // InternalAltarica.g:3627:1: ( ':' )
            // InternalAltarica.g:3628:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getColonKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3641:1: rule__LabeledTransition__Group__2 : rule__LabeledTransition__Group__2__Impl ;
    public final void rule__LabeledTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3645:1: ( rule__LabeledTransition__Group__2__Impl )
            // InternalAltarica.g:3646:2: rule__LabeledTransition__Group__2__Impl
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
    // InternalAltarica.g:3652:1: rule__LabeledTransition__Group__2__Impl : ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) ;
    public final void rule__LabeledTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3656:1: ( ( ( rule__LabeledTransition__ExpressionAssignment_2 ) ) )
            // InternalAltarica.g:3657:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            {
            // InternalAltarica.g:3657:1: ( ( rule__LabeledTransition__ExpressionAssignment_2 ) )
            // InternalAltarica.g:3658:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLabeledTransitionAccess().getExpressionAssignment_2()); 
            }
            // InternalAltarica.g:3659:1: ( rule__LabeledTransition__ExpressionAssignment_2 )
            // InternalAltarica.g:3659:2: rule__LabeledTransition__ExpressionAssignment_2
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
    // InternalAltarica.g:3675:1: rule__TransitionAnd__Group__0 : rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 ;
    public final void rule__TransitionAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3679:1: ( rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1 )
            // InternalAltarica.g:3680:2: rule__TransitionAnd__Group__0__Impl rule__TransitionAnd__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAltarica.g:3687:1: rule__TransitionAnd__Group__0__Impl : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3691:1: ( ( ruleTransitionOr ) )
            // InternalAltarica.g:3692:1: ( ruleTransitionOr )
            {
            // InternalAltarica.g:3692:1: ( ruleTransitionOr )
            // InternalAltarica.g:3693:1: ruleTransitionOr
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
    // InternalAltarica.g:3704:1: rule__TransitionAnd__Group__1 : rule__TransitionAnd__Group__1__Impl ;
    public final void rule__TransitionAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3708:1: ( rule__TransitionAnd__Group__1__Impl )
            // InternalAltarica.g:3709:2: rule__TransitionAnd__Group__1__Impl
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
    // InternalAltarica.g:3715:1: rule__TransitionAnd__Group__1__Impl : ( ( rule__TransitionAnd__Group_1__0 )* ) ;
    public final void rule__TransitionAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3719:1: ( ( ( rule__TransitionAnd__Group_1__0 )* ) )
            // InternalAltarica.g:3720:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            {
            // InternalAltarica.g:3720:1: ( ( rule__TransitionAnd__Group_1__0 )* )
            // InternalAltarica.g:3721:1: ( rule__TransitionAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getGroup_1()); 
            }
            // InternalAltarica.g:3722:1: ( rule__TransitionAnd__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAltarica.g:3722:2: rule__TransitionAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
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
    // InternalAltarica.g:3736:1: rule__TransitionAnd__Group_1__0 : rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 ;
    public final void rule__TransitionAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3740:1: ( rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1 )
            // InternalAltarica.g:3741:2: rule__TransitionAnd__Group_1__0__Impl rule__TransitionAnd__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAltarica.g:3748:1: rule__TransitionAnd__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3752:1: ( ( () ) )
            // InternalAltarica.g:3753:1: ( () )
            {
            // InternalAltarica.g:3753:1: ( () )
            // InternalAltarica.g:3754:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0()); 
            }
            // InternalAltarica.g:3755:1: ()
            // InternalAltarica.g:3757:1: 
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
    // InternalAltarica.g:3767:1: rule__TransitionAnd__Group_1__1 : rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 ;
    public final void rule__TransitionAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3771:1: ( rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2 )
            // InternalAltarica.g:3772:2: rule__TransitionAnd__Group_1__1__Impl rule__TransitionAnd__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:3779:1: rule__TransitionAnd__Group_1__1__Impl : ( '&' ) ;
    public final void rule__TransitionAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3783:1: ( ( '&' ) )
            // InternalAltarica.g:3784:1: ( '&' )
            {
            // InternalAltarica.g:3784:1: ( '&' )
            // InternalAltarica.g:3785:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3798:1: rule__TransitionAnd__Group_1__2 : rule__TransitionAnd__Group_1__2__Impl ;
    public final void rule__TransitionAnd__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3802:1: ( rule__TransitionAnd__Group_1__2__Impl )
            // InternalAltarica.g:3803:2: rule__TransitionAnd__Group_1__2__Impl
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
    // InternalAltarica.g:3809:1: rule__TransitionAnd__Group_1__2__Impl : ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionAnd__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3813:1: ( ( ( rule__TransitionAnd__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:3814:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:3814:1: ( ( rule__TransitionAnd__RightAssignment_1_2 ) )
            // InternalAltarica.g:3815:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAndAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:3816:1: ( rule__TransitionAnd__RightAssignment_1_2 )
            // InternalAltarica.g:3816:2: rule__TransitionAnd__RightAssignment_1_2
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
    // InternalAltarica.g:3832:1: rule__TransitionOr__Group__0 : rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 ;
    public final void rule__TransitionOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3836:1: ( rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1 )
            // InternalAltarica.g:3837:2: rule__TransitionOr__Group__0__Impl rule__TransitionOr__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAltarica.g:3844:1: rule__TransitionOr__Group__0__Impl : ( ruleTransition ) ;
    public final void rule__TransitionOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3848:1: ( ( ruleTransition ) )
            // InternalAltarica.g:3849:1: ( ruleTransition )
            {
            // InternalAltarica.g:3849:1: ( ruleTransition )
            // InternalAltarica.g:3850:1: ruleTransition
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
    // InternalAltarica.g:3861:1: rule__TransitionOr__Group__1 : rule__TransitionOr__Group__1__Impl ;
    public final void rule__TransitionOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3865:1: ( rule__TransitionOr__Group__1__Impl )
            // InternalAltarica.g:3866:2: rule__TransitionOr__Group__1__Impl
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
    // InternalAltarica.g:3872:1: rule__TransitionOr__Group__1__Impl : ( ( rule__TransitionOr__Group_1__0 )* ) ;
    public final void rule__TransitionOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3876:1: ( ( ( rule__TransitionOr__Group_1__0 )* ) )
            // InternalAltarica.g:3877:1: ( ( rule__TransitionOr__Group_1__0 )* )
            {
            // InternalAltarica.g:3877:1: ( ( rule__TransitionOr__Group_1__0 )* )
            // InternalAltarica.g:3878:1: ( rule__TransitionOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getGroup_1()); 
            }
            // InternalAltarica.g:3879:1: ( rule__TransitionOr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAltarica.g:3879:2: rule__TransitionOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
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
    // InternalAltarica.g:3893:1: rule__TransitionOr__Group_1__0 : rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 ;
    public final void rule__TransitionOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3897:1: ( rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1 )
            // InternalAltarica.g:3898:2: rule__TransitionOr__Group_1__0__Impl rule__TransitionOr__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAltarica.g:3905:1: rule__TransitionOr__Group_1__0__Impl : ( () ) ;
    public final void rule__TransitionOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3909:1: ( ( () ) )
            // InternalAltarica.g:3910:1: ( () )
            {
            // InternalAltarica.g:3910:1: ( () )
            // InternalAltarica.g:3911:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0()); 
            }
            // InternalAltarica.g:3912:1: ()
            // InternalAltarica.g:3914:1: 
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
    // InternalAltarica.g:3924:1: rule__TransitionOr__Group_1__1 : rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 ;
    public final void rule__TransitionOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3928:1: ( rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2 )
            // InternalAltarica.g:3929:2: rule__TransitionOr__Group_1__1__Impl rule__TransitionOr__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:3936:1: rule__TransitionOr__Group_1__1__Impl : ( '|' ) ;
    public final void rule__TransitionOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3940:1: ( ( '|' ) )
            // InternalAltarica.g:3941:1: ( '|' )
            {
            // InternalAltarica.g:3941:1: ( '|' )
            // InternalAltarica.g:3942:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:3955:1: rule__TransitionOr__Group_1__2 : rule__TransitionOr__Group_1__2__Impl ;
    public final void rule__TransitionOr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3959:1: ( rule__TransitionOr__Group_1__2__Impl )
            // InternalAltarica.g:3960:2: rule__TransitionOr__Group_1__2__Impl
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
    // InternalAltarica.g:3966:1: rule__TransitionOr__Group_1__2__Impl : ( ( rule__TransitionOr__RightAssignment_1_2 ) ) ;
    public final void rule__TransitionOr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3970:1: ( ( ( rule__TransitionOr__RightAssignment_1_2 ) ) )
            // InternalAltarica.g:3971:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            {
            // InternalAltarica.g:3971:1: ( ( rule__TransitionOr__RightAssignment_1_2 ) )
            // InternalAltarica.g:3972:1: ( rule__TransitionOr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionOrAccess().getRightAssignment_1_2()); 
            }
            // InternalAltarica.g:3973:1: ( rule__TransitionOr__RightAssignment_1_2 )
            // InternalAltarica.g:3973:2: rule__TransitionOr__RightAssignment_1_2
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
    // InternalAltarica.g:3989:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:3993:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalAltarica.g:3994:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:4001:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4005:1: ( ( () ) )
            // InternalAltarica.g:4006:1: ( () )
            {
            // InternalAltarica.g:4006:1: ( () )
            // InternalAltarica.g:4007:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            }
            // InternalAltarica.g:4008:1: ()
            // InternalAltarica.g:4010:1: 
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
    // InternalAltarica.g:4020:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4024:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalAltarica.g:4025:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalAltarica.g:4032:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__GuardAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4036:1: ( ( ( rule__Transition__GuardAssignment_1 ) ) )
            // InternalAltarica.g:4037:1: ( ( rule__Transition__GuardAssignment_1 ) )
            {
            // InternalAltarica.g:4037:1: ( ( rule__Transition__GuardAssignment_1 ) )
            // InternalAltarica.g:4038:1: ( rule__Transition__GuardAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }
            // InternalAltarica.g:4039:1: ( rule__Transition__GuardAssignment_1 )
            // InternalAltarica.g:4039:2: rule__Transition__GuardAssignment_1
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
    // InternalAltarica.g:4049:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4053:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalAltarica.g:4054:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalAltarica.g:4061:1: rule__Transition__Group__2__Impl : ( '->' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4065:1: ( ( '->' ) )
            // InternalAltarica.g:4066:1: ( '->' )
            {
            // InternalAltarica.g:4066:1: ( '->' )
            // InternalAltarica.g:4067:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4080:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4084:1: ( rule__Transition__Group__3__Impl )
            // InternalAltarica.g:4085:2: rule__Transition__Group__3__Impl
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
    // InternalAltarica.g:4091:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__ActionAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4095:1: ( ( ( rule__Transition__ActionAssignment_3 ) ) )
            // InternalAltarica.g:4096:1: ( ( rule__Transition__ActionAssignment_3 ) )
            {
            // InternalAltarica.g:4096:1: ( ( rule__Transition__ActionAssignment_3 ) )
            // InternalAltarica.g:4097:1: ( rule__Transition__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_3()); 
            }
            // InternalAltarica.g:4098:1: ( rule__Transition__ActionAssignment_3 )
            // InternalAltarica.g:4098:2: rule__Transition__ActionAssignment_3
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
    // InternalAltarica.g:4116:1: rule__Skip__Group__0 : rule__Skip__Group__0__Impl rule__Skip__Group__1 ;
    public final void rule__Skip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4120:1: ( rule__Skip__Group__0__Impl rule__Skip__Group__1 )
            // InternalAltarica.g:4121:2: rule__Skip__Group__0__Impl rule__Skip__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAltarica.g:4128:1: rule__Skip__Group__0__Impl : ( () ) ;
    public final void rule__Skip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4132:1: ( ( () ) )
            // InternalAltarica.g:4133:1: ( () )
            {
            // InternalAltarica.g:4133:1: ( () )
            // InternalAltarica.g:4134:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipAction_0()); 
            }
            // InternalAltarica.g:4135:1: ()
            // InternalAltarica.g:4137:1: 
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
    // InternalAltarica.g:4147:1: rule__Skip__Group__1 : rule__Skip__Group__1__Impl rule__Skip__Group__2 ;
    public final void rule__Skip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4151:1: ( rule__Skip__Group__1__Impl rule__Skip__Group__2 )
            // InternalAltarica.g:4152:2: rule__Skip__Group__1__Impl rule__Skip__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalAltarica.g:4159:1: rule__Skip__Group__1__Impl : ( 'skip' ) ;
    public final void rule__Skip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4163:1: ( ( 'skip' ) )
            // InternalAltarica.g:4164:1: ( 'skip' )
            {
            // InternalAltarica.g:4164:1: ( 'skip' )
            // InternalAltarica.g:4165:1: 'skip'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSkipKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4178:1: rule__Skip__Group__2 : rule__Skip__Group__2__Impl ;
    public final void rule__Skip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4182:1: ( rule__Skip__Group__2__Impl )
            // InternalAltarica.g:4183:2: rule__Skip__Group__2__Impl
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
    // InternalAltarica.g:4189:1: rule__Skip__Group__2__Impl : ( ';' ) ;
    public final void rule__Skip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4193:1: ( ( ';' ) )
            // InternalAltarica.g:4194:1: ( ';' )
            {
            // InternalAltarica.g:4194:1: ( ';' )
            // InternalAltarica.g:4195:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSkipAccess().getSemicolonKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4214:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4218:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalAltarica.g:4219:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:4226:1: rule__Assignment__Group__0__Impl : ( () ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4230:1: ( ( () ) )
            // InternalAltarica.g:4231:1: ( () )
            {
            // InternalAltarica.g:4231:1: ( () )
            // InternalAltarica.g:4232:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getAssignmentAction_0()); 
            }
            // InternalAltarica.g:4233:1: ()
            // InternalAltarica.g:4235:1: 
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
    // InternalAltarica.g:4245:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4249:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalAltarica.g:4250:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAltarica.g:4257:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__VariableAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4261:1: ( ( ( rule__Assignment__VariableAssignment_1 ) ) )
            // InternalAltarica.g:4262:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            {
            // InternalAltarica.g:4262:1: ( ( rule__Assignment__VariableAssignment_1 ) )
            // InternalAltarica.g:4263:1: ( rule__Assignment__VariableAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getVariableAssignment_1()); 
            }
            // InternalAltarica.g:4264:1: ( rule__Assignment__VariableAssignment_1 )
            // InternalAltarica.g:4264:2: rule__Assignment__VariableAssignment_1
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
    // InternalAltarica.g:4274:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4278:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // InternalAltarica.g:4279:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:4286:1: rule__Assignment__Group__2__Impl : ( ':=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4290:1: ( ( ':=' ) )
            // InternalAltarica.g:4291:1: ( ':=' )
            {
            // InternalAltarica.g:4291:1: ( ':=' )
            // InternalAltarica.g:4292:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4305:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl rule__Assignment__Group__4 ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4309:1: ( rule__Assignment__Group__3__Impl rule__Assignment__Group__4 )
            // InternalAltarica.g:4310:2: rule__Assignment__Group__3__Impl rule__Assignment__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalAltarica.g:4317:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4321:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // InternalAltarica.g:4322:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // InternalAltarica.g:4322:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // InternalAltarica.g:4323:1: ( rule__Assignment__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            }
            // InternalAltarica.g:4324:1: ( rule__Assignment__ValueAssignment_3 )
            // InternalAltarica.g:4324:2: rule__Assignment__ValueAssignment_3
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
    // InternalAltarica.g:4334:1: rule__Assignment__Group__4 : rule__Assignment__Group__4__Impl ;
    public final void rule__Assignment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4338:1: ( rule__Assignment__Group__4__Impl )
            // InternalAltarica.g:4339:2: rule__Assignment__Group__4__Impl
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
    // InternalAltarica.g:4345:1: rule__Assignment__Group__4__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4349:1: ( ( ';' ) )
            // InternalAltarica.g:4350:1: ( ';' )
            {
            // InternalAltarica.g:4350:1: ( ';' )
            // InternalAltarica.g:4351:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4374:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4378:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAltarica.g:4379:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalAltarica.g:4386:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4390:1: ( ( () ) )
            // InternalAltarica.g:4391:1: ( () )
            {
            // InternalAltarica.g:4391:1: ( () )
            // InternalAltarica.g:4392:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // InternalAltarica.g:4393:1: ()
            // InternalAltarica.g:4395:1: 
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
    // InternalAltarica.g:4405:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4409:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAltarica.g:4410:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAltarica.g:4417:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4421:1: ( ( '{' ) )
            // InternalAltarica.g:4422:1: ( '{' )
            {
            // InternalAltarica.g:4422:1: ( '{' )
            // InternalAltarica.g:4423:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4436:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4440:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAltarica.g:4441:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalAltarica.g:4448:1: rule__Block__Group__2__Impl : ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4452:1: ( ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) ) )
            // InternalAltarica.g:4453:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            {
            // InternalAltarica.g:4453:1: ( ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* ) )
            // InternalAltarica.g:4454:1: ( ( rule__Block__InstructionsAssignment_2 ) ) ( ( rule__Block__InstructionsAssignment_2 )* )
            {
            // InternalAltarica.g:4454:1: ( ( rule__Block__InstructionsAssignment_2 ) )
            // InternalAltarica.g:4455:1: ( rule__Block__InstructionsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // InternalAltarica.g:4456:1: ( rule__Block__InstructionsAssignment_2 )
            // InternalAltarica.g:4456:2: rule__Block__InstructionsAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__Block__InstructionsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }

            }

            // InternalAltarica.g:4459:1: ( ( rule__Block__InstructionsAssignment_2 )* )
            // InternalAltarica.g:4460:1: ( rule__Block__InstructionsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getInstructionsAssignment_2()); 
            }
            // InternalAltarica.g:4461:1: ( rule__Block__InstructionsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==34||LA27_0==52||LA27_0==54||LA27_0==57) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAltarica.g:4461:2: rule__Block__InstructionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalAltarica.g:4472:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4476:1: ( rule__Block__Group__3__Impl )
            // InternalAltarica.g:4477:2: rule__Block__Group__3__Impl
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
    // InternalAltarica.g:4483:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4487:1: ( ( '}' ) )
            // InternalAltarica.g:4488:1: ( '}' )
            {
            // InternalAltarica.g:4488:1: ( '}' )
            // InternalAltarica.g:4489:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4510:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4514:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalAltarica.g:4515:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAltarica.g:4522:1: rule__Conditional__Group__0__Impl : ( () ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4526:1: ( ( () ) )
            // InternalAltarica.g:4527:1: ( () )
            {
            // InternalAltarica.g:4527:1: ( () )
            // InternalAltarica.g:4528:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionalAction_0()); 
            }
            // InternalAltarica.g:4529:1: ()
            // InternalAltarica.g:4531:1: 
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
    // InternalAltarica.g:4541:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4545:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalAltarica.g:4546:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:4553:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4557:1: ( ( 'if' ) )
            // InternalAltarica.g:4558:1: ( 'if' )
            {
            // InternalAltarica.g:4558:1: ( 'if' )
            // InternalAltarica.g:4559:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4572:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4576:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalAltarica.g:4577:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAltarica.g:4584:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4588:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // InternalAltarica.g:4589:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // InternalAltarica.g:4589:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // InternalAltarica.g:4590:1: ( rule__Conditional__ConditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            }
            // InternalAltarica.g:4591:1: ( rule__Conditional__ConditionAssignment_2 )
            // InternalAltarica.g:4591:2: rule__Conditional__ConditionAssignment_2
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
    // InternalAltarica.g:4601:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4605:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalAltarica.g:4606:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAltarica.g:4613:1: rule__Conditional__Group__3__Impl : ( 'then' ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4617:1: ( ( 'then' ) )
            // InternalAltarica.g:4618:1: ( 'then' )
            {
            // InternalAltarica.g:4618:1: ( 'then' )
            // InternalAltarica.g:4619:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenKeyword_3()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4632:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4636:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalAltarica.g:4637:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_36);
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
    // InternalAltarica.g:4644:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ThenAssignment_4 ) ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4648:1: ( ( ( rule__Conditional__ThenAssignment_4 ) ) )
            // InternalAltarica.g:4649:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            {
            // InternalAltarica.g:4649:1: ( ( rule__Conditional__ThenAssignment_4 ) )
            // InternalAltarica.g:4650:1: ( rule__Conditional__ThenAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getThenAssignment_4()); 
            }
            // InternalAltarica.g:4651:1: ( rule__Conditional__ThenAssignment_4 )
            // InternalAltarica.g:4651:2: rule__Conditional__ThenAssignment_4
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
    // InternalAltarica.g:4661:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl rule__Conditional__Group__6 ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4665:1: ( rule__Conditional__Group__5__Impl rule__Conditional__Group__6 )
            // InternalAltarica.g:4666:2: rule__Conditional__Group__5__Impl rule__Conditional__Group__6
            {
            pushFollow(FOLLOW_36);
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
    // InternalAltarica.g:4673:1: rule__Conditional__Group__5__Impl : ( ( rule__Conditional__Group_5__0 )? ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4677:1: ( ( ( rule__Conditional__Group_5__0 )? ) )
            // InternalAltarica.g:4678:1: ( ( rule__Conditional__Group_5__0 )? )
            {
            // InternalAltarica.g:4678:1: ( ( rule__Conditional__Group_5__0 )? )
            // InternalAltarica.g:4679:1: ( rule__Conditional__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getGroup_5()); 
            }
            // InternalAltarica.g:4680:1: ( rule__Conditional__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAltarica.g:4680:2: rule__Conditional__Group_5__0
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
    // InternalAltarica.g:4690:1: rule__Conditional__Group__6 : rule__Conditional__Group__6__Impl ;
    public final void rule__Conditional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4694:1: ( rule__Conditional__Group__6__Impl )
            // InternalAltarica.g:4695:2: rule__Conditional__Group__6__Impl
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
    // InternalAltarica.g:4701:1: rule__Conditional__Group__6__Impl : ( ';' ) ;
    public final void rule__Conditional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4705:1: ( ( ';' ) )
            // InternalAltarica.g:4706:1: ( ';' )
            {
            // InternalAltarica.g:4706:1: ( ';' )
            // InternalAltarica.g:4707:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getSemicolonKeyword_6()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4734:1: rule__Conditional__Group_5__0 : rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 ;
    public final void rule__Conditional__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4738:1: ( rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1 )
            // InternalAltarica.g:4739:2: rule__Conditional__Group_5__0__Impl rule__Conditional__Group_5__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAltarica.g:4746:1: rule__Conditional__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__Conditional__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4750:1: ( ( ( 'else' ) ) )
            // InternalAltarica.g:4751:1: ( ( 'else' ) )
            {
            // InternalAltarica.g:4751:1: ( ( 'else' ) )
            // InternalAltarica.g:4752:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseKeyword_5_0()); 
            }
            // InternalAltarica.g:4753:1: ( 'else' )
            // InternalAltarica.g:4754:2: 'else'
            {
            match(input,56,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:4765:1: rule__Conditional__Group_5__1 : rule__Conditional__Group_5__1__Impl ;
    public final void rule__Conditional__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4769:1: ( rule__Conditional__Group_5__1__Impl )
            // InternalAltarica.g:4770:2: rule__Conditional__Group_5__1__Impl
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
    // InternalAltarica.g:4776:1: rule__Conditional__Group_5__1__Impl : ( ( rule__Conditional__ElseAssignment_5_1 ) ) ;
    public final void rule__Conditional__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4780:1: ( ( ( rule__Conditional__ElseAssignment_5_1 ) ) )
            // InternalAltarica.g:4781:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            {
            // InternalAltarica.g:4781:1: ( ( rule__Conditional__ElseAssignment_5_1 ) )
            // InternalAltarica.g:4782:1: ( rule__Conditional__ElseAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionalAccess().getElseAssignment_5_1()); 
            }
            // InternalAltarica.g:4783:1: ( rule__Conditional__ElseAssignment_5_1 )
            // InternalAltarica.g:4783:2: rule__Conditional__ElseAssignment_5_1
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
    // InternalAltarica.g:4797:1: rule__Switch__Group__0 : rule__Switch__Group__0__Impl rule__Switch__Group__1 ;
    public final void rule__Switch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4801:1: ( rule__Switch__Group__0__Impl rule__Switch__Group__1 )
            // InternalAltarica.g:4802:2: rule__Switch__Group__0__Impl rule__Switch__Group__1
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
    // InternalAltarica.g:4809:1: rule__Switch__Group__0__Impl : ( 'switch' ) ;
    public final void rule__Switch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4813:1: ( ( 'switch' ) )
            // InternalAltarica.g:4814:1: ( 'switch' )
            {
            // InternalAltarica.g:4814:1: ( 'switch' )
            // InternalAltarica.g:4815:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getSwitchKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4828:1: rule__Switch__Group__1 : rule__Switch__Group__1__Impl rule__Switch__Group__2 ;
    public final void rule__Switch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4832:1: ( rule__Switch__Group__1__Impl rule__Switch__Group__2 )
            // InternalAltarica.g:4833:2: rule__Switch__Group__1__Impl rule__Switch__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAltarica.g:4840:1: rule__Switch__Group__1__Impl : ( '{' ) ;
    public final void rule__Switch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4844:1: ( ( '{' ) )
            // InternalAltarica.g:4845:1: ( '{' )
            {
            // InternalAltarica.g:4845:1: ( '{' )
            // InternalAltarica.g:4846:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4859:1: rule__Switch__Group__2 : rule__Switch__Group__2__Impl rule__Switch__Group__3 ;
    public final void rule__Switch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4863:1: ( rule__Switch__Group__2__Impl rule__Switch__Group__3 )
            // InternalAltarica.g:4864:2: rule__Switch__Group__2__Impl rule__Switch__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalAltarica.g:4871:1: rule__Switch__Group__2__Impl : ( ( rule__Switch__CasesAssignment_2 )* ) ;
    public final void rule__Switch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4875:1: ( ( ( rule__Switch__CasesAssignment_2 )* ) )
            // InternalAltarica.g:4876:1: ( ( rule__Switch__CasesAssignment_2 )* )
            {
            // InternalAltarica.g:4876:1: ( ( rule__Switch__CasesAssignment_2 )* )
            // InternalAltarica.g:4877:1: ( rule__Switch__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getCasesAssignment_2()); 
            }
            // InternalAltarica.g:4878:1: ( rule__Switch__CasesAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==61) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAltarica.g:4878:2: rule__Switch__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
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
    // InternalAltarica.g:4888:1: rule__Switch__Group__3 : rule__Switch__Group__3__Impl rule__Switch__Group__4 ;
    public final void rule__Switch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4892:1: ( rule__Switch__Group__3__Impl rule__Switch__Group__4 )
            // InternalAltarica.g:4893:2: rule__Switch__Group__3__Impl rule__Switch__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalAltarica.g:4900:1: rule__Switch__Group__3__Impl : ( 'else' ) ;
    public final void rule__Switch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4904:1: ( ( 'else' ) )
            // InternalAltarica.g:4905:1: ( 'else' )
            {
            // InternalAltarica.g:4905:1: ( 'else' )
            // InternalAltarica.g:4906:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseKeyword_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4919:1: rule__Switch__Group__4 : rule__Switch__Group__4__Impl rule__Switch__Group__5 ;
    public final void rule__Switch__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4923:1: ( rule__Switch__Group__4__Impl rule__Switch__Group__5 )
            // InternalAltarica.g:4924:2: rule__Switch__Group__4__Impl rule__Switch__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:4931:1: rule__Switch__Group__4__Impl : ( ':' ) ;
    public final void rule__Switch__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4935:1: ( ( ':' ) )
            // InternalAltarica.g:4936:1: ( ':' )
            {
            // InternalAltarica.g:4936:1: ( ':' )
            // InternalAltarica.g:4937:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getColonKeyword_4()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:4950:1: rule__Switch__Group__5 : rule__Switch__Group__5__Impl rule__Switch__Group__6 ;
    public final void rule__Switch__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4954:1: ( rule__Switch__Group__5__Impl rule__Switch__Group__6 )
            // InternalAltarica.g:4955:2: rule__Switch__Group__5__Impl rule__Switch__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalAltarica.g:4962:1: rule__Switch__Group__5__Impl : ( ( rule__Switch__ElseAssignment_5 ) ) ;
    public final void rule__Switch__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4966:1: ( ( ( rule__Switch__ElseAssignment_5 ) ) )
            // InternalAltarica.g:4967:1: ( ( rule__Switch__ElseAssignment_5 ) )
            {
            // InternalAltarica.g:4967:1: ( ( rule__Switch__ElseAssignment_5 ) )
            // InternalAltarica.g:4968:1: ( rule__Switch__ElseAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getElseAssignment_5()); 
            }
            // InternalAltarica.g:4969:1: ( rule__Switch__ElseAssignment_5 )
            // InternalAltarica.g:4969:2: rule__Switch__ElseAssignment_5
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
    // InternalAltarica.g:4979:1: rule__Switch__Group__6 : rule__Switch__Group__6__Impl ;
    public final void rule__Switch__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4983:1: ( rule__Switch__Group__6__Impl )
            // InternalAltarica.g:4984:2: rule__Switch__Group__6__Impl
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
    // InternalAltarica.g:4990:1: rule__Switch__Group__6__Impl : ( '}' ) ;
    public final void rule__Switch__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:4994:1: ( ( '}' ) )
            // InternalAltarica.g:4995:1: ( '}' )
            {
            // InternalAltarica.g:4995:1: ( '}' )
            // InternalAltarica.g:4996:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:5023:1: rule__LogicalOr__Group__0 : rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 ;
    public final void rule__LogicalOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5027:1: ( rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1 )
            // InternalAltarica.g:5028:2: rule__LogicalOr__Group__0__Impl rule__LogicalOr__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAltarica.g:5035:1: rule__LogicalOr__Group__0__Impl : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5039:1: ( ( ruleLogicalAnd ) )
            // InternalAltarica.g:5040:1: ( ruleLogicalAnd )
            {
            // InternalAltarica.g:5040:1: ( ruleLogicalAnd )
            // InternalAltarica.g:5041:1: ruleLogicalAnd
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
    // InternalAltarica.g:5052:1: rule__LogicalOr__Group__1 : rule__LogicalOr__Group__1__Impl ;
    public final void rule__LogicalOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5056:1: ( rule__LogicalOr__Group__1__Impl )
            // InternalAltarica.g:5057:2: rule__LogicalOr__Group__1__Impl
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
    // InternalAltarica.g:5063:1: rule__LogicalOr__Group__1__Impl : ( ( rule__LogicalOr__Group_1__0 )* ) ;
    public final void rule__LogicalOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5067:1: ( ( ( rule__LogicalOr__Group_1__0 )* ) )
            // InternalAltarica.g:5068:1: ( ( rule__LogicalOr__Group_1__0 )* )
            {
            // InternalAltarica.g:5068:1: ( ( rule__LogicalOr__Group_1__0 )* )
            // InternalAltarica.g:5069:1: ( rule__LogicalOr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5070:1: ( rule__LogicalOr__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==62) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAltarica.g:5070:2: rule__LogicalOr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__LogicalOr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAltarica.g:5084:1: rule__LogicalOr__Group_1__0 : rule__LogicalOr__Group_1__0__Impl ;
    public final void rule__LogicalOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5088:1: ( rule__LogicalOr__Group_1__0__Impl )
            // InternalAltarica.g:5089:2: rule__LogicalOr__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5095:1: rule__LogicalOr__Group_1__0__Impl : ( ( rule__LogicalOr__Group_1_0__0 ) ) ;
    public final void rule__LogicalOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5099:1: ( ( ( rule__LogicalOr__Group_1_0__0 ) ) )
            // InternalAltarica.g:5100:1: ( ( rule__LogicalOr__Group_1_0__0 ) )
            {
            // InternalAltarica.g:5100:1: ( ( rule__LogicalOr__Group_1_0__0 ) )
            // InternalAltarica.g:5101:1: ( rule__LogicalOr__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:5102:1: ( rule__LogicalOr__Group_1_0__0 )
            // InternalAltarica.g:5102:2: rule__LogicalOr__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5114:1: rule__LogicalOr__Group_1_0__0 : rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1 ;
    public final void rule__LogicalOr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5118:1: ( rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1 )
            // InternalAltarica.g:5119:2: rule__LogicalOr__Group_1_0__0__Impl rule__LogicalOr__Group_1_0__1
            {
            pushFollow(FOLLOW_39);
            rule__LogicalOr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5126:1: rule__LogicalOr__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalOr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5130:1: ( ( () ) )
            // InternalAltarica.g:5131:1: ( () )
            {
            // InternalAltarica.g:5131:1: ( () )
            // InternalAltarica.g:5132:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0()); 
            }
            // InternalAltarica.g:5133:1: ()
            // InternalAltarica.g:5135:1: 
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
    // InternalAltarica.g:5145:1: rule__LogicalOr__Group_1_0__1 : rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2 ;
    public final void rule__LogicalOr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5149:1: ( rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2 )
            // InternalAltarica.g:5150:2: rule__LogicalOr__Group_1_0__1__Impl rule__LogicalOr__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__LogicalOr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5157:1: rule__LogicalOr__Group_1_0__1__Impl : ( ( rule__LogicalOr__OpAssignment_1_0_1 ) ) ;
    public final void rule__LogicalOr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5161:1: ( ( ( rule__LogicalOr__OpAssignment_1_0_1 ) ) )
            // InternalAltarica.g:5162:1: ( ( rule__LogicalOr__OpAssignment_1_0_1 ) )
            {
            // InternalAltarica.g:5162:1: ( ( rule__LogicalOr__OpAssignment_1_0_1 ) )
            // InternalAltarica.g:5163:1: ( rule__LogicalOr__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAltarica.g:5164:1: ( rule__LogicalOr__OpAssignment_1_0_1 )
            // InternalAltarica.g:5164:2: rule__LogicalOr__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5174:1: rule__LogicalOr__Group_1_0__2 : rule__LogicalOr__Group_1_0__2__Impl ;
    public final void rule__LogicalOr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5178:1: ( rule__LogicalOr__Group_1_0__2__Impl )
            // InternalAltarica.g:5179:2: rule__LogicalOr__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5185:1: rule__LogicalOr__Group_1_0__2__Impl : ( ( rule__LogicalOr__RightAssignment_1_0_2 ) ) ;
    public final void rule__LogicalOr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5189:1: ( ( ( rule__LogicalOr__RightAssignment_1_0_2 ) ) )
            // InternalAltarica.g:5190:1: ( ( rule__LogicalOr__RightAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:5190:1: ( ( rule__LogicalOr__RightAssignment_1_0_2 ) )
            // InternalAltarica.g:5191:1: ( rule__LogicalOr__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAltarica.g:5192:1: ( rule__LogicalOr__RightAssignment_1_0_2 )
            // InternalAltarica.g:5192:2: rule__LogicalOr__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5208:1: rule__LogicalAnd__Group__0 : rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 ;
    public final void rule__LogicalAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5212:1: ( rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1 )
            // InternalAltarica.g:5213:2: rule__LogicalAnd__Group__0__Impl rule__LogicalAnd__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAltarica.g:5220:1: rule__LogicalAnd__Group__0__Impl : ( ruleRelation ) ;
    public final void rule__LogicalAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5224:1: ( ( ruleRelation ) )
            // InternalAltarica.g:5225:1: ( ruleRelation )
            {
            // InternalAltarica.g:5225:1: ( ruleRelation )
            // InternalAltarica.g:5226:1: ruleRelation
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
    // InternalAltarica.g:5237:1: rule__LogicalAnd__Group__1 : rule__LogicalAnd__Group__1__Impl ;
    public final void rule__LogicalAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5241:1: ( rule__LogicalAnd__Group__1__Impl )
            // InternalAltarica.g:5242:2: rule__LogicalAnd__Group__1__Impl
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
    // InternalAltarica.g:5248:1: rule__LogicalAnd__Group__1__Impl : ( ( rule__LogicalAnd__Group_1__0 )* ) ;
    public final void rule__LogicalAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5252:1: ( ( ( rule__LogicalAnd__Group_1__0 )* ) )
            // InternalAltarica.g:5253:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            {
            // InternalAltarica.g:5253:1: ( ( rule__LogicalAnd__Group_1__0 )* )
            // InternalAltarica.g:5254:1: ( rule__LogicalAnd__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5255:1: ( rule__LogicalAnd__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==63) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAltarica.g:5255:2: rule__LogicalAnd__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__LogicalAnd__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAltarica.g:5269:1: rule__LogicalAnd__Group_1__0 : rule__LogicalAnd__Group_1__0__Impl ;
    public final void rule__LogicalAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5273:1: ( rule__LogicalAnd__Group_1__0__Impl )
            // InternalAltarica.g:5274:2: rule__LogicalAnd__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5280:1: rule__LogicalAnd__Group_1__0__Impl : ( ( rule__LogicalAnd__Group_1_0__0 ) ) ;
    public final void rule__LogicalAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5284:1: ( ( ( rule__LogicalAnd__Group_1_0__0 ) ) )
            // InternalAltarica.g:5285:1: ( ( rule__LogicalAnd__Group_1_0__0 ) )
            {
            // InternalAltarica.g:5285:1: ( ( rule__LogicalAnd__Group_1_0__0 ) )
            // InternalAltarica.g:5286:1: ( rule__LogicalAnd__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:5287:1: ( rule__LogicalAnd__Group_1_0__0 )
            // InternalAltarica.g:5287:2: rule__LogicalAnd__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5299:1: rule__LogicalAnd__Group_1_0__0 : rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1 ;
    public final void rule__LogicalAnd__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5303:1: ( rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1 )
            // InternalAltarica.g:5304:2: rule__LogicalAnd__Group_1_0__0__Impl rule__LogicalAnd__Group_1_0__1
            {
            pushFollow(FOLLOW_41);
            rule__LogicalAnd__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5311:1: rule__LogicalAnd__Group_1_0__0__Impl : ( () ) ;
    public final void rule__LogicalAnd__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5315:1: ( ( () ) )
            // InternalAltarica.g:5316:1: ( () )
            {
            // InternalAltarica.g:5316:1: ( () )
            // InternalAltarica.g:5317:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0()); 
            }
            // InternalAltarica.g:5318:1: ()
            // InternalAltarica.g:5320:1: 
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
    // InternalAltarica.g:5330:1: rule__LogicalAnd__Group_1_0__1 : rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2 ;
    public final void rule__LogicalAnd__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5334:1: ( rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2 )
            // InternalAltarica.g:5335:2: rule__LogicalAnd__Group_1_0__1__Impl rule__LogicalAnd__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__LogicalAnd__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5342:1: rule__LogicalAnd__Group_1_0__1__Impl : ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) ) ;
    public final void rule__LogicalAnd__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5346:1: ( ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) ) )
            // InternalAltarica.g:5347:1: ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) )
            {
            // InternalAltarica.g:5347:1: ( ( rule__LogicalAnd__OpAssignment_1_0_1 ) )
            // InternalAltarica.g:5348:1: ( rule__LogicalAnd__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAltarica.g:5349:1: ( rule__LogicalAnd__OpAssignment_1_0_1 )
            // InternalAltarica.g:5349:2: rule__LogicalAnd__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5359:1: rule__LogicalAnd__Group_1_0__2 : rule__LogicalAnd__Group_1_0__2__Impl ;
    public final void rule__LogicalAnd__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5363:1: ( rule__LogicalAnd__Group_1_0__2__Impl )
            // InternalAltarica.g:5364:2: rule__LogicalAnd__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5370:1: rule__LogicalAnd__Group_1_0__2__Impl : ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) ) ;
    public final void rule__LogicalAnd__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5374:1: ( ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) ) )
            // InternalAltarica.g:5375:1: ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:5375:1: ( ( rule__LogicalAnd__RightAssignment_1_0_2 ) )
            // InternalAltarica.g:5376:1: ( rule__LogicalAnd__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAltarica.g:5377:1: ( rule__LogicalAnd__RightAssignment_1_0_2 )
            // InternalAltarica.g:5377:2: rule__LogicalAnd__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5393:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5397:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalAltarica.g:5398:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAltarica.g:5405:1: rule__Relation__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5409:1: ( ( ruleAddition ) )
            // InternalAltarica.g:5410:1: ( ruleAddition )
            {
            // InternalAltarica.g:5410:1: ( ruleAddition )
            // InternalAltarica.g:5411:1: ruleAddition
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
    // InternalAltarica.g:5422:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5426:1: ( rule__Relation__Group__1__Impl )
            // InternalAltarica.g:5427:2: rule__Relation__Group__1__Impl
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
    // InternalAltarica.g:5433:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 )* ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5437:1: ( ( ( rule__Relation__Group_1__0 )* ) )
            // InternalAltarica.g:5438:1: ( ( rule__Relation__Group_1__0 )* )
            {
            // InternalAltarica.g:5438:1: ( ( rule__Relation__Group_1__0 )* )
            // InternalAltarica.g:5439:1: ( rule__Relation__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5440:1: ( rule__Relation__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=16 && LA32_0<=21)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAltarica.g:5440:2: rule__Relation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__Relation__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalAltarica.g:5454:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5458:1: ( rule__Relation__Group_1__0__Impl )
            // InternalAltarica.g:5459:2: rule__Relation__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5465:1: rule__Relation__Group_1__0__Impl : ( ( rule__Relation__Group_1_0__0 ) ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5469:1: ( ( ( rule__Relation__Group_1_0__0 ) ) )
            // InternalAltarica.g:5470:1: ( ( rule__Relation__Group_1_0__0 ) )
            {
            // InternalAltarica.g:5470:1: ( ( rule__Relation__Group_1_0__0 ) )
            // InternalAltarica.g:5471:1: ( rule__Relation__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:5472:1: ( rule__Relation__Group_1_0__0 )
            // InternalAltarica.g:5472:2: rule__Relation__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5484:1: rule__Relation__Group_1_0__0 : rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 ;
    public final void rule__Relation__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5488:1: ( rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1 )
            // InternalAltarica.g:5489:2: rule__Relation__Group_1_0__0__Impl rule__Relation__Group_1_0__1
            {
            pushFollow(FOLLOW_43);
            rule__Relation__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5496:1: rule__Relation__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5500:1: ( ( () ) )
            // InternalAltarica.g:5501:1: ( () )
            {
            // InternalAltarica.g:5501:1: ( () )
            // InternalAltarica.g:5502:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0()); 
            }
            // InternalAltarica.g:5503:1: ()
            // InternalAltarica.g:5505:1: 
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
    // InternalAltarica.g:5515:1: rule__Relation__Group_1_0__1 : rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 ;
    public final void rule__Relation__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5519:1: ( rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2 )
            // InternalAltarica.g:5520:2: rule__Relation__Group_1_0__1__Impl rule__Relation__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5527:1: rule__Relation__Group_1_0__1__Impl : ( ( rule__Relation__OpAssignment_1_0_1 ) ) ;
    public final void rule__Relation__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5531:1: ( ( ( rule__Relation__OpAssignment_1_0_1 ) ) )
            // InternalAltarica.g:5532:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            {
            // InternalAltarica.g:5532:1: ( ( rule__Relation__OpAssignment_1_0_1 ) )
            // InternalAltarica.g:5533:1: ( rule__Relation__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAltarica.g:5534:1: ( rule__Relation__OpAssignment_1_0_1 )
            // InternalAltarica.g:5534:2: rule__Relation__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5544:1: rule__Relation__Group_1_0__2 : rule__Relation__Group_1_0__2__Impl ;
    public final void rule__Relation__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5548:1: ( rule__Relation__Group_1_0__2__Impl )
            // InternalAltarica.g:5549:2: rule__Relation__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5555:1: rule__Relation__Group_1_0__2__Impl : ( ( rule__Relation__RightAssignment_1_0_2 ) ) ;
    public final void rule__Relation__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5559:1: ( ( ( rule__Relation__RightAssignment_1_0_2 ) ) )
            // InternalAltarica.g:5560:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:5560:1: ( ( rule__Relation__RightAssignment_1_0_2 ) )
            // InternalAltarica.g:5561:1: ( rule__Relation__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAltarica.g:5562:1: ( rule__Relation__RightAssignment_1_0_2 )
            // InternalAltarica.g:5562:2: rule__Relation__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5578:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5582:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalAltarica.g:5583:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalAltarica.g:5590:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5594:1: ( ( ruleMultiplication ) )
            // InternalAltarica.g:5595:1: ( ruleMultiplication )
            {
            // InternalAltarica.g:5595:1: ( ruleMultiplication )
            // InternalAltarica.g:5596:1: ruleMultiplication
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
    // InternalAltarica.g:5607:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5611:1: ( rule__Addition__Group__1__Impl )
            // InternalAltarica.g:5612:2: rule__Addition__Group__1__Impl
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
    // InternalAltarica.g:5618:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5622:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalAltarica.g:5623:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalAltarica.g:5623:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalAltarica.g:5624:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5625:1: ( rule__Addition__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=22 && LA33_0<=23)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAltarica.g:5625:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAltarica.g:5639:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5643:1: ( rule__Addition__Group_1__0__Impl )
            // InternalAltarica.g:5644:2: rule__Addition__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5650:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Group_1_0__0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5654:1: ( ( ( rule__Addition__Group_1_0__0 ) ) )
            // InternalAltarica.g:5655:1: ( ( rule__Addition__Group_1_0__0 ) )
            {
            // InternalAltarica.g:5655:1: ( ( rule__Addition__Group_1_0__0 ) )
            // InternalAltarica.g:5656:1: ( rule__Addition__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:5657:1: ( rule__Addition__Group_1_0__0 )
            // InternalAltarica.g:5657:2: rule__Addition__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5669:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5673:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // InternalAltarica.g:5674:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_45);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5681:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5685:1: ( ( () ) )
            // InternalAltarica.g:5686:1: ( () )
            {
            // InternalAltarica.g:5686:1: ( () )
            // InternalAltarica.g:5687:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0()); 
            }
            // InternalAltarica.g:5688:1: ()
            // InternalAltarica.g:5690:1: 
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
    // InternalAltarica.g:5700:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5704:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // InternalAltarica.g:5705:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5712:1: rule__Addition__Group_1_0__1__Impl : ( ( rule__Addition__OpAssignment_1_0_1 ) ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5716:1: ( ( ( rule__Addition__OpAssignment_1_0_1 ) ) )
            // InternalAltarica.g:5717:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            {
            // InternalAltarica.g:5717:1: ( ( rule__Addition__OpAssignment_1_0_1 ) )
            // InternalAltarica.g:5718:1: ( rule__Addition__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAltarica.g:5719:1: ( rule__Addition__OpAssignment_1_0_1 )
            // InternalAltarica.g:5719:2: rule__Addition__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5729:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5733:1: ( rule__Addition__Group_1_0__2__Impl )
            // InternalAltarica.g:5734:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5740:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5744:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // InternalAltarica.g:5745:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:5745:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // InternalAltarica.g:5746:1: ( rule__Addition__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAltarica.g:5747:1: ( rule__Addition__RightAssignment_1_0_2 )
            // InternalAltarica.g:5747:2: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5763:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5767:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalAltarica.g:5768:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalAltarica.g:5775:1: rule__Multiplication__Group__0__Impl : ( ruleNeg ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5779:1: ( ( ruleNeg ) )
            // InternalAltarica.g:5780:1: ( ruleNeg )
            {
            // InternalAltarica.g:5780:1: ( ruleNeg )
            // InternalAltarica.g:5781:1: ruleNeg
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
    // InternalAltarica.g:5792:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5796:1: ( rule__Multiplication__Group__1__Impl )
            // InternalAltarica.g:5797:2: rule__Multiplication__Group__1__Impl
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
    // InternalAltarica.g:5803:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5807:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalAltarica.g:5808:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalAltarica.g:5808:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalAltarica.g:5809:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalAltarica.g:5810:1: ( rule__Multiplication__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=24 && LA34_0<=25)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAltarica.g:5810:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAltarica.g:5824:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5828:1: ( rule__Multiplication__Group_1__0__Impl )
            // InternalAltarica.g:5829:2: rule__Multiplication__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5835:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Group_1_0__0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5839:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) )
            // InternalAltarica.g:5840:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            {
            // InternalAltarica.g:5840:1: ( ( rule__Multiplication__Group_1_0__0 ) )
            // InternalAltarica.g:5841:1: ( rule__Multiplication__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:5842:1: ( rule__Multiplication__Group_1_0__0 )
            // InternalAltarica.g:5842:2: rule__Multiplication__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5854:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5858:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // InternalAltarica.g:5859:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5866:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5870:1: ( ( () ) )
            // InternalAltarica.g:5871:1: ( () )
            {
            // InternalAltarica.g:5871:1: ( () )
            // InternalAltarica.g:5872:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0()); 
            }
            // InternalAltarica.g:5873:1: ()
            // InternalAltarica.g:5875:1: 
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
    // InternalAltarica.g:5885:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5889:1: ( rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 )
            // InternalAltarica.g:5890:2: rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5897:1: rule__Multiplication__Group_1_0__1__Impl : ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5901:1: ( ( ( rule__Multiplication__OpAssignment_1_0_1 ) ) )
            // InternalAltarica.g:5902:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            {
            // InternalAltarica.g:5902:1: ( ( rule__Multiplication__OpAssignment_1_0_1 ) )
            // InternalAltarica.g:5903:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAssignment_1_0_1()); 
            }
            // InternalAltarica.g:5904:1: ( rule__Multiplication__OpAssignment_1_0_1 )
            // InternalAltarica.g:5904:2: rule__Multiplication__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5914:1: rule__Multiplication__Group_1_0__2 : rule__Multiplication__Group_1_0__2__Impl ;
    public final void rule__Multiplication__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5918:1: ( rule__Multiplication__Group_1_0__2__Impl )
            // InternalAltarica.g:5919:2: rule__Multiplication__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5925:1: rule__Multiplication__Group_1_0__2__Impl : ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) ;
    public final void rule__Multiplication__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5929:1: ( ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) )
            // InternalAltarica.g:5930:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:5930:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            // InternalAltarica.g:5931:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            }
            // InternalAltarica.g:5932:1: ( rule__Multiplication__RightAssignment_1_0_2 )
            // InternalAltarica.g:5932:2: rule__Multiplication__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:5948:1: rule__Neg__Group_0__0 : rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 ;
    public final void rule__Neg__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5952:1: ( rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1 )
            // InternalAltarica.g:5953:2: rule__Neg__Group_0__0__Impl rule__Neg__Group_0__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalAltarica.g:5960:1: rule__Neg__Group_0__0__Impl : ( () ) ;
    public final void rule__Neg__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5964:1: ( ( () ) )
            // InternalAltarica.g:5965:1: ( () )
            {
            // InternalAltarica.g:5965:1: ( () )
            // InternalAltarica.g:5966:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotAction_0_0()); 
            }
            // InternalAltarica.g:5967:1: ()
            // InternalAltarica.g:5969:1: 
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
    // InternalAltarica.g:5979:1: rule__Neg__Group_0__1 : rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 ;
    public final void rule__Neg__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5983:1: ( rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2 )
            // InternalAltarica.g:5984:2: rule__Neg__Group_0__1__Impl rule__Neg__Group_0__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:5991:1: rule__Neg__Group_0__1__Impl : ( ( 'not' ) ) ;
    public final void rule__Neg__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:5995:1: ( ( ( 'not' ) ) )
            // InternalAltarica.g:5996:1: ( ( 'not' ) )
            {
            // InternalAltarica.g:5996:1: ( ( 'not' ) )
            // InternalAltarica.g:5997:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNotKeyword_0_1()); 
            }
            // InternalAltarica.g:5998:1: ( 'not' )
            // InternalAltarica.g:5999:2: 'not'
            {
            match(input,58,FOLLOW_2); if (state.failed) return ;

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
    // InternalAltarica.g:6010:1: rule__Neg__Group_0__2 : rule__Neg__Group_0__2__Impl ;
    public final void rule__Neg__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6014:1: ( rule__Neg__Group_0__2__Impl )
            // InternalAltarica.g:6015:2: rule__Neg__Group_0__2__Impl
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
    // InternalAltarica.g:6021:1: rule__Neg__Group_0__2__Impl : ( ( rule__Neg__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Neg__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6025:1: ( ( ( rule__Neg__ExpressionAssignment_0_2 ) ) )
            // InternalAltarica.g:6026:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            {
            // InternalAltarica.g:6026:1: ( ( rule__Neg__ExpressionAssignment_0_2 ) )
            // InternalAltarica.g:6027:1: ( rule__Neg__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_0_2()); 
            }
            // InternalAltarica.g:6028:1: ( rule__Neg__ExpressionAssignment_0_2 )
            // InternalAltarica.g:6028:2: rule__Neg__ExpressionAssignment_0_2
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
    // InternalAltarica.g:6044:1: rule__Neg__Group_1__0 : rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 ;
    public final void rule__Neg__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6048:1: ( rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1 )
            // InternalAltarica.g:6049:2: rule__Neg__Group_1__0__Impl rule__Neg__Group_1__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalAltarica.g:6056:1: rule__Neg__Group_1__0__Impl : ( () ) ;
    public final void rule__Neg__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6060:1: ( ( () ) )
            // InternalAltarica.g:6061:1: ( () )
            {
            // InternalAltarica.g:6061:1: ( () )
            // InternalAltarica.g:6062:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getMinusAction_1_0()); 
            }
            // InternalAltarica.g:6063:1: ()
            // InternalAltarica.g:6065:1: 
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
    // InternalAltarica.g:6075:1: rule__Neg__Group_1__1 : rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 ;
    public final void rule__Neg__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6079:1: ( rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2 )
            // InternalAltarica.g:6080:2: rule__Neg__Group_1__1__Impl rule__Neg__Group_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:6087:1: rule__Neg__Group_1__1__Impl : ( ( '-' ) ) ;
    public final void rule__Neg__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6091:1: ( ( ( '-' ) ) )
            // InternalAltarica.g:6092:1: ( ( '-' ) )
            {
            // InternalAltarica.g:6092:1: ( ( '-' ) )
            // InternalAltarica.g:6093:1: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1()); 
            }
            // InternalAltarica.g:6094:1: ( '-' )
            // InternalAltarica.g:6095:2: '-'
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
    // InternalAltarica.g:6106:1: rule__Neg__Group_1__2 : rule__Neg__Group_1__2__Impl ;
    public final void rule__Neg__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6110:1: ( rule__Neg__Group_1__2__Impl )
            // InternalAltarica.g:6111:2: rule__Neg__Group_1__2__Impl
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
    // InternalAltarica.g:6117:1: rule__Neg__Group_1__2__Impl : ( ( rule__Neg__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Neg__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6121:1: ( ( ( rule__Neg__ExpressionAssignment_1_2 ) ) )
            // InternalAltarica.g:6122:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            {
            // InternalAltarica.g:6122:1: ( ( rule__Neg__ExpressionAssignment_1_2 ) )
            // InternalAltarica.g:6123:1: ( rule__Neg__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpressionAssignment_1_2()); 
            }
            // InternalAltarica.g:6124:1: ( rule__Neg__ExpressionAssignment_1_2 )
            // InternalAltarica.g:6124:2: rule__Neg__ExpressionAssignment_1_2
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
    // InternalAltarica.g:6140:1: rule__Atom__Group_6__0 : rule__Atom__Group_6__0__Impl rule__Atom__Group_6__1 ;
    public final void rule__Atom__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6144:1: ( rule__Atom__Group_6__0__Impl rule__Atom__Group_6__1 )
            // InternalAltarica.g:6145:2: rule__Atom__Group_6__0__Impl rule__Atom__Group_6__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:6152:1: rule__Atom__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6156:1: ( ( '(' ) )
            // InternalAltarica.g:6157:1: ( '(' )
            {
            // InternalAltarica.g:6157:1: ( '(' )
            // InternalAltarica.g:6158:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6171:1: rule__Atom__Group_6__1 : rule__Atom__Group_6__1__Impl rule__Atom__Group_6__2 ;
    public final void rule__Atom__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6175:1: ( rule__Atom__Group_6__1__Impl rule__Atom__Group_6__2 )
            // InternalAltarica.g:6176:2: rule__Atom__Group_6__1__Impl rule__Atom__Group_6__2
            {
            pushFollow(FOLLOW_51);
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
    // InternalAltarica.g:6183:1: rule__Atom__Group_6__1__Impl : ( ruleExpression ) ;
    public final void rule__Atom__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6187:1: ( ( ruleExpression ) )
            // InternalAltarica.g:6188:1: ( ruleExpression )
            {
            // InternalAltarica.g:6188:1: ( ruleExpression )
            // InternalAltarica.g:6189:1: ruleExpression
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
    // InternalAltarica.g:6200:1: rule__Atom__Group_6__2 : rule__Atom__Group_6__2__Impl ;
    public final void rule__Atom__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6204:1: ( rule__Atom__Group_6__2__Impl )
            // InternalAltarica.g:6205:2: rule__Atom__Group_6__2__Impl
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
    // InternalAltarica.g:6211:1: rule__Atom__Group_6__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6215:1: ( ( ')' ) )
            // InternalAltarica.g:6216:1: ( ')' )
            {
            // InternalAltarica.g:6216:1: ( ')' )
            // InternalAltarica.g:6217:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6236:1: rule__NameRef__Group__0 : rule__NameRef__Group__0__Impl rule__NameRef__Group__1 ;
    public final void rule__NameRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6240:1: ( rule__NameRef__Group__0__Impl rule__NameRef__Group__1 )
            // InternalAltarica.g:6241:2: rule__NameRef__Group__0__Impl rule__NameRef__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalAltarica.g:6248:1: rule__NameRef__Group__0__Impl : ( ( rule__NameRef__VariableAssignment_0 ) ) ;
    public final void rule__NameRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6252:1: ( ( ( rule__NameRef__VariableAssignment_0 ) ) )
            // InternalAltarica.g:6253:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            {
            // InternalAltarica.g:6253:1: ( ( rule__NameRef__VariableAssignment_0 ) )
            // InternalAltarica.g:6254:1: ( rule__NameRef__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_0()); 
            }
            // InternalAltarica.g:6255:1: ( rule__NameRef__VariableAssignment_0 )
            // InternalAltarica.g:6255:2: rule__NameRef__VariableAssignment_0
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
    // InternalAltarica.g:6265:1: rule__NameRef__Group__1 : rule__NameRef__Group__1__Impl ;
    public final void rule__NameRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6269:1: ( rule__NameRef__Group__1__Impl )
            // InternalAltarica.g:6270:2: rule__NameRef__Group__1__Impl
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
    // InternalAltarica.g:6276:1: rule__NameRef__Group__1__Impl : ( ( rule__NameRef__Group_1__0 )* ) ;
    public final void rule__NameRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6280:1: ( ( ( rule__NameRef__Group_1__0 )* ) )
            // InternalAltarica.g:6281:1: ( ( rule__NameRef__Group_1__0 )* )
            {
            // InternalAltarica.g:6281:1: ( ( rule__NameRef__Group_1__0 )* )
            // InternalAltarica.g:6282:1: ( rule__NameRef__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1()); 
            }
            // InternalAltarica.g:6283:1: ( rule__NameRef__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==59) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAltarica.g:6283:2: rule__NameRef__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__NameRef__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAltarica.g:6297:1: rule__NameRef__Group_1__0 : rule__NameRef__Group_1__0__Impl ;
    public final void rule__NameRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6301:1: ( rule__NameRef__Group_1__0__Impl )
            // InternalAltarica.g:6302:2: rule__NameRef__Group_1__0__Impl
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
    // InternalAltarica.g:6308:1: rule__NameRef__Group_1__0__Impl : ( ( rule__NameRef__Group_1_0__0 ) ) ;
    public final void rule__NameRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6312:1: ( ( ( rule__NameRef__Group_1_0__0 ) ) )
            // InternalAltarica.g:6313:1: ( ( rule__NameRef__Group_1_0__0 ) )
            {
            // InternalAltarica.g:6313:1: ( ( rule__NameRef__Group_1_0__0 ) )
            // InternalAltarica.g:6314:1: ( rule__NameRef__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getGroup_1_0()); 
            }
            // InternalAltarica.g:6315:1: ( rule__NameRef__Group_1_0__0 )
            // InternalAltarica.g:6315:2: rule__NameRef__Group_1_0__0
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
    // InternalAltarica.g:6327:1: rule__NameRef__Group_1_0__0 : rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 ;
    public final void rule__NameRef__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6331:1: ( rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1 )
            // InternalAltarica.g:6332:2: rule__NameRef__Group_1_0__0__Impl rule__NameRef__Group_1_0__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalAltarica.g:6339:1: rule__NameRef__Group_1_0__0__Impl : ( () ) ;
    public final void rule__NameRef__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6343:1: ( ( () ) )
            // InternalAltarica.g:6344:1: ( () )
            {
            // InternalAltarica.g:6344:1: ( () )
            // InternalAltarica.g:6345:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0()); 
            }
            // InternalAltarica.g:6346:1: ()
            // InternalAltarica.g:6348:1: 
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
    // InternalAltarica.g:6358:1: rule__NameRef__Group_1_0__1 : rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 ;
    public final void rule__NameRef__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6362:1: ( rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2 )
            // InternalAltarica.g:6363:2: rule__NameRef__Group_1_0__1__Impl rule__NameRef__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAltarica.g:6370:1: rule__NameRef__Group_1_0__1__Impl : ( '.' ) ;
    public final void rule__NameRef__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6374:1: ( ( '.' ) )
            // InternalAltarica.g:6375:1: ( '.' )
            {
            // InternalAltarica.g:6375:1: ( '.' )
            // InternalAltarica.g:6376:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6389:1: rule__NameRef__Group_1_0__2 : rule__NameRef__Group_1_0__2__Impl ;
    public final void rule__NameRef__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6393:1: ( rule__NameRef__Group_1_0__2__Impl )
            // InternalAltarica.g:6394:2: rule__NameRef__Group_1_0__2__Impl
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
    // InternalAltarica.g:6400:1: rule__NameRef__Group_1_0__2__Impl : ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) ;
    public final void rule__NameRef__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6404:1: ( ( ( rule__NameRef__VariableAssignment_1_0_2 ) ) )
            // InternalAltarica.g:6405:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            {
            // InternalAltarica.g:6405:1: ( ( rule__NameRef__VariableAssignment_1_0_2 ) )
            // InternalAltarica.g:6406:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableAssignment_1_0_2()); 
            }
            // InternalAltarica.g:6407:1: ( rule__NameRef__VariableAssignment_1_0_2 )
            // InternalAltarica.g:6407:2: rule__NameRef__VariableAssignment_1_0_2
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
    // InternalAltarica.g:6423:1: rule__SwitchExpression__Group__0 : rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 ;
    public final void rule__SwitchExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6427:1: ( rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1 )
            // InternalAltarica.g:6428:2: rule__SwitchExpression__Group__0__Impl rule__SwitchExpression__Group__1
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
    // InternalAltarica.g:6435:1: rule__SwitchExpression__Group__0__Impl : ( 'switch' ) ;
    public final void rule__SwitchExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6439:1: ( ( 'switch' ) )
            // InternalAltarica.g:6440:1: ( 'switch' )
            {
            // InternalAltarica.g:6440:1: ( 'switch' )
            // InternalAltarica.g:6441:1: 'switch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6454:1: rule__SwitchExpression__Group__1 : rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 ;
    public final void rule__SwitchExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6458:1: ( rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2 )
            // InternalAltarica.g:6459:2: rule__SwitchExpression__Group__1__Impl rule__SwitchExpression__Group__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalAltarica.g:6466:1: rule__SwitchExpression__Group__1__Impl : ( '{' ) ;
    public final void rule__SwitchExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6470:1: ( ( '{' ) )
            // InternalAltarica.g:6471:1: ( '{' )
            {
            // InternalAltarica.g:6471:1: ( '{' )
            // InternalAltarica.g:6472:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6485:1: rule__SwitchExpression__Group__2 : rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 ;
    public final void rule__SwitchExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6489:1: ( rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3 )
            // InternalAltarica.g:6490:2: rule__SwitchExpression__Group__2__Impl rule__SwitchExpression__Group__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalAltarica.g:6497:1: rule__SwitchExpression__Group__2__Impl : ( ( rule__SwitchExpression__CasesAssignment_2 )* ) ;
    public final void rule__SwitchExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6501:1: ( ( ( rule__SwitchExpression__CasesAssignment_2 )* ) )
            // InternalAltarica.g:6502:1: ( ( rule__SwitchExpression__CasesAssignment_2 )* )
            {
            // InternalAltarica.g:6502:1: ( ( rule__SwitchExpression__CasesAssignment_2 )* )
            // InternalAltarica.g:6503:1: ( rule__SwitchExpression__CasesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getCasesAssignment_2()); 
            }
            // InternalAltarica.g:6504:1: ( rule__SwitchExpression__CasesAssignment_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==61) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAltarica.g:6504:2: rule__SwitchExpression__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__SwitchExpression__CasesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAltarica.g:6514:1: rule__SwitchExpression__Group__3 : rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4 ;
    public final void rule__SwitchExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6518:1: ( rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4 )
            // InternalAltarica.g:6519:2: rule__SwitchExpression__Group__3__Impl rule__SwitchExpression__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalAltarica.g:6526:1: rule__SwitchExpression__Group__3__Impl : ( 'default' ) ;
    public final void rule__SwitchExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6530:1: ( ( 'default' ) )
            // InternalAltarica.g:6531:1: ( 'default' )
            {
            // InternalAltarica.g:6531:1: ( 'default' )
            // InternalAltarica.g:6532:1: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6545:1: rule__SwitchExpression__Group__4 : rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5 ;
    public final void rule__SwitchExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6549:1: ( rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5 )
            // InternalAltarica.g:6550:2: rule__SwitchExpression__Group__4__Impl rule__SwitchExpression__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:6557:1: rule__SwitchExpression__Group__4__Impl : ( ':' ) ;
    public final void rule__SwitchExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6561:1: ( ( ':' ) )
            // InternalAltarica.g:6562:1: ( ':' )
            {
            // InternalAltarica.g:6562:1: ( ':' )
            // InternalAltarica.g:6563:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getColonKeyword_4()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6576:1: rule__SwitchExpression__Group__5 : rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6 ;
    public final void rule__SwitchExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6580:1: ( rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6 )
            // InternalAltarica.g:6581:2: rule__SwitchExpression__Group__5__Impl rule__SwitchExpression__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalAltarica.g:6588:1: rule__SwitchExpression__Group__5__Impl : ( ( rule__SwitchExpression__DefaultAssignment_5 ) ) ;
    public final void rule__SwitchExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6592:1: ( ( ( rule__SwitchExpression__DefaultAssignment_5 ) ) )
            // InternalAltarica.g:6593:1: ( ( rule__SwitchExpression__DefaultAssignment_5 ) )
            {
            // InternalAltarica.g:6593:1: ( ( rule__SwitchExpression__DefaultAssignment_5 ) )
            // InternalAltarica.g:6594:1: ( rule__SwitchExpression__DefaultAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getDefaultAssignment_5()); 
            }
            // InternalAltarica.g:6595:1: ( rule__SwitchExpression__DefaultAssignment_5 )
            // InternalAltarica.g:6595:2: rule__SwitchExpression__DefaultAssignment_5
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
    // InternalAltarica.g:6605:1: rule__SwitchExpression__Group__6 : rule__SwitchExpression__Group__6__Impl ;
    public final void rule__SwitchExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6609:1: ( rule__SwitchExpression__Group__6__Impl )
            // InternalAltarica.g:6610:2: rule__SwitchExpression__Group__6__Impl
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
    // InternalAltarica.g:6616:1: rule__SwitchExpression__Group__6__Impl : ( '}' ) ;
    public final void rule__SwitchExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6620:1: ( ( '}' ) )
            // InternalAltarica.g:6621:1: ( '}' )
            {
            // InternalAltarica.g:6621:1: ( '}' )
            // InternalAltarica.g:6622:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSwitchExpressionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6649:1: rule__CaseExpression__Group__0 : rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 ;
    public final void rule__CaseExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6653:1: ( rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1 )
            // InternalAltarica.g:6654:2: rule__CaseExpression__Group__0__Impl rule__CaseExpression__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:6661:1: rule__CaseExpression__Group__0__Impl : ( 'case' ) ;
    public final void rule__CaseExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6665:1: ( ( 'case' ) )
            // InternalAltarica.g:6666:1: ( 'case' )
            {
            // InternalAltarica.g:6666:1: ( 'case' )
            // InternalAltarica.g:6667:1: 'case'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseKeyword_0()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6680:1: rule__CaseExpression__Group__1 : rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 ;
    public final void rule__CaseExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6684:1: ( rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2 )
            // InternalAltarica.g:6685:2: rule__CaseExpression__Group__1__Impl rule__CaseExpression__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAltarica.g:6692:1: rule__CaseExpression__Group__1__Impl : ( ( rule__CaseExpression__ConditionAssignment_1 ) ) ;
    public final void rule__CaseExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6696:1: ( ( ( rule__CaseExpression__ConditionAssignment_1 ) ) )
            // InternalAltarica.g:6697:1: ( ( rule__CaseExpression__ConditionAssignment_1 ) )
            {
            // InternalAltarica.g:6697:1: ( ( rule__CaseExpression__ConditionAssignment_1 ) )
            // InternalAltarica.g:6698:1: ( rule__CaseExpression__ConditionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getConditionAssignment_1()); 
            }
            // InternalAltarica.g:6699:1: ( rule__CaseExpression__ConditionAssignment_1 )
            // InternalAltarica.g:6699:2: rule__CaseExpression__ConditionAssignment_1
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
    // InternalAltarica.g:6709:1: rule__CaseExpression__Group__2 : rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 ;
    public final void rule__CaseExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6713:1: ( rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3 )
            // InternalAltarica.g:6714:2: rule__CaseExpression__Group__2__Impl rule__CaseExpression__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:6721:1: rule__CaseExpression__Group__2__Impl : ( ':' ) ;
    public final void rule__CaseExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6725:1: ( ( ':' ) )
            // InternalAltarica.g:6726:1: ( ':' )
            {
            // InternalAltarica.g:6726:1: ( ':' )
            // InternalAltarica.g:6727:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getColonKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6740:1: rule__CaseExpression__Group__3 : rule__CaseExpression__Group__3__Impl ;
    public final void rule__CaseExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6744:1: ( rule__CaseExpression__Group__3__Impl )
            // InternalAltarica.g:6745:2: rule__CaseExpression__Group__3__Impl
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
    // InternalAltarica.g:6751:1: rule__CaseExpression__Group__3__Impl : ( ( rule__CaseExpression__CaseAssignment_3 ) ) ;
    public final void rule__CaseExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6755:1: ( ( ( rule__CaseExpression__CaseAssignment_3 ) ) )
            // InternalAltarica.g:6756:1: ( ( rule__CaseExpression__CaseAssignment_3 ) )
            {
            // InternalAltarica.g:6756:1: ( ( rule__CaseExpression__CaseAssignment_3 ) )
            // InternalAltarica.g:6757:1: ( rule__CaseExpression__CaseAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCaseExpressionAccess().getCaseAssignment_3()); 
            }
            // InternalAltarica.g:6758:1: ( rule__CaseExpression__CaseAssignment_3 )
            // InternalAltarica.g:6758:2: rule__CaseExpression__CaseAssignment_3
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
    // InternalAltarica.g:6776:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6780:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // InternalAltarica.g:6781:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalAltarica.g:6788:1: rule__FunctionCall__Group__0__Impl : ( () ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6792:1: ( ( () ) )
            // InternalAltarica.g:6793:1: ( () )
            {
            // InternalAltarica.g:6793:1: ( () )
            // InternalAltarica.g:6794:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionCallAction_0()); 
            }
            // InternalAltarica.g:6795:1: ()
            // InternalAltarica.g:6797:1: 
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
    // InternalAltarica.g:6807:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6811:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // InternalAltarica.g:6812:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_56);
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
    // InternalAltarica.g:6819:1: rule__FunctionCall__Group__1__Impl : ( ( rule__FunctionCall__NameAssignment_1 ) ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6823:1: ( ( ( rule__FunctionCall__NameAssignment_1 ) ) )
            // InternalAltarica.g:6824:1: ( ( rule__FunctionCall__NameAssignment_1 ) )
            {
            // InternalAltarica.g:6824:1: ( ( rule__FunctionCall__NameAssignment_1 ) )
            // InternalAltarica.g:6825:1: ( rule__FunctionCall__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getNameAssignment_1()); 
            }
            // InternalAltarica.g:6826:1: ( rule__FunctionCall__NameAssignment_1 )
            // InternalAltarica.g:6826:2: rule__FunctionCall__NameAssignment_1
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
    // InternalAltarica.g:6836:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6840:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // InternalAltarica.g:6841:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_57);
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
    // InternalAltarica.g:6848:1: rule__FunctionCall__Group__2__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6852:1: ( ( '(' ) )
            // InternalAltarica.g:6853:1: ( '(' )
            {
            // InternalAltarica.g:6853:1: ( '(' )
            // InternalAltarica.g:6854:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6867:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6871:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // InternalAltarica.g:6872:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_57);
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
    // InternalAltarica.g:6879:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__Group_3__0 )? ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6883:1: ( ( ( rule__FunctionCall__Group_3__0 )? ) )
            // InternalAltarica.g:6884:1: ( ( rule__FunctionCall__Group_3__0 )? )
            {
            // InternalAltarica.g:6884:1: ( ( rule__FunctionCall__Group_3__0 )? )
            // InternalAltarica.g:6885:1: ( rule__FunctionCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            }
            // InternalAltarica.g:6886:1: ( rule__FunctionCall__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_NUMBER)||LA37_0==23||(LA37_0>=26 && LA37_0<=30)||LA37_0==42||(LA37_0>=57 && LA37_0<=58)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAltarica.g:6886:2: rule__FunctionCall__Group_3__0
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
    // InternalAltarica.g:6896:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6900:1: ( rule__FunctionCall__Group__4__Impl )
            // InternalAltarica.g:6901:2: rule__FunctionCall__Group__4__Impl
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
    // InternalAltarica.g:6907:1: rule__FunctionCall__Group__4__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6911:1: ( ( ')' ) )
            // InternalAltarica.g:6912:1: ( ')' )
            {
            // InternalAltarica.g:6912:1: ( ')' )
            // InternalAltarica.g:6913:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:6936:1: rule__FunctionCall__Group_3__0 : rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 ;
    public final void rule__FunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6940:1: ( rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 )
            // InternalAltarica.g:6941:2: rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAltarica.g:6948:1: rule__FunctionCall__Group_3__0__Impl : ( ( rule__FunctionCall__ParametersAssignment_3_0 ) ) ;
    public final void rule__FunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6952:1: ( ( ( rule__FunctionCall__ParametersAssignment_3_0 ) ) )
            // InternalAltarica.g:6953:1: ( ( rule__FunctionCall__ParametersAssignment_3_0 ) )
            {
            // InternalAltarica.g:6953:1: ( ( rule__FunctionCall__ParametersAssignment_3_0 ) )
            // InternalAltarica.g:6954:1: ( rule__FunctionCall__ParametersAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_0()); 
            }
            // InternalAltarica.g:6955:1: ( rule__FunctionCall__ParametersAssignment_3_0 )
            // InternalAltarica.g:6955:2: rule__FunctionCall__ParametersAssignment_3_0
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
    // InternalAltarica.g:6965:1: rule__FunctionCall__Group_3__1 : rule__FunctionCall__Group_3__1__Impl ;
    public final void rule__FunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6969:1: ( rule__FunctionCall__Group_3__1__Impl )
            // InternalAltarica.g:6970:2: rule__FunctionCall__Group_3__1__Impl
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
    // InternalAltarica.g:6976:1: rule__FunctionCall__Group_3__1__Impl : ( ( rule__FunctionCall__Group_3_1__0 )* ) ;
    public final void rule__FunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:6980:1: ( ( ( rule__FunctionCall__Group_3_1__0 )* ) )
            // InternalAltarica.g:6981:1: ( ( rule__FunctionCall__Group_3_1__0 )* )
            {
            // InternalAltarica.g:6981:1: ( ( rule__FunctionCall__Group_3_1__0 )* )
            // InternalAltarica.g:6982:1: ( rule__FunctionCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_3_1()); 
            }
            // InternalAltarica.g:6983:1: ( rule__FunctionCall__Group_3_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAltarica.g:6983:2: rule__FunctionCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__FunctionCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalAltarica.g:6997:1: rule__FunctionCall__Group_3_1__0 : rule__FunctionCall__Group_3_1__0__Impl rule__FunctionCall__Group_3_1__1 ;
    public final void rule__FunctionCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7001:1: ( rule__FunctionCall__Group_3_1__0__Impl rule__FunctionCall__Group_3_1__1 )
            // InternalAltarica.g:7002:2: rule__FunctionCall__Group_3_1__0__Impl rule__FunctionCall__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAltarica.g:7009:1: rule__FunctionCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7013:1: ( ( ',' ) )
            // InternalAltarica.g:7014:1: ( ',' )
            {
            // InternalAltarica.g:7014:1: ( ',' )
            // InternalAltarica.g:7015:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7028:1: rule__FunctionCall__Group_3_1__1 : rule__FunctionCall__Group_3_1__1__Impl ;
    public final void rule__FunctionCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7032:1: ( rule__FunctionCall__Group_3_1__1__Impl )
            // InternalAltarica.g:7033:2: rule__FunctionCall__Group_3_1__1__Impl
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
    // InternalAltarica.g:7039:1: rule__FunctionCall__Group_3_1__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__FunctionCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7043:1: ( ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) ) )
            // InternalAltarica.g:7044:1: ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) )
            {
            // InternalAltarica.g:7044:1: ( ( rule__FunctionCall__ParametersAssignment_3_1_1 ) )
            // InternalAltarica.g:7045:1: ( rule__FunctionCall__ParametersAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1_1()); 
            }
            // InternalAltarica.g:7046:1: ( rule__FunctionCall__ParametersAssignment_3_1_1 )
            // InternalAltarica.g:7046:2: rule__FunctionCall__ParametersAssignment_3_1_1
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


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalAltarica.g:7061:1: rule__Model__DeclarationsAssignment : ( ruleAbstractDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7065:1: ( ( ruleAbstractDeclaration ) )
            // InternalAltarica.g:7066:1: ( ruleAbstractDeclaration )
            {
            // InternalAltarica.g:7066:1: ( ruleAbstractDeclaration )
            // InternalAltarica.g:7067:1: ruleAbstractDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7076:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7080:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7081:1: ( RULE_ID )
            {
            // InternalAltarica.g:7081:1: ( RULE_ID )
            // InternalAltarica.g:7082:1: RULE_ID
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
    // InternalAltarica.g:7091:1: rule__Domain__ConstantsAssignment_4_0 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7095:1: ( ( ruleSymbolicConstant ) )
            // InternalAltarica.g:7096:1: ( ruleSymbolicConstant )
            {
            // InternalAltarica.g:7096:1: ( ruleSymbolicConstant )
            // InternalAltarica.g:7097:1: ruleSymbolicConstant
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
    // InternalAltarica.g:7106:1: rule__Domain__ConstantsAssignment_4_1_1 : ( ruleSymbolicConstant ) ;
    public final void rule__Domain__ConstantsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7110:1: ( ( ruleSymbolicConstant ) )
            // InternalAltarica.g:7111:1: ( ruleSymbolicConstant )
            {
            // InternalAltarica.g:7111:1: ( ruleSymbolicConstant )
            // InternalAltarica.g:7112:1: ruleSymbolicConstant
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
    // InternalAltarica.g:7121:1: rule__SymbolicConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SymbolicConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7125:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7126:1: ( RULE_ID )
            {
            // InternalAltarica.g:7126:1: ( RULE_ID )
            // InternalAltarica.g:7127:1: RULE_ID
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
    // InternalAltarica.g:7136:1: rule__BaseType__NameAssignment : ( ruleBaseTypeEnum ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7140:1: ( ( ruleBaseTypeEnum ) )
            // InternalAltarica.g:7141:1: ( ruleBaseTypeEnum )
            {
            // InternalAltarica.g:7141:1: ( ruleBaseTypeEnum )
            // InternalAltarica.g:7142:1: ruleBaseTypeEnum
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
    // InternalAltarica.g:7151:1: rule__NamedType__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NamedType__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7155:1: ( ( ( RULE_ID ) ) )
            // InternalAltarica.g:7156:1: ( ( RULE_ID ) )
            {
            // InternalAltarica.g:7156:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7157:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
            }
            // InternalAltarica.g:7158:1: ( RULE_ID )
            // InternalAltarica.g:7159:1: RULE_ID
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
    // InternalAltarica.g:7170:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7174:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7175:1: ( RULE_ID )
            {
            // InternalAltarica.g:7175:1: ( RULE_ID )
            // InternalAltarica.g:7176:1: RULE_ID
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
    // InternalAltarica.g:7185:1: rule__Class__DeclarationsAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Class__DeclarationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7189:1: ( ( ruleDeclaration ) )
            // InternalAltarica.g:7190:1: ( ruleDeclaration )
            {
            // InternalAltarica.g:7190:1: ( ruleDeclaration )
            // InternalAltarica.g:7191:1: ruleDeclaration
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
    // InternalAltarica.g:7200:1: rule__Class__TransitionsAssignment_4_1 : ( ruleLabeledTransition ) ;
    public final void rule__Class__TransitionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7204:1: ( ( ruleLabeledTransition ) )
            // InternalAltarica.g:7205:1: ( ruleLabeledTransition )
            {
            // InternalAltarica.g:7205:1: ( ruleLabeledTransition )
            // InternalAltarica.g:7206:1: ruleLabeledTransition
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
    // InternalAltarica.g:7215:1: rule__Class__AssertionsAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Class__AssertionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7219:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7220:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7220:1: ( ruleInstruction )
            // InternalAltarica.g:7221:1: ruleInstruction
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
    // InternalAltarica.g:7230:1: rule__VariableDeclaration__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7234:1: ( ( ruleType ) )
            // InternalAltarica.g:7235:1: ( ruleType )
            {
            // InternalAltarica.g:7235:1: ( ruleType )
            // InternalAltarica.g:7236:1: ruleType
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
    // InternalAltarica.g:7245:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7249:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7250:1: ( RULE_ID )
            {
            // InternalAltarica.g:7250:1: ( RULE_ID )
            // InternalAltarica.g:7251:1: RULE_ID
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
    // InternalAltarica.g:7260:1: rule__VariableDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7264:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7265:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7265:1: ( ruleAttribute )
            // InternalAltarica.g:7266:1: ruleAttribute
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
    // InternalAltarica.g:7275:1: rule__VariableDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__VariableDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7279:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7280:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7280:1: ( ruleAttribute )
            // InternalAltarica.g:7281:1: ruleAttribute
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
    // InternalAltarica.g:7290:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7294:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7295:1: ( RULE_ID )
            {
            // InternalAltarica.g:7295:1: ( RULE_ID )
            // InternalAltarica.g:7296:1: RULE_ID
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
    // InternalAltarica.g:7305:1: rule__Attribute__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7309:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7310:1: ( ruleExpression )
            {
            // InternalAltarica.g:7310:1: ( ruleExpression )
            // InternalAltarica.g:7311:1: ruleExpression
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
    // InternalAltarica.g:7320:1: rule__EventDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EventDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7324:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7325:1: ( RULE_ID )
            {
            // InternalAltarica.g:7325:1: ( RULE_ID )
            // InternalAltarica.g:7326:1: RULE_ID
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
    // InternalAltarica.g:7335:1: rule__EventDeclaration__AttributesAssignment_3_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7339:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7340:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7340:1: ( ruleAttribute )
            // InternalAltarica.g:7341:1: ruleAttribute
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
    // InternalAltarica.g:7350:1: rule__EventDeclaration__AttributesAssignment_3_2_1 : ( ruleAttribute ) ;
    public final void rule__EventDeclaration__AttributesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7354:1: ( ( ruleAttribute ) )
            // InternalAltarica.g:7355:1: ( ruleAttribute )
            {
            // InternalAltarica.g:7355:1: ( ruleAttribute )
            // InternalAltarica.g:7356:1: ruleAttribute
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
    // InternalAltarica.g:7365:1: rule__ParameterDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7369:1: ( ( ruleType ) )
            // InternalAltarica.g:7370:1: ( ruleType )
            {
            // InternalAltarica.g:7370:1: ( ruleType )
            // InternalAltarica.g:7371:1: ruleType
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
    // InternalAltarica.g:7380:1: rule__ParameterDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7384:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7385:1: ( RULE_ID )
            {
            // InternalAltarica.g:7385:1: ( RULE_ID )
            // InternalAltarica.g:7386:1: RULE_ID
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
    // InternalAltarica.g:7395:1: rule__ParameterDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ParameterDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7399:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7400:1: ( ruleExpression )
            {
            // InternalAltarica.g:7400:1: ( ruleExpression )
            // InternalAltarica.g:7401:1: ruleExpression
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
    // InternalAltarica.g:7410:1: rule__ObserverDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ObserverDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7414:1: ( ( ruleType ) )
            // InternalAltarica.g:7415:1: ( ruleType )
            {
            // InternalAltarica.g:7415:1: ( ruleType )
            // InternalAltarica.g:7416:1: ruleType
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
    // InternalAltarica.g:7425:1: rule__ObserverDeclaration__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ObserverDeclaration__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7429:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7430:1: ( RULE_ID )
            {
            // InternalAltarica.g:7430:1: ( RULE_ID )
            // InternalAltarica.g:7431:1: RULE_ID
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
    // InternalAltarica.g:7440:1: rule__ObserverDeclaration__ValueAssignment_5 : ( ruleExpression ) ;
    public final void rule__ObserverDeclaration__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7444:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7445:1: ( ruleExpression )
            {
            // InternalAltarica.g:7445:1: ( ruleExpression )
            // InternalAltarica.g:7446:1: ruleExpression
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
    // InternalAltarica.g:7455:1: rule__LabeledTransition__EventAssignment_0 : ( ruleNameRef ) ;
    public final void rule__LabeledTransition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7459:1: ( ( ruleNameRef ) )
            // InternalAltarica.g:7460:1: ( ruleNameRef )
            {
            // InternalAltarica.g:7460:1: ( ruleNameRef )
            // InternalAltarica.g:7461:1: ruleNameRef
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
    // InternalAltarica.g:7470:1: rule__LabeledTransition__ExpressionAssignment_2 : ( ruleTransitionAnd ) ;
    public final void rule__LabeledTransition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7474:1: ( ( ruleTransitionAnd ) )
            // InternalAltarica.g:7475:1: ( ruleTransitionAnd )
            {
            // InternalAltarica.g:7475:1: ( ruleTransitionAnd )
            // InternalAltarica.g:7476:1: ruleTransitionAnd
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
    // InternalAltarica.g:7485:1: rule__TransitionAnd__RightAssignment_1_2 : ( ruleTransitionOr ) ;
    public final void rule__TransitionAnd__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7489:1: ( ( ruleTransitionOr ) )
            // InternalAltarica.g:7490:1: ( ruleTransitionOr )
            {
            // InternalAltarica.g:7490:1: ( ruleTransitionOr )
            // InternalAltarica.g:7491:1: ruleTransitionOr
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
    // InternalAltarica.g:7500:1: rule__TransitionOr__RightAssignment_1_2 : ( ruleTransition ) ;
    public final void rule__TransitionOr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7504:1: ( ( ruleTransition ) )
            // InternalAltarica.g:7505:1: ( ruleTransition )
            {
            // InternalAltarica.g:7505:1: ( ruleTransition )
            // InternalAltarica.g:7506:1: ruleTransition
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
    // InternalAltarica.g:7515:1: rule__Transition__GuardAssignment_1 : ( ruleExpression ) ;
    public final void rule__Transition__GuardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7519:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7520:1: ( ruleExpression )
            {
            // InternalAltarica.g:7520:1: ( ruleExpression )
            // InternalAltarica.g:7521:1: ruleExpression
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
    // InternalAltarica.g:7530:1: rule__Transition__ActionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transition__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7534:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7535:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7535:1: ( ruleInstruction )
            // InternalAltarica.g:7536:1: ruleInstruction
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
    // InternalAltarica.g:7545:1: rule__Assignment__VariableAssignment_1 : ( ruleNameRef ) ;
    public final void rule__Assignment__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7549:1: ( ( ruleNameRef ) )
            // InternalAltarica.g:7550:1: ( ruleNameRef )
            {
            // InternalAltarica.g:7550:1: ( ruleNameRef )
            // InternalAltarica.g:7551:1: ruleNameRef
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
    // InternalAltarica.g:7560:1: rule__Assignment__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7564:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7565:1: ( ruleExpression )
            {
            // InternalAltarica.g:7565:1: ( ruleExpression )
            // InternalAltarica.g:7566:1: ruleExpression
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
    // InternalAltarica.g:7575:1: rule__Block__InstructionsAssignment_2 : ( ruleInstruction ) ;
    public final void rule__Block__InstructionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7579:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7580:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7580:1: ( ruleInstruction )
            // InternalAltarica.g:7581:1: ruleInstruction
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
    // InternalAltarica.g:7590:1: rule__Conditional__ConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7594:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7595:1: ( ruleExpression )
            {
            // InternalAltarica.g:7595:1: ( ruleExpression )
            // InternalAltarica.g:7596:1: ruleExpression
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
    // InternalAltarica.g:7605:1: rule__Conditional__ThenAssignment_4 : ( ruleInstruction ) ;
    public final void rule__Conditional__ThenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7609:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7610:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7610:1: ( ruleInstruction )
            // InternalAltarica.g:7611:1: ruleInstruction
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
    // InternalAltarica.g:7620:1: rule__Conditional__ElseAssignment_5_1 : ( ruleInstruction ) ;
    public final void rule__Conditional__ElseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7624:1: ( ( ruleInstruction ) )
            // InternalAltarica.g:7625:1: ( ruleInstruction )
            {
            // InternalAltarica.g:7625:1: ( ruleInstruction )
            // InternalAltarica.g:7626:1: ruleInstruction
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
    // InternalAltarica.g:7635:1: rule__Switch__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__Switch__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7639:1: ( ( ruleCaseExpression ) )
            // InternalAltarica.g:7640:1: ( ruleCaseExpression )
            {
            // InternalAltarica.g:7640:1: ( ruleCaseExpression )
            // InternalAltarica.g:7641:1: ruleCaseExpression
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
    // InternalAltarica.g:7650:1: rule__Switch__ElseAssignment_5 : ( ruleExpression ) ;
    public final void rule__Switch__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7654:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7655:1: ( ruleExpression )
            {
            // InternalAltarica.g:7655:1: ( ruleExpression )
            // InternalAltarica.g:7656:1: ruleExpression
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


    // $ANTLR start "rule__LogicalOr__OpAssignment_1_0_1"
    // InternalAltarica.g:7665:1: rule__LogicalOr__OpAssignment_1_0_1 : ( ( 'or' ) ) ;
    public final void rule__LogicalOr__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7669:1: ( ( ( 'or' ) ) )
            // InternalAltarica.g:7670:1: ( ( 'or' ) )
            {
            // InternalAltarica.g:7670:1: ( ( 'or' ) )
            // InternalAltarica.g:7671:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }
            // InternalAltarica.g:7672:1: ( 'or' )
            // InternalAltarica.g:7673:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7688:1: rule__LogicalOr__RightAssignment_1_0_2 : ( ruleLogicalAnd ) ;
    public final void rule__LogicalOr__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7692:1: ( ( ruleLogicalAnd ) )
            // InternalAltarica.g:7693:1: ( ruleLogicalAnd )
            {
            // InternalAltarica.g:7693:1: ( ruleLogicalAnd )
            // InternalAltarica.g:7694:1: ruleLogicalAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7703:1: rule__LogicalAnd__OpAssignment_1_0_1 : ( ( 'and' ) ) ;
    public final void rule__LogicalAnd__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7707:1: ( ( ( 'and' ) ) )
            // InternalAltarica.g:7708:1: ( ( 'and' ) )
            {
            // InternalAltarica.g:7708:1: ( ( 'and' ) )
            // InternalAltarica.g:7709:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }
            // InternalAltarica.g:7710:1: ( 'and' )
            // InternalAltarica.g:7711:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
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
    // InternalAltarica.g:7726:1: rule__LogicalAnd__RightAssignment_1_0_2 : ( ruleRelation ) ;
    public final void rule__LogicalAnd__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7730:1: ( ( ruleRelation ) )
            // InternalAltarica.g:7731:1: ( ruleRelation )
            {
            // InternalAltarica.g:7731:1: ( ruleRelation )
            // InternalAltarica.g:7732:1: ruleRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7741:1: rule__Relation__OpAssignment_1_0_1 : ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Relation__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7745:1: ( ( ( rule__Relation__OpAlternatives_1_0_1_0 ) ) )
            // InternalAltarica.g:7746:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            {
            // InternalAltarica.g:7746:1: ( ( rule__Relation__OpAlternatives_1_0_1_0 ) )
            // InternalAltarica.g:7747:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalAltarica.g:7748:1: ( rule__Relation__OpAlternatives_1_0_1_0 )
            // InternalAltarica.g:7748:2: rule__Relation__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7757:1: rule__Relation__RightAssignment_1_0_2 : ( ruleAddition ) ;
    public final void rule__Relation__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7761:1: ( ( ruleAddition ) )
            // InternalAltarica.g:7762:1: ( ruleAddition )
            {
            // InternalAltarica.g:7762:1: ( ruleAddition )
            // InternalAltarica.g:7763:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7772:1: rule__Addition__OpAssignment_1_0_1 : ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Addition__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7776:1: ( ( ( rule__Addition__OpAlternatives_1_0_1_0 ) ) )
            // InternalAltarica.g:7777:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            {
            // InternalAltarica.g:7777:1: ( ( rule__Addition__OpAlternatives_1_0_1_0 ) )
            // InternalAltarica.g:7778:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalAltarica.g:7779:1: ( rule__Addition__OpAlternatives_1_0_1_0 )
            // InternalAltarica.g:7779:2: rule__Addition__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7788:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7792:1: ( ( ruleMultiplication ) )
            // InternalAltarica.g:7793:1: ( ruleMultiplication )
            {
            // InternalAltarica.g:7793:1: ( ruleMultiplication )
            // InternalAltarica.g:7794:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7803:1: rule__Multiplication__OpAssignment_1_0_1 : ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Multiplication__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7807:1: ( ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) ) )
            // InternalAltarica.g:7808:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            {
            // InternalAltarica.g:7808:1: ( ( rule__Multiplication__OpAlternatives_1_0_1_0 ) )
            // InternalAltarica.g:7809:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getOpAlternatives_1_0_1_0()); 
            }
            // InternalAltarica.g:7810:1: ( rule__Multiplication__OpAlternatives_1_0_1_0 )
            // InternalAltarica.g:7810:2: rule__Multiplication__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7819:1: rule__Multiplication__RightAssignment_1_0_2 : ( ruleNeg ) ;
    public final void rule__Multiplication__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7823:1: ( ( ruleNeg ) )
            // InternalAltarica.g:7824:1: ( ruleNeg )
            {
            // InternalAltarica.g:7824:1: ( ruleNeg )
            // InternalAltarica.g:7825:1: ruleNeg
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:7834:1: rule__Neg__ExpressionAssignment_0_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7838:1: ( ( ruleAtom ) )
            // InternalAltarica.g:7839:1: ( ruleAtom )
            {
            // InternalAltarica.g:7839:1: ( ruleAtom )
            // InternalAltarica.g:7840:1: ruleAtom
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
    // InternalAltarica.g:7849:1: rule__Neg__ExpressionAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Neg__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7853:1: ( ( ruleAtom ) )
            // InternalAltarica.g:7854:1: ( ruleAtom )
            {
            // InternalAltarica.g:7854:1: ( ruleAtom )
            // InternalAltarica.g:7855:1: ruleAtom
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
    // InternalAltarica.g:7864:1: rule__BooleanLiteral__ValueAssignment : ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7868:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_0 ) ) )
            // InternalAltarica.g:7869:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            {
            // InternalAltarica.g:7869:1: ( ( rule__BooleanLiteral__ValueAlternatives_0 ) )
            // InternalAltarica.g:7870:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_0()); 
            }
            // InternalAltarica.g:7871:1: ( rule__BooleanLiteral__ValueAlternatives_0 )
            // InternalAltarica.g:7871:2: rule__BooleanLiteral__ValueAlternatives_0
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
    // InternalAltarica.g:7880:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7884:1: ( ( RULE_STRING ) )
            // InternalAltarica.g:7885:1: ( RULE_STRING )
            {
            // InternalAltarica.g:7885:1: ( RULE_STRING )
            // InternalAltarica.g:7886:1: RULE_STRING
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
    // InternalAltarica.g:7895:1: rule__NumberLiteral__ValueAssignment : ( RULE_NUMBER ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7899:1: ( ( RULE_NUMBER ) )
            // InternalAltarica.g:7900:1: ( RULE_NUMBER )
            {
            // InternalAltarica.g:7900:1: ( RULE_NUMBER )
            // InternalAltarica.g:7901:1: RULE_NUMBER
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
    // InternalAltarica.g:7910:1: rule__NameRef__VariableAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7914:1: ( ( ( RULE_ID ) ) )
            // InternalAltarica.g:7915:1: ( ( RULE_ID ) )
            {
            // InternalAltarica.g:7915:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7916:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
            }
            // InternalAltarica.g:7917:1: ( RULE_ID )
            // InternalAltarica.g:7918:1: RULE_ID
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
    // InternalAltarica.g:7929:1: rule__NameRef__VariableAssignment_1_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__NameRef__VariableAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7933:1: ( ( ( RULE_ID ) ) )
            // InternalAltarica.g:7934:1: ( ( RULE_ID ) )
            {
            // InternalAltarica.g:7934:1: ( ( RULE_ID ) )
            // InternalAltarica.g:7935:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            }
            // InternalAltarica.g:7936:1: ( RULE_ID )
            // InternalAltarica.g:7937:1: RULE_ID
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
    // InternalAltarica.g:7948:1: rule__SwitchExpression__CasesAssignment_2 : ( ruleCaseExpression ) ;
    public final void rule__SwitchExpression__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7952:1: ( ( ruleCaseExpression ) )
            // InternalAltarica.g:7953:1: ( ruleCaseExpression )
            {
            // InternalAltarica.g:7953:1: ( ruleCaseExpression )
            // InternalAltarica.g:7954:1: ruleCaseExpression
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
    // InternalAltarica.g:7963:1: rule__SwitchExpression__DefaultAssignment_5 : ( ruleExpression ) ;
    public final void rule__SwitchExpression__DefaultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7967:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7968:1: ( ruleExpression )
            {
            // InternalAltarica.g:7968:1: ( ruleExpression )
            // InternalAltarica.g:7969:1: ruleExpression
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
    // InternalAltarica.g:7978:1: rule__CaseExpression__ConditionAssignment_1 : ( ruleLogicalOr ) ;
    public final void rule__CaseExpression__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7982:1: ( ( ruleLogicalOr ) )
            // InternalAltarica.g:7983:1: ( ruleLogicalOr )
            {
            // InternalAltarica.g:7983:1: ( ruleLogicalOr )
            // InternalAltarica.g:7984:1: ruleLogicalOr
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
    // InternalAltarica.g:7993:1: rule__CaseExpression__CaseAssignment_3 : ( ruleExpression ) ;
    public final void rule__CaseExpression__CaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:7997:1: ( ( ruleExpression ) )
            // InternalAltarica.g:7998:1: ( ruleExpression )
            {
            // InternalAltarica.g:7998:1: ( ruleExpression )
            // InternalAltarica.g:7999:1: ruleExpression
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
    // InternalAltarica.g:8008:1: rule__FunctionCall__NameAssignment_1 : ( ( rule__FunctionCall__NameAlternatives_1_0 ) ) ;
    public final void rule__FunctionCall__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8012:1: ( ( ( rule__FunctionCall__NameAlternatives_1_0 ) ) )
            // InternalAltarica.g:8013:1: ( ( rule__FunctionCall__NameAlternatives_1_0 ) )
            {
            // InternalAltarica.g:8013:1: ( ( rule__FunctionCall__NameAlternatives_1_0 ) )
            // InternalAltarica.g:8014:1: ( rule__FunctionCall__NameAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getNameAlternatives_1_0()); 
            }
            // InternalAltarica.g:8015:1: ( rule__FunctionCall__NameAlternatives_1_0 )
            // InternalAltarica.g:8015:2: rule__FunctionCall__NameAlternatives_1_0
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
    // InternalAltarica.g:8024:1: rule__FunctionCall__ParametersAssignment_3_0 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8028:1: ( ( ruleExpression ) )
            // InternalAltarica.g:8029:1: ( ruleExpression )
            {
            // InternalAltarica.g:8029:1: ( ruleExpression )
            // InternalAltarica.g:8030:1: ruleExpression
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
    // InternalAltarica.g:8039:1: rule__FunctionCall__ParametersAssignment_3_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAltarica.g:8043:1: ( ( ruleExpression ) )
            // InternalAltarica.g:8044:1: ( ruleExpression )
            {
            // InternalAltarica.g:8044:1: ( ruleExpression )
            // InternalAltarica.g:8045:1: ruleExpression
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002200000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000E1C180000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000E00180000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0250000400000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0250000400000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000081000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x060004007C800070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000E00180000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x06000C007C800070L});

}