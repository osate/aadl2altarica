package org.osate.altarica.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.altarica.services.AltaricaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAltaricaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "':'", "'domain'", "';'", "'['", "','", "']'", "'{'", "'}'", "'class'", "'transition'", "'assertion'", "'end'", "'('", "')'", "'event'", "'parameter'", "'observer'", "'&'", "'|'", "'$transition'", "'skip'", "':='", "'if'", "'then'", "'else'", "'and'", "'or'", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'not'", "'true'", "'false'", "'.'", "'case {'", "'Integer'", "'Boolean'"
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
    public static final int T__58=58;
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
    public String getGrammarFileName() { return "../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g"; }



     	private AltaricaGrammarAccess grammarAccess;
     	
        public InternalAltaricaParser(TokenStream input, AltaricaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected AltaricaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:77:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleAbstractDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:80:28: ( ( (lv_declarations_0_0= ruleAbstractDeclaration ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:81:1: ( (lv_declarations_0_0= ruleAbstractDeclaration ) )*
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:81:1: ( (lv_declarations_0_0= ruleAbstractDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:82:1: (lv_declarations_0_0= ruleAbstractDeclaration )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:82:1: (lv_declarations_0_0= ruleAbstractDeclaration )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:83:3: lv_declarations_0_0= ruleAbstractDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractDeclaration_in_ruleModel130);
            	    lv_declarations_0_0=ruleAbstractDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_0_0, 
            	              		"AbstractDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:107:1: entryRuleAbstractDeclaration returns [EObject current=null] : iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF ;
    public final EObject entryRuleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:108:2: (iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:109:2: iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166);
            iv_ruleAbstractDeclaration=ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclaration176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDeclaration"


    // $ANTLR start "ruleAbstractDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:116:1: ruleAbstractDeclaration returns [EObject current=null] : (this_Domain_0= ruleDomain | this_Class_1= ruleClass ) ;
    public final EObject ruleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Domain_0 = null;

        EObject this_Class_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:119:28: ( (this_Domain_0= ruleDomain | this_Class_1= ruleClass ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:120:1: (this_Domain_0= ruleDomain | this_Class_1= ruleClass )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:120:1: (this_Domain_0= ruleDomain | this_Class_1= ruleClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:121:5: this_Domain_0= ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomain_in_ruleAbstractDeclaration223);
                    this_Domain_0=ruleDomain();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Domain_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:131:5: this_Class_1= ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_in_ruleAbstractDeclaration250);
                    this_Class_1=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Class_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDeclaration"


    // $ANTLR start "entryRuleAbstractDefinitionConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:149:1: entryRuleAbstractDefinitionConstant returns [EObject current=null] : iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF ;
    public final EObject entryRuleAbstractDefinitionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDefinitionConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:150:2: (iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:151:2: iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDefinitionConstantRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant287);
            iv_ruleAbstractDefinitionConstant=ruleAbstractDefinitionConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDefinitionConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant297); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDefinitionConstant"


    // $ANTLR start "ruleAbstractDefinitionConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:158:1: ruleAbstractDefinitionConstant returns [EObject current=null] : (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant ) ;
    public final EObject ruleAbstractDefinitionConstant() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionConstant_0 = null;

        EObject this_DomainConstant_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:161:28: ( (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:162:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:162:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:163:5: this_ExpressionConstant_0= ruleExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDefinitionConstantAccess().getExpressionConstantParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpressionConstant_in_ruleAbstractDefinitionConstant344);
                    this_ExpressionConstant_0=ruleExpressionConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExpressionConstant_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:173:5: this_DomainConstant_1= ruleDomainConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDefinitionConstantAccess().getDomainConstantParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDomainConstant_in_ruleAbstractDefinitionConstant371);
                    this_DomainConstant_1=ruleDomainConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DomainConstant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDefinitionConstant"


    // $ANTLR start "entryRuleExpressionConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:189:1: entryRuleExpressionConstant returns [EObject current=null] : iv_ruleExpressionConstant= ruleExpressionConstant EOF ;
    public final EObject entryRuleExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:190:2: (iv_ruleExpressionConstant= ruleExpressionConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:191:2: iv_ruleExpressionConstant= ruleExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant406);
            iv_ruleExpressionConstant=ruleExpressionConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionConstant416); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionConstant"


    // $ANTLR start "ruleExpressionConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:198:1: ruleExpressionConstant returns [EObject current=null] : (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:201:28: ( (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:202:1: (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:202:1: (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:202:3: otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleExpressionConstant453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpressionConstantAccess().getEqualsSignKeyword_0());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:206:1: ( (lv_ownedExpression_1_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:207:1: (lv_ownedExpression_1_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:207:1: (lv_ownedExpression_1_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:208:3: lv_ownedExpression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionConstantAccess().getOwnedExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionConstant474);
            lv_ownedExpression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionConstantRule());
              	        }
                     		set(
                     			current, 
                     			"ownedExpression",
                      		lv_ownedExpression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionConstant"


    // $ANTLR start "entryRuleDomainConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:232:1: entryRuleDomainConstant returns [EObject current=null] : iv_ruleDomainConstant= ruleDomainConstant EOF ;
    public final EObject entryRuleDomainConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:233:2: (iv_ruleDomainConstant= ruleDomainConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:234:2: iv_ruleDomainConstant= ruleDomainConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainConstantRule()); 
            }
            pushFollow(FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant510);
            iv_ruleDomainConstant=ruleDomainConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainConstant520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainConstant"


    // $ANTLR start "ruleDomainConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:241:1: ruleDomainConstant returns [EObject current=null] : (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDomainConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_domain_1_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:244:28: ( (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:245:1: (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:245:1: (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:245:3: otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDomainConstant557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDomainConstantAccess().getColonKeyword_0());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:249:1: ( (lv_domain_1_0= ruleAbstractDomain ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:250:1: (lv_domain_1_0= ruleAbstractDomain )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:250:1: (lv_domain_1_0= ruleAbstractDomain )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:251:3: lv_domain_1_0= ruleAbstractDomain
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainConstantAccess().getDomainAbstractDomainParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractDomain_in_ruleDomainConstant578);
            lv_domain_1_0=ruleAbstractDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDomainConstantRule());
              	        }
                     		set(
                     			current, 
                     			"domain",
                      		lv_domain_1_0, 
                      		"AbstractDomain");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:267:2: (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:267:4: otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleDomainConstant591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDomainConstantAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:271:1: ( (lv_ownedExpression_3_0= ruleExpression ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:272:1: (lv_ownedExpression_3_0= ruleExpression )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:272:1: (lv_ownedExpression_3_0= ruleExpression )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:273:3: lv_ownedExpression_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainConstantAccess().getOwnedExpressionExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleDomainConstant612);
                    lv_ownedExpression_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedExpression",
                              		lv_ownedExpression_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainConstant"


    // $ANTLR start "entryRuleDomain"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:297:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:298:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:299:2: iv_ruleDomain= ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain650);
            iv_ruleDomain=ruleDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomain; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:306:1: ruleDomain returns [EObject current=null] : ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) ( (lv_domain_3_0= ruleEnumeration ) ) otherlv_4= ';' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_domain_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:309:28: ( ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) ( (lv_domain_3_0= ruleEnumeration ) ) otherlv_4= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:310:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) ( (lv_domain_3_0= ruleEnumeration ) ) otherlv_4= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:310:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) ( (lv_domain_3_0= ruleEnumeration ) ) otherlv_4= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:310:2: () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) ( (lv_domain_3_0= ruleEnumeration ) ) otherlv_4= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:310:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:311:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainAccess().getDomainAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDomain706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:320:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:321:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:321:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:322:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDomainRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:338:2: ( (lv_domain_3_0= ruleEnumeration ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:339:1: (lv_domain_3_0= ruleEnumeration )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:339:1: (lv_domain_3_0= ruleEnumeration )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:340:3: lv_domain_3_0= ruleEnumeration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDomainAccess().getDomainEnumerationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumeration_in_ruleDomain749);
            lv_domain_3_0=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDomainRule());
              	        }
                     		set(
                     			current, 
                     			"domain",
                      		lv_domain_3_0, 
                      		"Enumeration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleDomain761); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleAbstractDomain"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:368:1: entryRuleAbstractDomain returns [EObject current=null] : iv_ruleAbstractDomain= ruleAbstractDomain EOF ;
    public final EObject entryRuleAbstractDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDomain = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:369:2: (iv_ruleAbstractDomain= ruleAbstractDomain EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:370:2: iv_ruleAbstractDomain= ruleAbstractDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDomainRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain797);
            iv_ruleAbstractDomain=ruleAbstractDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDomain; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDomain807); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDomain"


    // $ANTLR start "ruleAbstractDomain"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:377:1: ruleAbstractDomain returns [EObject current=null] : (this_BaseType_0= ruleBaseType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleAbstractDomain() throws RecognitionException {
        EObject current = null;

        EObject this_BaseType_0 = null;

        EObject this_Range_1 = null;

        EObject this_Enumeration_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:380:28: ( (this_BaseType_0= ruleBaseType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:381:1: (this_BaseType_0= ruleBaseType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:381:1: (this_BaseType_0= ruleBaseType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 57:
            case 58:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:382:5: this_BaseType_0= ruleBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDomainAccess().getBaseTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBaseType_in_ruleAbstractDomain854);
                    this_BaseType_0=ruleBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BaseType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:392:5: this_Range_1= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDomainAccess().getRangeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRange_in_ruleAbstractDomain881);
                    this_Range_1=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Range_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:402:5: this_Enumeration_2= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDomainAccess().getEnumerationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleAbstractDomain908);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enumeration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDomain"


    // $ANTLR start "entryRuleRange"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:418:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:419:2: (iv_ruleRange= ruleRange EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:420:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange943);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange953); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:427:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:430:28: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:431:1: (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:431:1: (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:431:3: otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRange990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:435:1: ( (lv_lower_1_0= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:436:1: (lv_lower_1_0= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:436:1: (lv_lower_1_0= ruleAtom )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:437:3: lv_lower_1_0= ruleAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getLowerAtomParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleRange1011);
            lv_lower_1_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lower",
                      		lv_lower_1_0, 
                      		"Atom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleRange1023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getCommaKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:457:1: ( (lv_upper_3_0= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:458:1: (lv_upper_3_0= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:458:1: (lv_upper_3_0= ruleAtom )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:459:3: lv_upper_3_0= ruleAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getUpperAtomParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAtom_in_ruleRange1044);
            lv_upper_3_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"upper",
                      		lv_upper_3_0, 
                      		"Atom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleRange1056); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleEnumeration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:487:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:488:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:489:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1092);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:496:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedSymbols_2_0 = null;

        EObject lv_ownedSymbols_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:499:28: ( ( () otherlv_1= '{' ( ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )* )? otherlv_5= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:500:1: ( () otherlv_1= '{' ( ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )* )? otherlv_5= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:500:1: ( () otherlv_1= '{' ( ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )* )? otherlv_5= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:500:2: () otherlv_1= '{' ( ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )* )? otherlv_5= '}'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:500:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:501:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEnumeration1148); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:510:1: ( ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:510:2: ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) ) (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )*
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:510:2: ( (lv_ownedSymbols_2_0= ruleSymbolicConstant ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:511:1: (lv_ownedSymbols_2_0= ruleSymbolicConstant )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:511:1: (lv_ownedSymbols_2_0= ruleSymbolicConstant )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:512:3: lv_ownedSymbols_2_0= ruleSymbolicConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedSymbolsSymbolicConstantParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSymbolicConstant_in_ruleEnumeration1170);
                    lv_ownedSymbols_2_0=ruleSymbolicConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedSymbols",
                              		lv_ownedSymbols_2_0, 
                              		"SymbolicConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:528:2: (otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:528:4: otherlv_3= ',' ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEnumeration1183); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:532:1: ( (lv_ownedSymbols_4_0= ruleSymbolicConstant ) )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:533:1: (lv_ownedSymbols_4_0= ruleSymbolicConstant )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:533:1: (lv_ownedSymbols_4_0= ruleSymbolicConstant )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:534:3: lv_ownedSymbols_4_0= ruleSymbolicConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedSymbolsSymbolicConstantParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSymbolicConstant_in_ruleEnumeration1204);
                    	    lv_ownedSymbols_4_0=ruleSymbolicConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedSymbols",
                    	              		lv_ownedSymbols_4_0, 
                    	              		"SymbolicConstant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleEnumeration1220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleSymbolicConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:562:1: entryRuleSymbolicConstant returns [EObject current=null] : iv_ruleSymbolicConstant= ruleSymbolicConstant EOF ;
    public final EObject entryRuleSymbolicConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:563:2: (iv_ruleSymbolicConstant= ruleSymbolicConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:564:2: iv_ruleSymbolicConstant= ruleSymbolicConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolicConstantRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_entryRuleSymbolicConstant1256);
            iv_ruleSymbolicConstant=ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolicConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicConstant1266); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolicConstant"


    // $ANTLR start "ruleSymbolicConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:571:1: ruleSymbolicConstant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolicConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:574:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:575:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:575:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:575:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:575:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:576:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:581:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:582:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:582:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:583:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolicConstant1317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSymbolicConstantAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSymbolicConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolicConstant"


    // $ANTLR start "entryRuleType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:607:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:608:2: (iv_ruleType= ruleType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:609:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1358);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1368); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:616:1: ruleType returns [EObject current=null] : ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BaseType_0 = null;

        EObject this_NamedType_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:619:28: ( ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:1: ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:1: ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==57) && (synpred1_InternalAltarica())) {
                alt8=1;
            }
            else if ( (LA8_0==58) && (synpred1_InternalAltarica())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:2: ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:2: ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:3: ( ruleBaseType )=>this_BaseType_0= ruleBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBaseType_in_ruleType1421);
                    this_BaseType_0=ruleBaseType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BaseType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:631:5: this_NamedType_1= ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedType_in_ruleType1449);
                    this_NamedType_1=ruleNamedType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NamedType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleBaseType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:647:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:648:2: (iv_ruleBaseType= ruleBaseType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:649:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType1484);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType1494); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:656:1: ruleBaseType returns [EObject current=null] : ( (lv_name_0_0= ruleBaseTypeEnum ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:659:28: ( ( (lv_name_0_0= ruleBaseTypeEnum ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:660:1: ( (lv_name_0_0= ruleBaseTypeEnum ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:660:1: ( (lv_name_0_0= ruleBaseTypeEnum ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:661:1: (lv_name_0_0= ruleBaseTypeEnum )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:661:1: (lv_name_0_0= ruleBaseTypeEnum )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:662:3: lv_name_0_0= ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBaseTypeEnum_in_ruleBaseType1539);
            lv_name_0_0=ruleBaseTypeEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBaseTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"BaseTypeEnum");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleNamedType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:686:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:687:2: (iv_ruleNamedType= ruleNamedType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:688:2: iv_ruleNamedType= ruleNamedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType1574);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType1584); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:695:1: ruleNamedType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:698:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:699:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:699:1: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:700:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:700:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:701:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNamedTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedType1628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNamedTypeAccess().getRefNamedElementCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleClass"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:720:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:721:2: (iv_ruleClass= ruleClass EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:722:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass1663);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass1673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:729:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_declarations_3_0 = null;

        EObject lv_transitions_5_0 = null;

        EObject lv_assertions_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:732:28: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:733:1: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:733:1: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:733:2: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:733:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:734:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassAccess().getNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleClass1719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:743:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:744:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:744:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:745:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass1736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:761:2: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=30 && LA9_0<=32)||(LA9_0>=57 && LA9_0<=58)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:762:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:762:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:763:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleClass1762);
            	    lv_declarations_3_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_3_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:779:3: (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:779:5: otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleClass1776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getTransitionKeyword_4_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:783:1: ( (lv_transitions_5_0= ruleLabeledTransition ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:784:1: (lv_transitions_5_0= ruleLabeledTransition )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:784:1: (lv_transitions_5_0= ruleLabeledTransition )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:785:3: lv_transitions_5_0= ruleLabeledTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLabeledTransition_in_ruleClass1797);
                    	    lv_transitions_5_0=ruleLabeledTransition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"transitions",
                    	              		lv_transitions_5_0, 
                    	              		"LabeledTransition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:801:5: (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:801:7: otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleClass1813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAssertionKeyword_5_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:805:1: ( (lv_assertions_7_0= ruleInstruction ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID||LA12_0==22||LA12_0==36||LA12_0==38) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:806:1: (lv_assertions_7_0= ruleInstruction )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:806:1: (lv_assertions_7_0= ruleInstruction )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:807:3: lv_assertions_7_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstruction_in_ruleClass1834);
                    	    lv_assertions_7_0=ruleInstruction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"assertions",
                    	              		lv_assertions_7_0, 
                    	              		"Instruction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleClass1849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:835:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:836:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:837:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1885);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1895); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:844:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_EventDeclaration_1 = null;

        EObject this_ParameterDeclaration_2 = null;

        EObject this_ObserverDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:847:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:848:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:848:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 57:
            case 58:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 31:
                {
                alt14=3;
                }
                break;
            case 32:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:849:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleDeclaration1942);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:859:5: this_EventDeclaration_1= ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_ruleDeclaration1969);
                    this_EventDeclaration_1=ruleEventDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EventDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:869:5: this_ParameterDeclaration_2= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleDeclaration1996);
                    this_ParameterDeclaration_2=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParameterDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:879:5: this_ObserverDeclaration_3= ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObserverDeclaration_in_ruleDeclaration2023);
                    this_ObserverDeclaration_3=ruleObserverDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObserverDeclaration_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:895:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:896:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:897:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2058);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2068); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:904:1: ruleVariableDeclaration returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_type_1_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:907:28: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:908:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:908:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:908:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:908:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:909:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationAccess().getVariableAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:914:2: ( (lv_type_1_0= ruleType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:915:1: (lv_type_1_0= ruleType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:915:1: (lv_type_1_0= ruleType )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:916:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration2123);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:932:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:933:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:933:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:934:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:950:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:950:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleVariableDeclaration2158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:954:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:955:1: (lv_attributes_4_0= ruleAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:955:1: (lv_attributes_4_0= ruleAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:956:3: lv_attributes_4_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleVariableDeclaration2179);
                    lv_attributes_4_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_4_0, 
                              		"Attribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:972:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:972:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleVariableDeclaration2192); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:976:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:977:1: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:977:1: (lv_attributes_6_0= ruleAttribute )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:978:3: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleVariableDeclaration2213);
                    	    lv_attributes_6_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_6_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleVariableDeclaration2227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleVariableDeclaration2241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAttribute"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1010:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1011:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1012:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2277);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2287); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1019:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1022:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1023:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1023:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1023:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1023:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1024:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1029:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1030:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1030:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1031:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAttribute2355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1051:1: ( (lv_value_3_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1052:1: (lv_value_3_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1052:1: (lv_value_3_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1053:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAttribute2376);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAttribute2388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEventDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1081:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1082:2: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1083:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration2424);
            iv_ruleEventDeclaration=ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclaration2434); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventDeclaration"


    // $ANTLR start "ruleEventDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1090:1: ruleEventDeclaration returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) ;
    public final EObject ruleEventDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1093:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1094:1: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1094:1: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1094:2: () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1094:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1095:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventDeclarationAccess().getEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleEventDeclaration2480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDeclarationAccess().getEventKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1104:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1105:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1105:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1106:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDeclaration2497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEventDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1122:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1122:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleEventDeclaration2515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1126:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1127:1: (lv_attributes_4_0= ruleAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1127:1: (lv_attributes_4_0= ruleAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1128:3: lv_attributes_4_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleEventDeclaration2536);
                    lv_attributes_4_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"attributes",
                              		lv_attributes_4_0, 
                              		"Attribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1144:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1144:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleEventDeclaration2549); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1148:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1149:1: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1149:1: (lv_attributes_6_0= ruleAttribute )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1150:3: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleEventDeclaration2570);
                    	    lv_attributes_6_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEventDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"attributes",
                    	              		lv_attributes_6_0, 
                    	              		"Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleEventDeclaration2584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEventDeclaration2598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEventDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1182:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1183:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1184:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2634);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1191:1: ruleParameterDeclaration returns [EObject current=null] : ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1194:28: ( ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1195:1: ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1195:1: ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1195:2: () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1195:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1196:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleParameterDeclaration2690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1205:1: ( (lv_type_2_0= ruleType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1206:1: (lv_type_2_0= ruleType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1206:1: (lv_type_2_0= ruleType )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1207:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameterDeclaration2711);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1223:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1224:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1224:1: (lv_name_3_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1225:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration2728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleParameterDeclaration2745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1245:1: ( (lv_value_5_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1246:1: (lv_value_5_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1246:1: (lv_value_5_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1247:3: lv_value_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameterDeclaration2766);
            lv_value_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleParameterDeclaration2778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getParameterDeclarationAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleObserverDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1275:1: entryRuleObserverDeclaration returns [EObject current=null] : iv_ruleObserverDeclaration= ruleObserverDeclaration EOF ;
    public final EObject entryRuleObserverDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserverDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1276:2: (iv_ruleObserverDeclaration= ruleObserverDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1277:2: iv_ruleObserverDeclaration= ruleObserverDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObserverDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration2814);
            iv_ruleObserverDeclaration=ruleObserverDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObserverDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObserverDeclaration2824); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObserverDeclaration"


    // $ANTLR start "ruleObserverDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1284:1: ruleObserverDeclaration returns [EObject current=null] : ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleObserverDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_2_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1287:28: ( ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1288:1: ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1288:1: ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1288:2: () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1288:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1289:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getObserverDeclarationAccess().getObserverAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleObserverDeclaration2870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1298:1: ( (lv_type_2_0= ruleType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1299:1: (lv_type_2_0= ruleType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1299:1: (lv_type_2_0= ruleType )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1300:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleObserverDeclaration2891);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObserverDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1316:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1317:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1317:1: (lv_name_3_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1318:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObserverDeclaration2908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getObserverDeclarationAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getObserverDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleObserverDeclaration2925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1338:1: ( (lv_value_5_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1339:1: (lv_value_5_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1339:1: (lv_value_5_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1340:3: lv_value_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleObserverDeclaration2946);
            lv_value_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getObserverDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleObserverDeclaration2958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getObserverDeclarationAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObserverDeclaration"


    // $ANTLR start "entryRuleLabeledTransition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1368:1: entryRuleLabeledTransition returns [EObject current=null] : iv_ruleLabeledTransition= ruleLabeledTransition EOF ;
    public final EObject entryRuleLabeledTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledTransition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1369:2: (iv_ruleLabeledTransition= ruleLabeledTransition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1370:2: iv_ruleLabeledTransition= ruleLabeledTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition2994);
            iv_ruleLabeledTransition=ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeledTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledTransition3004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabeledTransition"


    // $ANTLR start "ruleLabeledTransition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1377:1: ruleLabeledTransition returns [EObject current=null] : ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) ) ;
    public final EObject ruleLabeledTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_event_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1380:28: ( ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1381:1: ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1381:1: ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1381:2: ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1381:2: ( (lv_event_0_0= ruleNameRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1382:1: (lv_event_0_0= ruleNameRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1382:1: (lv_event_0_0= ruleNameRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1383:3: lv_event_0_0= ruleNameRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameRef_in_ruleLabeledTransition3050);
            lv_event_0_0=ruleNameRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabeledTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"NameRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLabeledTransition3062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabeledTransitionAccess().getColonKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1403:1: ( (lv_expression_2_0= ruleTransitionAnd ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1404:1: (lv_expression_2_0= ruleTransitionAnd )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1404:1: (lv_expression_2_0= ruleTransitionAnd )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1405:3: lv_expression_2_0= ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_ruleLabeledTransition3083);
            lv_expression_2_0=ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLabeledTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"TransitionAnd");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabeledTransition"


    // $ANTLR start "entryRuleTransitionAnd"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1429:1: entryRuleTransitionAnd returns [EObject current=null] : iv_ruleTransitionAnd= ruleTransitionAnd EOF ;
    public final EObject entryRuleTransitionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionAnd = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1430:2: (iv_ruleTransitionAnd= ruleTransitionAnd EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1431:2: iv_ruleTransitionAnd= ruleTransitionAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionAndRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd3119);
            iv_ruleTransitionAnd=ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionAnd3129); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionAnd"


    // $ANTLR start "ruleTransitionAnd"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1438:1: ruleTransitionAnd returns [EObject current=null] : (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* ) ;
    public final EObject ruleTransitionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TransitionOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1441:28: ( (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1442:1: (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1442:1: (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1443:5: this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_ruleTransitionAnd3176);
            this_TransitionOr_0=ruleTransitionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TransitionOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1451:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1451:2: () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1451:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1452:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTransitionAnd3197); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1461:1: ( (lv_right_3_0= ruleTransitionOr ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1462:1: (lv_right_3_0= ruleTransitionOr )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1462:1: (lv_right_3_0= ruleTransitionOr )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1463:3: lv_right_3_0= ruleTransitionOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransitionOr_in_ruleTransitionAnd3218);
            	    lv_right_3_0=ruleTransitionOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"TransitionOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionAnd"


    // $ANTLR start "entryRuleTransitionOr"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1487:1: entryRuleTransitionOr returns [EObject current=null] : iv_ruleTransitionOr= ruleTransitionOr EOF ;
    public final EObject entryRuleTransitionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionOr = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1488:2: (iv_ruleTransitionOr= ruleTransitionOr EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1489:2: iv_ruleTransitionOr= ruleTransitionOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionOrRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr3256);
            iv_ruleTransitionOr=ruleTransitionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionOr3266); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionOr"


    // $ANTLR start "ruleTransitionOr"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1496:1: ruleTransitionOr returns [EObject current=null] : (this_ITransition_0= ruleITransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) ) )* ) ;
    public final EObject ruleTransitionOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ITransition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1499:28: ( (this_ITransition_0= ruleITransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1500:1: (this_ITransition_0= ruleITransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1500:1: (this_ITransition_0= ruleITransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1501:5: this_ITransition_0= ruleITransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTransitionOrAccess().getITransitionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleITransition_in_ruleTransitionOr3313);
            this_ITransition_0=ruleITransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ITransition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1509:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1509:2: () otherlv_2= '|' ( (lv_right_3_0= ruleITransition ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1509:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1510:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleTransitionOr3334); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1519:1: ( (lv_right_3_0= ruleITransition ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1520:1: (lv_right_3_0= ruleITransition )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1520:1: (lv_right_3_0= ruleITransition )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1521:3: lv_right_3_0= ruleITransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionOrAccess().getRightITransitionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleITransition_in_ruleTransitionOr3355);
            	    lv_right_3_0=ruleITransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTransitionOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ITransition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionOr"


    // $ANTLR start "entryRuleITransition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1545:1: entryRuleITransition returns [EObject current=null] : iv_ruleITransition= ruleITransition EOF ;
    public final EObject entryRuleITransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleITransition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1546:2: (iv_ruleITransition= ruleITransition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1547:2: iv_ruleITransition= ruleITransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getITransitionRule()); 
            }
            pushFollow(FOLLOW_ruleITransition_in_entryRuleITransition3393);
            iv_ruleITransition=ruleITransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleITransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleITransition3403); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleITransition"


    // $ANTLR start "ruleITransition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1554:1: ruleITransition returns [EObject current=null] : ( () otherlv_1= '$transition' ) ;
    public final EObject ruleITransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1557:28: ( ( () otherlv_1= '$transition' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1558:1: ( () otherlv_1= '$transition' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1558:1: ( () otherlv_1= '$transition' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1558:2: () otherlv_1= '$transition'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1558:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1559:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getITransitionAccess().getITransitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleITransition3449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getITransitionAccess().getTransitionKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleITransition"


    // $ANTLR start "entryRuleInstruction"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1576:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1577:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1578:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction3485);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction3495); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1585:1: ruleInstruction returns [EObject current=null] : (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_IfThenElse_3= ruleIfThenElse ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Skip_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Block_2 = null;

        EObject this_IfThenElse_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1588:28: ( (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_IfThenElse_3= ruleIfThenElse ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1589:1: (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_IfThenElse_3= ruleIfThenElse )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1589:1: (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_IfThenElse_3= ruleIfThenElse )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                alt21=2;
                }
                break;
            case 22:
                {
                alt21=3;
                }
                break;
            case 38:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1590:5: this_Skip_0= ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSkip_in_ruleInstruction3542);
                    this_Skip_0=ruleSkip();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Skip_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1600:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstruction3569);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1610:5: this_Block_2= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleInstruction3596);
                    this_Block_2=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1620:5: this_IfThenElse_3= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getIfThenElseParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleInstruction3623);
                    this_IfThenElse_3=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfThenElse_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleSkip"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1636:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1637:2: (iv_ruleSkip= ruleSkip EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1638:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip3658);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip3668); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1645:1: ruleSkip returns [EObject current=null] : ( () otherlv_1= 'skip' otherlv_2= ';' ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1648:28: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1649:1: ( () otherlv_1= 'skip' otherlv_2= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1649:1: ( () otherlv_1= 'skip' otherlv_2= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1649:2: () otherlv_1= 'skip' otherlv_2= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1649:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1650:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSkipAccess().getSkipAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleSkip3714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSkipAccess().getSkipKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSkip3726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSkipAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleAssignment"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1671:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1672:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1673:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3762);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3772); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1680:1: ruleAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1683:28: ( ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1684:1: ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1684:1: ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1684:2: () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1684:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1685:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1690:2: ( (lv_variable_1_0= ruleNameRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1691:1: (lv_variable_1_0= ruleNameRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1691:1: (lv_variable_1_0= ruleNameRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1692:3: lv_variable_1_0= ruleNameRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameRef_in_ruleAssignment3827);
            lv_variable_1_0=ruleNameRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"NameRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleAssignment3839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1712:1: ( (lv_value_3_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1713:1: (lv_value_3_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1713:1: (lv_value_3_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1714:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment3860);
            lv_value_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAssignment3872); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleBlock"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1742:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1743:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1744:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock3908);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock3918); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1751:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1754:28: ( ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1755:1: ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1755:1: ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1755:2: () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1755:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1756:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBlock3964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1765:1: ( (lv_instructions_2_0= ruleInstruction ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==22||LA22_0==36||LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1766:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1766:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1767:3: lv_instructions_2_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBlock3985);
            	    lv_instructions_2_0=ruleInstruction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instructions",
            	              		lv_instructions_2_0, 
            	              		"Instruction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBlock3998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleIfThenElse"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1795:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1796:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1797:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse4034);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse4044); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1804:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1807:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) ) )? otherlv_6= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1808:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) ) )? otherlv_6= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1808:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) ) )? otherlv_6= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1808:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_then_3_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleIfThenElse4081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1812:1: ( (lv_condition_1_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1813:1: (lv_condition_1_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1813:1: (lv_condition_1_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1814:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElse4102);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleIfThenElse4114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getThenKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1834:1: ( (lv_then_3_0= ruleInstruction ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1835:1: (lv_then_3_0= ruleInstruction )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1835:1: (lv_then_3_0= ruleInstruction )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1836:3: lv_then_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleIfThenElse4135);
            lv_then_3_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_3_0, 
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1852:2: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) && (synpred2_InternalAltarica())) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1852:3: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleInstruction ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1852:3: ( ( 'else' )=>otherlv_4= 'else' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1852:4: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleIfThenElse4156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getElseKeyword_4_0());
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1857:2: ( (lv_else_5_0= ruleInstruction ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1858:1: (lv_else_5_0= ruleInstruction )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1858:1: (lv_else_5_0= ruleInstruction )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1859:3: lv_else_5_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseInstructionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleIfThenElse4178);
                    lv_else_5_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_5_0, 
                              		"Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleIfThenElse4192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getIfThenElseAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1887:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1888:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1889:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4228);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1896:1: ruleExpression returns [EObject current=null] : this_Logical_0= ruleLogical ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1899:28: (this_Logical_0= ruleLogical )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1901:5: this_Logical_0= ruleLogical
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getLogicalParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogical_in_ruleExpression4284);
            this_Logical_0=ruleLogical();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Logical_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogical"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1917:1: entryRuleLogical returns [EObject current=null] : iv_ruleLogical= ruleLogical EOF ;
    public final EObject entryRuleLogical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1918:2: (iv_ruleLogical= ruleLogical EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1919:2: iv_ruleLogical= ruleLogical EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical4318);
            iv_ruleLogical=ruleLogical();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical4328); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogical"


    // $ANTLR start "ruleLogical"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1926:1: ruleLogical returns [EObject current=null] : (this_Relation_0= ruleRelation ( ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* ) ;
    public final EObject ruleLogical() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Relation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1929:28: ( (this_Relation_0= ruleRelation ( ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1930:1: (this_Relation_0= ruleRelation ( ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1930:1: (this_Relation_0= ruleRelation ( ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1931:5: this_Relation_0= ruleRelation ( ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelation_in_ruleLogical4375);
            this_Relation_0=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Relation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:1: ( ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) && (synpred3_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==42) && (synpred3_InternalAltarica())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:2: ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )=> ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1956:6: ( () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1956:7: () ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRelation ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1956:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1957:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAccess().getLogicalLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1962:2: ( ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1963:1: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1963:1: ( (lv_op_2_1= 'and' | lv_op_2_2= 'or' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1964:1: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1964:1: (lv_op_2_1= 'and' | lv_op_2_2= 'or' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==41) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==42) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1965:3: lv_op_2_1= 'and'
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_41_in_ruleLogical4455); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getLogicalAccess().getOpAndKeyword_1_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getLogicalRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1977:8: lv_op_2_2= 'or'
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_42_in_ruleLogical4484); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getLogicalAccess().getOpOrKeyword_1_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getLogicalRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1992:2: ( (lv_right_3_0= ruleRelation ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1993:1: (lv_right_3_0= ruleRelation )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1993:1: (lv_right_3_0= ruleRelation )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1994:3: lv_right_3_0= ruleRelation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelation_in_ruleLogical4521);
            	    lv_right_3_0=ruleRelation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Relation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogical"


    // $ANTLR start "entryRuleRelation"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2018:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2019:2: (iv_ruleRelation= ruleRelation EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2020:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation4560);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation4570); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2027:1: ruleRelation returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        Token lv_op_2_5=null;
        Token lv_op_2_6=null;
        EObject this_Addition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2030:28: ( (this_Addition_0= ruleAddition ( ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2031:1: (this_Addition_0= ruleAddition ( ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2031:1: (this_Addition_0= ruleAddition ( ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2032:5: this_Addition_0= ruleAddition ( ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleRelation4617);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:1: ( ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) && (synpred4_InternalAltarica())) {
                    alt27=1;
                }
                else if ( (LA27_0==43) && (synpred4_InternalAltarica())) {
                    alt27=1;
                }
                else if ( (LA27_0==44) && (synpred4_InternalAltarica())) {
                    alt27=1;
                }
                else if ( (LA27_0==45) && (synpred4_InternalAltarica())) {
                    alt27=1;
                }
                else if ( (LA27_0==46) && (synpred4_InternalAltarica())) {
                    alt27=1;
                }
                else if ( (LA27_0==47) && (synpred4_InternalAltarica())) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:2: ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2069:6: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2069:7: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2069:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2070:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2075:2: ( ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2076:1: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2076:1: ( (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2077:1: (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2077:1: (lv_op_2_1= '=' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' )
            	    int alt26=6;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt26=4;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt26=5;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt26=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2078:3: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,15,FOLLOW_15_in_ruleRelation4753); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getRelationAccess().getOpEqualsSignKeyword_1_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2090:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_43_in_ruleRelation4782); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getRelationAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2102:8: lv_op_2_3= '<'
            	            {
            	            lv_op_2_3=(Token)match(input,44,FOLLOW_44_in_ruleRelation4811); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getRelationAccess().getOpLessThanSignKeyword_1_0_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2114:8: lv_op_2_4= '<='
            	            {
            	            lv_op_2_4=(Token)match(input,45,FOLLOW_45_in_ruleRelation4840); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getRelationAccess().getOpLessThanSignEqualsSignKeyword_1_0_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2126:8: lv_op_2_5= '>='
            	            {
            	            lv_op_2_5=(Token)match(input,46,FOLLOW_46_in_ruleRelation4869); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_5, grammarAccess.getRelationAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_1_0_4());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_5, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2138:8: lv_op_2_6= '>'
            	            {
            	            lv_op_2_6=(Token)match(input,47,FOLLOW_47_in_ruleRelation4898); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_6, grammarAccess.getRelationAccess().getOpGreaterThanSignKeyword_1_0_1_0_5());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getRelationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_6, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2153:2: ( (lv_right_3_0= ruleAddition ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2154:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2154:1: (lv_right_3_0= ruleAddition )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2155:3: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleRelation4935);
            	    lv_right_3_0=ruleAddition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Addition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAddition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2179:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2180:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2181:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition4974);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition4984); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2188:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2191:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2192:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2192:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2193:5: this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition5031);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:1: ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==48) && (synpred5_InternalAltarica())) {
                    alt29=1;
                }
                else if ( (LA29_0==49) && (synpred5_InternalAltarica())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2218:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2218:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2218:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2219:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2224:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2225:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2225:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2226:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2226:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==48) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==49) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2227:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_48_in_ruleAddition5111); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getAdditionAccess().getOpPlusSignKeyword_1_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdditionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2239:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_49_in_ruleAddition5140); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getAdditionAccess().getOpHyphenMinusKeyword_1_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdditionRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2254:2: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2255:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2255:1: (lv_right_3_0= ruleMultiplication )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2256:3: lv_right_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition5177);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2280:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2281:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2282:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication5216);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication5226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2289:1: ruleMultiplication returns [EObject current=null] : (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Neg_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2292:28: ( (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2293:1: (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2293:1: (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2294:5: this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNeg_in_ruleMultiplication5273);
            this_Neg_0=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Neg_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:1: ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==50) && (synpred6_InternalAltarica())) {
                    alt31=1;
                }
                else if ( (LA31_0==51) && (synpred6_InternalAltarica())) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:2: ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2319:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2319:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2319:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2320:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2325:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2326:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2326:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2327:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2327:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==50) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==51) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2328:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,50,FOLLOW_50_in_ruleMultiplication5353); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getMultiplicationAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2340:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_51_in_ruleMultiplication5382); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getMultiplicationAccess().getOpSolidusKeyword_1_0_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMultiplicationRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2355:2: ( (lv_right_3_0= ruleNeg ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2356:1: (lv_right_3_0= ruleNeg )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2356:1: (lv_right_3_0= ruleNeg )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2357:3: lv_right_3_0= ruleNeg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNeg_in_ruleMultiplication5419);
            	    lv_right_3_0=ruleNeg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Neg");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNeg"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2381:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2382:2: (iv_ruleNeg= ruleNeg EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2383:2: iv_ruleNeg= ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_entryRuleNeg5458);
            iv_ruleNeg=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNeg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg5468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeg"


    // $ANTLR start "ruleNeg"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2390:1: ruleNeg returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atom_6 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2393:28: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2394:1: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2394:1: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt32=1;
                }
                break;
            case 49:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 28:
            case 53:
            case 54:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2394:2: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2394:2: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2394:3: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2394:3: ()
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2395:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegAccess().getNotAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2400:2: ( ( 'not' )=>otherlv_1= 'not' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2400:3: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleNeg5523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNegAccess().getNotKeyword_0_1());
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2405:2: ( (lv_expression_2_0= ruleAtom ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2406:1: (lv_expression_2_0= ruleAtom )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2406:1: (lv_expression_2_0= ruleAtom )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2407:3: lv_expression_2_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleNeg5545);
                    lv_expression_2_0=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Atom");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2424:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2424:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2424:7: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2424:7: ()
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2425:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegAccess().getMinusAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2430:2: ( ( '-' )=>otherlv_4= '-' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2430:3: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleNeg5582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1());
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2435:2: ( (lv_expression_5_0= ruleAtom ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2436:1: (lv_expression_5_0= ruleAtom )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2436:1: (lv_expression_5_0= ruleAtom )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2437:3: lv_expression_5_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleNeg5604);
                    lv_expression_5_0=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Atom");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2455:5: this_Atom_6= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleNeg5633);
                    this_Atom_6=ruleAtom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atom_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeg"


    // $ANTLR start "entryRuleAtom"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2471:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2472:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2473:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom5668);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom5678); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2480:1: ruleAtom returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_BooleanLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntegerLiteral_2 = null;

        EObject this_NameRef_3 = null;

        EObject this_Expression_5 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2483:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2484:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2484:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
                {
                alt33=1;
                }
                break;
            case RULE_STRING:
                {
                alt33=2;
                }
                break;
            case RULE_INT:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
                {
                alt33=4;
                }
                break;
            case 28:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2485:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleAtom5725);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2495:5: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleAtom5752);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2505:5: this_IntegerLiteral_2= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleAtom5779);
                    this_IntegerLiteral_2=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2515:5: this_NameRef_3= ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameRef_in_ruleAtom5806);
                    this_NameRef_3=ruleNameRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2524:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2524:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2524:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAtom5824); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom5846);
                    this_Expression_5=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleAtom5857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2549:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2550:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2551:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5894);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5904); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2558:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2561:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2562:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2562:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2563:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2563:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2564:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2564:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            else if ( (LA34_0==54) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2565:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,53,FOLLOW_53_in_ruleBooleanLiteral5948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2577:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,54,FOLLOW_54_in_ruleBooleanLiteral5977); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", lv_value_0_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2600:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2601:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2602:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6028);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6038); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2609:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2612:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2613:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2613:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2614:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2614:1: (lv_value_0_0= RULE_STRING )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2615:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2639:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2640:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2641:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral6119);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral6129); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2648:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2651:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2652:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2652:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2653:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2653:1: (lv_value_0_0= RULE_INT )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2654:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral6170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleNameRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2678:1: entryRuleNameRef returns [EObject current=null] : iv_ruleNameRef= ruleNameRef EOF ;
    public final EObject entryRuleNameRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2679:2: (iv_ruleNameRef= ruleNameRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2680:2: iv_ruleNameRef= ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_entryRuleNameRef6210);
            iv_ruleNameRef=ruleNameRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameRef6220); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameRef"


    // $ANTLR start "ruleNameRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2687:1: ruleNameRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleNameRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2690:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2691:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2691:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2691:2: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2691:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2692:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2692:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2693:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNameRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameRef6265); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:2: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==55) && (synpred9_InternalAltarica())) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:3: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2711:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2711:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2711:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2712:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleNameRef6311); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1());
            	          
            	    }
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2721:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2722:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2722:1: (otherlv_3= RULE_ID )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2723:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNameRefRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameRef6331); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameRef"


    // $ANTLR start "entryRuleDomainRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2746:1: entryRuleDomainRef returns [EObject current=null] : iv_ruleDomainRef= ruleDomainRef EOF ;
    public final EObject entryRuleDomainRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2747:2: (iv_ruleDomainRef= ruleDomainRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2748:2: iv_ruleDomainRef= ruleDomainRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainRefRule()); 
            }
            pushFollow(FOLLOW_ruleDomainRef_in_entryRuleDomainRef6374);
            iv_ruleDomainRef=ruleDomainRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainRef6384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainRef"


    // $ANTLR start "ruleDomainRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2755:1: ruleDomainRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDomainRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2758:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:1: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2760:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2760:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2761:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDomainRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainRef6428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDomainRefAccess().getReferenceDomainCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainRef"


    // $ANTLR start "entryRuleSwitch"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2782:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2783:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2784:2: iv_ruleSwitch= ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch6465);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch6475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2791:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedCases_1_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2794:28: ( (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2795:1: (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2795:1: (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2795:3: otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleSwitch6512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getCaseKeyword_0());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2799:1: ( (lv_ownedCases_1_0= ruleCaseExpression ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_INT)||LA36_0==28||LA36_0==49||(LA36_0>=52 && LA36_0<=54)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2800:1: (lv_ownedCases_1_0= ruleCaseExpression )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2800:1: (lv_ownedCases_1_0= ruleCaseExpression )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2801:3: lv_ownedCases_1_0= ruleCaseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchAccess().getOwnedCasesCaseExpressionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCaseExpression_in_ruleSwitch6533);
            	    lv_ownedCases_1_0=ruleCaseExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedCases",
            	              		lv_ownedCases_1_0, 
            	              		"CaseExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleSwitch6546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getElseKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2821:1: ( (lv_default_3_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2822:1: (lv_default_3_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2822:1: (lv_default_3_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2823:3: lv_default_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch6567);
            lv_default_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchRule());
              	        }
                     		set(
                     			current, 
                     			"default",
                      		lv_default_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleSwitch6579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleCaseExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2851:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2852:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2853:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression6615);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression6625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseExpression"


    // $ANTLR start "ruleCaseExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2860:1: ruleCaseExpression returns [EObject current=null] : ( ( (lv_condition_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2863:28: ( ( ( (lv_condition_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2864:1: ( ( (lv_condition_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2864:1: ( ( (lv_condition_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2864:2: ( (lv_condition_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ','
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2864:2: ( (lv_condition_0_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2865:1: (lv_condition_0_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2865:1: (lv_condition_0_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2866:3: lv_condition_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getConditionExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseExpression6671);
            lv_condition_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCaseExpression6683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCaseExpressionAccess().getColonKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2886:1: ( (lv_body_2_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2887:1: (lv_body_2_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2887:1: (lv_body_2_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2888:3: lv_body_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getBodyExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseExpression6704);
            lv_body_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCaseExpression6716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCaseExpressionAccess().getCommaKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "ruleBaseTypeEnum"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2916:1: ruleBaseTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) ) ;
    public final Enumerator ruleBaseTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2918:28: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2919:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2919:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            else if ( (LA37_0==58) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2919:2: (enumLiteral_0= 'Integer' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2919:2: (enumLiteral_0= 'Integer' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2919:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleBaseTypeEnum6766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2925:6: (enumLiteral_1= 'Boolean' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2925:6: (enumLiteral_1= 'Boolean' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2925:8: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleBaseTypeEnum6783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getBaseTypeEnumAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseTypeEnum"

    // $ANTLR start synpred1_InternalAltarica
    public final void synpred1_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:3: ( ruleBaseType )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:620:5: ruleBaseType
        {
        pushFollow(FOLLOW_ruleBaseType_in_synpred1_InternalAltarica1405);
        ruleBaseType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAltarica

    // $ANTLR start synpred2_InternalAltarica
    public final void synpred2_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1852:4: ( 'else' )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1852:6: 'else'
        {
        match(input,40,FOLLOW_40_in_synpred2_InternalAltarica4148); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalAltarica

    // $ANTLR start synpred3_InternalAltarica
    public final void synpred3_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:2: ( ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:3: ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:3: ( () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:4: () ( ( ( 'and' | 'or' ) ) ) ( ( ruleRelation ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1939:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1940:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1940:2: ( ( ( 'and' | 'or' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1941:1: ( ( 'and' | 'or' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1941:1: ( ( 'and' | 'or' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1942:1: ( 'and' | 'or' )
        {
        if ( (input.LA(1)>=41 && input.LA(1)<=42) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1952:2: ( ( ruleRelation ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1953:1: ( ruleRelation )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1953:1: ( ruleRelation )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1954:1: ruleRelation
        {
        pushFollow(FOLLOW_ruleRelation_in_synpred3_InternalAltarica4426);
        ruleRelation();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalAltarica

    // $ANTLR start synpred4_InternalAltarica
    public final void synpred4_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:2: ( ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:3: ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:3: ( () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:4: () ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2040:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2041:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2041:2: ( ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2042:1: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2042:1: ( ( '=' | '!=' | '<' | '<=' | '>=' | '>' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2043:1: ( '=' | '!=' | '<' | '<=' | '>=' | '>' )
        {
        if ( input.LA(1)==15||(input.LA(1)>=43 && input.LA(1)<=47) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2065:2: ( ( ruleAddition ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2066:1: ( ruleAddition )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2066:1: ( ruleAddition )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:1: ruleAddition
        {
        pushFollow(FOLLOW_ruleAddition_in_synpred4_InternalAltarica4724);
        ruleAddition();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalAltarica

    // $ANTLR start synpred5_InternalAltarica
    public final void synpred5_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:4: () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2201:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2202:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2202:2: ( ( ( '+' | '-' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2203:1: ( ( '+' | '-' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2203:1: ( ( '+' | '-' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2204:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=48 && input.LA(1)<=49) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2214:2: ( ( ruleMultiplication ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2215:1: ( ruleMultiplication )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2215:1: ( ruleMultiplication )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2216:1: ruleMultiplication
        {
        pushFollow(FOLLOW_ruleMultiplication_in_synpred5_InternalAltarica5082);
        ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalAltarica

    // $ANTLR start synpred6_InternalAltarica
    public final void synpred6_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:2: ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:3: ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:3: ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:4: () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2303:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2303:2: ( ( ( '*' | '/' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2304:1: ( ( '*' | '/' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2304:1: ( ( '*' | '/' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2305:1: ( '*' | '/' )
        {
        if ( (input.LA(1)>=50 && input.LA(1)<=51) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2315:2: ( ( ruleNeg ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2316:1: ( ruleNeg )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2316:1: ( ruleNeg )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2317:1: ruleNeg
        {
        pushFollow(FOLLOW_ruleNeg_in_synpred6_InternalAltarica5324);
        ruleNeg();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalAltarica

    // $ANTLR start synpred9_InternalAltarica
    public final void synpred9_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:3: ( ( () '.' ( ( RULE_ID ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:4: ( () '.' ( ( RULE_ID ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:4: ( () '.' ( ( RULE_ID ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:5: () '.' ( ( RULE_ID ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:5: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2705:1: 
        {
        }

        match(input,55,FOLLOW_55_in_synpred9_InternalAltarica6281); if (state.failed) return ;
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2706:1: ( ( RULE_ID ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2707:1: ( RULE_ID )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2707:1: ( RULE_ID )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2708:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred9_InternalAltarica6289); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalAltarica

    // Delegated rules

    public final boolean synpred3_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_ruleModel130 = new BitSet(new long[]{0x0000000001020002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleAbstractDeclaration223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleAbstractDeclaration250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_ruleAbstractDefinitionConstant344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_ruleAbstractDefinitionConstant371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionConstant416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleExpressionConstant453 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionConstant474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainConstant520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDomainConstant557 = new BitSet(new long[]{0x0600000000480000L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleDomainConstant578 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleDomainConstant591 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDomainConstant612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDomain706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain723 = new BitSet(new long[]{0x0600000000480000L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleDomain749 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDomain761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDomain807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleAbstractDomain854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleAbstractDomain881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleAbstractDomain908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRange990 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleRange1011 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRange1023 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleRange1044 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRange1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEnumeration1148 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_ruleEnumeration1170 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleEnumeration1183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_ruleEnumeration1204 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_entryRuleSymbolicConstant1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicConstant1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolicConstant1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleType1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_ruleType1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseTypeEnum_in_ruleBaseType1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleClass1719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass1736 = new BitSet(new long[]{0x06000001CE000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleClass1762 = new BitSet(new long[]{0x06000001CE000010L});
    public static final BitSet FOLLOW_25_in_ruleClass1776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_ruleClass1797 = new BitSet(new long[]{0x000000000C000010L});
    public static final BitSet FOLLOW_26_in_ruleClass1813 = new BitSet(new long[]{0x0000005000400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleClass1834 = new BitSet(new long[]{0x0000005008400010L});
    public static final BitSet FOLLOW_27_in_ruleClass1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleDeclaration1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_ruleDeclaration1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleDeclaration1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_ruleDeclaration2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration2123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2140 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleVariableDeclaration2158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleVariableDeclaration2179 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleVariableDeclaration2192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleVariableDeclaration2213 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleVariableDeclaration2227 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDeclaration2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2338 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribute2355 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAttribute2376 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclaration2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEventDeclaration2480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDeclaration2497 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleEventDeclaration2515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEventDeclaration2536 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleEventDeclaration2549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEventDeclaration2570 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleEventDeclaration2584 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEventDeclaration2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterDeclaration2690 = new BitSet(new long[]{0x0600000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration2711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration2728 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParameterDeclaration2745 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterDeclaration2766 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleParameterDeclaration2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration2814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObserverDeclaration2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleObserverDeclaration2870 = new BitSet(new long[]{0x0600000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleObserverDeclaration2891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObserverDeclaration2908 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleObserverDeclaration2925 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleObserverDeclaration2946 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleObserverDeclaration2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledTransition3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_ruleLabeledTransition3050 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLabeledTransition3062 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_ruleLabeledTransition3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd3119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionAnd3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_ruleTransitionAnd3176 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleTransitionAnd3197 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_ruleTransitionAnd3218 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr3256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionOr3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleITransition_in_ruleTransitionOr3313 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleTransitionOr3334 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleITransition_in_ruleTransitionOr3355 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleITransition_in_entryRuleITransition3393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleITransition3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleITransition3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction3485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleInstruction3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstruction3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleInstruction3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleInstruction3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip3658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSkip3714 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSkip3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_ruleAssignment3827 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleAssignment3839 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment3860 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssignment3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBlock3964 = new BitSet(new long[]{0x0000005000400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBlock3985 = new BitSet(new long[]{0x0000005000C00010L});
    public static final BitSet FOLLOW_23_in_ruleBlock3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse4034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleIfThenElse4081 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElse4102 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleIfThenElse4114 = new BitSet(new long[]{0x0000005000400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleIfThenElse4135 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_ruleIfThenElse4156 = new BitSet(new long[]{0x0000005000400010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleIfThenElse4178 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIfThenElse4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleExpression4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical4318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogical4375 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_41_in_ruleLogical4455 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_42_in_ruleLogical4484 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogical4521 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation4560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation4617 = new BitSet(new long[]{0x0000F80000008002L});
    public static final BitSet FOLLOW_15_in_ruleRelation4753 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_43_in_ruleRelation4782 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_44_in_ruleRelation4811 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_45_in_ruleRelation4840 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_46_in_ruleRelation4869 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_47_in_ruleRelation4898 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation4935 = new BitSet(new long[]{0x0000F80000008002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition4974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition5031 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAddition5111 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_49_in_ruleAddition5140 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition5177 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_ruleMultiplication5273 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMultiplication5353 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_51_in_ruleMultiplication5382 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleNeg_in_ruleMultiplication5419 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_entryRuleNeg5458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNeg5523 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNeg5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNeg5582 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNeg5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNeg5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom5668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleAtom5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleAtom5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleAtom5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_ruleAtom5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtom5824 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom5846 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAtom5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBooleanLiteral5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBooleanLiteral5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral6119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_entryRuleNameRef6210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameRef6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameRef6265 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNameRef6311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameRef6331 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleDomainRef_in_entryRuleDomainRef6374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainRef6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainRef6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch6465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleSwitch6512 = new BitSet(new long[]{0x0072010010000070L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_ruleSwitch6533 = new BitSet(new long[]{0x0072010010000070L});
    public static final BitSet FOLLOW_40_in_ruleSwitch6546 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch6567 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSwitch6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression6615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseExpression6671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCaseExpression6683 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseExpression6704 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCaseExpression6716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBaseTypeEnum6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBaseTypeEnum6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_synpred1_InternalAltarica1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred2_InternalAltarica4148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred3_InternalAltarica4393 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleRelation_in_synpred3_InternalAltarica4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred4_InternalAltarica4635 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleAddition_in_synpred4_InternalAltarica4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalAltarica5049 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_synpred5_InternalAltarica5082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalAltarica5291 = new BitSet(new long[]{0x0072000010000070L});
    public static final BitSet FOLLOW_ruleNeg_in_synpred6_InternalAltarica5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred9_InternalAltarica6281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred9_InternalAltarica6289 = new BitSet(new long[]{0x0000000000000002L});

}