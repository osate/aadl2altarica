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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_NUMBER", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'{'", "','", "'}'", "'class'", "'transition'", "'assertion'", "'end'", "'('", "')'", "';'", "'='", "'event'", "'parameter'", "'observer'", "':'", "'&'", "'|'", "'->'", "'skip'", "':='", "'if'", "'then'", "'else'", "'switch'", "'or'", "'and'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'not'", "'true'", "'false'", "'.'", "'default'", "'case'", "'exponential'", "'Dirac'", "'constant'", "'Integer'", "'Boolean'"
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
    // InternalAltarica.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAltarica.g:69:2: (iv_ruleModel= ruleModel EOF )
            // InternalAltarica.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:77:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleAbstractDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:80:28: ( ( (lv_declarations_0_0= ruleAbstractDeclaration ) )* )
            // InternalAltarica.g:81:1: ( (lv_declarations_0_0= ruleAbstractDeclaration ) )*
            {
            // InternalAltarica.g:81:1: ( (lv_declarations_0_0= ruleAbstractDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAltarica.g:82:1: (lv_declarations_0_0= ruleAbstractDeclaration )
            	    {
            	    // InternalAltarica.g:82:1: (lv_declarations_0_0= ruleAbstractDeclaration )
            	    // InternalAltarica.g:83:3: lv_declarations_0_0= ruleAbstractDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getDeclarationsAbstractDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
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
            	              		"org.osate.altarica.Altarica.AbstractDeclaration");
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
    // InternalAltarica.g:107:1: entryRuleAbstractDeclaration returns [EObject current=null] : iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF ;
    public final EObject entryRuleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclaration = null;


        try {
            // InternalAltarica.g:108:2: (iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF )
            // InternalAltarica.g:109:2: iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDeclaration=ruleAbstractDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:116:1: ruleAbstractDeclaration returns [EObject current=null] : (this_Domain_0= ruleDomain | this_Class_1= ruleClass ) ;
    public final EObject ruleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Domain_0 = null;

        EObject this_Class_1 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:119:28: ( (this_Domain_0= ruleDomain | this_Class_1= ruleClass ) )
            // InternalAltarica.g:120:1: (this_Domain_0= ruleDomain | this_Class_1= ruleClass )
            {
            // InternalAltarica.g:120:1: (this_Domain_0= ruleDomain | this_Class_1= ruleClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
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
                    // InternalAltarica.g:121:5: this_Domain_0= ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:131:5: this_Class_1= ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getClassParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleDomain"
    // InternalAltarica.g:147:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalAltarica.g:148:2: (iv_ruleDomain= ruleDomain EOF )
            // InternalAltarica.g:149:2: iv_ruleDomain= ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomain; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:156:1: ruleDomain returns [EObject current=null] : ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_constants_4_0 = null;

        EObject lv_constants_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:159:28: ( ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' ) )
            // InternalAltarica.g:160:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' )
            {
            // InternalAltarica.g:160:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' )
            // InternalAltarica.g:160:2: () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}'
            {
            // InternalAltarica.g:160:2: ()
            // InternalAltarica.g:161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainAccess().getDomainAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                  
            }
            // InternalAltarica.g:170:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalAltarica.g:171:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAltarica.g:171:1: (lv_name_2_0= RULE_ID )
            // InternalAltarica.g:172:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // InternalAltarica.g:192:1: ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAltarica.g:192:2: ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )*
                    {
                    // InternalAltarica.g:192:2: ( (lv_constants_4_0= ruleSymbolicConstant ) )
                    // InternalAltarica.g:193:1: (lv_constants_4_0= ruleSymbolicConstant )
                    {
                    // InternalAltarica.g:193:1: (lv_constants_4_0= ruleSymbolicConstant )
                    // InternalAltarica.g:194:3: lv_constants_4_0= ruleSymbolicConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_constants_4_0=ruleSymbolicConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDomainRule());
                      	        }
                             		add(
                             			current, 
                             			"constants",
                              		lv_constants_4_0, 
                              		"org.osate.altarica.Altarica.SymbolicConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAltarica.g:210:2: (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAltarica.g:210:4: otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // InternalAltarica.g:214:1: ( (lv_constants_6_0= ruleSymbolicConstant ) )
                    	    // InternalAltarica.g:215:1: (lv_constants_6_0= ruleSymbolicConstant )
                    	    {
                    	    // InternalAltarica.g:215:1: (lv_constants_6_0= ruleSymbolicConstant )
                    	    // InternalAltarica.g:216:3: lv_constants_6_0= ruleSymbolicConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_constants_6_0=ruleSymbolicConstant();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDomainRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"constants",
                    	              		lv_constants_6_0, 
                    	              		"org.osate.altarica.Altarica.SymbolicConstant");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_5());
                  
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


    // $ANTLR start "entryRuleSymbolicConstant"
    // InternalAltarica.g:244:1: entryRuleSymbolicConstant returns [EObject current=null] : iv_ruleSymbolicConstant= ruleSymbolicConstant EOF ;
    public final EObject entryRuleSymbolicConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicConstant = null;


        try {
            // InternalAltarica.g:245:2: (iv_ruleSymbolicConstant= ruleSymbolicConstant EOF )
            // InternalAltarica.g:246:2: iv_ruleSymbolicConstant= ruleSymbolicConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolicConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSymbolicConstant=ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolicConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:253:1: ruleSymbolicConstant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolicConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:256:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAltarica.g:257:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAltarica.g:257:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAltarica.g:257:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalAltarica.g:257:2: ()
            // InternalAltarica.g:258:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0(),
                          current);
                  
            }

            }

            // InternalAltarica.g:263:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalAltarica.g:264:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAltarica.g:264:1: (lv_name_1_0= RULE_ID )
            // InternalAltarica.g:265:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
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
    // InternalAltarica.g:289:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalAltarica.g:290:2: (iv_ruleType= ruleType EOF )
            // InternalAltarica.g:291:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:298:1: ruleType returns [EObject current=null] : ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BaseType_0 = null;

        EObject this_NamedType_1 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:301:28: ( ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType ) )
            // InternalAltarica.g:302:1: ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType )
            {
            // InternalAltarica.g:302:1: ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==62) && (synpred1_InternalAltarica())) {
                alt5=1;
            }
            else if ( (LA5_0==63) && (synpred1_InternalAltarica())) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAltarica.g:302:2: ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType )
                    {
                    // InternalAltarica.g:302:2: ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType )
                    // InternalAltarica.g:302:3: ( ruleBaseType )=>this_BaseType_0= ruleBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:313:5: this_NamedType_1= ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:329:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // InternalAltarica.g:330:2: (iv_ruleBaseType= ruleBaseType EOF )
            // InternalAltarica.g:331:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:338:1: ruleBaseType returns [EObject current=null] : ( (lv_name_0_0= ruleBaseTypeEnum ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:341:28: ( ( (lv_name_0_0= ruleBaseTypeEnum ) ) )
            // InternalAltarica.g:342:1: ( (lv_name_0_0= ruleBaseTypeEnum ) )
            {
            // InternalAltarica.g:342:1: ( (lv_name_0_0= ruleBaseTypeEnum ) )
            // InternalAltarica.g:343:1: (lv_name_0_0= ruleBaseTypeEnum )
            {
            // InternalAltarica.g:343:1: (lv_name_0_0= ruleBaseTypeEnum )
            // InternalAltarica.g:344:3: lv_name_0_0= ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.osate.altarica.Altarica.BaseTypeEnum");
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
    // InternalAltarica.g:368:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // InternalAltarica.g:369:2: (iv_ruleNamedType= ruleNamedType EOF )
            // InternalAltarica.g:370:2: iv_ruleNamedType= ruleNamedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:377:1: ruleNamedType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:380:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAltarica.g:381:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAltarica.g:381:1: ( (otherlv_0= RULE_ID ) )
            // InternalAltarica.g:382:1: (otherlv_0= RULE_ID )
            {
            // InternalAltarica.g:382:1: (otherlv_0= RULE_ID )
            // InternalAltarica.g:383:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNamedTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:402:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalAltarica.g:403:2: (iv_ruleClass= ruleClass EOF )
            // InternalAltarica.g:404:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:411:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' ) ;
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
            // InternalAltarica.g:414:28: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' ) )
            // InternalAltarica.g:415:1: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' )
            {
            // InternalAltarica.g:415:1: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' )
            // InternalAltarica.g:415:2: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end'
            {
            // InternalAltarica.g:415:2: ()
            // InternalAltarica.g:416:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassAccess().getNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                  
            }
            // InternalAltarica.g:425:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalAltarica.g:426:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAltarica.g:426:1: (lv_name_2_0= RULE_ID )
            // InternalAltarica.g:427:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            // InternalAltarica.g:443:2: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=28 && LA6_0<=30)||(LA6_0>=62 && LA6_0<=63)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAltarica.g:444:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // InternalAltarica.g:444:1: (lv_declarations_3_0= ruleDeclaration )
            	    // InternalAltarica.g:445:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_8);
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
            	              		"org.osate.altarica.Altarica.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalAltarica.g:461:3: (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAltarica.g:461:5: otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getTransitionKeyword_4_0());
                          
                    }
                    // InternalAltarica.g:465:1: ( (lv_transitions_5_0= ruleLabeledTransition ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalAltarica.g:466:1: (lv_transitions_5_0= ruleLabeledTransition )
                    	    {
                    	    // InternalAltarica.g:466:1: (lv_transitions_5_0= ruleLabeledTransition )
                    	    // InternalAltarica.g:467:3: lv_transitions_5_0= ruleLabeledTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_9);
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
                    	              		"org.osate.altarica.Altarica.LabeledTransition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            // InternalAltarica.g:483:5: (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAltarica.g:483:7: otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAssertionKeyword_5_0());
                          
                    }
                    // InternalAltarica.g:487:1: ( (lv_assertions_7_0= ruleInstruction ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==17||LA9_0==35||LA9_0==37||LA9_0==40) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalAltarica.g:488:1: (lv_assertions_7_0= ruleInstruction )
                    	    {
                    	    // InternalAltarica.g:488:1: (lv_assertions_7_0= ruleInstruction )
                    	    // InternalAltarica.g:489:3: lv_assertions_7_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_11);
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
                    	              		"org.osate.altarica.Altarica.Instruction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:517:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalAltarica.g:518:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalAltarica.g:519:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:526:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_EventDeclaration_1 = null;

        EObject this_ParameterDeclaration_2 = null;

        EObject this_ObserverDeclaration_3 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:529:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration ) )
            // InternalAltarica.g:530:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration )
            {
            // InternalAltarica.g:530:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 62:
            case 63:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAltarica.g:531:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:541:5: this_EventDeclaration_1= ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:551:5: this_ParameterDeclaration_2= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:561:5: this_ObserverDeclaration_3= ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:577:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalAltarica.g:578:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalAltarica.g:579:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:586:1: ruleVariableDeclaration returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) ;
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
            // InternalAltarica.g:589:28: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) )
            // InternalAltarica.g:590:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            {
            // InternalAltarica.g:590:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            // InternalAltarica.g:590:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';'
            {
            // InternalAltarica.g:590:2: ()
            // InternalAltarica.g:591:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationAccess().getVariableAction_0(),
                          current);
                  
            }

            }

            // InternalAltarica.g:596:2: ( (lv_type_1_0= ruleType ) )
            // InternalAltarica.g:597:1: (lv_type_1_0= ruleType )
            {
            // InternalAltarica.g:597:1: (lv_type_1_0= ruleType )
            // InternalAltarica.g:598:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.osate.altarica.Altarica.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAltarica.g:614:2: ( (lv_name_2_0= RULE_ID ) )
            // InternalAltarica.g:615:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAltarica.g:615:1: (lv_name_2_0= RULE_ID )
            // InternalAltarica.g:616:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            // InternalAltarica.g:632:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAltarica.g:632:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // InternalAltarica.g:636:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    // InternalAltarica.g:637:1: (lv_attributes_4_0= ruleAttribute )
                    {
                    // InternalAltarica.g:637:1: (lv_attributes_4_0= ruleAttribute )
                    // InternalAltarica.g:638:3: lv_attributes_4_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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
                              		"org.osate.altarica.Altarica.Attribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAltarica.g:654:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==18) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalAltarica.g:654:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalAltarica.g:658:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // InternalAltarica.g:659:1: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalAltarica.g:659:1: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalAltarica.g:660:3: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	              		"org.osate.altarica.Altarica.Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:692:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalAltarica.g:693:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalAltarica.g:694:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:701:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:704:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // InternalAltarica.g:705:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // InternalAltarica.g:705:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // InternalAltarica.g:705:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            // InternalAltarica.g:705:2: ()
            // InternalAltarica.g:706:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // InternalAltarica.g:711:2: ( (lv_name_1_0= RULE_ID ) )
            // InternalAltarica.g:712:1: (lv_name_1_0= RULE_ID )
            {
            // InternalAltarica.g:712:1: (lv_name_1_0= RULE_ID )
            // InternalAltarica.g:713:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            // InternalAltarica.g:733:1: ( (lv_value_3_0= ruleExpression ) )
            // InternalAltarica.g:734:1: (lv_value_3_0= ruleExpression )
            {
            // InternalAltarica.g:734:1: (lv_value_3_0= ruleExpression )
            // InternalAltarica.g:735:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.osate.altarica.Altarica.Expression");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEventDeclaration"
    // InternalAltarica.g:759:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // InternalAltarica.g:760:2: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // InternalAltarica.g:761:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventDeclaration=ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:768:1: ruleEventDeclaration returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) ;
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
            // InternalAltarica.g:771:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) )
            // InternalAltarica.g:772:1: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            {
            // InternalAltarica.g:772:1: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            // InternalAltarica.g:772:2: () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';'
            {
            // InternalAltarica.g:772:2: ()
            // InternalAltarica.g:773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventDeclarationAccess().getEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDeclarationAccess().getEventKeyword_1());
                  
            }
            // InternalAltarica.g:782:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalAltarica.g:783:1: (lv_name_2_0= RULE_ID )
            {
            // InternalAltarica.g:783:1: (lv_name_2_0= RULE_ID )
            // InternalAltarica.g:784:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            // InternalAltarica.g:800:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAltarica.g:800:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // InternalAltarica.g:804:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    // InternalAltarica.g:805:1: (lv_attributes_4_0= ruleAttribute )
                    {
                    // InternalAltarica.g:805:1: (lv_attributes_4_0= ruleAttribute )
                    // InternalAltarica.g:806:3: lv_attributes_4_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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
                              		"org.osate.altarica.Altarica.Attribute");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAltarica.g:822:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==18) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalAltarica.g:822:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // InternalAltarica.g:826:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // InternalAltarica.g:827:1: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalAltarica.g:827:1: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalAltarica.g:828:3: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
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
                    	              		"org.osate.altarica.Altarica.Attribute");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:860:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // InternalAltarica.g:861:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // InternalAltarica.g:862:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:869:1: ruleParameterDeclaration returns [EObject current=null] : ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
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
            // InternalAltarica.g:872:28: ( ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // InternalAltarica.g:873:1: ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // InternalAltarica.g:873:1: ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            // InternalAltarica.g:873:2: () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // InternalAltarica.g:873:2: ()
            // InternalAltarica.g:874:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1());
                  
            }
            // InternalAltarica.g:883:1: ( (lv_type_2_0= ruleType ) )
            // InternalAltarica.g:884:1: (lv_type_2_0= ruleType )
            {
            // InternalAltarica.g:884:1: (lv_type_2_0= ruleType )
            // InternalAltarica.g:885:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.osate.altarica.Altarica.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAltarica.g:901:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalAltarica.g:902:1: (lv_name_3_0= RULE_ID )
            {
            // InternalAltarica.g:902:1: (lv_name_3_0= RULE_ID )
            // InternalAltarica.g:903:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // InternalAltarica.g:923:1: ( (lv_value_5_0= ruleExpression ) )
            // InternalAltarica.g:924:1: (lv_value_5_0= ruleExpression )
            {
            // InternalAltarica.g:924:1: (lv_value_5_0= ruleExpression )
            // InternalAltarica.g:925:3: lv_value_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:953:1: entryRuleObserverDeclaration returns [EObject current=null] : iv_ruleObserverDeclaration= ruleObserverDeclaration EOF ;
    public final EObject entryRuleObserverDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserverDeclaration = null;


        try {
            // InternalAltarica.g:954:2: (iv_ruleObserverDeclaration= ruleObserverDeclaration EOF )
            // InternalAltarica.g:955:2: iv_ruleObserverDeclaration= ruleObserverDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObserverDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObserverDeclaration=ruleObserverDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObserverDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:962:1: ruleObserverDeclaration returns [EObject current=null] : ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
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
            // InternalAltarica.g:965:28: ( ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // InternalAltarica.g:966:1: ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // InternalAltarica.g:966:1: ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            // InternalAltarica.g:966:2: () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // InternalAltarica.g:966:2: ()
            // InternalAltarica.g:967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getObserverDeclarationAccess().getObserverAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1());
                  
            }
            // InternalAltarica.g:976:1: ( (lv_type_2_0= ruleType ) )
            // InternalAltarica.g:977:1: (lv_type_2_0= ruleType )
            {
            // InternalAltarica.g:977:1: (lv_type_2_0= ruleType )
            // InternalAltarica.g:978:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_4);
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
                      		"org.osate.altarica.Altarica.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAltarica.g:994:2: ( (lv_name_3_0= RULE_ID ) )
            // InternalAltarica.g:995:1: (lv_name_3_0= RULE_ID )
            {
            // InternalAltarica.g:995:1: (lv_name_3_0= RULE_ID )
            // InternalAltarica.g:996:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // InternalAltarica.g:1016:1: ( (lv_value_5_0= ruleExpression ) )
            // InternalAltarica.g:1017:1: (lv_value_5_0= ruleExpression )
            {
            // InternalAltarica.g:1017:1: (lv_value_5_0= ruleExpression )
            // InternalAltarica.g:1018:3: lv_value_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:1046:1: entryRuleLabeledTransition returns [EObject current=null] : iv_ruleLabeledTransition= ruleLabeledTransition EOF ;
    public final EObject entryRuleLabeledTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledTransition = null;


        try {
            // InternalAltarica.g:1047:2: (iv_ruleLabeledTransition= ruleLabeledTransition EOF )
            // InternalAltarica.g:1048:2: iv_ruleLabeledTransition= ruleLabeledTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLabeledTransition=ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeledTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1055:1: ruleLabeledTransition returns [EObject current=null] : ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) ) ;
    public final EObject ruleLabeledTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_event_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1058:28: ( ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) ) )
            // InternalAltarica.g:1059:1: ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) )
            {
            // InternalAltarica.g:1059:1: ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) )
            // InternalAltarica.g:1059:2: ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) )
            {
            // InternalAltarica.g:1059:2: ( (lv_event_0_0= ruleNameRef ) )
            // InternalAltarica.g:1060:1: (lv_event_0_0= ruleNameRef )
            {
            // InternalAltarica.g:1060:1: (lv_event_0_0= ruleNameRef )
            // InternalAltarica.g:1061:3: lv_event_0_0= ruleNameRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
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
                      		"org.osate.altarica.Altarica.NameRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabeledTransitionAccess().getColonKeyword_1());
                  
            }
            // InternalAltarica.g:1081:1: ( (lv_expression_2_0= ruleTransitionAnd ) )
            // InternalAltarica.g:1082:1: (lv_expression_2_0= ruleTransitionAnd )
            {
            // InternalAltarica.g:1082:1: (lv_expression_2_0= ruleTransitionAnd )
            // InternalAltarica.g:1083:3: lv_expression_2_0= ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
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
                      		"org.osate.altarica.Altarica.TransitionAnd");
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
    // InternalAltarica.g:1107:1: entryRuleTransitionAnd returns [EObject current=null] : iv_ruleTransitionAnd= ruleTransitionAnd EOF ;
    public final EObject entryRuleTransitionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionAnd = null;


        try {
            // InternalAltarica.g:1108:2: (iv_ruleTransitionAnd= ruleTransitionAnd EOF )
            // InternalAltarica.g:1109:2: iv_ruleTransitionAnd= ruleTransitionAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionAnd=ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1116:1: ruleTransitionAnd returns [EObject current=null] : (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* ) ;
    public final EObject ruleTransitionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TransitionOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1119:28: ( (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* ) )
            // InternalAltarica.g:1120:1: (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* )
            {
            // InternalAltarica.g:1120:1: (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* )
            // InternalAltarica.g:1121:5: this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_19);
            this_TransitionOr_0=ruleTransitionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TransitionOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:1129:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAltarica.g:1129:2: () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) )
            	    {
            	    // InternalAltarica.g:1129:2: ()
            	    // InternalAltarica.g:1130:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // InternalAltarica.g:1139:1: ( (lv_right_3_0= ruleTransitionOr ) )
            	    // InternalAltarica.g:1140:1: (lv_right_3_0= ruleTransitionOr )
            	    {
            	    // InternalAltarica.g:1140:1: (lv_right_3_0= ruleTransitionOr )
            	    // InternalAltarica.g:1141:3: lv_right_3_0= ruleTransitionOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_19);
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
            	              		"org.osate.altarica.Altarica.TransitionOr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalAltarica.g:1165:1: entryRuleTransitionOr returns [EObject current=null] : iv_ruleTransitionOr= ruleTransitionOr EOF ;
    public final EObject entryRuleTransitionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionOr = null;


        try {
            // InternalAltarica.g:1166:2: (iv_ruleTransitionOr= ruleTransitionOr EOF )
            // InternalAltarica.g:1167:2: iv_ruleTransitionOr= ruleTransitionOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransitionOr=ruleTransitionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1174:1: ruleTransitionOr returns [EObject current=null] : (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* ) ;
    public final EObject ruleTransitionOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Transition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1177:28: ( (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* ) )
            // InternalAltarica.g:1178:1: (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* )
            {
            // InternalAltarica.g:1178:1: (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* )
            // InternalAltarica.g:1179:5: this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_20);
            this_Transition_0=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Transition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:1187:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAltarica.g:1187:2: () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) )
            	    {
            	    // InternalAltarica.g:1187:2: ()
            	    // InternalAltarica.g:1188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // InternalAltarica.g:1197:1: ( (lv_right_3_0= ruleTransition ) )
            	    // InternalAltarica.g:1198:1: (lv_right_3_0= ruleTransition )
            	    {
            	    // InternalAltarica.g:1198:1: (lv_right_3_0= ruleTransition )
            	    // InternalAltarica.g:1199:3: lv_right_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleTransition();

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
            	              		"org.osate.altarica.Altarica.Transition");
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


    // $ANTLR start "entryRuleTransition"
    // InternalAltarica.g:1223:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAltarica.g:1224:2: (iv_ruleTransition= ruleTransition EOF )
            // InternalAltarica.g:1225:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalAltarica.g:1232:1: ruleTransition returns [EObject current=null] : ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_guard_1_0 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1235:28: ( ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) ) )
            // InternalAltarica.g:1236:1: ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) )
            {
            // InternalAltarica.g:1236:1: ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) )
            // InternalAltarica.g:1236:2: () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) )
            {
            // InternalAltarica.g:1236:2: ()
            // InternalAltarica.g:1237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionAccess().getTransitionAction_0(),
                          current);
                  
            }

            }

            // InternalAltarica.g:1242:2: ( (lv_guard_1_0= ruleExpression ) )
            // InternalAltarica.g:1243:1: (lv_guard_1_0= ruleExpression )
            {
            // InternalAltarica.g:1243:1: (lv_guard_1_0= ruleExpression )
            // InternalAltarica.g:1244:3: lv_guard_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_21);
            lv_guard_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"guard",
                      		lv_guard_1_0, 
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
                  
            }
            // InternalAltarica.g:1264:1: ( (lv_action_3_0= ruleInstruction ) )
            // InternalAltarica.g:1265:1: (lv_action_3_0= ruleInstruction )
            {
            // InternalAltarica.g:1265:1: (lv_action_3_0= ruleInstruction )
            // InternalAltarica.g:1266:3: lv_action_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_action_3_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_3_0, 
                      		"org.osate.altarica.Altarica.Instruction");
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInstruction"
    // InternalAltarica.g:1290:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalAltarica.g:1291:2: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalAltarica.g:1292:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1299:1: ruleInstruction returns [EObject current=null] : (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Skip_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Block_2 = null;

        EObject this_Conditional_3 = null;

        EObject this_Switch_4 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1302:28: ( (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch ) )
            // InternalAltarica.g:1303:1: (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch )
            {
            // InternalAltarica.g:1303:1: (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case 17:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            case 40:
                {
                alt18=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAltarica.g:1304:5: this_Skip_0= ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1314:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1324:5: this_Block_2= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:1334:5: this_Conditional_3= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Conditional_3=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Conditional_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalAltarica.g:1344:5: this_Switch_4= ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_Switch_4=ruleSwitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Switch_4; 
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
    // InternalAltarica.g:1360:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // InternalAltarica.g:1361:2: (iv_ruleSkip= ruleSkip EOF )
            // InternalAltarica.g:1362:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1369:1: ruleSkip returns [EObject current=null] : ( () otherlv_1= 'skip' otherlv_2= ';' ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:1372:28: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) )
            // InternalAltarica.g:1373:1: ( () otherlv_1= 'skip' otherlv_2= ';' )
            {
            // InternalAltarica.g:1373:1: ( () otherlv_1= 'skip' otherlv_2= ';' )
            // InternalAltarica.g:1373:2: () otherlv_1= 'skip' otherlv_2= ';'
            {
            // InternalAltarica.g:1373:2: ()
            // InternalAltarica.g:1374:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSkipAccess().getSkipAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSkipAccess().getSkipKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:1395:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalAltarica.g:1396:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalAltarica.g:1397:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1404:1: ruleAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1407:28: ( ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // InternalAltarica.g:1408:1: ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // InternalAltarica.g:1408:1: ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            // InternalAltarica.g:1408:2: () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // InternalAltarica.g:1408:2: ()
            // InternalAltarica.g:1409:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
                          current);
                  
            }

            }

            // InternalAltarica.g:1414:2: ( (lv_variable_1_0= ruleNameRef ) )
            // InternalAltarica.g:1415:1: (lv_variable_1_0= ruleNameRef )
            {
            // InternalAltarica.g:1415:1: (lv_variable_1_0= ruleNameRef )
            // InternalAltarica.g:1416:3: lv_variable_1_0= ruleNameRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_22);
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
                      		"org.osate.altarica.Altarica.NameRef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // InternalAltarica.g:1436:1: ( (lv_value_3_0= ruleExpression ) )
            // InternalAltarica.g:1437:1: (lv_value_3_0= ruleExpression )
            {
            // InternalAltarica.g:1437:1: (lv_value_3_0= ruleExpression )
            // InternalAltarica.g:1438:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_14);
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
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:1466:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalAltarica.g:1467:2: (iv_ruleBlock= ruleBlock EOF )
            // InternalAltarica.g:1468:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1475:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1478:28: ( ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' ) )
            // InternalAltarica.g:1479:1: ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' )
            {
            // InternalAltarica.g:1479:1: ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' )
            // InternalAltarica.g:1479:2: () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}'
            {
            // InternalAltarica.g:1479:2: ()
            // InternalAltarica.g:1480:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalAltarica.g:1489:1: ( (lv_instructions_2_0= ruleInstruction ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==17||LA19_0==35||LA19_0==37||LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAltarica.g:1490:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // InternalAltarica.g:1490:1: (lv_instructions_2_0= ruleInstruction )
            	    // InternalAltarica.g:1491:3: lv_instructions_2_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_23);
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
            	              		"org.osate.altarica.Altarica.Instruction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleConditional"
    // InternalAltarica.g:1519:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalAltarica.g:1520:2: (iv_ruleConditional= ruleConditional EOF )
            // InternalAltarica.g:1521:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalAltarica.g:1528:1: ruleConditional returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1531:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' ) )
            // InternalAltarica.g:1532:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' )
            {
            // InternalAltarica.g:1532:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' )
            // InternalAltarica.g:1532:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';'
            {
            // InternalAltarica.g:1532:2: ()
            // InternalAltarica.g:1533:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConditionalAccess().getConditionalAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
                  
            }
            // InternalAltarica.g:1542:1: ( (lv_condition_2_0= ruleExpression ) )
            // InternalAltarica.g:1543:1: (lv_condition_2_0= ruleExpression )
            {
            // InternalAltarica.g:1543:1: (lv_condition_2_0= ruleExpression )
            // InternalAltarica.g:1544:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getThenKeyword_3());
                  
            }
            // InternalAltarica.g:1564:1: ( (lv_then_4_0= ruleInstruction ) )
            // InternalAltarica.g:1565:1: (lv_then_4_0= ruleInstruction )
            {
            // InternalAltarica.g:1565:1: (lv_then_4_0= ruleInstruction )
            // InternalAltarica.g:1566:3: lv_then_4_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_25);
            lv_then_4_0=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"org.osate.altarica.Altarica.Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAltarica.g:1582:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) && (synpred2_InternalAltarica())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAltarica.g:1582:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) )
                    {
                    // InternalAltarica.g:1582:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalAltarica.g:1582:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // InternalAltarica.g:1587:2: ( (lv_else_6_0= ruleInstruction ) )
                    // InternalAltarica.g:1588:1: (lv_else_6_0= ruleInstruction )
                    {
                    // InternalAltarica.g:1588:1: (lv_else_6_0= ruleInstruction )
                    // InternalAltarica.g:1589:3: lv_else_6_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_else_6_0=ruleInstruction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_6_0, 
                              		"org.osate.altarica.Altarica.Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getConditionalAccess().getSemicolonKeyword_6());
                  
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleSwitch"
    // InternalAltarica.g:1617:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalAltarica.g:1618:2: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalAltarica.g:1619:2: iv_ruleSwitch= ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1626:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cases_2_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1629:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalAltarica.g:1630:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalAltarica.g:1630:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalAltarica.g:1630:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalAltarica.g:1638:1: ( (lv_cases_2_0= ruleCaseExpression ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==58) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAltarica.g:1639:1: (lv_cases_2_0= ruleCaseExpression )
            	    {
            	    // InternalAltarica.g:1639:1: (lv_cases_2_0= ruleCaseExpression )
            	    // InternalAltarica.g:1640:3: lv_cases_2_0= ruleCaseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_cases_2_0=ruleCaseExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_2_0, 
            	              		"org.osate.altarica.Altarica.CaseExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,39,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getElseKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,31,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getColonKeyword_4());
                  
            }
            // InternalAltarica.g:1664:1: ( (lv_else_5_0= ruleExpression ) )
            // InternalAltarica.g:1665:1: (lv_else_5_0= ruleExpression )
            {
            // InternalAltarica.g:1665:1: (lv_else_5_0= ruleExpression )
            // InternalAltarica.g:1666:3: lv_else_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
            lv_else_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchRule());
              	        }
                     		set(
                     			current, 
                     			"else",
                      		lv_else_5_0, 
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6());
                  
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


    // $ANTLR start "entryRuleExpression"
    // InternalAltarica.g:1694:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAltarica.g:1695:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalAltarica.g:1696:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1703:1: ruleExpression returns [EObject current=null] : this_LogicalOr_0= ruleLogicalOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOr_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1706:28: (this_LogicalOr_0= ruleLogicalOr )
            // InternalAltarica.g:1708:5: this_LogicalOr_0= ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_2);
            this_LogicalOr_0=ruleLogicalOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOr_0; 
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


    // $ANTLR start "entryRuleLogicalOr"
    // InternalAltarica.g:1724:1: entryRuleLogicalOr returns [EObject current=null] : iv_ruleLogicalOr= ruleLogicalOr EOF ;
    public final EObject entryRuleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOr = null;


        try {
            // InternalAltarica.g:1725:2: (iv_ruleLogicalOr= ruleLogicalOr EOF )
            // InternalAltarica.g:1726:2: iv_ruleLogicalOr= ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOr=ruleLogicalOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOr"


    // $ANTLR start "ruleLogicalOr"
    // InternalAltarica.g:1733:1: ruleLogicalOr returns [EObject current=null] : (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* ) ;
    public final EObject ruleLogicalOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_LogicalAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1736:28: ( (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* ) )
            // InternalAltarica.g:1737:1: (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* )
            {
            // InternalAltarica.g:1737:1: (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* )
            // InternalAltarica.g:1738:5: this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_28);
            this_LogicalAnd_0=ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:1746:1: ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==41) && (synpred3_InternalAltarica())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAltarica.g:1746:2: ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )
            	    {
            	    // InternalAltarica.g:1757:6: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )
            	    // InternalAltarica.g:1757:7: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) )
            	    {
            	    // InternalAltarica.g:1757:7: ()
            	    // InternalAltarica.g:1758:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalAltarica.g:1763:2: ( (lv_op_2_0= 'or' ) )
            	    // InternalAltarica.g:1764:1: (lv_op_2_0= 'or' )
            	    {
            	    // InternalAltarica.g:1764:1: (lv_op_2_0= 'or' )
            	    // InternalAltarica.g:1765:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,41,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getLogicalOrAccess().getOpOrKeyword_1_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLogicalOrRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalAltarica.g:1778:2: ( (lv_right_3_0= ruleLogicalAnd ) )
            	    // InternalAltarica.g:1779:1: (lv_right_3_0= ruleLogicalAnd )
            	    {
            	    // InternalAltarica.g:1779:1: (lv_right_3_0= ruleLogicalAnd )
            	    // InternalAltarica.g:1780:3: lv_right_3_0= ruleLogicalAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleLogicalAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"org.osate.altarica.Altarica.LogicalAnd");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleLogicalOr"


    // $ANTLR start "entryRuleLogicalAnd"
    // InternalAltarica.g:1804:1: entryRuleLogicalAnd returns [EObject current=null] : iv_ruleLogicalAnd= ruleLogicalAnd EOF ;
    public final EObject entryRuleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAnd = null;


        try {
            // InternalAltarica.g:1805:2: (iv_ruleLogicalAnd= ruleLogicalAnd EOF )
            // InternalAltarica.g:1806:2: iv_ruleLogicalAnd= ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAnd=ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAnd"


    // $ANTLR start "ruleLogicalAnd"
    // InternalAltarica.g:1813:1: ruleLogicalAnd returns [EObject current=null] : (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* ) ;
    public final EObject ruleLogicalAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Relation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:1816:28: ( (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* ) )
            // InternalAltarica.g:1817:1: (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* )
            {
            // InternalAltarica.g:1817:1: (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* )
            // InternalAltarica.g:1818:5: this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndAccess().getRelationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_29);
            this_Relation_0=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Relation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:1826:1: ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==42) && (synpred4_InternalAltarica())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAltarica.g:1826:2: ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) )
            	    {
            	    // InternalAltarica.g:1837:6: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) )
            	    // InternalAltarica.g:1837:7: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) )
            	    {
            	    // InternalAltarica.g:1837:7: ()
            	    // InternalAltarica.g:1838:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalAltarica.g:1843:2: ( (lv_op_2_0= 'and' ) )
            	    // InternalAltarica.g:1844:1: (lv_op_2_0= 'and' )
            	    {
            	    // InternalAltarica.g:1844:1: (lv_op_2_0= 'and' )
            	    // InternalAltarica.g:1845:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,42,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getLogicalAndAccess().getOpAndKeyword_1_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLogicalAndRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalAltarica.g:1858:2: ( (lv_right_3_0= ruleRelation ) )
            	    // InternalAltarica.g:1859:1: (lv_right_3_0= ruleRelation )
            	    {
            	    // InternalAltarica.g:1859:1: (lv_right_3_0= ruleRelation )
            	    // InternalAltarica.g:1860:3: lv_right_3_0= ruleRelation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleRelation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"org.osate.altarica.Altarica.Relation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleLogicalAnd"


    // $ANTLR start "entryRuleRelation"
    // InternalAltarica.g:1884:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalAltarica.g:1885:2: (iv_ruleRelation= ruleRelation EOF )
            // InternalAltarica.g:1886:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:1893:1: ruleRelation returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* ) ;
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
            // InternalAltarica.g:1896:28: ( (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* ) )
            // InternalAltarica.g:1897:1: (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* )
            {
            // InternalAltarica.g:1897:1: (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* )
            // InternalAltarica.g:1898:5: this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_30);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:1906:1: ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==43) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==44) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==45) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==46) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==47) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==48) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAltarica.g:1906:2: ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )
            	    {
            	    // InternalAltarica.g:1935:6: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )
            	    // InternalAltarica.g:1935:7: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // InternalAltarica.g:1935:7: ()
            	    // InternalAltarica.g:1936:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalAltarica.g:1941:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) )
            	    // InternalAltarica.g:1942:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) )
            	    {
            	    // InternalAltarica.g:1942:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) )
            	    // InternalAltarica.g:1943:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' )
            	    {
            	    // InternalAltarica.g:1943:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' )
            	    int alt24=6;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalAltarica.g:1944:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,43,FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getRelationAccess().getOpEqualsSignEqualsSignKeyword_1_0_1_0_0());
            	                  
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
            	            // InternalAltarica.g:1956:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalAltarica.g:1968:8: lv_op_2_3= '<'
            	            {
            	            lv_op_2_3=(Token)match(input,45,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalAltarica.g:1980:8: lv_op_2_4= '<='
            	            {
            	            lv_op_2_4=(Token)match(input,46,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalAltarica.g:1992:8: lv_op_2_5= '>='
            	            {
            	            lv_op_2_5=(Token)match(input,47,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalAltarica.g:2004:8: lv_op_2_6= '>'
            	            {
            	            lv_op_2_6=(Token)match(input,48,FOLLOW_16); if (state.failed) return current;
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

            	    // InternalAltarica.g:2019:2: ( (lv_right_3_0= ruleAddition ) )
            	    // InternalAltarica.g:2020:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // InternalAltarica.g:2020:1: (lv_right_3_0= ruleAddition )
            	    // InternalAltarica.g:2021:3: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
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
            	              		"org.osate.altarica.Altarica.Addition");
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAddition"
    // InternalAltarica.g:2045:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalAltarica.g:2046:2: (iv_ruleAddition= ruleAddition EOF )
            // InternalAltarica.g:2047:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2054:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2057:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) )
            // InternalAltarica.g:2058:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            {
            // InternalAltarica.g:2058:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            // InternalAltarica.g:2059:5: this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_31);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:2067:1: ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) && (synpred6_InternalAltarica())) {
                    alt27=1;
                }
                else if ( (LA27_0==50) && (synpred6_InternalAltarica())) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAltarica.g:2067:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    {
            	    // InternalAltarica.g:2084:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    // InternalAltarica.g:2084:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalAltarica.g:2084:7: ()
            	    // InternalAltarica.g:2085:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalAltarica.g:2090:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalAltarica.g:2091:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalAltarica.g:2091:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalAltarica.g:2092:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalAltarica.g:2092:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==49) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==50) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalAltarica.g:2093:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,49,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalAltarica.g:2105:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
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

            	    // InternalAltarica.g:2120:2: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalAltarica.g:2121:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalAltarica.g:2121:1: (lv_right_3_0= ruleMultiplication )
            	    // InternalAltarica.g:2122:3: lv_right_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_31);
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
            	              		"org.osate.altarica.Altarica.Multiplication");
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalAltarica.g:2146:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalAltarica.g:2147:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalAltarica.g:2148:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2155:1: ruleMultiplication returns [EObject current=null] : (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Neg_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2158:28: ( (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* ) )
            // InternalAltarica.g:2159:1: (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* )
            {
            // InternalAltarica.g:2159:1: (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* )
            // InternalAltarica.g:2160:5: this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_32);
            this_Neg_0=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Neg_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalAltarica.g:2168:1: ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==51) && (synpred7_InternalAltarica())) {
                    alt29=1;
                }
                else if ( (LA29_0==52) && (synpred7_InternalAltarica())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAltarica.g:2168:2: ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) )
            	    {
            	    // InternalAltarica.g:2185:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) )
            	    // InternalAltarica.g:2185:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) )
            	    {
            	    // InternalAltarica.g:2185:7: ()
            	    // InternalAltarica.g:2186:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // InternalAltarica.g:2191:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalAltarica.g:2192:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalAltarica.g:2192:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalAltarica.g:2193:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalAltarica.g:2193:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==51) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==52) ) {
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
            	            // InternalAltarica.g:2194:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,51,FOLLOW_16); if (state.failed) return current;
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
            	            // InternalAltarica.g:2206:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,52,FOLLOW_16); if (state.failed) return current;
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

            	    // InternalAltarica.g:2221:2: ( (lv_right_3_0= ruleNeg ) )
            	    // InternalAltarica.g:2222:1: (lv_right_3_0= ruleNeg )
            	    {
            	    // InternalAltarica.g:2222:1: (lv_right_3_0= ruleNeg )
            	    // InternalAltarica.g:2223:3: lv_right_3_0= ruleNeg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_32);
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
            	              		"org.osate.altarica.Altarica.Neg");
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNeg"
    // InternalAltarica.g:2247:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // InternalAltarica.g:2248:2: (iv_ruleNeg= ruleNeg EOF )
            // InternalAltarica.g:2249:2: iv_ruleNeg= ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNeg=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNeg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2256:1: ruleNeg returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atom_6 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2259:28: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom ) )
            // InternalAltarica.g:2260:1: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom )
            {
            // InternalAltarica.g:2260:1: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt30=1;
                }
                break;
            case 50:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_NUMBER:
            case 24:
            case 40:
            case 54:
            case 55:
            case 59:
            case 60:
            case 61:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalAltarica.g:2260:2: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) )
                    {
                    // InternalAltarica.g:2260:2: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) )
                    // InternalAltarica.g:2260:3: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) )
                    {
                    // InternalAltarica.g:2260:3: ()
                    // InternalAltarica.g:2261:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegAccess().getNotAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalAltarica.g:2266:2: ( ( 'not' )=>otherlv_1= 'not' )
                    // InternalAltarica.g:2266:3: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNegAccess().getNotKeyword_0_1());
                          
                    }

                    }

                    // InternalAltarica.g:2271:2: ( (lv_expression_2_0= ruleAtom ) )
                    // InternalAltarica.g:2272:1: (lv_expression_2_0= ruleAtom )
                    {
                    // InternalAltarica.g:2272:1: (lv_expression_2_0= ruleAtom )
                    // InternalAltarica.g:2273:3: lv_expression_2_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.osate.altarica.Altarica.Atom");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:2290:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) )
                    {
                    // InternalAltarica.g:2290:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) )
                    // InternalAltarica.g:2290:7: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) )
                    {
                    // InternalAltarica.g:2290:7: ()
                    // InternalAltarica.g:2291:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegAccess().getMinusAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAltarica.g:2296:2: ( ( '-' )=>otherlv_4= '-' )
                    // InternalAltarica.g:2296:3: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1());
                          
                    }

                    }

                    // InternalAltarica.g:2301:2: ( (lv_expression_5_0= ruleAtom ) )
                    // InternalAltarica.g:2302:1: (lv_expression_5_0= ruleAtom )
                    {
                    // InternalAltarica.g:2302:1: (lv_expression_5_0= ruleAtom )
                    // InternalAltarica.g:2303:3: lv_expression_5_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
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
                              		"org.osate.altarica.Altarica.Atom");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAltarica.g:2321:5: this_Atom_6= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAltarica.g:2337:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalAltarica.g:2338:2: (iv_ruleAtom= ruleAtom EOF )
            // InternalAltarica.g:2339:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2346:1: ruleAtom returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_FunctionCall_3= ruleFunctionCall | this_NameRef_4= ruleNameRef | this_SwitchExpression_5= ruleSwitchExpression | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_BooleanLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_NumberLiteral_2 = null;

        EObject this_FunctionCall_3 = null;

        EObject this_NameRef_4 = null;

        EObject this_SwitchExpression_5 = null;

        EObject this_Expression_7 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2349:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_FunctionCall_3= ruleFunctionCall | this_NameRef_4= ruleNameRef | this_SwitchExpression_5= ruleSwitchExpression | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) ) )
            // InternalAltarica.g:2350:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_FunctionCall_3= ruleFunctionCall | this_NameRef_4= ruleNameRef | this_SwitchExpression_5= ruleSwitchExpression | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) )
            {
            // InternalAltarica.g:2350:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_NumberLiteral_2= ruleNumberLiteral | this_FunctionCall_3= ruleFunctionCall | this_NameRef_4= ruleNameRef | this_SwitchExpression_5= ruleSwitchExpression | (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
                {
                alt31=1;
                }
                break;
            case RULE_STRING:
                {
                alt31=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt31=3;
                }
                break;
            case 59:
            case 60:
            case 61:
                {
                alt31=4;
                }
                break;
            case RULE_ID:
                {
                alt31=5;
                }
                break;
            case 40:
                {
                alt31=6;
                }
                break;
            case 24:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalAltarica.g:2351:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:2361:5: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAltarica.g:2371:5: this_NumberLiteral_2= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_2=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalAltarica.g:2381:5: this_FunctionCall_3= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getFunctionCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionCall_3=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // InternalAltarica.g:2391:5: this_NameRef_4= ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getNameRefParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_NameRef_4=ruleNameRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NameRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // InternalAltarica.g:2401:5: this_SwitchExpression_5= ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getSwitchExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_2);
                    this_SwitchExpression_5=ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // InternalAltarica.g:2410:6: (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    {
                    // InternalAltarica.g:2410:6: (otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')' )
                    // InternalAltarica.g:2410:8: otherlv_6= '(' this_Expression_7= ruleExpression otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_6_1()); 
                          
                    }
                    pushFollow(FOLLOW_33);
                    this_Expression_7=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAtomAccess().getRightParenthesisKeyword_6_2());
                          
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
    // InternalAltarica.g:2435:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalAltarica.g:2436:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalAltarica.g:2437:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2444:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:2447:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalAltarica.g:2448:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalAltarica.g:2448:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalAltarica.g:2449:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalAltarica.g:2449:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalAltarica.g:2450:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalAltarica.g:2450:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            else if ( (LA32_0==55) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAltarica.g:2451:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
                    // InternalAltarica.g:2463:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalAltarica.g:2486:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalAltarica.g:2487:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalAltarica.g:2488:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2495:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:2498:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAltarica.g:2499:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAltarica.g:2499:1: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAltarica.g:2500:1: (lv_value_0_0= RULE_STRING )
            {
            // InternalAltarica.g:2500:1: (lv_value_0_0= RULE_STRING )
            // InternalAltarica.g:2501:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
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
                      		"org.osate.altarica.Altarica.STRING");
              	    
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


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalAltarica.g:2525:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalAltarica.g:2526:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalAltarica.g:2527:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalAltarica.g:2534:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:2537:28: ( ( (lv_value_0_0= RULE_NUMBER ) ) )
            // InternalAltarica.g:2538:1: ( (lv_value_0_0= RULE_NUMBER ) )
            {
            // InternalAltarica.g:2538:1: ( (lv_value_0_0= RULE_NUMBER ) )
            // InternalAltarica.g:2539:1: (lv_value_0_0= RULE_NUMBER )
            {
            // InternalAltarica.g:2539:1: (lv_value_0_0= RULE_NUMBER )
            // InternalAltarica.g:2540:3: lv_value_0_0= RULE_NUMBER
            {
            lv_value_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueNUMBERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.osate.altarica.Altarica.NUMBER");
              	    
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNameRef"
    // InternalAltarica.g:2564:1: entryRuleNameRef returns [EObject current=null] : iv_ruleNameRef= ruleNameRef EOF ;
    public final EObject entryRuleNameRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameRef = null;


        try {
            // InternalAltarica.g:2565:2: (iv_ruleNameRef= ruleNameRef EOF )
            // InternalAltarica.g:2566:2: iv_ruleNameRef= ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameRef=ruleNameRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2573:1: ruleNameRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleNameRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalAltarica.g:2576:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // InternalAltarica.g:2577:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // InternalAltarica.g:2577:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // InternalAltarica.g:2577:2: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // InternalAltarica.g:2577:2: ( (otherlv_0= RULE_ID ) )
            // InternalAltarica.g:2578:1: (otherlv_0= RULE_ID )
            {
            // InternalAltarica.g:2578:1: (otherlv_0= RULE_ID )
            // InternalAltarica.g:2579:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNameRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
              	
            }

            }


            }

            // InternalAltarica.g:2590:2: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==56) && (synpred10_InternalAltarica())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAltarica.g:2590:3: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // InternalAltarica.g:2597:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // InternalAltarica.g:2597:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalAltarica.g:2597:7: ()
            	    // InternalAltarica.g:2598:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,56,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1());
            	          
            	    }
            	    // InternalAltarica.g:2607:1: ( (otherlv_3= RULE_ID ) )
            	    // InternalAltarica.g:2608:1: (otherlv_3= RULE_ID )
            	    {
            	    // InternalAltarica.g:2608:1: (otherlv_3= RULE_ID )
            	    // InternalAltarica.g:2609:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNameRefRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_1_0_2_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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


    // $ANTLR start "entryRuleSwitchExpression"
    // InternalAltarica.g:2628:1: entryRuleSwitchExpression returns [EObject current=null] : iv_ruleSwitchExpression= ruleSwitchExpression EOF ;
    public final EObject entryRuleSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchExpression = null;


        try {
            // InternalAltarica.g:2629:2: (iv_ruleSwitchExpression= ruleSwitchExpression EOF )
            // InternalAltarica.g:2630:2: iv_ruleSwitchExpression= ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchExpression=ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // InternalAltarica.g:2637:1: ruleSwitchExpression returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'default' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
    public final EObject ruleSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cases_2_0 = null;

        EObject lv_default_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2640:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'default' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // InternalAltarica.g:2641:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'default' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // InternalAltarica.g:2641:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'default' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' )
            // InternalAltarica.g:2641:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'default' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalAltarica.g:2649:1: ( (lv_cases_2_0= ruleCaseExpression ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==58) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAltarica.g:2650:1: (lv_cases_2_0= ruleCaseExpression )
            	    {
            	    // InternalAltarica.g:2650:1: (lv_cases_2_0= ruleCaseExpression )
            	    // InternalAltarica.g:2651:3: lv_cases_2_0= ruleCaseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_cases_2_0=ruleCaseExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_2_0, 
            	              		"org.osate.altarica.Altarica.CaseExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,57,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,31,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchExpressionAccess().getColonKeyword_4());
                  
            }
            // InternalAltarica.g:2675:1: ( (lv_default_5_0= ruleExpression ) )
            // InternalAltarica.g:2676:1: (lv_default_5_0= ruleExpression )
            {
            // InternalAltarica.g:2676:1: (lv_default_5_0= ruleExpression )
            // InternalAltarica.g:2677:3: lv_default_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
            lv_default_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"default",
                      		lv_default_5_0, 
                      		"org.osate.altarica.Altarica.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleCaseExpression"
    // InternalAltarica.g:2705:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // InternalAltarica.g:2706:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // InternalAltarica.g:2707:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalAltarica.g:2714:1: ruleCaseExpression returns [EObject current=null] : (otherlv_0= 'case' ( (lv_condition_1_0= ruleLogicalOr ) ) otherlv_2= ':' ( (lv_case_3_0= ruleExpression ) ) ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_condition_1_0 = null;

        EObject lv_case_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2717:28: ( (otherlv_0= 'case' ( (lv_condition_1_0= ruleLogicalOr ) ) otherlv_2= ':' ( (lv_case_3_0= ruleExpression ) ) ) )
            // InternalAltarica.g:2718:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleLogicalOr ) ) otherlv_2= ':' ( (lv_case_3_0= ruleExpression ) ) )
            {
            // InternalAltarica.g:2718:1: (otherlv_0= 'case' ( (lv_condition_1_0= ruleLogicalOr ) ) otherlv_2= ':' ( (lv_case_3_0= ruleExpression ) ) )
            // InternalAltarica.g:2718:3: otherlv_0= 'case' ( (lv_condition_1_0= ruleLogicalOr ) ) otherlv_2= ':' ( (lv_case_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCaseExpressionAccess().getCaseKeyword_0());
                  
            }
            // InternalAltarica.g:2722:1: ( (lv_condition_1_0= ruleLogicalOr ) )
            // InternalAltarica.g:2723:1: (lv_condition_1_0= ruleLogicalOr )
            {
            // InternalAltarica.g:2723:1: (lv_condition_1_0= ruleLogicalOr )
            // InternalAltarica.g:2724:3: lv_condition_1_0= ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            lv_condition_1_0=ruleLogicalOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"org.osate.altarica.Altarica.LogicalOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCaseExpressionAccess().getColonKeyword_2());
                  
            }
            // InternalAltarica.g:2744:1: ( (lv_case_3_0= ruleExpression ) )
            // InternalAltarica.g:2745:1: (lv_case_3_0= ruleExpression )
            {
            // InternalAltarica.g:2745:1: (lv_case_3_0= ruleExpression )
            // InternalAltarica.g:2746:3: lv_case_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_case_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"case",
                      		lv_case_3_0, 
                      		"org.osate.altarica.Altarica.Expression");
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
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "entryRuleFunctionCall"
    // InternalAltarica.g:2770:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalAltarica.g:2771:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalAltarica.g:2772:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalAltarica.g:2779:1: ruleFunctionCall returns [EObject current=null] : ( () ( ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAltarica.g:2782:28: ( ( () ( ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' ) )
            // InternalAltarica.g:2783:1: ( () ( ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            {
            // InternalAltarica.g:2783:1: ( () ( ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )
            // InternalAltarica.g:2783:2: () ( ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            {
            // InternalAltarica.g:2783:2: ()
            // InternalAltarica.g:2784:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // InternalAltarica.g:2789:2: ( ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) ) )
            // InternalAltarica.g:2790:1: ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) )
            {
            // InternalAltarica.g:2790:1: ( (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' ) )
            // InternalAltarica.g:2791:1: (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' )
            {
            // InternalAltarica.g:2791:1: (lv_name_1_1= 'exponential' | lv_name_1_2= 'Dirac' | lv_name_1_3= 'constant' )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt35=1;
                }
                break;
            case 60:
                {
                alt35=2;
                }
                break;
            case 61:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAltarica.g:2792:3: lv_name_1_1= 'exponential'
                    {
                    lv_name_1_1=(Token)match(input,59,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_1, grammarAccess.getFunctionCallAccess().getNameExponentialKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalAltarica.g:2804:8: lv_name_1_2= 'Dirac'
                    {
                    lv_name_1_2=(Token)match(input,60,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_2, grammarAccess.getFunctionCallAccess().getNameDiracKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalAltarica.g:2816:8: lv_name_1_3= 'constant'
                    {
                    lv_name_1_3=(Token)match(input,61,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_3, grammarAccess.getFunctionCallAccess().getNameConstantKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionCallRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_3, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalAltarica.g:2835:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_NUMBER)||LA37_0==24||LA37_0==40||LA37_0==50||(LA37_0>=53 && LA37_0<=55)||(LA37_0>=59 && LA37_0<=61)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAltarica.g:2835:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
                    {
                    // InternalAltarica.g:2835:2: ( (lv_parameters_3_0= ruleExpression ) )
                    // InternalAltarica.g:2836:1: (lv_parameters_3_0= ruleExpression )
                    {
                    // InternalAltarica.g:2836:1: (lv_parameters_3_0= ruleExpression )
                    // InternalAltarica.g:2837:3: lv_parameters_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
                    lv_parameters_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"org.osate.altarica.Altarica.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAltarica.g:2853:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==18) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAltarica.g:2853:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalAltarica.g:2857:1: ( (lv_parameters_5_0= ruleExpression ) )
                    	    // InternalAltarica.g:2858:1: (lv_parameters_5_0= ruleExpression )
                    	    {
                    	    // InternalAltarica.g:2858:1: (lv_parameters_5_0= ruleExpression )
                    	    // InternalAltarica.g:2859:3: lv_parameters_5_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_parameters_5_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"org.osate.altarica.Altarica.Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
                  
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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "ruleBaseTypeEnum"
    // InternalAltarica.g:2887:1: ruleBaseTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) ) ;
    public final Enumerator ruleBaseTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalAltarica.g:2889:28: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) ) )
            // InternalAltarica.g:2890:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) )
            {
            // InternalAltarica.g:2890:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            else if ( (LA38_0==63) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalAltarica.g:2890:2: (enumLiteral_0= 'Integer' )
                    {
                    // InternalAltarica.g:2890:2: (enumLiteral_0= 'Integer' )
                    // InternalAltarica.g:2890:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAltarica.g:2896:6: (enumLiteral_1= 'Boolean' )
                    {
                    // InternalAltarica.g:2896:6: (enumLiteral_1= 'Boolean' )
                    // InternalAltarica.g:2896:8: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
        // InternalAltarica.g:302:3: ( ruleBaseType )
        // InternalAltarica.g:302:5: ruleBaseType
        {
        pushFollow(FOLLOW_2);
        ruleBaseType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAltarica

    // $ANTLR start synpred2_InternalAltarica
    public final void synpred2_InternalAltarica_fragment() throws RecognitionException {   
        // InternalAltarica.g:1582:4: ( 'else' )
        // InternalAltarica.g:1582:6: 'else'
        {
        match(input,39,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalAltarica

    // $ANTLR start synpred3_InternalAltarica
    public final void synpred3_InternalAltarica_fragment() throws RecognitionException {   
        // InternalAltarica.g:1746:2: ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )
        // InternalAltarica.g:1746:3: ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) )
        {
        // InternalAltarica.g:1746:3: ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) )
        // InternalAltarica.g:1746:4: () ( ( 'or' ) ) ( ( ruleLogicalAnd ) )
        {
        // InternalAltarica.g:1746:4: ()
        // InternalAltarica.g:1747:1: 
        {
        }

        // InternalAltarica.g:1747:2: ( ( 'or' ) )
        // InternalAltarica.g:1748:1: ( 'or' )
        {
        // InternalAltarica.g:1748:1: ( 'or' )
        // InternalAltarica.g:1749:2: 'or'
        {
        match(input,41,FOLLOW_16); if (state.failed) return ;

        }


        }

        // InternalAltarica.g:1753:2: ( ( ruleLogicalAnd ) )
        // InternalAltarica.g:1754:1: ( ruleLogicalAnd )
        {
        // InternalAltarica.g:1754:1: ( ruleLogicalAnd )
        // InternalAltarica.g:1755:1: ruleLogicalAnd
        {
        pushFollow(FOLLOW_2);
        ruleLogicalAnd();

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
        // InternalAltarica.g:1826:2: ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )
        // InternalAltarica.g:1826:3: ( () ( ( 'and' ) ) ( ( ruleRelation ) ) )
        {
        // InternalAltarica.g:1826:3: ( () ( ( 'and' ) ) ( ( ruleRelation ) ) )
        // InternalAltarica.g:1826:4: () ( ( 'and' ) ) ( ( ruleRelation ) )
        {
        // InternalAltarica.g:1826:4: ()
        // InternalAltarica.g:1827:1: 
        {
        }

        // InternalAltarica.g:1827:2: ( ( 'and' ) )
        // InternalAltarica.g:1828:1: ( 'and' )
        {
        // InternalAltarica.g:1828:1: ( 'and' )
        // InternalAltarica.g:1829:2: 'and'
        {
        match(input,42,FOLLOW_16); if (state.failed) return ;

        }


        }

        // InternalAltarica.g:1833:2: ( ( ruleRelation ) )
        // InternalAltarica.g:1834:1: ( ruleRelation )
        {
        // InternalAltarica.g:1834:1: ( ruleRelation )
        // InternalAltarica.g:1835:1: ruleRelation
        {
        pushFollow(FOLLOW_2);
        ruleRelation();

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
        // InternalAltarica.g:1906:2: ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )
        // InternalAltarica.g:1906:3: ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) )
        {
        // InternalAltarica.g:1906:3: ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) )
        // InternalAltarica.g:1906:4: () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) )
        {
        // InternalAltarica.g:1906:4: ()
        // InternalAltarica.g:1907:1: 
        {
        }

        // InternalAltarica.g:1907:2: ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) )
        // InternalAltarica.g:1908:1: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) )
        {
        // InternalAltarica.g:1908:1: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) )
        // InternalAltarica.g:1909:1: ( '==' | '!=' | '<' | '<=' | '>=' | '>' )
        {
        if ( (input.LA(1)>=43 && input.LA(1)<=48) ) {
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

        // InternalAltarica.g:1931:2: ( ( ruleAddition ) )
        // InternalAltarica.g:1932:1: ( ruleAddition )
        {
        // InternalAltarica.g:1932:1: ( ruleAddition )
        // InternalAltarica.g:1933:1: ruleAddition
        {
        pushFollow(FOLLOW_2);
        ruleAddition();

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
        // InternalAltarica.g:2067:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )
        // InternalAltarica.g:2067:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) )
        {
        // InternalAltarica.g:2067:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) )
        // InternalAltarica.g:2067:4: () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) )
        {
        // InternalAltarica.g:2067:4: ()
        // InternalAltarica.g:2068:1: 
        {
        }

        // InternalAltarica.g:2068:2: ( ( ( '+' | '-' ) ) )
        // InternalAltarica.g:2069:1: ( ( '+' | '-' ) )
        {
        // InternalAltarica.g:2069:1: ( ( '+' | '-' ) )
        // InternalAltarica.g:2070:1: ( '+' | '-' )
        {
        if ( (input.LA(1)>=49 && input.LA(1)<=50) ) {
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

        // InternalAltarica.g:2080:2: ( ( ruleMultiplication ) )
        // InternalAltarica.g:2081:1: ( ruleMultiplication )
        {
        // InternalAltarica.g:2081:1: ( ruleMultiplication )
        // InternalAltarica.g:2082:1: ruleMultiplication
        {
        pushFollow(FOLLOW_2);
        ruleMultiplication();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalAltarica

    // $ANTLR start synpred7_InternalAltarica
    public final void synpred7_InternalAltarica_fragment() throws RecognitionException {   
        // InternalAltarica.g:2168:2: ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )
        // InternalAltarica.g:2168:3: ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) )
        {
        // InternalAltarica.g:2168:3: ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) )
        // InternalAltarica.g:2168:4: () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) )
        {
        // InternalAltarica.g:2168:4: ()
        // InternalAltarica.g:2169:1: 
        {
        }

        // InternalAltarica.g:2169:2: ( ( ( '*' | '/' ) ) )
        // InternalAltarica.g:2170:1: ( ( '*' | '/' ) )
        {
        // InternalAltarica.g:2170:1: ( ( '*' | '/' ) )
        // InternalAltarica.g:2171:1: ( '*' | '/' )
        {
        if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
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

        // InternalAltarica.g:2181:2: ( ( ruleNeg ) )
        // InternalAltarica.g:2182:1: ( ruleNeg )
        {
        // InternalAltarica.g:2182:1: ( ruleNeg )
        // InternalAltarica.g:2183:1: ruleNeg
        {
        pushFollow(FOLLOW_2);
        ruleNeg();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalAltarica

    // $ANTLR start synpred10_InternalAltarica
    public final void synpred10_InternalAltarica_fragment() throws RecognitionException {   
        // InternalAltarica.g:2590:3: ( ( () '.' ( ( RULE_ID ) ) ) )
        // InternalAltarica.g:2590:4: ( () '.' ( ( RULE_ID ) ) )
        {
        // InternalAltarica.g:2590:4: ( () '.' ( ( RULE_ID ) ) )
        // InternalAltarica.g:2590:5: () '.' ( ( RULE_ID ) )
        {
        // InternalAltarica.g:2590:5: ()
        // InternalAltarica.g:2591:1: 
        {
        }

        match(input,56,FOLLOW_4); if (state.failed) return ;
        // InternalAltarica.g:2592:1: ( ( RULE_ID ) )
        // InternalAltarica.g:2593:1: ( RULE_ID )
        {
        // InternalAltarica.g:2593:1: ( RULE_ID )
        // InternalAltarica.g:2594:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalAltarica

    // Delegated rules

    public final boolean synpred10_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalAltarica_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred7_InternalAltarica() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalAltarica_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000070E00010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000012800020010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000012800820010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x38E4010001000070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xC000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000128000A0010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001F80000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x38E4010003000070L});

}